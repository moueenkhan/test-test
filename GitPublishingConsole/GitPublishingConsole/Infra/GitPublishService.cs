using GitPublishingConsole.Core;
using GitPublishingConsole.Infra.GitActions.Common;
using GitPublishingConsole.Infra.GitActions.FileOperations;
using GitPublishingConsole.Infra.GitActions.Git2SharptActions;
using GitPublishingConsole.Models;
using LibGit2Sharp;
using LibGit2Sharp.Handlers;
using Branch = GitPublishingConsole.Infra.GitActions.Git2SharptActions.Branch;

namespace GitPublishingConsole.Infra;

public class GitPublishService : IGitPublishService
{
    private readonly IFileService _fileService;

    public GitPublishService(IFileService fileService) => _fileService = fileService;

    private static string GetTempDirectory()
    {
        var tempDirectory = Path.Combine(Path.GetTempPath(), Path.GetRandomFileName());
        Directory.CreateDirectory(tempDirectory);
        return tempDirectory;
    }

    public async Task<GitPublishResult> CheckoutAndPush(string sdkUrl, GitParams gitParams,
        GitCredentials gitCredentials)
    {
        var tempDirectory = GetTempDirectory();

        var clone =
            new Clone(gitParams.GetRepositoryUrl(), gitParams.Branch, tempDirectory,
                gitCredentials.ToCredentialsHandler());

        var branch = new Branch(tempDirectory, gitParams.Branch);

        var removeExistingFiles = new RemoveExistingFiles(_fileService, tempDirectory);

        var downloadSdk = new DownloadSdk(_fileService, tempDirectory, sdkUrl);

        var stage = new Stage(tempDirectory, gitParams.CommitMessage, gitParams.GetSignature(), gitParams.Branch);

        var push = new Push(tempDirectory, gitParams.Branch, gitCredentials.ToCredentialsHandler());

        var clean = new CleanUp(_fileService, tempDirectory);

        var actions = clone
            .Then(branch)
            .Then(removeExistingFiles)
            .Then(downloadSdk)
            .Then(stage)
            .Then(push)
            .Then(clean);

        var gitLogger = new GitLogger();
        var result = await actions.ExecuteOperations(gitLogger);
        return new GitPublishResult(result, gitLogger.Render());
    }
}

file static class GitExtensions
{
    private static UsernamePasswordCredentials ToCredentials(this GitCredentials gitCredentials) =>
        new()
        {
            Username = gitCredentials.Username,
            Password = gitCredentials.TokenOrPassword
        };

    public static CredentialsHandler ToCredentialsHandler(this GitCredentials gitCredentials) =>
        (_, _, _) => gitCredentials.ToCredentials();

    public static Signature GetSignature(this GitParams gitParams) =>
        new(gitParams.AuthorName, gitParams.AuthorEmail, DateTimeOffset.UtcNow);
}