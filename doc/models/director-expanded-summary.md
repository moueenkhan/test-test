
# Director Expanded Summary

## Structure

`DirectorExpandedSummary`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NumDirectorsFound` | `int` | Required | Number of found directors | int getNumDirectorsFound() | setNumDirectorsFound(int numDirectorsFound) |
| `NumDirectorsNotFound` | `int` | Required | Number of directors not found | int getNumDirectorsNotFound() | setNumDirectorsNotFound(int numDirectorsNotFound) |
| `NocFlag` | `String` | Optional | NOC flag - Y = Notice of corrections exist; N = No notice of corrections | String getNocFlag() | setNocFlag(String nocFlag) |
| `NumDisqualifications` | `int` | Required | Number of directors disqualified | int getNumDisqualifications() | setNumDisqualifications(int numDisqualifications) |
| `NumConvictions` | `int` | Required | Number of convictions | int getNumConvictions() | setNumConvictions(int numConvictions) |
| `NumCIFAS` | `int` | Required | Number of CIFAS records | int getNumCIFAS() | setNumCIFAS(int numCIFAS) |
| `NumDirectorships` | `int` | Required | Number of directorships | int getNumDirectorships() | setNumDirectorships(int numDirectorships) |
| `NumCurrrentDirships` | `int` | Required | Number of current directorships | int getNumCurrrentDirships() | setNumCurrrentDirships(int numCurrrentDirships) |
| `NumCurrentDissolvedDirships` | `int` | Required | Number of current dissolved directorships | int getNumCurrentDissolvedDirships() | setNumCurrentDissolvedDirships(int numCurrentDissolvedDirships) |
| `NumPreviousDirectorships` | `int` | Required | Number of previous directorships | int getNumPreviousDirectorships() | setNumPreviousDirectorships(int numPreviousDirectorships) |
| `NumDirectorshipsFailed` | `int` | Required | Number of failed directorships | int getNumDirectorshipsFailed() | setNumDirectorshipsFailed(int numDirectorshipsFailed) |
| `NumDirectorshipsNotFailed` | `int` | Required | Number of directorships not failed | int getNumDirectorshipsNotFailed() | setNumDirectorshipsNotFailed(int numDirectorshipsNotFailed) |
| `NumDirectorshipsCompulsoryLiquidator` | `int` | Required | Number of directorships for companies that have a compulsory liquidator appointed | int getNumDirectorshipsCompulsoryLiquidator() | setNumDirectorshipsCompulsoryLiquidator(int numDirectorshipsCompulsoryLiquidator) |
| `NumDirectorshipsCreditorLiquidator` | `int` | Required | Number of directorships for companies that have a liquidator appointed by creditors | int getNumDirectorshipsCreditorLiquidator() | setNumDirectorshipsCreditorLiquidator(int numDirectorshipsCreditorLiquidator) |
| `NumDirectorshipsMemberLiqidator` | `int` | Required | Number of directorships for companies that have a liquidator appointed by members | int getNumDirectorshipsMemberLiqidator() | setNumDirectorshipsMemberLiqidator(int numDirectorshipsMemberLiqidator) |
| `NumDirectorshipsUnknownLiquidator` | `int` | Required | Number of directorships for companies that have a liquidator appointed by persons unknown | int getNumDirectorshipsUnknownLiquidator() | setNumDirectorshipsUnknownLiquidator(int numDirectorshipsUnknownLiquidator) |
| `NumDirectorshipsWindUpOrder` | `int` | Required | Number of directorships for companies that have a winding up order | int getNumDirectorshipsWindUpOrder() | setNumDirectorshipsWindUpOrder(int numDirectorshipsWindUpOrder) |
| `NumDirectorshipsAdministratorAppointed` | `int` | Required | Number of directorships for companies that have an appointment of an administrator | int getNumDirectorshipsAdministratorAppointed() | setNumDirectorshipsAdministratorAppointed(int numDirectorshipsAdministratorAppointed) |
| `NumDirectorshipsAdministratorDischarge` | `int` | Required | Number of directorships for companies that have a discharge of an administrator | int getNumDirectorshipsAdministratorDischarge() | setNumDirectorshipsAdministratorDischarge(int numDirectorshipsAdministratorDischarge) |
| `NumDirectorshipsAppointmentAdministrativeReceiver` | `int` | Required | Number of directorships for companies that have an appointment of an administrative receiver | int getNumDirectorshipsAppointmentAdministrativeReceiver() | setNumDirectorshipsAppointmentAdministrativeReceiver(int numDirectorshipsAppointmentAdministrativeReceiver) |
| `NumDirectorshipsReceiverAppointed` | `int` | Required | Number of directorships for companies that have a receiver appointed | int getNumDirectorshipsReceiverAppointed() | setNumDirectorshipsReceiverAppointed(int numDirectorshipsReceiverAppointed) |
| `NumDirectorshipsAdministrativeReceiverCessation` | `int` | Required | Number of directorships for companies that have had a cessation of an administrative receiver | int getNumDirectorshipsAdministrativeReceiverCessation() | setNumDirectorshipsAdministrativeReceiverCessation(int numDirectorshipsAdministrativeReceiverCessation) |
| `NumDirectorshipsReceiverCessation` | `int` | Required | Number of directorships for companies that have had a cessation of a receiver | int getNumDirectorshipsReceiverCessation() | setNumDirectorshipsReceiverCessation(int numDirectorshipsReceiverCessation) |
| `NumDirectorshipsApprovalVoluntaryArrangements` | `int` | Required | Number of directorships for companies that have had an approval of voluntary arrangements | int getNumDirectorshipsApprovalVoluntaryArrangements() | setNumDirectorshipsApprovalVoluntaryArrangements(int numDirectorshipsApprovalVoluntaryArrangements) |
| `NumDirectorshipsCompletionVoluntaryArrangements` | `int` | Required | Number of directorships for companies that have had a completion of voluntary arrangements | int getNumDirectorshipsCompletionVoluntaryArrangements() | setNumDirectorshipsCompletionVoluntaryArrangements(int numDirectorshipsCompletionVoluntaryArrangements) |
| `NumDirectorshipsRevocationVoluntaryArrangements` | `int` | Required | Number of directorships for companies that have had a revocation of voluntary arrangements | int getNumDirectorshipsRevocationVoluntaryArrangements() | setNumDirectorshipsRevocationVoluntaryArrangements(int numDirectorshipsRevocationVoluntaryArrangements) |
| `NumDirectorshipsSuspensionVoluntaryArrangements` | `int` | Required | Number of directorships for companies that have has a suspension of voluntary arrangements | int getNumDirectorshipsSuspensionVoluntaryArrangements() | setNumDirectorshipsSuspensionVoluntaryArrangements(int numDirectorshipsSuspensionVoluntaryArrangements) |
| `NumDirectorshipsReinstated` | `int` | Required | Number of directorships for companies that have been reinstated | int getNumDirectorshipsReinstated() | setNumDirectorshipsReinstated(int numDirectorshipsReinstated) |
| `NumDirectorshipsDissolved` | `int` | Required | Number of directorships for companies that have been dissolved | int getNumDirectorshipsDissolved() | setNumDirectorshipsDissolved(int numDirectorshipsDissolved) |
| `DirectorNumbers` | [`DirectorNumbers`](../../doc/models/director-numbers.md) | Optional | - | DirectorNumbers getDirectorNumbers() | setDirectorNumbers(DirectorNumbers directorNumbers) |

## Example (as JSON)

```json
{
  "NumDirectorsFound": 190,
  "NumDirectorsNotFound": 138,
  "NocFlag": null,
  "NumDisqualifications": 148,
  "NumConvictions": 236,
  "NumCIFAS": 230,
  "NumDirectorships": 132,
  "NumCurrrentDirships": 122,
  "NumCurrentDissolvedDirships": 94,
  "NumPreviousDirectorships": 28,
  "NumDirectorshipsFailed": 132,
  "NumDirectorshipsNotFailed": 48,
  "NumDirectorshipsCompulsoryLiquidator": 54,
  "NumDirectorshipsCreditorLiquidator": 46,
  "NumDirectorshipsMemberLiqidator": 6,
  "NumDirectorshipsUnknownLiquidator": 124,
  "NumDirectorshipsWindUpOrder": 28,
  "NumDirectorshipsAdministratorAppointed": 254,
  "NumDirectorshipsAdministratorDischarge": 154,
  "NumDirectorshipsAppointmentAdministrativeReceiver": 82,
  "NumDirectorshipsReceiverAppointed": 220,
  "NumDirectorshipsAdministrativeReceiverCessation": 124,
  "NumDirectorshipsReceiverCessation": 4,
  "NumDirectorshipsApprovalVoluntaryArrangements": 238,
  "NumDirectorshipsCompletionVoluntaryArrangements": 70,
  "NumDirectorshipsRevocationVoluntaryArrangements": 60,
  "NumDirectorshipsSuspensionVoluntaryArrangements": 176,
  "NumDirectorshipsReinstated": 172,
  "NumDirectorshipsDissolved": 20,
  "DirectorNumbers": null
}
```

