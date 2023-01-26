# Credit Risk Customer Insight

```java
CreditRiskCustomerInsightController creditRiskCustomerInsightController = client.getCreditRiskCustomerInsightController();
```

## Class Name

`CreditRiskCustomerInsightController`

## Methods

* [Business Search](../../doc/controllers/credit-risk-customer-insight.md#business-search)
* [Registered Company Credit](../../doc/controllers/credit-risk-customer-insight.md#registered-company-credit)
* [Non Registered Company Credit](../../doc/controllers/credit-risk-customer-insight.md#non-registered-company-credit)
* [Director Search](../../doc/controllers/credit-risk-customer-insight.md#director-search)
* [Directors Details](../../doc/controllers/credit-risk-customer-insight.md#directors-details)
* [Business Owners](../../doc/controllers/credit-risk-customer-insight.md#business-owners)


# Business Search

<div>
  Search Experian's UK Business database to return either the best matching business or a list of businesses to choose from. You can then use a returned identifier to request additional business information from many of Experian's Business Information APIs. <br/><br/>
  Searches can be made using:
  <ul>
  <li>the business name only</li>
  <li>the business postcode</li>
  <li>the business identifiers (registration number or Experian non limited key)</li>
  <li>additional filters to qualify the search scope (registered/non registered, dissolved businesses)</li>
  </ul>
<br/>
Sample searches against name=TEST will work in the Sandbox.
</div>


```java
CompletableFuture<BusinessTargeterResponse> businessSearchAsync(
    final String name,
    final String postcode,
    final String town,
    final String phonenumber,
    final String businessref,
    final Boolean searchcorporates,
    final Boolean excludedissolved,
    final Boolean searchnoncorps)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Business name to be used in the search<br>**Default**: `"TEST"` |
| `postcode` | `String` | Query, Optional | Postcode of location to be used in the search<br>**Constraints**: *Maximum Length*: `8`, *Pattern*: `([a-zA-Z0-9\ ])*` |
| `town` | `String` | Query, Optional | Town location to be used in the search<br>**Constraints**: *Maximum Length*: `35`, *Pattern*: `([0-9A-Za-z'\-\ ])*` |
| `phonenumber` | `String` | Query, Optional | Telephone number to be used in the search |
| `businessref` | `String` | Query, Optional | Business reference (registered number or NonLimited URN) to be used in the search.  Sample 99999999 or UI88888888. |
| `searchcorporates` | `Boolean` | Query, Optional | Indicator showing whether to include limited businesses in the search (true = Include, false = Exclude)<br>**Default**: `true` |
| `excludedissolved` | `Boolean` | Query, Optional | Indicator showing whether to include dissolved limited businesses in the search (true = Include, false = Exclude)<br>**Default**: `true` |
| `searchnoncorps` | `Boolean` | Query, Optional | Indicator showing whether to include non-limited businesses in the search (true = Include, false = Exclude)<br>**Default**: `false` |

## Response Type

[`BusinessTargeterResponse`](../../doc/models/business-targeter-response.md)

## Example Usage

```java
String name = "TEST";
Boolean searchcorporates = true;
Boolean excludedissolved = true;
Boolean searchnoncorps = false;

creditRiskCustomerInsightController.businessSearchAsync(name, null, null, null, null, searchcorporates, excludedissolved, searchnoncorps).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request. Incorrect verb or path provided | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 401 | Unauthorized access. Invalid or Expired Token, or product not enabled against the account | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 406 | Not Acceptable. Invalid headers provided. | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 422 | Unprocessable Entity. Incorrect parameters provided | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 500 | Internal server error | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Registered Company Credit

Returns detailed information on UK limited companies, including corporate structure, management info, shareholders, financials, Commercial Delphi credit scores and history, CCJs, mortgages, legal notices, Cifas fraud data and business credit history (CAIS).<br/>
Sample searches using RegNumber=99999999 will work in the Sandbox.

```java
CompletableFuture<LtdCompanyData> registeredCompanyCreditAsync(
    final String regNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `regNumber` | `String` | Template, Required | Company registration number; Sample RegNumber is 99999999. |

## Response Type

[`LtdCompanyData`](../../doc/models/ltd-company-data.md)

## Example Usage

```java
String regNumber = "99999999";

creditRiskCustomerInsightController.registeredCompanyCreditAsync(regNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized access. Invalid or Expired Token, or product not enabled against the account | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 404 | Company not found | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 406 | Not Acceptable. Invalid headers provided. | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 500 | Internal server error | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Non Registered Company Credit

Returns detailed information on UK non-limited businesses, including Commercial Delphi credit scores and history, commercial credit history (CAIS), payment performance, Cifas fraud data, CCJs and bankruptcies.<br/>
Sample searches using NonLimitedKey=UI88888888 will work in the Sandbox.

```java
CompletableFuture<NonLtdBusinessData> nonRegisteredCompanyCreditAsync(
    final String nonLimitedKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `nonLimitedKey` | `String` | Template, Required | Experian Non limited key for the non-registered company. Sample non limited key is UI88888888. |

## Response Type

[`NonLtdBusinessData`](../../doc/models/non-ltd-business-data.md)

## Example Usage

```java
String nonLimitedKey = "UI88888888";

creditRiskCustomerInsightController.nonRegisteredCompanyCreditAsync(nonLimitedKey).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized access. Invalid or Expired Token, or product not enabled against the account | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 404 | Company not found | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 406 | Not Acceptable. Invalid headers provided. | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 500 | Internal server error | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Director Search

<div>
  Search Experian's UK Business database to return a list of Directors and/or Secretaries. Each matching entry provides an identifier  which can be used to access additional information about the director via other endpoints such as Director Details. <br/><br/> Searches can be made using:
  <li>forename, middlenames and surname</li>
  <li>service address postcode</li>
  <li>flags qualifying the scope of the search (directors/secretaries).</li>
</div>
<br/>
Sample searches using forename=John and surname=Smith will return data in the Sandbox


```java
CompletableFuture<DirectorTargeterResponse> directorSearchAsync(
    final String title,
    final String forename,
    final String middlenames,
    final String surname,
    final String suffix,
    final String dateofbirth,
    final String flat,
    final String housename,
    final String housenumber,
    final String street,
    final String district,
    final String county,
    final String postcode,
    final String town,
    final Boolean directorsflag,
    final Boolean secretariesflag)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `title` | `String` | Query, Optional | Director's title (Lord, Dame, etc.) returned from the Director search |
| `forename` | `String` | Query, Optional | Director's forename returned from the Director search<br>**Default**: `"John"` |
| `middlenames` | `String` | Query, Optional | Director's middle names returned from the Director search<br>**Default**: `"William"` |
| `surname` | `String` | Query, Optional | Director's surname returned from the Director search<br>**Default**: `"Smith"` |
| `suffix` | `String` | Query, Optional | Director's name suffix (Jnr. etc.) returned from the Director search |
| `dateofbirth` | `String` | Query, Optional | Director's Date of Birth |
| `flat` | `String` | Query, Optional | Director's address flat |
| `housename` | `String` | Query, Optional | Director's address house name |
| `housenumber` | `String` | Query, Optional | Director's address house number |
| `street` | `String` | Query, Optional | Director's service address street |
| `district` | `String` | Query, Optional | Director's address district |
| `county` | `String` | Query, Optional | Director's address county |
| `postcode` | `String` | Query, Optional | Director's address postcode |
| `town` | `String` | Query, Optional | Director's address town |
| `directorsflag` | `Boolean` | Query, Optional | Indicator showing whether to include Directors in the search (true = Include, false = Exclude)<br>**Default**: `true` |
| `secretariesflag` | `Boolean` | Query, Optional | Indicator showing whether to include Secretaries in the search (true = Include, false = Exclude)<br>**Default**: `false` |

## Response Type

[`DirectorTargeterResponse`](../../doc/models/director-targeter-response.md)

## Example Usage

```java
String forename = "John";
String middlenames = "William";
String surname = "Smith";
Boolean directorsflag = true;
Boolean secretariesflag = false;

creditRiskCustomerInsightController.directorSearchAsync(null, forename, middlenames, surname, null, null, null, null, null, null, null, null, null, null, directorsflag, secretariesflag).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request. Incorrect verb or path provided | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 401 | Unauthorized access. Invalid or Expired Token, or product not enabled against the account | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 406 | Not Acceptable. Invalid headers provided. | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 422 | Unprocessable Entity. Incorrect parameters provided | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 500 | Internal server error | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Directors Details

Returns detailed information about a Director of UK Limited company, including other Directorships, disqualifications, convictions and Cifas fraud data.   <br/><br/> Sample searches against DirectorNumber=D99999999 will return data in the Sandbox

```java
CompletableFuture<DirectorData> directorsDetailsAsync(
    final String directorNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `directorNumber` | `String` | Template, Required | Director unique reference number; Sample DirectorNumber D99999999. |

## Response Type

[`DirectorData`](../../doc/models/director-data.md)

## Example Usage

```java
String directorNumber = "D99999999";

creditRiskCustomerInsightController.directorsDetailsAsync(directorNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized access. Invalid or Expired Token, or product not enabled against the account | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 404 | Director not found | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 406 | Not Acceptable. Invalid headers provided. | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 500 | Internal server error | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |


# Business Owners

Returns detailed information about owners of non-registered UK businesses, including public information, voters roll, associations, Cifas fraud data and credit history (CAIS). This enables you to perform a credit assessment, based on up to 3 business proprietors, when you're unable to locate a business.

```java
CompletableFuture<BusinessOwnerDetailsResponse> businessOwnersAsync(
    final BusinessOwnerSearchReq body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`BusinessOwnerSearchReq`](../../doc/models/business-owner-search-req.md) | Body, Required | - |

## Response Type

[`BusinessOwnerDetailsResponse`](../../doc/models/business-owner-details-response.md)

## Example Usage

```java
BusinessOwnerSearchReq body = new BusinessOwnerSearchReq();

creditRiskCustomerInsightController.businessOwnersAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized access. Invalid or Expired Token, or product not enabled against the account | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 404 | Business Owner not found | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 406 | Not Acceptable. Invalid headers provided. | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 422 | Unprocessable Entity. Incorrect parameters provided | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |
| 500 | Internal server error | [`ErrorResponseException`](../../doc/models/error-response-exception.md) |

