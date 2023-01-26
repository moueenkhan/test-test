
# Directr Selection List

## Structure

`DirectrSelectionList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DirectorNumber` | `String` | Optional | Director number identifying the person returned from the Director search | String getDirectorNumber() | setDirectorNumber(String directorNumber) |
| `DirectorFlag` | `String` | Optional | Indicator showing whether the person returned from the Director search is a Director. 'Y' = Director, 'N' = Not a director | String getDirectorFlag() | setDirectorFlag(String directorFlag) |
| `SecretaryFlag` | `String` | Optional | Indicator showing whether the person returned from the Director search is a Secretary.'Y' = Secretary, 'N' = Not a secretary | String getSecretaryFlag() | setSecretaryFlag(String secretaryFlag) |
| `CurrPrevName` | `String` | Optional | Indicator showing whether the name returned from the Director search is current or previous. 'C' = Current, 'P' = Previous | String getCurrPrevName() | setCurrPrevName(String currPrevName) |
| `CurrPrevAddress` | `String` | Optional | Indicator showing whether the address returned from the Director search is current or previous - 'C' = Current, 'P' = Previous | String getCurrPrevAddress() | setCurrPrevAddress(String currPrevAddress) |
| `DirectorDetails` | [`DirSelectDetail`](../../doc/models/dir-select-detail.md) | Optional | - | DirSelectDetail getDirectorDetails() | setDirectorDetails(DirSelectDetail directorDetails) |

## Example (as JSON)

```json
{
  "DirectorNumber": null,
  "DirectorFlag": null,
  "SecretaryFlag": null,
  "CurrPrevName": null,
  "CurrPrevAddress": null,
  "DirectorDetails": null
}
```

