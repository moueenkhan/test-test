
# CCL Ltd Detail

## Structure

`CCLLtdDetail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LicenceNumber` | `String` | Optional | License Date | String getLicenceNumber() | setLicenceNumber(String licenceNumber) |
| `LicenceDate` | `String` | Optional | CCL License Date (yyyy-mm-dd) | String getLicenceDate() | setLicenceDate(String licenceDate) |
| `LicenceCategories` | `String` | Optional | CCL Licence Categories - A = Consumer credit business; B = Consumer hire business; C = Credit brokerage; D = Debt adjusting and debt counselling; E = Debt collecting; F = Credit reference agency; Z = Right to canvass | String getLicenceCategories() | setLicenceCategories(String licenceCategories) |
| `DeterminationToRevokeDate` | `String` | Optional | Determination To Revoke Date (yyyy-mm-dd) | String getDeterminationToRevokeDate() | setDeterminationToRevokeDate(String determinationToRevokeDate) |
| `DeterminationToSuspendDate` | `String` | Optional | Determination To Suspend Date (yyyy-mm-dd) | String getDeterminationToSuspendDate() | setDeterminationToSuspendDate(String determinationToSuspendDate) |
| `DeterminationToVaryDate` | `String` | Optional | Determination To Vary Date (yyyy-mm-dd) | String getDeterminationToVaryDate() | setDeterminationToVaryDate(String determinationToVaryDate) |
| `AppealDate` | `String` | Optional | CCL Appeal Date (yyyy-mm-dd) | String getAppealDate() | setAppealDate(String appealDate) |
| `SuspensionDate` | `String` | Optional | CCL Suspension Date (yyyy-mm-dd) | String getSuspensionDate() | setSuspensionDate(String suspensionDate) |
| `SuspendPeriod` | `Integer` | Optional | Number of months for CCL suspension period | Integer getSuspendPeriod() | setSuspendPeriod(Integer suspendPeriod) |
| `TerminationDate` | `String` | Optional | CCL Termination Date (yyyy-mm-dd) | String getTerminationDate() | setTerminationDate(String terminationDate) |
| `LicenseeDetail` | `String` | Optional | Licensee Name | String getLicenseeDetail() | setLicenseeDetail(String licenseeDetail) |
| `LicenseeLocation` | [`LtdBusinessLocation`](../../doc/models/ltd-business-location.md) | Optional | - | LtdBusinessLocation getLicenseeLocation() | setLicenseeLocation(LtdBusinessLocation licenseeLocation) |
| `TradingNames` | [`List<TradeNames>`](../../doc/models/trade-names.md) | Optional | - | List<TradeNames> getTradingNames() | setTradingNames(List<TradeNames> tradingNames) |

## Example (as JSON)

```json
{
  "LicenceNumber": null,
  "LicenceDate": null,
  "LicenceCategories": null,
  "DeterminationToRevokeDate": null,
  "DeterminationToSuspendDate": null,
  "DeterminationToVaryDate": null,
  "AppealDate": null,
  "SuspensionDate": null,
  "SuspendPeriod": null,
  "TerminationDate": null,
  "LicenseeDetail": null,
  "LicenseeLocation": null,
  "TradingNames": null
}
```

