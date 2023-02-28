using GitPublishingConsole.Models;

namespace GitPublishingConsole.Infra.GitActions.Common;

public class ChainAction : IGitAction
{
    private readonly IGitAction _current;
    private readonly IGitAction _next;

    public ChainAction(IGitAction current, IGitAction next)
    {
        _current = current;
        _next = next;
    }

    public async Task<bool> ExecuteOperations(GitLogger logger) =>
        await _current.ExecuteOperations(logger) && await _next.ExecuteOperations(logger);
}