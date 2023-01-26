
# Consumer Credit Licence Summary

## Structure

`ConsumerCreditLicenceSummary`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateOwnershipCommencedYyyy` | `String` | Optional | Date ownership commenced YYYY | String getDateOwnershipCommencedYyyy() | setDateOwnershipCommencedYyyy(String dateOwnershipCommencedYyyy) |
| `DateOwnershipCommencedMm` | `String` | Optional | Date ownership commenced MM | String getDateOwnershipCommencedMm() | setDateOwnershipCommencedMm(String dateOwnershipCommencedMm) |
| `DateOwnershipTerminatedYyyy` | `String` | Optional | Date ownership terminated YYYY | String getDateOwnershipTerminatedYyyy() | setDateOwnershipTerminatedYyyy(String dateOwnershipTerminatedYyyy) |
| `DateOwnershipTerminatedMm` | `String` | Optional | Date ownership terminated MM | String getDateOwnershipTerminatedMm() | setDateOwnershipTerminatedMm(String dateOwnershipTerminatedMm) |
| `MainDataOutsideOwnership` | `String` | Optional | Main data outside ownership range. Y = Data outside range; N = No data outside range | String getMainDataOutsideOwnership() | setMainDataOutsideOwnership(String mainDataOutsideOwnership) |
| `NumberCLLs` | `int` | Required | Number of CCLs | int getNumberCLLs() | setNumberCLLs(int numberCLLs) |
| `NocFlag` | `String` | Optional | Notice of Correction Flag | String getNocFlag() | setNocFlag(String nocFlag) |
| `AssociatedDataOutsideOwnership` | `String` | Optional | Associated data outside ownership range. (Y = Associated data outside range, N = No associated data outside range) | String getAssociatedDataOutsideOwnership() | setAssociatedDataOutsideOwnership(String associatedDataOutsideOwnership) |
| `AssociatedNumCCLs` | `int` | Required | Number of CCLs | int getAssociatedNumCCLs() | setAssociatedNumCCLs(int associatedNumCCLs) |
| `AssociatedNocFlag` | `String` | Optional | Notice of Correction Flag | String getAssociatedNocFlag() | setAssociatedNocFlag(String associatedNocFlag) |

## Example (as JSON)

```json
{
  "DateOwnershipCommenced-Yyyy": null,
  "DateOwnershipCommenced-Mm": null,
  "DateOwnershipTerminated-Yyyy": null,
  "DateOwnershipTerminated-Mm": null,
  "MainDataOutsideOwnership": null,
  "NumberCLLs": 38,
  "NocFlag": null,
  "AssociatedDataOutsideOwnership": null,
  "AssociatedNumCCLs": 96,
  "AssociatedNocFlag": null
}
```

