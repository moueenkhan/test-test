using GitPublishingConsole.Core;
using GitPublishingConsole.Infra;
using GitPublishingConsole.Models;

IFileService fileService = new FileService(new HttpClient());
IGitPublishService gitPublishService = new GitPublishService(fileService);


var gitCredentials = new GitCredentials("Shield-Jaguar",  "");
var gitParams = new GitParams
{
    ProviderOrUrl = "GitHub",
    //Repository = "Shield-Jaguar/package-publishing-test",
    Repository = "Shield-Jaguar/package-publishing-test-3",
    //Repository = "Shield-Jaguar/maven-testing",
    Branch = "dev-5",
    AuthorName = "Shield-Jaguar",
    AuthorEmail = "mujahid.khan@apimatic.io",
    CommitMessage = $"This is the first commit @ {DateTime.UtcNow}"
};

//const string sdkUrl ="https://127.0.0.1:10000/devstoreaccount1/publish-ready-sdk/TypeScript-1.0.7-1ab8480d-7c35-4262-af63-7cc0933eb957.zip";
const string sdkUrl = "https://127.0.0.1:10000/devstoreaccount1/publish-ready-sdk/Java-2.0.8-4a2f074f-0915-44e4-b095-93388ff5535f.zip";
var log = await gitPublishService.CheckoutAndPush(sdkUrl, gitParams, gitCredentials);

Console.WriteLine(log.Success);
//Console.WriteLine(log.Logs);