# O Auth Authorization

```java
OAuthAuthorizationController oAuthAuthorizationController = client.getOAuthAuthorizationController();
```

## Class Name

`OAuthAuthorizationController`

## Methods

* [Request Token](../../doc/controllers/o-auth-authorization.md#request-token)
* [Refresh Token](../../doc/controllers/o-auth-authorization.md#refresh-token)


# Request Token

Create a new OAuth 2 token.

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<OAuthToken> requestTokenAsync(
    final String authorization,
    final String username,
    final String password,
    final String scope,
    final Map<String, Object> fieldParameters)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `authorization` | `String` | Header, Required | Authorization header in Basic auth format |
| `username` | `String` | Form, Required | Resource owner username |
| `password` | `String` | Form, Required | Resource owner password |
| `scope` | `String` | Form, Optional | Requested scopes as a space-delimited list. |
| `fieldParameters` | `Map<String, Object>` | Optional | Pass additional field parameters. |

## Server

`Server.AUTH`

## Response Type

[`OAuthToken`](../../doc/models/o-auth-token.md)

## Example Usage

```java
String authorization = "Authorization8";
String username = "username0";
String password = "password4";
Map<String, Object> fieldParameters = new LinkedHashMap<>();
fieldParameters.put("key0", com.experian.sandboxusapi.ApiHelper.deserialize("\"additionalFieldParams9\""));

oAuthAuthorizationController.requestTokenAsync(authorization, username, password, null, fieldParameters).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | OAuth 2 provider returned an error. | [`OAuthProviderException`](../../doc/models/o-auth-provider-exception.md) |
| 401 | OAuth 2 provider says client authentication failed. | [`OAuthProviderException`](../../doc/models/o-auth-provider-exception.md) |


# Refresh Token

Obtain a new access token using a refresh token

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<OAuthToken> refreshTokenAsync(
    final String authorization,
    final String refreshToken,
    final String scope,
    final Map<String, Object> fieldParameters)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `authorization` | `String` | Header, Required | Authorization header in Basic auth format |
| `refreshToken` | `String` | Form, Required | Refresh token |
| `scope` | `String` | Form, Optional | Requested scopes as a space-delimited list. |
| `fieldParameters` | `Map<String, Object>` | Optional | Pass additional field parameters. |

## Server

`Server.AUTH`

## Response Type

[`OAuthToken`](../../doc/models/o-auth-token.md)

## Example Usage

```java
String authorization = "Authorization8";
String refreshToken = "refresh_token0";
Map<String, Object> fieldParameters = new LinkedHashMap<>();
fieldParameters.put("key0", com.experian.sandboxusapi.ApiHelper.deserialize("\"additionalFieldParams9\""));

oAuthAuthorizationController.refreshTokenAsync(authorization, refreshToken, null, fieldParameters).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | OAuth 2 provider returned an error. | [`OAuthProviderException`](../../doc/models/o-auth-provider-exception.md) |
| 401 | OAuth 2 provider says client authentication failed. | [`OAuthProviderException`](../../doc/models/o-auth-provider-exception.md) |

