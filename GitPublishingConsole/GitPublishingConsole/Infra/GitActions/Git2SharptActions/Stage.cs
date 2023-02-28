using System.Globalization;
using GitPublishingConsole.Infra.GitActions.Common;
using GitPublishingConsole.Models;
using LibGit2Sharp;

namespace GitPublishingConsole.Infra.GitActions.Git2SharptActions;

public class Stage : LibGit2SharpAction
{
    private string TempDirectory { get; }
    private string CommitMessage { get; }
    private Signature Signature { get; }
    private string BranchName { get; }

    public Stage(string tempDirectory, string commitMessage, Signature signature, string branchName)
    {
        TempDirectory = tempDirectory;
        CommitMessage = commitMessage;
        Signature = signature;
        BranchName = branchName;
    }


    protected override string Operation => "Staging and Commiting new sdk files";

    protected override string Error => "Unable to stage or commit new changes";

    protected override void Execute(GitLogger logger)
    {
        using var repository = new Repository(TempDirectory);
        var isEmptyRepository = !repository.Branches.Any();
        Commands.Stage(repository, "*");
        var status = repository.RetrieveStatus();
        if (!status.IsDirty)
        {
            logger.Warning("No change in files detected");
            return;
        }

        logger.Info($"Staged Changed: {PrintStatus(status)}");
        repository.Commit(CommitMessage, Signature, Signature, new CommitOptions
        {
            AllowEmptyCommit = true,
        });

        if (!isEmptyRepository) return;
        logger.Info("creating new branch for empty repository");

        // This is special case, as we need to crate branch after staging changes
        var newBranch = repository.CreateBranch(BranchName);
        var remote = repository.Network.Remotes["origin"];
        repository.Branches.Update(newBranch,
            b => b.Remote = remote.Name,
            b => b.UpstreamBranch = newBranch.CanonicalName);
        Commands.Checkout(repository, newBranch);
    }

    private static string PrintStatus(RepositoryStatus status) =>
        string.Format(CultureInfo.InvariantCulture,
            "+{0} ~{1} -{2} | +{3} ~{4} -{5} | i{6}",
            status.Added.Count(),
            status.Staged.Count(),
            status.Removed.Count(),
            status.Untracked.Count(),
            status.Modified.Count(),
            status.Missing.Count(),
            status.Ignored.Count());
}