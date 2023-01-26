
# Share Capital

## Structure

`ShareCapital`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LastList` | `String` | Optional | Last Confirmation Statement Date that includes shareholder details (yyyy-mm-dd) | String getLastList() | setLastList(String lastList) |
| `IssuingCompany` | `String` | Optional | Registration Number of company issuing the shares | String getIssuingCompany() | setIssuingCompany(String issuingCompany) |
| `CurrentPreviousFlag` | `String` | Optional | Indicator showing whether this is a current (C) or previous (P) shareholding | String getCurrentPreviousFlag() | setCurrentPreviousFlag(String currentPreviousFlag) |
| `EffectiveDate` | `String` | Optional | Effective date (yyyy-mm-dd) | String getEffectiveDate() | setEffectiveDate(String effectiveDate) |
| `ShareClassNo` | `String` | Optional | Sequential number within the limited company to identify the Share Class | String getShareClassNo() | setShareClassNo(String shareClassNo) |
| `Currency` | `String` | Optional | Currency under which the Share Capital has been created - ISO currency code | String getCurrency() | setCurrency(String currency) |
| `ShareClassCode` | `String` | Optional | Code identifying the Share Class | String getShareClassCode() | setShareClassCode(String shareClassCode) |
| `ShareClassDesc` | `String` | Optional | Description of the Share Class | String getShareClassDesc() | setShareClassDesc(String shareClassDesc) |
| `VotingRights` | `String` | Optional | Indicator showing whether this Share Capital has voting rights | String getVotingRights() | setVotingRights(String votingRights) |
| `TotalNominalCapital` | `String` | Optional | Total Nominal Capital for the Share Capital | String getTotalNominalCapital() | setTotalNominalCapital(String totalNominalCapital) |
| `NumShares` | `Double` | Optional | Number of shares for the Share Capital | Double getNumShares() | setNumShares(Double numShares) |
| `NominalValue` | `String` | Optional | Nominal value of each share for the Share Capital | String getNominalValue() | setNominalValue(String nominalValue) |
| `Percentage` | `double` | Required | - | double getPercentage() | setPercentage(double percentage) |
| `LatestUpdate` | `String` | Optional | Date that the limited company data for this block was last updated (yyyy-mm-dd) | String getLatestUpdate() | setLatestUpdate(String latestUpdate) |

## Example (as JSON)

```json
{
  "LastList": null,
  "IssuingCompany": null,
  "CurrentPreviousFlag": null,
  "EffectiveDate": null,
  "ShareClassNo": null,
  "Currency": null,
  "ShareClassCode": null,
  "ShareClassDesc": null,
  "VotingRights": null,
  "TotalNominalCapital": null,
  "NumShares": null,
  "NominalValue": null,
  "Percentage": 80.82,
  "LatestUpdate": null
}
```

