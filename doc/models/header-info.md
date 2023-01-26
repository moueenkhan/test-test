
# Header Info

## Structure

`HeaderInfo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RecordType` | `String` | Optional | Indicator showing the type of record within share information for the limited company - Header (H) | String getRecordType() | setRecordType(String recordType) |
| `IssuingCompany` | `String` | Optional | Registration Number of company issuing the shares | String getIssuingCompany() | setIssuingCompany(String issuingCompany) |
| `CurrentPreviousFlag` | `String` | Optional | Indicator showing whether this is a current (C) or previous (P) shareholding | String getCurrentPreviousFlag() | setCurrentPreviousFlag(String currentPreviousFlag) |
| `EffectiveDate` | `String` | Optional | Date of annual returns (yyyy-mm-dd) | String getEffectiveDate() | setEffectiveDate(String effectiveDate) |
| `BulkList` | `String` | Optional | Indicator showing whether this is a Bulk List | String getBulkList() | setBulkList(String bulkList) |
| `IssuedCapital` | `String` | Optional | Indicator showing whether there is data available in addition to the Header - 0 = Only header available, 1 = More data available | String getIssuedCapital() | setIssuedCapital(String issuedCapital) |
| `LegalStatus` | `String` | Optional | Indicator summarising the legal status of the limited company - 1 = Limited Liability Partnership; 2 = Limited by Guarantee; default = Limited by Share | String getLegalStatus() | setLegalStatus(String legalStatus) |
| `LastList` | `String` | Optional | Last Confirmation Statement Date that includes shareholder details (yyyy-mm-dd) | String getLastList() | setLastList(String lastList) |
| `DocumentType` | `String` | Optional | Indicator showing the document type for the shareholder data source - R = Confirmation Statement (Annual Return) 8 = 88(2); A = Accounts; space = unknown | String getDocumentType() | setDocumentType(String documentType) |
| `SuppressedInfo` | `String` | Optional | Indicator showing whether this data is suppressed from client applications - Y = Suppress from client applications | String getSuppressedInfo() | setSuppressedInfo(String suppressedInfo) |
| `LatestCurrent` | `String` | Optional | Filing date for the limited company accounts previous to the latest accounts (yyyy-mm-dd) | String getLatestCurrent() | setLatestCurrent(String latestCurrent) |
| `LatestPrevious` | `String` | Optional | Filing date for the limited company accounts previous to the latest accounts (yyyy-mm-dd) | String getLatestPrevious() | setLatestPrevious(String latestPrevious) |
| `LatestUpdate` | `String` | Optional | Date that the limited company data for this block was last updated (yyyy-mm-dd) | String getLatestUpdate() | setLatestUpdate(String latestUpdate) |
| `DateLoaded` | `String` | Optional | Date that the limited company latest accounts were loaded (yyyy-mm-dd) | String getDateLoaded() | setDateLoaded(String dateLoaded) |

## Example (as JSON)

```json
{
  "RecordType": null,
  "IssuingCompany": null,
  "CurrentPreviousFlag": null,
  "EffectiveDate": null,
  "BulkList": null,
  "IssuedCapital": null,
  "LegalStatus": null,
  "LastList": null,
  "DocumentType": null,
  "SuppressedInfo": null,
  "LatestCurrent": null,
  "LatestPrevious": null,
  "LatestUpdate": null,
  "DateLoaded": null
}
```

