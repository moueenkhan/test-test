
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |
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

## Commercial Credit APIClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getCreditRiskCustomerInsightController()` | Provides access to CreditRiskCustomerInsight controller. | `CreditRiskCustomerInsightController` |
| `getOAuthAuthorizationController()` | Provides access to OAuthAuthorization controller. | `OAuthAuthorizationController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

