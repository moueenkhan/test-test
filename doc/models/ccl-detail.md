
# CCL Detail

## Structure

`CCLDetail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RecordType` | `String` | Optional | - | String getRecordType() | setRecordType(String recordType) |
| `LicenceNumber` | `String` | Optional | Licence Number | String getLicenceNumber() | setLicenceNumber(String licenceNumber) |
| `LicenceDate` | `String` | Optional | Licence Date (yyyy-mm-dd) | String getLicenceDate() | setLicenceDate(String licenceDate) |
| `LicenceCategories` | `String` | Optional | Consumer Credit Licence Categories - A = Consumer credit business; B = Consumer hire business; C = Credit brokerage; D = Debt adjusting and debt counselling; E = Debt collecting; F = Credit reference agency; Z = Right to canvass | String getLicenceCategories() | setLicenceCategories(String licenceCategories) |
| `DeterminationToRevokeDate` | `String` | Optional | The date of Determination To Revoke Consumer Credit Licence (yyyy-mm-dd) | String getDeterminationToRevokeDate() | setDeterminationToRevokeDate(String determinationToRevokeDate) |
| `DeterminationToSuspendDate` | `String` | Optional | The date of Determination To Suspend Consumer Credit Licence (yyyy-mm-dd) | String getDeterminationToSuspendDate() | setDeterminationToSuspendDate(String determinationToSuspendDate) |
| `DeterminationToVaryDate` | `String` | Optional | The date of Determination To Vary Consumer Credit Licence (yyyy-mm-dd) | String getDeterminationToVaryDate() | setDeterminationToVaryDate(String determinationToVaryDate) |
| `AppealDate` | `String` | Optional | Consumer Credit Licence Appeal Date (yyyy-mm-dd) | String getAppealDate() | setAppealDate(String appealDate) |
| `SuspensionDate` | `String` | Optional | Consumer Credit Licence Suspension Date (yyyy-mm-dd) | String getSuspensionDate() | setSuspensionDate(String suspensionDate) |
| `SuspendPeriod` | `Integer` | Optional | Number of months for Consumer Credit Licence suspension period | Integer getSuspendPeriod() | setSuspendPeriod(Integer suspendPeriod) |
| `TerminationDate` | `String` | Optional | Consumer Credit Licence Termination Date (yyyy-mm-dd) | String getTerminationDate() | setTerminationDate(String terminationDate) |
| `LapsedDate` | `String` | Optional | Consumer Credit Licence Lapsed Date (yyyy-mm-dd) | String getLapsedDate() | setLapsedDate(String lapsedDate) |
| `NumberTradingNames` | `Integer` | Optional | Number of trading names covered by the Consumer Credit Licence | Integer getNumberTradingNames() | setNumberTradingNames(Integer numberTradingNames) |
| `LicenseeDetail` | `String` | Optional | Licensee Name | String getLicenseeDetail() | setLicenseeDetail(String licenseeDetail) |
| `LicenseeLocation` | [`NonLtdBusinessLocation`](../../doc/models/non-ltd-business-location.md) | Optional | - | NonLtdBusinessLocation getLicenseeLocation() | setLicenseeLocation(NonLtdBusinessLocation licenseeLocation) |
| `TradingNames` | [`List<TradeNames>`](../../doc/models/trade-names.md) | Optional | - | List<TradeNames> getTradingNames() | setTradingNames(List<TradeNames> tradingNames) |

## Example (as JSON)

```json
{
  "RecordType": null,
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
  "LapsedDate": null,
  "NumberTradingNames": null,
  "LicenseeDetail": null,
  "LicenseeLocation": null,
  "TradingNames": null
}
```

