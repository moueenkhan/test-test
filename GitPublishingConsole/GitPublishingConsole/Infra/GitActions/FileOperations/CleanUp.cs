using GitPublishingConsole.Core;
using GitPublishingConsole.Infra.GitActions.Common;
using GitPublishingConsole.Models;

namespace GitPublishingConsole.Infra.GitActions.FileOperations;

public class CleanUp : IGitAction
{
    private readonly IFileService _fileService;
    private string TempDirectory { get; }
    public CleanUp(IFileService fileService, string tempDirectory)
    {
        _fileService = fileService;
        TempDirectory = tempDirectory;
    }

    public Task<bool> ExecuteOperations(GitLogger logger)
    {
        logger.Info("Deleting contents of temp directory");
        _fileService.DeleteDirectory(TempDirectory);
        return Task.FromResult(true);
    }
}