using Pastel;

namespace GitPublishingConsole.Models;

public class GitLogger
{
    private readonly IList<string> _entries = new List<string>();

    private static readonly string Inf = "[INF]".Pastel(ConsoleColor.Green);
    private static readonly string Err = "[ERR]".Pastel(ConsoleColor.Red);
    private static readonly string Wrn = "[WRN]".Pastel(ConsoleColor.Yellow);

    public void Info(string entry)
    {
        _entries.Add($"{DateTimeOffset.UtcNow} {Inf}: {entry}");
        Console.WriteLine(_entries.Last());
    }

    private void Error(string entry)
    {
        _entries.Add($"{DateTimeOffset.UtcNow} {Err}: {entry}");
        Console.WriteLine(_entries.Last());
    }

    public void Warning(string entry)
    {
        _entries.Add($"{DateTimeOffset.UtcNow} {Wrn}: {entry}");
        Console.WriteLine(_entries.Last());
    }


    public void Error(string entry, Exception e)
    {
        Error(entry);
        Error($"Exception {e.Message}");
    }

    public void Warning(string entry, Exception e)
    {
        Warning(entry);
        Warning($"Exception {e.Message}");
    }

    public string Render() => string.Join('\n', _entries);
}