
# Prev Director Details

## Structure

`PrevDirectorDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`NameDetls`](../../doc/models/name-detls.md) | Optional | - | NameDetls getName() | setName(NameDetls name) |
| `DateOfBirth` | `String` | Optional | Date of birth (yyyy-mm-dd or yyyy-mm) | String getDateOfBirth() | setDateOfBirth(String dateOfBirth) |
| `DirectorAge` | `String` | Optional | Previous Director's age in years | String getDirectorAge() | setDirectorAge(String directorAge) |
| `Qualifications` | `String` | Optional | Previous Director's qualifications (BSC, etc) | String getQualifications() | setQualifications(String qualifications) |
| `Title` | `String` | Optional | Previous Director's title (Lord, Dame, etc.) | String getTitle() | setTitle(String title) |
| `CommercialDetail` | [`SecCommercialDetail`](../../doc/models/sec-commercial-detail.md) | Optional | - | SecCommercialDetail getCommercialDetail() | setCommercialDetail(SecCommercialDetail commercialDetail) |
| `Location` | [`Location`](../../doc/models/location.md) | Optional | - | Location getLocation() | setLocation(Location location) |
| `Position` | `String` | Optional | Previous Director's position as textual description | String getPosition() | setPosition(String position) |
| `Occupation` | `String` | Optional | Previous Director's occupation as textual description | String getOccupation() | setOccupation(String occupation) |
| `Nationality` | `String` | Optional | Previous Director's nationality as textual description | String getNationality() | setNationality(String nationality) |
| `ShareInformation` | `String` | Optional | Previous Director's share information as textual description e.g. "50 ORD &pound;1" | String getShareInformation() | setShareInformation(String shareInformation) |

## Example (as JSON)

```json
{
  "Name": null,
  "DateOfBirth": null,
  "DirectorAge": null,
  "Qualifications": null,
  "Title": null,
  "CommercialDetail": null,
  "Location": null,
  "Position": null,
  "Occupation": null,
  "Nationality": null,
  "ShareInformation": null
}
```

