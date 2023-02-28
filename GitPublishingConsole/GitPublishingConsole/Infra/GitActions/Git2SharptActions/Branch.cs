using GitPublishingConsole.Infra.GitActions.Common;
using GitPublishingConsole.Models;
using LibGit2Sharp;

namespace GitPublishingConsole.Infra.GitActions.Git2SharptActions;

public class Branch: LibGit2SharpAction
{
    private string TempDirectory { get; }
    private string BranchName { get; }
    
    protected override string Operation => "Check out branch";
    protected override string Error  => "unable to check out branch";

    public Branch(string tempDirectory, string branchName)
    {
        TempDirectory = tempDirectory;
        BranchName = branchName;
    }
    
    protected override void Execute(GitLogger logger)
    {
        using var repository = new Repository(TempDirectory);
        if (!repository.Branches.Any())
        {
            // we need to crate branch
            logger.Warning("Cannot branch as repository is empty");
        }
        else if (repository.Branches[BranchName] is var existingBranch && existingBranch != null)
        {
            logger.Info("Current branch is already branch");
        }
        else
        {
            logger.Info("Create branch from default branch and checkout");
            var newBranch = repository.CreateBranch(BranchName);
            var remote = repository.Network.Remotes["origin"];
            repository.Branches.Update(newBranch,
                b => b.Remote = remote.Name,
                b => b.UpstreamBranch = newBranch.CanonicalName);
            Commands.Checkout(repository, newBranch);
        }
    }
}