
# Shareholdings

## Structure

`Shareholdings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RecordType` | `String` | Optional | Indicator showing the type of record within share information for the limited company - Shareholding (S) | String getRecordType() | setRecordType(String recordType) |
| `IssuingCompany` | `String` | Optional | Registration Number of company issuing the shares | String getIssuingCompany() | setIssuingCompany(String issuingCompany) |
| `CurrentPreviousFlag` | `String` | Optional | Indicator showing whether this is a current (C) or previous (P) shareholding | String getCurrentPreviousFlag() | setCurrentPreviousFlag(String currentPreviousFlag) |
| `EffectiveDate` | `String` | Optional | Effective date (yyyy-mm-dd) | String getEffectiveDate() | setEffectiveDate(String effectiveDate) |
| `ShareClassNo` | `String` | Optional | Sequential number within the limited company to identify the Share Class | String getShareClassNo() | setShareClassNo(String shareClassNo) |
| `ShareholdingNo` | `String` | Optional | Sequential number within the limited company to identify the Shareholding of the associated Share Class | String getShareholdingNo() | setShareholdingNo(String shareholdingNo) |
| `NumShares` | `Double` | Optional | - | Double getNumShares() | setNumShares(Double numShares) |
| `TotalNominalCapital` | `String` | Optional | Calculated Total Nominal Capital for Shareholding | String getTotalNominalCapital() | setTotalNominalCapital(String totalNominalCapital) |
| `Percentage` | `Double` | Optional | - | Double getPercentage() | setPercentage(Double percentage) |
| `PercentageTotalCapital` | `Double` | Optional | Calculated Percentage Total Capital for Shareholding | Double getPercentageTotalCapital() | setPercentageTotalCapital(Double percentageTotalCapital) |
| `Approximation` | `String` | Optional | - | String getApproximation() | setApproximation(String approximation) |
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
  "NumShares": null,
  "TotalNominalCapital": null,
  "Percentage": null,
  "PercentageTotalCapital": null,
  "Approximation": null,
  "LatestUpdate": null
}
```

