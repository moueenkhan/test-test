using System.IO.Compression;
using GitPublishingConsole.Core;

namespace GitPublishingConsole.Infra;

public class FileService : IFileService
{
    private readonly HttpClient _httpClient;

    public FileService(HttpClient httpClient) => _httpClient = httpClient;

    public async Task<bool> HttpDownloadAndUnzip(string requestUri, string directoryToUnzip)
    {
        using var response = await _httpClient.GetAsync(requestUri);
        if (!response.IsSuccessStatusCode) return false;

        await using var streamToReadFrom = await response.Content.ReadAsStreamAsync();
        using var zip = new ZipArchive(streamToReadFrom);
        zip.ExtractToDirectory(directoryToUnzip, true);
        return true;
    }

    public Task ClearDirectory(string tempDirectory, bool ignoreHiddenSubDirectories = true)
    {
        var di = new DirectoryInfo(tempDirectory);
        foreach (var file in di.EnumerateFiles())
        {
            file.Delete();
        }

        foreach (var dir in di.EnumerateDirectories())
        {
            if (ignoreHiddenSubDirectories && dir.Attributes.HasFlag(FileAttributes.Hidden))
                continue;
            dir.Delete(true);
        }

        return Task.CompletedTask;
    }

    public Task DeleteDirectory(string tempDirectory)
    {
        if (Directory.Exists(tempDirectory))
            Directory.Delete(tempDirectory, true);
        return Task.CompletedTask;
    }
}