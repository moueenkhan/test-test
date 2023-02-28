using GitPublishingConsole.Infra.GitActions.Common;
using GitPublishingConsole.Models;
using LibGit2Sharp;
using LibGit2Sharp.Handlers;

namespace GitPublishingConsole.Infra.GitActions.Git2SharptActions;

public class Clone : LibGit2SharpAction
{
    private string RepositoryUrl { get; }
    private string Branch { get; }
    private string TempDirectory { get; }
    private CredentialsHandler CredentialsHandler { get; }

    public Clone(string repositoryUrl, string branch, string tempDirectory, CredentialsHandler credentialsHandler)
    {
        RepositoryUrl = repositoryUrl;
        TempDirectory = tempDirectory;
        CredentialsHandler = credentialsHandler;
        Branch = branch;
    }

    protected override string Operation => "Checking access to git repository";
    protected override string Error => "Unable to access git repository";

    protected override void Execute(GitLogger logger)
    {
        var references = Repository.ListRemoteReferences(RepositoryUrl, CredentialsHandler).ToList();

        var existingBranch =
            references.FirstOrDefault(elem => elem.IsLocalBranch && elem.CanonicalName == $"refs/heads/{Branch}");

        if (existingBranch != null)
        {
            logger.Info("Cloning remote branch exists");
            Repository.Clone(RepositoryUrl, TempDirectory,
                new CloneOptions
                {
                    CredentialsProvider = CredentialsHandler,
                    BranchName = Branch
                });
        }
        else
        {
            logger.Info("Cloning remote repository with branch does not exists");
            Repository.Clone(RepositoryUrl, TempDirectory,
                new CloneOptions
                {
                    CredentialsProvider = CredentialsHandler,
                });
        }
    }
}