using GitPublishingConsole.Infra.GitActions.Common;
using GitPublishingConsole.Models;
using LibGit2Sharp;
using LibGit2Sharp.Handlers;

namespace GitPublishingConsole.Infra.GitActions.Git2SharptActions;

public class Push : LibGit2SharpAction
{
    private readonly string _tempDirectory;
    private readonly string _branch;
    private readonly CredentialsHandler _credentialsHandler;

    public Push(string tempDirectory, string branch, CredentialsHandler credentialsHandler) 
    {
        _tempDirectory = tempDirectory;
        _branch = branch;
        _credentialsHandler = credentialsHandler;
    }


    protected override string Operation => "Pushing code to origin";
    protected override string Error => "Unable to push code to origin";

    protected override void Execute(GitLogger logger)
    {
        using var repository = new Repository(_tempDirectory);
        var branch = repository.Branches[_branch];

        if (branch == null) throw new InvalidOperationException("unable to find required branch before push");

        
        repository.Network.Push(branch, new PushOptions
        {
            CredentialsProvider = _credentialsHandler,
            OnPushTransferProgress = (data, total, bytes) =>
            {
                logger.Info($"Push transfer progress Data: {data} total: {total} bytes: {bytes}");
                return true;
            }
        });
    }
}