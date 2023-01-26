
# Shareholder

## Structure

`Shareholder`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RecordType` | `String` | Optional | Indicator showing the type of record within share information for the limited company - Shareholder (U) | String getRecordType() | setRecordType(String recordType) |
| `IssuingCompany` | `String` | Optional | Registration Number of company issuing the shares | String getIssuingCompany() | setIssuingCompany(String issuingCompany) |
| `CurrentPreviousFlag` | `String` | Optional | Indicator showing whether this is a current (C) or previous (P) shareholding | String getCurrentPreviousFlag() | setCurrentPreviousFlag(String currentPreviousFlag) |
| `EffectiveDate` | `String` | Optional | Effective date (yyyy-mm-dd) | String getEffectiveDate() | setEffectiveDate(String effectiveDate) |
| `ShareClassNo` | `String` | Optional | Sequential number within the limited company to identify the Share Class | String getShareClassNo() | setShareClassNo(String shareClassNo) |
| `ShareholdingNo` | `String` | Optional | Sequential number within the limited company to identify the Shareholding of the associated Shareholding | String getShareholdingNo() | setShareholdingNo(String shareholdingNo) |
| `ShareholderNo` | `String` | Optional | Sequential number within the limited company to identify the Shareholder of the associated Share Class | String getShareholderNo() | setShareholderNo(String shareholderNo) |
| `ShareholderDetails` | [`SharehldrsDetails`](../../doc/models/sharehldrs-details.md) | Optional | - | SharehldrsDetails getShareholderDetails() | setShareholderDetails(SharehldrsDetails shareholderDetails) |
| `NOCRef` | `String` | Optional | Notice of Correction reference relating to the Shareholder | String getNOCRef() | setNOCRef(String nOCRef) |
| `LatestUpdate` | `String` | Optional | Date that the limited company data for this block was last updated (yyyy-mm-dd) | String getLatestUpdate() | setLatestUpdate(String latestUpdate) |

## Example (as JSON)

```json
{
  "RecordType": null,
  "IssuingCompany": null,
  "CurrentPreviousFlag": null,
  "EffectiveDate": null,
  "ShareClassNo": null,
  "ShareholdingNo": null,
  "ShareholderNo": null,
  "ShareholderDetails": null,
  "NOCRef": null,
  "LatestUpdate": null
}
```

