
# Dir Detail

## Structure

`DirDetail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CommercialDetail` | [`CommDetail`](../../doc/models/comm-detail.md) | Optional | - | CommDetail getCommercialDetail() | setCommercialDetail(CommDetail commercialDetail) |
| `DateOfBirth` | `String` | Optional | Date of birth (yyyy-mm-dd) | String getDateOfBirth() | setDateOfBirth(String dateOfBirth) |
| `Location` | [`OutputDirLocationDetail`](../../doc/models/output-dir-location-detail.md) | Optional | - | OutputDirLocationDetail getLocation() | setLocation(OutputDirLocationDetail location) |
| `Name` | [`OutputNameDetail`](../../doc/models/output-name-detail.md) | Optional | - | OutputNameDetail getName() | setName(OutputNameDetail name) |
| `Nationality` | `String` | Optional | Director's nationality as textual description | String getNationality() | setNationality(String nationality) |

## Example (as JSON)

```json
{
  "CommercialDetail": null,
  "DateOfBirth": null,
  "Location": null,
  "Name": null,
  "Nationality": null
}
```

