
# Secretary Details

## Structure

`SecretaryDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`NameDetls`](../../doc/models/name-detls.md) | Optional | - | NameDetls getName() | setName(NameDetls name) |
| `Qualifications` | `String` | Optional | Secretary's qualifications (BSC, etc) | String getQualifications() | setQualifications(String qualifications) |
| `Title` | `String` | Optional | Secretary's title (Lord, Dame, etc.) | String getTitle() | setTitle(String title) |
| `CommercialDetail` | [`SecCommercialDetail`](../../doc/models/sec-commercial-detail.md) | Optional | - | SecCommercialDetail getCommercialDetail() | setCommercialDetail(SecCommercialDetail commercialDetail) |
| `Location` | [`Location`](../../doc/models/location.md) | Optional | - | Location getLocation() | setLocation(Location location) |

## Example (as JSON)

```json
{
  "Name": null,
  "Qualifications": null,
  "Title": null,
  "CommercialDetail": null,
  "Location": null
}
```

