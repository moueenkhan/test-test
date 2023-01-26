
# Current Directors

## Structure

`CurrentDirectors`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ForeignAddressFlag` | `String` | Optional | Current Director address location indicator - Y = Foreign; N = Not foreign; M = Unknown | String getForeignAddressFlag() | setForeignAddressFlag(String foreignAddressFlag) |
| `DirectorCompanyFlag` | `String` | Optional | Current Director company indicator - Y = Director is a company; N = Director is not a company | String getDirectorCompanyFlag() | setDirectorCompanyFlag(String directorCompanyFlag) |
| `DirectorNumber` | `String` | Optional | Experian Director reference number | String getDirectorNumber() | setDirectorNumber(String directorNumber) |
| `AppointmentDate` | `String` | Optional | Director appointment date (yyyy-mm-dd) | String getAppointmentDate() | setAppointmentDate(String appointmentDate) |
| `AppointmentIndicator` | `String` | Optional | The date of Current Director's appointment qualifier - P=prior to Appointment The date; E=exact date | String getAppointmentIndicator() | setAppointmentIndicator(String appointmentIndicator) |
| `DirectorshipLength` | `Integer` | Optional | Length of Current Directorship in months | Integer getDirectorshipLength() | setDirectorshipLength(Integer directorshipLength) |
| `LatestReturns` | `String` | Optional | Date of last returns (yyyy-mm-dd) | String getLatestReturns() | setLatestReturns(String latestReturns) |
| `NOCRef` | `String` | Optional | Notice of Correction reference | String getNOCRef() | setNOCRef(String nOCRef) |
| `NumberConvictions` | `Integer` | Optional | Number of convictions against the Current Director | Integer getNumberConvictions() | setNumberConvictions(Integer numberConvictions) |
| `ConvictionDetails` | [`List<ConvictionDetails>`](../../doc/models/conviction-details.md) | Optional | - | List<ConvictionDetails> getConvictionDetails() | setConvictionDetails(List<ConvictionDetails> convictionDetails) |
| `DirectorDetails` | [`DirectorDetails`](../../doc/models/director-details.md) | Optional | - | DirectorDetails getDirectorDetails() | setDirectorDetails(DirectorDetails directorDetails) |

## Example (as JSON)

```json
{
  "ForeignAddressFlag": null,
  "DirectorCompanyFlag": null,
  "DirectorNumber": null,
  "AppointmentDate": null,
  "AppointmentIndicator": null,
  "DirectorshipLength": null,
  "LatestReturns": null,
  "NOCRef": null,
  "NumberConvictions": null,
  "ConvictionDetails": null,
  "DirectorDetails": null
}
```

