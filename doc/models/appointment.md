
# Appointment

## Structure

`Appointment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AdminOrderDate` | `String` | Optional | Administrator appointment date (yyyy-mm-dd) | String getAdminOrderDate() | setAdminOrderDate(String adminOrderDate) |
| `Administrator` | [`List<Administrator>`](../../doc/models/administrator.md) | Optional | - | List<Administrator> getAdministrator() | setAdministrator(List<Administrator> administrator) |
| `LodgedDate` | `String` | Optional | Lodged Date for the appointment of Administrators for the limited company (yyyy-mm-dd) | String getLodgedDate() | setLodgedDate(String lodgedDate) |
| `NumberAdministrators` | `Integer` | Optional | Number of Administrators for the appointment of Administrators for the limited company (max 5) | Integer getNumberAdministrators() | setNumberAdministrators(Integer numberAdministrators) |
| `PublicationTown` | `String` | Optional | Publication Town for appointment of Administrators indicator - B = Belfast; C = Cardiff; E = Edinburgh; L = London | String getPublicationTown() | setPublicationTown(String publicationTown) |

## Example (as JSON)

```json
{
  "AdminOrderDate": null,
  "Administrator": null,
  "LodgedDate": null,
  "NumberAdministrators": null,
  "PublicationTown": null
}
```

