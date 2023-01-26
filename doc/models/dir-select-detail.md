
# Dir Select Detail

## Structure

`DirSelectDetail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`FullNameDetail`](../../doc/models/full-name-detail.md) | Optional | - | FullNameDetail getName() | setName(FullNameDetail name) |
| `DateOfBirth` | `String` | Optional | Date of birth (yyyy-mm-dd) | String getDateOfBirth() | setDateOfBirth(String dateOfBirth) |
| `Qualification` | `String` | Optional | Director's qualifications (BSC, etc) returned from the Director search | String getQualification() | setQualification(String qualification) |
| `Location` | [`DirSelectOutLocationDetail`](../../doc/models/dir-select-out-location-detail.md) | Optional | - | DirSelectOutLocationDetail getLocation() | setLocation(DirSelectOutLocationDetail location) |

## Example (as JSON)

```json
{
  "Name": null,
  "DateOfBirth": null,
  "Qualification": null,
  "Location": null
}
```

