namespace GitPublishingConsole.Core;

public interface IFileService
{
    Task<bool> HttpDownloadAndUnzip(string requestUri, string directoryToUnzip);

    Task ClearDirectory(string tempDirectory, bool ignoreHiddenSubDirectories = true);

    Task DeleteDirectory(string tempDirectory);
}