namespace GitPublishingConsole.Models;

public class GitParams
{
    public required string ProviderOrUrl { get; init; }
    public required string Repository { get; init; }
    public required string Branch { get; init; }
    public required string AuthorName { get; init; }
    public required string AuthorEmail { get; init; }
    public required string CommitMessage { get; init; }

    // TODO: Remove this function and move to Publish API
    public string GetRepositoryUrl() =>
        ProviderOrUrl switch
        {
            "GitHub" => $"https://github.com/{Repository}.git",
            "GitLab" => $"https://gitlab.com/{Repository}.git",
            "Bitbucket" => $"https://bitbucket.org/{Repository}.git",
            _ => new Uri(new Uri(ProviderOrUrl), Repository).ToString()
        };
}