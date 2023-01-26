
# Bankruptcy Details

## Structure

`BankruptcyDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RecordType` | `String` | Optional | Indicator showing record type - M=main, A=Associated, P=Pool | String getRecordType() | setRecordType(String recordType) |
| `GazetteDate` | `String` | Optional | Gazette date (yyyy-mm-dd) | String getGazetteDate() | setGazetteDate(String gazetteDate) |
| `BankruptcyType` | `String` | Optional | Bankruptcy Type - BO = Bankruptcy Order; SEQ= Sequestration etc. | String getBankruptcyType() | setBankruptcyType(String bankruptcyType) |
| `Name` | `String` | Optional | Trading name of subject non-limited business as identified for the bankruptcy | String getName() | setName(String name) |
| `BankruptcyLocation` | [`NonLtdBusinessLocation`](../../doc/models/non-ltd-business-location.md) | Optional | - | NonLtdBusinessLocation getBankruptcyLocation() | setBankruptcyLocation(NonLtdBusinessLocation bankruptcyLocation) |
| `BankruptcyText` | `String` | Optional | Bankruptcy text | String getBankruptcyText() | setBankruptcyText(String bankruptcyText) |

## Example (as JSON)

```json
{
  "RecordType": null,
  "GazetteDate": null,
  "BankruptcyType": null,
  "Name": null,
  "BankruptcyLocation": null,
  "BankruptcyText": null
}
```

