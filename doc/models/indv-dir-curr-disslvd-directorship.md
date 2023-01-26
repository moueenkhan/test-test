
# Indv Dir Curr Disslvd Directorship

## Structure

`IndvDirCurrDisslvdDirectorship`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AppointmentDate` | `String` | Optional | Director Appointment Date (yyyy-mm-dd) | String getAppointmentDate() | setAppointmentDate(String appointmentDate) |
| `AppointmentIndicator` | `String` | Optional | Directorship appointment Indicator - E-exact, P-prior to | String getAppointmentIndicator() | setAppointmentIndicator(String appointmentIndicator) |
| `CommercialDetail` | [`CommDetailsRegNumber`](../../doc/models/comm-details-reg-number.md) | Optional | - | CommDetailsRegNumber getCommercialDetail() | setCommercialDetail(CommDetailsRegNumber commercialDetail) |
| `DirectorshipLength` | `String` | Optional | Length of directorship in months | String getDirectorshipLength() | setDirectorshipLength(String directorshipLength) |
| `DissolutionDate` | `String` | Optional | Dissolution Date (yyyy-mm-dd) | String getDissolutionDate() | setDissolutionDate(String dissolutionDate) |
| `LatestEvent` | `String` | Optional | Latest event date (yyyy-mm-dd) | String getLatestEvent() | setLatestEvent(String latestEvent) |
| `LatestEventCode` | `String` | Optional | Indicator showing type of latest event for the dissolved directorship - 05 = Compulsory Liquidation; 10 = Creditors Voluntary Liquidation; 15 = Members Voluntary Liquidation; 20 = Liquidation of Unknown Type; 25 = Winding up Order; 30 = Administrator Appointed; 35 = Administration Order Discharged; 40 = Administrative Receiver Appointed; 45 = Receiver Appointment; 50 = Administrative Receiver Cessation; 55 = Receiver Cessation; 60 = Voluntary Arrangement Approved; 65 = Voluntary Arrangement Completed; 70 = Voluntary Arrangement Revoked; 75 = Voluntary Arrangement Suspended; 80 = Company Reinstated; Blank ' ' no events | String getLatestEventCode() | setLatestEventCode(String latestEventCode) |
| `LatestReturns` | `String` | Optional | Latest returns date (yyyy-mm-dd) | String getLatestReturns() | setLatestReturns(String latestReturns) |
| `Occupation` | `String` | Optional | Occupation of Director within dissolved directorship | String getOccupation() | setOccupation(String occupation) |
| `Position` | `String` | Optional | Position for Director within dissolved directorship | String getPosition() | setPosition(String position) |
| `Qualifications` | `String` | Optional | Qualifications of Director within dissolved directorship | String getQualifications() | setQualifications(String qualifications) |
| `Shares` | `String` | Optional | Shares held by Director within dissolved directorship | String getShares() | setShares(String shares) |

## Example (as JSON)

```json
{
  "AppointmentDate": null,
  "AppointmentIndicator": null,
  "CommercialDetail": null,
  "DirectorshipLength": null,
  "DissolutionDate": null,
  "LatestEvent": null,
  "LatestEventCode": null,
  "LatestReturns": null,
  "Occupation": null,
  "Position": null,
  "Qualifications": null,
  "Shares": null
}
```

