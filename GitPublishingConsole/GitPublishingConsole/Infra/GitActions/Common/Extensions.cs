namespace GitPublishingConsole.Infra.GitActions.Common;

public static class Extensions
{
    public static IGitAction Then(this IGitAction action, IGitAction next) =>
        new ChainAction(action, next);
}