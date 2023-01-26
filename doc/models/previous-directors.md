
# Previous Directors

## Structure

`PreviousDirectors`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ForeignAddressFlag` | `String` | Optional | Previous Director address location indicator - Y = Foreign; N = Not foreign; M = Unknown | String getForeignAddressFlag() | setForeignAddressFlag(String foreignAddressFlag) |
| `DirectorCompanyFlag` | `String` | Optional | Previous Director company indicator - Y = Director is a company; N = Director is not a company | String getDirectorCompanyFlag() | setDirectorCompanyFlag(String directorCompanyFlag) |
| `DirectorNumber` | `String` | Optional | Experian Director reference number | String getDirectorNumber() | setDirectorNumber(String directorNumber) |
| `AppointmentDate` | `String` | Optional | Previous director appointment date (yyyy-mm-dd) | String getAppointmentDate() | setAppointmentDate(String appointmentDate) |
| `AppointmentIndicator` | `String` | Optional | The date of Previous Director's appointment qualifier - P=prior to Appointment The date; E=exact date | String getAppointmentIndicator() | setAppointmentIndicator(String appointmentIndicator) |
| `ResignationDate` | `String` | Optional | Previous director resignation date (yyyy-mm-dd) | String getResignationDate() | setResignationDate(String resignationDate) |
| `ResignationIndicator` | `String` | Optional | The date of Previous Director's Resignation qualifier - P=prior to Resignation The date; E=exact date | String getResignationIndicator() | setResignationIndicator(String resignationIndicator) |
| `DirectorshipLength` | `Integer` | Optional | Length of Previous Directorship in months | Integer getDirectorshipLength() | setDirectorshipLength(Integer directorshipLength) |
| `LatestReturns` | `String` | Optional | Date of latest returns (yyyy-mm-dd) | String getLatestReturns() | setLatestReturns(String latestReturns) |
| `NOCRef` | `String` | Optional | Notice of Correction reference | String getNOCRef() | setNOCRef(String nOCRef) |
| `NumberConvictions` | `Integer` | Optional | Number of convictions against the Previous Director | Integer getNumberConvictions() | setNumberConvictions(Integer numberConvictions) |
| `ConvictionDetails` | [`List<ConvictionDetails>`](../../doc/models/conviction-details.md) | Optional | - | List<ConvictionDetails> getConvictionDetails() | setConvictionDetails(List<ConvictionDetails> convictionDetails) |
| `DirectorDetails` | [`PrevDirectorDetails`](../../doc/models/prev-director-details.md) | Optional | - | PrevDirectorDetails getDirectorDetails() | setDirectorDetails(PrevDirectorDetails directorDetails) |

## Example (as JSON)

```json
{
  "ForeignAddressFlag": null,
  "DirectorCompanyFlag": null,
  "DirectorNumber": null,
  "AppointmentDate": null,
  "AppointmentIndicator": null,
  "ResignationDate": null,
  "ResignationIndicator": null,
  "DirectorshipLength": null,
  "LatestReturns": null,
  "NOCRef": null,
  "NumberConvictions": null,
  "ConvictionDetails": null,
  "DirectorDetails": null
}
```

