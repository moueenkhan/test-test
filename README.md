
# Getting Started with Commercial Credit API

## Introduction

The Commercial Credit API gives access to Experian's commercial credit data, including business, director/owner information and credit scores. You can use these combined data assets to drive credit decisions via integations into your existing systems.

## Building

Supported Java version is **8+**.

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Commercial%20Credit%20API-Java&workspaceName=CommercialCreditAPI&projectName=CommercialCreditAPILib&rootNamespace=com.experian.sandboxusapi&groupId=CommercialCreditAPILib&artifactId=commercial-credit-apilib&version=2.0.2&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Commercial%20Credit%20API-Java&workspaceName=CommercialCreditAPI&projectName=CommercialCreditAPILib&rootNamespace=com.experian.sandboxusapi&groupId=CommercialCreditAPILib&artifactId=commercial-credit-apilib&version=2.0.2&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=Commercial%20Credit%20API-Java&workspaceName=CommercialCreditAPI&projectName=CommercialCreditAPILib&rootNamespace=com.experian.sandboxusapi&groupId=CommercialCreditAPILib&artifactId=commercial-credit-apilib&version=2.0.2&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=Commercial%20Credit%20API-Java&workspaceName=CommercialCreditAPI&projectName=CommercialCreditAPILib&rootNamespace=com.experian.sandboxusapi&groupId=CommercialCreditAPILib&artifactId=commercial-credit-apilib&version=2.0.2&step=import3)

## Installation

The following section explains how to use the CommercialCreditAPILib library in a new project.

### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=Commercial%20Credit%20API-Java&workspaceName=CommercialCreditAPI&projectName=CommercialCreditAPILib&rootNamespace=com.experian.sandboxusapi&groupId=CommercialCreditAPILib&artifactId=commercial-credit-apilib&version=2.0.2&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Commercial%20Credit%20API-Java&workspaceName=CommercialCreditAPI&projectName=CommercialCreditAPILib&rootNamespace=com.experian.sandboxusapi&groupId=CommercialCreditAPILib&artifactId=commercial-credit-apilib&version=2.0.2&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Commercial%20Credit%20API-Java&workspaceName=CommercialCreditAPI&projectName=CommercialCreditAPILib&rootNamespace=com.experian.sandboxusapi&groupId=CommercialCreditAPILib&artifactId=commercial-credit-apilib&version=2.0.2&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=Commercial%20Credit%20API-Java&workspaceName=CommercialCreditAPI&projectName=CommercialCreditAPILib&rootNamespace=com.experian.sandboxusapi&groupId=CommercialCreditAPILib&artifactId=commercial-credit-apilib&version=2.0.2&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=Commercial%20Credit%20API-Java&workspaceName=CommercialCreditAPI&projectName=CommercialCreditAPILib&rootNamespace=com.experian.sandboxusapi&groupId=CommercialCreditAPILib&artifactId=commercial-credit-apilib&version=2.0.2&step=createNewProject4)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *CommercialCreditAPILib* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=Commercial%20Credit%20API-Java&workspaceName=CommercialCreditAPI&projectName=CommercialCreditAPILib&rootNamespace=com.experian.sandboxusapi&groupId=CommercialCreditAPILib&artifactId=commercial-credit-apilib&version=2.0.2&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify CommercialCreditAPILib in `Group Id`, commercial-credit-apilib in `Artifact Id` and 2.0.2 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=Commercial%20Credit%20API-Java&workspaceName=CommercialCreditAPI&projectName=CommercialCreditAPILib&rootNamespace=com.experian.sandboxusapi&groupId=CommercialCreditAPILib&artifactId=commercial-credit-apilib&version=2.0.2&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=Commercial%20Credit%20API-Java&workspaceName=CommercialCreditAPI&projectName=CommercialCreditAPILib&rootNamespace=com.experian.sandboxusapi&groupId=CommercialCreditAPILib&artifactId=commercial-credit-apilib&version=2.0.2&step=testProject2)

### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project CommercialCreditAPILib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](doc/http-client-configuration.md) | Http Client Configuration instance. |
| `oAuthClientId` | `String` | OAuth 2 Client ID |
| `oAuthClientSecret` | `String` | OAuth 2 Client Secret |
| `oAuthUsername` | `String` | OAuth 2 Resource Owner Username |
| `oAuthPassword` | `String` | OAuth 2 Resource Owner Password |
| `oAuthToken` | `OAuthToken` | Object for storing information about the OAuth token |

The API client can be initialized as follows:

```java
CommercialCreditAPIClient client = new CommercialCreditAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .resourceOwnerAuthCredentials("OAuthClientId", "OAuthClientSecret", "OAuthUsername", "OAuthPassword")
    .environment(Environment.PRODUCTION)
    .build();
```

## Authorization

This API uses `OAuth 2 Resource Owner Credentials Grant`.

## Resource Owner Password Grant

Your application must obtain user authorization before it can execute an endpoint call incase this SDK chooses to use *OAuth 2.0 Resource Owner Password Credentials Grant*. This authorization includes the following steps

The `fetchToken()` method will exchange the user's credentials for an *access token*. The access token is an object containing information for authorizing client requests and refreshing the token itself.

```java
try {
    OAuthToken token = client.getResourceOwnerAuth().fetchToken();
    // re-instantiate the client with oauth token
    client = client.newBuilder().oAuthToken(token).build();
} catch (Throwable e) {
    // TODO Handle exception
}
```

The client can now make authorized endpoint calls.

### Refreshing the token

An access token may expire after sometime. To extend its lifetime, you must refresh the token.

```java
if (client.getResourceOwnerAuth().isTokenExpired()) {
    try {
        OAuthToken token = client.getResourceOwnerAuth().refreshToken();
        // re-instantiate the client with oauth token
        client = client.newBuilder().oAuthToken(token).build();
    } catch (Throwable e) {
        // TODO Handle exception
    }
}
```

If a token expires, an exception will be thrown before the next endpoint call requiring authentication.

### Storing an access token for reuse

It is recommended that you store the access token for reuse.

```java
// store token
httpSession.setAttribute("access_token", client.getResourceOwnerAuth().getOAuthToken());
```

### Creating a client from a stored token

To authorize a client from a stored access token, just set the access token in Configuration along with the other configuration parameters before creating the client:

```java
// load token later...
OAuthToken token = (OAuthToken) httpSession.getAttribute("access_token");

// re-instantiate the client with oauth token
client = client.newBuilder().oAuthToken(token).build();
```

### Complete example

This example uses Spring framework. The `/callapi` route will first try to restore the access token from the session; otherwise it falls back to
fetching a new access token. If the token is expired, then it will be refreshed before making any API call.

```java
package com.example;

import com.experian.sandboxusapi.CommercialCreditAPIClient;
import com.experian.sandboxusapi.models.OAuthToken;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {
    private CommercialCreditAPIClient client;

    public MainController() {
        CommercialCreditAPIClient client = new CommercialCreditAPIClient.Builder()
            .httpClientConfig(configBuilder -> configBuilder
                    .timeout(0))
            .resourceOwnerAuthCredentials("OAuthClientId", "OAuthClientSecret", "OAuthUsername", "OAuthPassword")
            .environment(Environment.PRODUCTION)
            .build();
        
        
    }

    @RequestMapping(value = "/callapi", method = RequestMethod.GET, produces = "application/json")
    public String callApi(HttpSession session, HttpServletResponse response) throws Throwable {
        // redirect if access token is not set
        if (session.getAttribute("access_token") == null) {
            synchronized (client) {
                OAuthToken token = client.getResourceOwnerAuth().fetchToken();
                session.setAttribute("access_token", token);
            }
        }

        synchronized (client) {
            client = client.newBuilder().oAuthToken((OAuthToken) session.getAttribute("access_token")).build();

            // refresh the token if it is expired
            if(client.getResourceOwnerAuth().isTokenExpired()) {
                try {
                    session.setAttribute("access_token", client.getResourceOwnerAuth().refreshToken());
                } catch (Throwable e) {
                    // TODO Handle exception
                }
            }

            // now you can use client to make endpoint calls
            // client will automatically refresh the token when it expires
            return "someView";
        }
    }
}
```

## List of APIs

* [Credit Risk Customer Insight](doc/controllers/credit-risk-customer-insight.md)
* [O Auth Authorization](doc/controllers/o-auth-authorization.md)

## Classes Documentation

* [Utility Classes](doc/utility-classes.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [HttpCallback Interface](doc/http-callback-interface.md)
* [Headers](doc/headers.md)
* [ApiException](doc/api-exception.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)

