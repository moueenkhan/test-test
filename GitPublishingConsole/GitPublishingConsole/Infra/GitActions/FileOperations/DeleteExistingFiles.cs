using GitPublishingConsole.Core;
using GitPublishingConsole.Infra.GitActions.Common;
using GitPublishingConsole.Models;

namespace GitPublishingConsole.Infra.GitActions.FileOperations;



public class RemoveExistingFiles : IGitAction
{
    private readonly IFileService _fileService;
    private string TempDirectory { get; }

    public RemoveExistingFiles(IFileService fileService, string tempDirectory)
    {
        _fileService = fileService;
        TempDirectory = tempDirectory;
    }

    public Task<bool> ExecuteOperations(GitLogger logger)
    {
        logger.Info("Clearing contents of temp directory");
        _fileService.ClearDirectory(TempDirectory);
        return Task.FromResult(true);
    }
}