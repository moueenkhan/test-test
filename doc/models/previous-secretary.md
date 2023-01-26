
# Previous Secretary

## Structure

`PreviousSecretary`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ForeignAddressFlag` | `String` | Optional | Previous Secretary address location indicator - Y = Foreign; N = Not foreign; M = Unknown | String getForeignAddressFlag() | setForeignAddressFlag(String foreignAddressFlag) |
| `SecretaryCompanyFlag` | `String` | Optional | Previous Secretary company indicator - Y = Secretary is a company; N = Secretary is not a company | String getSecretaryCompanyFlag() | setSecretaryCompanyFlag(String secretaryCompanyFlag) |
| `DirectorNumber` | `String` | Optional | Experian Director reference number | String getDirectorNumber() | setDirectorNumber(String directorNumber) |
| `AppointmentDate` | `String` | Optional | Previous secretary appointment date (yyyy-mm-dd) | String getAppointmentDate() | setAppointmentDate(String appointmentDate) |
| `AppointmentIndicator` | `String` | Optional | The date of Previous Secretary's appointment qualifier - P=prior to Appointment The date; E=exact date | String getAppointmentIndicator() | setAppointmentIndicator(String appointmentIndicator) |
| `ResignationDate` | `String` | Optional | Previous secretary resignation date (yyyy-mm-dd) | String getResignationDate() | setResignationDate(String resignationDate) |
| `ResignationIndicator` | `String` | Optional | The date of Previous Secretary's Resignation qualifier - P=prior to Resignation The date; E=exact date | String getResignationIndicator() | setResignationIndicator(String resignationIndicator) |
| `NOCRef` | `String` | Optional | Notice of Correction reference | String getNOCRef() | setNOCRef(String nOCRef) |
| `SecretaryDetails` | [`SecretaryDetails`](../../doc/models/secretary-details.md) | Optional | - | SecretaryDetails getSecretaryDetails() | setSecretaryDetails(SecretaryDetails secretaryDetails) |

## Example (as JSON)

```json
{
  "ForeignAddressFlag": null,
  "SecretaryCompanyFlag": null,
  "DirectorNumber": null,
  "AppointmentDate": null,
  "AppointmentIndicator": null,
  "ResignationDate": null,
  "ResignationIndicator": null,
  "NOCRef": null,
  "SecretaryDetails": null
}
```

