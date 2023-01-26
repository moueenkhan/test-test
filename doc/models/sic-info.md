
# SIC Info

## Structure

`SICInfo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CodeType` | `String` | Optional | Indicator showing which SIC Code is used in the following fields - A=1980; B=1992 | String getCodeType() | setCodeType(String codeType) |
| `SICCode` | `String` | Optional | The SIC code for the business returned from the Business search | String getSICCode() | setSICCode(String sICCode) |
| `Description` | `String` | Optional | The SIC description for the business returned from the Business search | String getDescription() | setDescription(String description) |

## Example (as JSON)

```json
{
  "CodeType": null,
  "SICCode": null,
  "Description": null
}
```

