
# Indv Sec Curr Sec Data

## Structure

`IndvSecCurrSecData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AppointmentDate` | `String` | Optional | Appointment Date (yyyy-mm-dd) | String getAppointmentDate() | setAppointmentDate(String appointmentDate) |
| `AppointmentIndicator` | `String` | Optional | Secretaryship appointment Indicator - E-exact, P-prior to | String getAppointmentIndicator() | setAppointmentIndicator(String appointmentIndicator) |
| `CommercialDetail` | [`CommDetailsRegNumber`](../../doc/models/comm-details-reg-number.md) | Optional | - | CommDetailsRegNumber getCommercialDetail() | setCommercialDetail(CommDetailsRegNumber commercialDetail) |
| `LatestReturns` | `String` | Optional | Latest returns Date (yyyy-mm-dd) | String getLatestReturns() | setLatestReturns(String latestReturns) |
| `SecretaryshipLength` | `String` | Optional | Length of secretaryship in months | String getSecretaryshipLength() | setSecretaryshipLength(String secretaryshipLength) |
| `Shares` | `String` | Optional | Shares held by Secretary within secretaryship | String getShares() | setShares(String shares) |

## Example (as JSON)

```json
{
  "AppointmentDate": null,
  "AppointmentIndicator": null,
  "CommercialDetail": null,
  "LatestReturns": null,
  "SecretaryshipLength": null,
  "Shares": null
}
```

