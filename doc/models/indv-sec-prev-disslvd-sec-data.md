
# Indv Sec Prev Disslvd Sec Data

## Structure

`IndvSecPrevDisslvdSecData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AppointmentDate` | `String` | Optional | Appointment Date (yyyy-mm-dd) | String getAppointmentDate() | setAppointmentDate(String appointmentDate) |
| `AppointmentIndicator` | `String` | Optional | Secretaryship appointment Indicator - E-exact, P-prior to | String getAppointmentIndicator() | setAppointmentIndicator(String appointmentIndicator) |
| `CommercialDetail` | [`CommDetailsRegNumber`](../../doc/models/comm-details-reg-number.md) | Optional | - | CommDetailsRegNumber getCommercialDetail() | setCommercialDetail(CommDetailsRegNumber commercialDetail) |
| `DissolutionDate` | `String` | Optional | Dissolution Date (yyyy-mm-dd) | String getDissolutionDate() | setDissolutionDate(String dissolutionDate) |
| `LatestReturns` | `String` | Optional | Latest Returns date (yyyy-mm-dd) | String getLatestReturns() | setLatestReturns(String latestReturns) |
| `ResignationDate` | `String` | Optional | Resignation Date (yyyy-mm-dd) | String getResignationDate() | setResignationDate(String resignationDate) |
| `ResignationIndicator` | `String` | Optional | Previous secretaryship resignation Indicator - E-exact, P-prior to | String getResignationIndicator() | setResignationIndicator(String resignationIndicator) |
| `SecretaryshipLength` | `String` | Optional | Length of previous secretaryship in months | String getSecretaryshipLength() | setSecretaryshipLength(String secretaryshipLength) |
| `Shares` | `String` | Optional | Shares held by Secretary within dissolved previous secretaryship | String getShares() | setShares(String shares) |

## Example (as JSON)

```json
{
  "AppointmentDate": null,
  "AppointmentIndicator": null,
  "CommercialDetail": null,
  "DissolutionDate": null,
  "LatestReturns": null,
  "ResignationDate": null,
  "ResignationIndicator": null,
  "SecretaryshipLength": null,
  "Shares": null
}
```

