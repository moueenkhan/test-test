using GitPublishingConsole.Models;

namespace GitPublishingConsole.Infra.GitActions.Common;

public interface IGitAction
{
    Task<bool> ExecuteOperations(GitLogger gitLogger);
}