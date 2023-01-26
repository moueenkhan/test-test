
# Fax Details

## Structure

`FaxDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DiallingCode` | `String` | Optional | The dialling code component of the fax number held for the non-limited business | String getDiallingCode() | setDiallingCode(String diallingCode) |
| `MainNumber` | `String` | Optional | The individual number component of the fax number held for the non-limited business | String getMainNumber() | setMainNumber(String mainNumber) |
| `FPSFlag` | `String` | Optional | Indicator showing whether this fax number for the non-limited business is registered with the Telephone Preference Scheme | String getFPSFlag() | setFPSFlag(String fPSFlag) |

## Example (as JSON)

```json
{
  "DiallingCode": null,
  "MainNumber": null,
  "FPSFlag": null
}
```

