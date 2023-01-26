
# Telephone Details

## Structure

`TelephoneDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DiallingCode` | `String` | Optional | The dialling code component of the telephone number held for the non-limited business | String getDiallingCode() | setDiallingCode(String diallingCode) |
| `MainNumber` | `String` | Optional | The individual number component of the telephone number held for the non-limited business | String getMainNumber() | setMainNumber(String mainNumber) |
| `TPSFlag` | `String` | Optional | Indicator showing whether this telephone number for the non-limited business is registered with the Telephone Preference Scheme | String getTPSFlag() | setTPSFlag(String tPSFlag) |

## Example (as JSON)

```json
{
  "DiallingCode": null,
  "MainNumber": null,
  "TPSFlag": null
}
```

