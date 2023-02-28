using GitPublishingConsole.Core;
using GitPublishingConsole.Infra.GitActions.Common;
using GitPublishingConsole.Models;

namespace GitPublishingConsole.Infra.GitActions.FileOperations;

public class DownloadSdk : IGitAction
{
    private readonly IFileService _fileService;

    public DownloadSdk(IFileService fileService, string tempDirectory, string sdkUrl)
    {
        _fileService = fileService;
        TempDirectory = tempDirectory;
        SdkUrl = sdkUrl;
    }

    public async Task<bool> ExecuteOperations(GitLogger logger)
    {
        logger.Info("Downloading sdk and unzipping");
        return await _fileService.HttpDownloadAndUnzip(SdkUrl, TempDirectory);
    }

    private string TempDirectory { get; }

    private string SdkUrl { get; }
}