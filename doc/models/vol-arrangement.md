
# Vol Arrangement

## Structure

`VolArrangement`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ApprovalDate` | `String` | Optional | Approval Date for the voluntary arrangement for the limited company (yyyy-mm-dd) | String getApprovalDate() | setApprovalDate(String approvalDate) |
| `CessationDate` | `String` | Optional | Lodged Date for the cessation of the voluntary arrangement for the limited company (yyyy-mm-dd) | String getCessationDate() | setCessationDate(String cessationDate) |
| `CessationLodgeDate` | `String` | Optional | Cessation Date for the voluntary arrangement for the limited company (yyyy-mm-dd) | String getCessationLodgeDate() | setCessationLodgeDate(String cessationLodgeDate) |
| `CessationType` | `String` | Optional | Cessation Type indicator - C = Completion; R = Revocation; S = Suspension | String getCessationType() | setCessationType(String cessationType) |
| `LodgedDate` | `String` | Optional | Lodged Date for the voluntary arrangement for the limited company (yyyy-mm-dd) | String getLodgedDate() | setLodgedDate(String lodgedDate) |
| `NumberSupervisors` | `Integer` | Optional | Number of Supervisors for the voluntary arrangement for the limited company (max 5) | Integer getNumberSupervisors() | setNumberSupervisors(Integer numberSupervisors) |
| `PublicationTown` | `String` | Optional | Publication Town for the voluntary arrangement indicator - B = Belfast; C = Cardiff; E = Edinburgh; L = London | String getPublicationTown() | setPublicationTown(String publicationTown) |
| `Supervisor` | [`List<Supervisors>`](../../doc/models/supervisors.md) | Optional | - | List<Supervisors> getSupervisor() | setSupervisor(List<Supervisors> supervisor) |

## Example (as JSON)

```json
{
  "ApprovalDate": null,
  "CessationDate": null,
  "CessationLodgeDate": null,
  "CessationType": null,
  "LodgedDate": null,
  "NumberSupervisors": null,
  "PublicationTown": null,
  "Supervisor": null
}
```

