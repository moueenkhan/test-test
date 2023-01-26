
# Director Data

## Structure

`DirectorData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DirectorNumber` | `String` | Optional | Experian Director reference number | String getDirectorNumber() | setDirectorNumber(String directorNumber) |
| `DirectorSecretaryFlag` | `String` | Optional | Indicator showing whether the person is a Director, Secretary or both - D=Director only, S=Secretary only, B=Both | String getDirectorSecretaryFlag() | setDirectorSecretaryFlag(String directorSecretaryFlag) |
| `ForeignAddressFlag` | `String` | Optional | Indicator showing whether the person's address is foreign - N=UK address, Y=Foreign Address, M=Unknown address | String getForeignAddressFlag() | setForeignAddressFlag(String foreignAddressFlag) |
| `DirectorCompanyFlag` | `String` | Optional | Indicator showing whether the director / secretary is a company - Y=director is a company, N=director is not a company | String getDirectorCompanyFlag() | setDirectorCompanyFlag(String directorCompanyFlag) |
| `DirectorDetails` | [`DirDetail`](../../doc/models/dir-detail.md) | Optional | - | DirDetail getDirectorDetails() | setDirectorDetails(DirDetail directorDetails) |
| `PreviousAddresses` | [`List<DirPreviousAddr>`](../../doc/models/dir-previous-addr.md) | Optional | - | List<DirPreviousAddr> getPreviousAddresses() | setPreviousAddresses(List<DirPreviousAddr> previousAddresses) |
| `PreviousNames` | [`List<IndvDirPrevName>`](../../doc/models/indv-dir-prev-name.md) | Optional | - | List<IndvDirPrevName> getPreviousNames() | setPreviousNames(List<IndvDirPrevName> previousNames) |
| `Directorships` | [`Directorships`](../../doc/models/directorships.md) | Optional | - | Directorships getDirectorships() | setDirectorships(Directorships directorships) |
| `Secretaryships` | [`Secretaryships`](../../doc/models/secretaryships.md) | Optional | - | Secretaryships getSecretaryships() | setSecretaryships(Secretaryships secretaryships) |
| `DisqualStartDate` | `String` | Optional | Disqualification Start Date (yyyy-mm-dd) | String getDisqualStartDate() | setDisqualStartDate(String disqualStartDate) |
| `DisqualEndDate` | `String` | Optional | Disqualification End Date (yyyy-mm-dd) | String getDisqualEndDate() | setDisqualEndDate(String disqualEndDate) |
| `Convictions` | [`List<IndvDirConvData>`](../../doc/models/indv-dir-conv-data.md) | Optional | - | List<IndvDirConvData> getConvictions() | setConvictions(List<IndvDirConvData> convictions) |
| `SummaryDirectorCIFAS` | [`List<SummaryDirectorCIFAS>`](../../doc/models/summary-director-cifas.md) | Optional | - | List<SummaryDirectorCIFAS> getSummaryDirectorCIFAS() | setSummaryDirectorCIFAS(List<SummaryDirectorCIFAS> summaryDirectorCIFAS) |
| `DetailDirectorCIFAS` | [`List<DetailDirectorCIFAS>`](../../doc/models/detail-director-cifas.md) | Optional | - | List<DetailDirectorCIFAS> getDetailDirectorCIFAS() | setDetailDirectorCIFAS(List<DetailDirectorCIFAS> detailDirectorCIFAS) |
| `NoticeOfCorrection` | [`NoticeOfCorrection`](../../doc/models/notice-of-correction.md) | Optional | - | NoticeOfCorrection getNoticeOfCorrection() | setNoticeOfCorrection(NoticeOfCorrection noticeOfCorrection) |
| `Error` | [`Error`](../../doc/models/error.md) | Optional | - | Error getError() | setError(Error error) |

## Example (as JSON)

```json
{
  "DirectorNumber": null,
  "DirectorSecretaryFlag": null,
  "ForeignAddressFlag": null,
  "DirectorCompanyFlag": null,
  "DirectorDetails": null,
  "PreviousAddresses": null,
  "PreviousNames": null,
  "Directorships": null,
  "Secretaryships": null,
  "DisqualStartDate": null,
  "DisqualEndDate": null,
  "Convictions": null,
  "SummaryDirectorCIFAS": null,
  "DetailDirectorCIFAS": null,
  "NoticeOfCorrection": null,
  "Error": null
}
```

