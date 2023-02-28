using GitPublishingConsole.Models;
using LibGit2Sharp;

namespace GitPublishingConsole.Infra.GitActions.Common;

public abstract class LibGit2SharpAction : IGitAction
{
    protected abstract string Operation { get; }
    protected abstract string Error { get; }
    

    public Task<bool> ExecuteOperations(GitLogger logger)
    {
        logger.Info(Operation);
        try
        {
            //var typeName = this.GetType().Name;
            //Console.WriteLine($"the name of type: {typeName}");
            Execute(logger);
            return Task.FromResult(true);
        }
        catch (LibGit2SharpException e)
        {
            logger.Error(Error, e);
            return Task.FromResult(false);
        }
    }

    protected abstract void Execute(GitLogger logger);
}