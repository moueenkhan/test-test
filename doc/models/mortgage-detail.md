
# Mortgage Detail

## Structure

`MortgageDetail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AlterationsToOrder` | `String` | Optional | Textual description of the Alterations To Order for the mortgage for the limited company | String getAlterationsToOrder() | setAlterationsToOrder(String alterationsToOrder) |
| `AmountChargeIncreased` | `String` | Optional | Textual description of the Amount the Charge Increased for the mortgage for the limited company | String getAmountChargeIncreased() | setAmountChargeIncreased(String amountChargeIncreased) |
| `AmountLatestIssue` | `String` | Optional | Amount for latest issue for the mortgage | String getAmountLatestIssue() | setAmountLatestIssue(String amountLatestIssue) |
| `AmountSatisfied` | `String` | Optional | Textual description of the Amount Satisfied for the mortgage for the limited company | String getAmountSatisfied() | setAmountSatisfied(String amountSatisfied) |
| `AmountSecured` | `String` | Optional | Textual description of the Amount Secured for the mortgage for the limited company | String getAmountSecured() | setAmountSecured(String amountSecured) |
| `ChargeNumber` | `String` | Optional | Charge Number for the mortgage | String getChargeNumber() | setChargeNumber(String chargeNumber) |
| `ChargeType` | `String` | Optional | Textual description of the Charge Type for the mortgage for the limited company | String getChargeType() | setChargeType(String chargeType) |
| `ChargeeText` | `String` | Optional | Textual description of the Chargee Text for the mortgage for the limited company | String getChargeeText() | setChargeeText(String chargeeText) |
| `CommissionDetails` | [`List<CommissionDetails>`](../../doc/models/commission-details.md) | Optional | - | List<CommissionDetails> getCommissionDetails() | setCommissionDetails(List<CommissionDetails> commissionDetails) |
| `CreationDate` | `String` | Optional | The date that the mortgage for the limited company was created (yyyy-mm-dd) | String getCreationDate() | setCreationDate(String creationDate) |
| `Currency` | `String` | Optional | Code / symbol for the currency that the mortgage amount was secured in | String getCurrency() | setCurrency(String currency) |
| `DateFullySatisfied` | `String` | Optional | The date that the mortgage for the limited company was fully satisfied (yyyy-mm-dd) | String getDateFullySatisfied() | setDateFullySatisfied(String dateFullySatisfied) |
| `DeedDate` | `String` | Optional | The date that the property associated with the mortgage for the limited company was acquired (yyyy-mm-dd) | String getDeedDate() | setDeedDate(String deedDate) |
| `ExecutionDate` | `List<String>` | Optional | - | List<String> getExecutionDate() | setExecutionDate(List<String> executionDate) |
| `ExecutorDetails` | [`List<ExecutorDetails>`](../../doc/models/executor-details.md) | Optional | - | List<ExecutorDetails> getExecutorDetails() | setExecutorDetails(List<ExecutorDetails> executorDetails) |
| `FormType` | `String` | Optional | Input Form Type for the mortgage - Refer to Mortgage Form Types worksheet | String getFormType() | setFormType(String formType) |
| `FullySatisfiedIndicator` | `String` | Optional | Fully Satisfied Indicator - F = Fully satisfied; N = Not satisfied | String getFullySatisfiedIndicator() | setFullySatisfiedIndicator(String fullySatisfiedIndicator) |
| `LatestIssueDate` | `String` | Optional | Latest Issue Date for the mortgage for the limited company (yyyy-mm-dd) | String getLatestIssueDate() | setLatestIssueDate(String latestIssueDate) |
| `LenderDetails` | [`List<LenderDetails>`](../../doc/models/lender-details.md) | Optional | - | List<LenderDetails> getLenderDetails() | setLenderDetails(List<LenderDetails> lenderDetails) |
| `LodgedDate` | `String` | Optional | The date that the mortgage for the limited company was lodged (yyyy-mm-dd) | String getLodgedDate() | setLodgedDate(String lodgedDate) |
| `NaturePartialSatisfaction` | [`List<NaturePartialSatisfaction>`](../../doc/models/nature-partial-satisfaction.md) | Optional | - | List<NaturePartialSatisfaction> getNaturePartialSatisfaction() | setNaturePartialSatisfaction(List<NaturePartialSatisfaction> naturePartialSatisfaction) |
| `NumberCommissionElements` | `Integer` | Optional | Number of Commission Elements recorded for the mortgage for the limited company | Integer getNumberCommissionElements() | setNumberCommissionElements(Integer numberCommissionElements) |
| `NumberExecutionDates` | `Integer` | Optional | Number of Execution Dates recorded for the mortgage for the limited company | Integer getNumberExecutionDates() | setNumberExecutionDates(Integer numberExecutionDates) |
| `NumberExecutors` | `Integer` | Optional | Number of Executors recorded for the mortgage for the limited company | Integer getNumberExecutors() | setNumberExecutors(Integer numberExecutors) |
| `NumberLenders` | `Integer` | Optional | Number of Lenders recorded for the mortgage for the limited company | Integer getNumberLenders() | setNumberLenders(Integer numberLenders) |
| `NumberPartialSatisfactionDataItems` | `Integer` | Optional | Number of Partial Satisfaction Data Items recorded for the mortgage for the limited company | Integer getNumberPartialSatisfactionDataItems() | setNumberPartialSatisfactionDataItems(Integer numberPartialSatisfactionDataItems) |
| `NumberPartialSatisfactionDates` | `Integer` | Optional | Number of Partial Satisfaction Dates recorded for the mortgage for the limited company | Integer getNumberPartialSatisfactionDates() | setNumberPartialSatisfactionDates(Integer numberPartialSatisfactionDates) |
| `NumberReceiverAppointmentDates` | `Integer` | Optional | Number of Receiver Appointment Dates recorded for the mortgage for the limited company | Integer getNumberReceiverAppointmentDates() | setNumberReceiverAppointmentDates(Integer numberReceiverAppointmentDates) |
| `NumberReceiverCessationDates` | `Integer` | Optional | Number of Receiver Cessation Dates recorded for the mortgage for the limited company | Integer getNumberReceiverCessationDates() | setNumberReceiverCessationDates(Integer numberReceiverCessationDates) |
| `NumberTrustees` | `Integer` | Optional | Number of Trustees recorded for the mortgage for the limited company | Integer getNumberTrustees() | setNumberTrustees(Integer numberTrustees) |
| `PartialSatisfactionDate` | `List<String>` | Optional | - | List<String> getPartialSatisfactionDate() | setPartialSatisfactionDate(List<String> partialSatisfactionDate) |
| `PropertyAcquiredDate` | `String` | Optional | The date that the property associated with the mortgage for the limited company was acquired (yyyy-mm-dd) | String getPropertyAcquiredDate() | setPropertyAcquiredDate(String propertyAcquiredDate) |
| `PropertyDetails` | `String` | Optional | Textual description of the Property Details for the mortgage for the limited company | String getPropertyDetails() | setPropertyDetails(String propertyDetails) |
| `PropertyReleasedFromCharge` | `String` | Optional | Textual description of the Property Released From Charge for the mortgage for the limited company | String getPropertyReleasedFromCharge() | setPropertyReleasedFromCharge(String propertyReleasedFromCharge) |
| `PublicationTown` | `String` | Optional | Mortgage registration town indicator - B = Belfast; C = Cardiff; E = Edinburgh; L = London | String getPublicationTown() | setPublicationTown(String publicationTown) |
| `ReceiverAppointment` | [`List<ReceiverAppointment>`](../../doc/models/receiver-appointment.md) | Optional | - | List<ReceiverAppointment> getReceiverAppointment() | setReceiverAppointment(List<ReceiverAppointment> receiverAppointment) |
| `ReceiverCessation` | [`List<ReceiverCessation>`](../../doc/models/receiver-cessation.md) | Optional | - | List<ReceiverCessation> getReceiverCessation() | setReceiverCessation(List<ReceiverCessation> receiverCessation) |
| `RegistrationDate` | `String` | Optional | The date that the mortgage for the limited company was registered (yyyy-mm-dd) | String getRegistrationDate() | setRegistrationDate(String registrationDate) |
| `RegulatingProvisions` | `String` | Optional | Textual description of the Regulating Provisions for the mortgage for the limited company | String getRegulatingProvisions() | setRegulatingProvisions(String regulatingProvisions) |
| `ResolutionSeriesDate` | `String` | Optional | Resolution Series Date for the mortgage for the limited company (yyyy-mm-dd) | String getResolutionSeriesDate() | setResolutionSeriesDate(String resolutionSeriesDate) |
| `RestrictingProvisions` | `String` | Optional | Textual description of the Restricting Provisions for the mortgage for the limited company | String getRestrictingProvisions() | setRestrictingProvisions(String restrictingProvisions) |
| `TotalDebenture` | `String` | Optional | Total amount of debenture secured for the mortgage | String getTotalDebenture() | setTotalDebenture(String totalDebenture) |
| `TrusteeDetails` | [`List<TrusteeDetails>`](../../doc/models/trustee-details.md) | Optional | - | List<TrusteeDetails> getTrusteeDetails() | setTrusteeDetails(List<TrusteeDetails> trusteeDetails) |

## Example (as JSON)

```json
{
  "AlterationsToOrder": null,
  "AmountChargeIncreased": null,
  "AmountLatestIssue": null,
  "AmountSatisfied": null,
  "AmountSecured": null,
  "ChargeNumber": null,
  "ChargeType": null,
  "ChargeeText": null,
  "CommissionDetails": null,
  "CreationDate": null,
  "Currency": null,
  "DateFullySatisfied": null,
  "DeedDate": null,
  "ExecutionDate": null,
  "ExecutorDetails": null,
  "FormType": null,
  "FullySatisfiedIndicator": null,
  "LatestIssueDate": null,
  "LenderDetails": null,
  "LodgedDate": null,
  "NaturePartialSatisfaction": null,
  "NumberCommissionElements": null,
  "NumberExecutionDates": null,
  "NumberExecutors": null,
  "NumberLenders": null,
  "NumberPartialSatisfactionDataItems": null,
  "NumberPartialSatisfactionDates": null,
  "NumberReceiverAppointmentDates": null,
  "NumberReceiverCessationDates": null,
  "NumberTrustees": null,
  "PartialSatisfactionDate": null,
  "PropertyAcquiredDate": null,
  "PropertyDetails": null,
  "PropertyReleasedFromCharge": null,
  "PublicationTown": null,
  "ReceiverAppointment": null,
  "ReceiverCessation": null,
  "RegistrationDate": null,
  "RegulatingProvisions": null,
  "ResolutionSeriesDate": null,
  "RestrictingProvisions": null,
  "TotalDebenture": null,
  "TrusteeDetails": null
}
```

