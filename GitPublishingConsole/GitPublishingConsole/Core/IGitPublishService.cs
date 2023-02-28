using GitPublishingConsole.Models;

namespace GitPublishingConsole.Core;

public interface IGitPublishService
{
    Task<GitPublishResult> CheckoutAndPush(string sdkUrl, GitParams gitParams, GitCredentials gitCredentials);
}

public record GitPublishResult(bool Success, string Logs);