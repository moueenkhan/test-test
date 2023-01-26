
# Scoring Data

## Structure

`ScoringData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NumEmployeesSign` | `String` | Optional | Sign associated with the following number of employees of the business | String getNumEmployeesSign() | setNumEmployeesSign(String numEmployeesSign) |
| `NumEmployees` | `Double` | Optional | The number of employees of the business (Default 9999999999) | Double getNumEmployees() | setNumEmployees(Double numEmployees) |
| `PossiblyRelatedData` | `String` | Optional | Indicator shownig the status of the data in relation to the ownership period - Y = main data outside of the ownership date range or associated data inside of the ownership date range; N = no main data outside of the ownership date range or associated data inside of the ownership date range | String getPossiblyRelatedData() | setPossiblyRelatedData(String possiblyRelatedData) |
| `SICInformation1992` | [`SICInfo1992`](../../doc/models/sic-info-1992.md) | Optional | - | SICInfo1992 getSICInformation1992() | setSICInformation1992(SICInfo1992 sICInformation1992) |
| `CIFASIndicator` | [`CIFASIndicator`](../../doc/models/cifas-indicator.md) | Optional | - | CIFASIndicator getCIFASIndicator() | setCIFASIndicator(CIFASIndicator cIFASIndicator) |
| `MaxNumDirectorshipsSign` | `String` | Optional | Sign associated with the following highest number of current directorships | String getMaxNumDirectorshipsSign() | setMaxNumDirectorshipsSign(String maxNumDirectorshipsSign) |
| `MaxNumDirectorships` | `Integer` | Optional | The highest number of current directorships held by any of the entered proprietors, less (the number of directorships where the company was dissolved and has not been subsequently re-instated whilst the directorship was current less the number of directorships where the company has a creditor wind down event or a receiver appointed whilst the directorship was current) | Integer getMaxNumDirectorships() | setMaxNumDirectorships(Integer maxNumDirectorships) |
| `NumDisqualifiedDirectorsSign` | `String` | Optional | Sign associated with the following total number of director disqualifications | String getNumDisqualifiedDirectorsSign() | setNumDisqualifiedDirectorsSign(String numDisqualifiedDirectorsSign) |
| `NumDisqualifiedDirectors` | `Integer` | Optional | The total number of director disqualifications held against the entered proprietors (Default 999) | Integer getNumDisqualifiedDirectors() | setNumDisqualifiedDirectors(Integer numDisqualifiedDirectors) |
| `NumDirectorConvictionsSign` | `String` | Optional | Sign associated with the following total number of director convictions | String getNumDirectorConvictionsSign() | setNumDirectorConvictionsSign(String numDirectorConvictionsSign) |
| `NumDirectorConvictions` | `Integer` | Optional | The total number of director convictions that are held against the entered proprietors (Default 999) | Integer getNumDirectorConvictions() | setNumDirectorConvictions(Integer numDirectorConvictions) |
| `NOCFlag` | `String` | Optional | Indicator shownig the presence of Notices of Correction related to the business - Y = NOC information found against business data; N = No NOC information found against business data | String getNOCFlag() | setNOCFlag(String nOCFlag) |
| `NumDirectorFailuresSign` | `String` | Optional | Sign associated with the following number of failed directorships | String getNumDirectorFailuresSign() | setNumDirectorFailuresSign(String numDirectorFailuresSign) |
| `NumDirectorFailures` | `Double` | Optional | The number of failed directorships that are held against the entered proprietors (Default 99999) | Double getNumDirectorFailures() | setNumDirectorFailures(Double numDirectorFailures) |
| `NumberCollectionLast2YearsSign` | `String` | Optional | Sign associated with the following number of accounts placed for collection | String getNumberCollectionLast2YearsSign() | setNumberCollectionLast2YearsSign(String numberCollectionLast2YearsSign) |
| `NumberCollectionLast2Years` | `Double` | Optional | The number of accounts placed for collection in the last 2 years. Default 99999 | Double getNumberCollectionLast2Years() | setNumberCollectionLast2Years(Double numberCollectionLast2Years) |
| `NumCCJsSign` | `String` | Optional | Sign associated with the following Number of County Court Judgments | String getNumCCJsSign() | setNumCCJsSign(String numCCJsSign) |
| `NumCCJs` | `Integer` | Optional | The Number of County Court Judgments in last 6 years | Integer getNumCCJs() | setNumCCJs(Integer numCCJs) |
| `ValueCCJsSign` | `String` | Optional | Sign associated with the following total value of all County Court Judgments | String getValueCCJsSign() | setValueCCJsSign(String valueCCJsSign) |
| `ValueCCJs` | `Double` | Optional | The total value of all County Court Judgments in last 6 years | Double getValueCCJs() | setValueCCJs(Double valueCCJs) |
| `TimeSinceLastCCJSign` | `String` | Optional | Sign associated with the following age of most recent County Court Judgment | String getTimeSinceLastCCJSign() | setTimeSinceLastCCJSign(String timeSinceLastCCJSign) |
| `TimeSinceLastCCJ` | `Integer` | Optional | The age of most recent County Court Judgment in whole months (rounded) Default  Default 999 | Integer getTimeSinceLastCCJ() | setTimeSinceLastCCJ(Integer timeSinceLastCCJ) |
| `BankruptcyFlag` | `String` | Optional | Indicator shownig the presence of bankruptcy data related to the business - Y = bankruptcy information found against business data; N = No bankruptcy information found against business data | String getBankruptcyFlag() | setBankruptcyFlag(String bankruptcyFlag) |
| `NumPrevSearch3MthSign` | `String` | Optional | Sign associated with the following total number of searches recorded against the business in last 3 Months | String getNumPrevSearch3MthSign() | setNumPrevSearch3MthSign(String numPrevSearch3MthSign) |
| `NumPrevSearch3Mth` | `Integer` | Optional | The total number of searches recorded against the business in last 3 Months | Integer getNumPrevSearch3Mth() | setNumPrevSearch3Mth(Integer numPrevSearch3Mth) |
| `NumPrevSearch6MthSign` | `String` | Optional | Sign associated with the following total number of searches recorded against the business in last 6 Months | String getNumPrevSearch6MthSign() | setNumPrevSearch6MthSign(String numPrevSearch6MthSign) |
| `NumPrevSearch6Mth` | `Integer` | Optional | The total number of searches recorded against the business in last 6 Months | Integer getNumPrevSearch6Mth() | setNumPrevSearch6Mth(Integer numPrevSearch6Mth) |
| `NumPrevSearch12MthSign` | `String` | Optional | Sign associated with the following total number of searches recorded against the business in last 12 Months | String getNumPrevSearch12MthSign() | setNumPrevSearch12MthSign(String numPrevSearch12MthSign) |
| `NumPrevSearch12Mth` | `Integer` | Optional | The total number of searches recorded against the business in last 12 Months | Integer getNumPrevSearch12Mth() | setNumPrevSearch12Mth(Integer numPrevSearch12Mth) |
| `NumCCLsSign` | `String` | Optional | Sign associated with the following total number of Consumer Credit Licences held | String getNumCCLsSign() | setNumCCLsSign(String numCCLsSign) |
| `NumCCLs` | `Integer` | Optional | The total number of Consumer Credit Licences held | Integer getNumCCLs() | setNumCCLs(Integer numCCLs) |
| `NumCoFailuresSign` | `String` | Optional | Sign associated with the following number of failed directorships | String getNumCoFailuresSign() | setNumCoFailuresSign(String numCoFailuresSign) |
| `NumCoFailures` | `Double` | Optional | The number of failed directorships, summed for all of the entered proprietors, where a creditor wind down event has occurred or a receiver is appointed or the company has been dissolved and not subsequently re-instated whilst the director is current for the company the event occurred at. Default 99999 | Double getNumCoFailures() | setNumCoFailures(Double numCoFailures) |
| `AgeMostRecentCAIS8Mths` | `String` | Optional | - | String getAgeMostRecentCAIS8Mths() | setAgeMostRecentCAIS8Mths(String ageMostRecentCAIS8Mths) |
| `AvgOutstBalOwnCompanyActiveAccounts` | `String` | Optional | - | String getAvgOutstBalOwnCompanyActiveAccounts() | setAvgOutstBalOwnCompanyActiveAccounts(String avgOutstBalOwnCompanyActiveAccounts) |
| `AvgOutstBalOwnCompanyActiveAccountsInd` | `String` | Optional | - | String getAvgOutstBalOwnCompanyActiveAccountsInd() | setAvgOutstBalOwnCompanyActiveAccountsInd(String avgOutstBalOwnCompanyActiveAccountsInd) |
| `HighestFlagSetting` | `String` | Optional | - | String getHighestFlagSetting() | setHighestFlagSetting(String highestFlagSetting) |
| `NumCAISDefaults` | `String` | Optional | - | String getNumCAISDefaults() | setNumCAISDefaults(String numCAISDefaults) |
| `NumCAISDefaultsLast6Yrs` | `String` | Optional | - | String getNumCAISDefaultsLast6Yrs() | setNumCAISDefaultsLast6Yrs(String numCAISDefaultsLast6Yrs) |
| `NumOwnCompanyDefaults` | `String` | Optional | - | String getNumOwnCompanyDefaults() | setNumOwnCompanyDefaults(String numOwnCompanyDefaults) |
| `NumOwnCompanySettledAccounts` | `String` | Optional | - | String getNumOwnCompanySettledAccounts() | setNumOwnCompanySettledAccounts(String numOwnCompanySettledAccounts) |
| `NumSettledCAIS0Last12Mths` | `String` | Optional | - | String getNumSettledCAIS0Last12Mths() | setNumSettledCAIS0Last12Mths(String numSettledCAIS0Last12Mths) |
| `OwnCompanyWorstActiveStatus` | `String` | Optional | - | String getOwnCompanyWorstActiveStatus() | setOwnCompanyWorstActiveStatus(String ownCompanyWorstActiveStatus) |
| `TimeSinceMostRecentDelinquentAccount` | `String` | Optional | - | String getTimeSinceMostRecentDelinquentAccount() | setTimeSinceMostRecentDelinquentAccount(String timeSinceMostRecentDelinquentAccount) |
| `TotBalActiveAccountsPerEmployee` | `String` | Optional | - | String getTotBalActiveAccountsPerEmployee() | setTotBalActiveAccountsPerEmployee(String totBalActiveAccountsPerEmployee) |
| `TotBalActiveAccountsPerEmployeeInd` | `String` | Optional | - | String getTotBalActiveAccountsPerEmployeeInd() | setTotBalActiveAccountsPerEmployeeInd(String totBalActiveAccountsPerEmployeeInd) |
| `TotBalOutstActiveAccounts` | `String` | Optional | - | String getTotBalOutstActiveAccounts() | setTotBalOutstActiveAccounts(String totBalOutstActiveAccounts) |
| `TotBalOutstActiveAccountsInd` | `String` | Optional | - | String getTotBalOutstActiveAccountsInd() | setTotBalOutstActiveAccountsInd(String totBalOutstActiveAccountsInd) |
| `TotNumActiveAccounts` | `String` | Optional | - | String getTotNumActiveAccounts() | setTotNumActiveAccounts(String totNumActiveAccounts) |
| `TotNumOfDelinquentAccounts` | `String` | Optional | - | String getTotNumOfDelinquentAccounts() | setTotNumOfDelinquentAccounts(String totNumOfDelinquentAccounts) |
| `TotNumOwnCompanyAccounts` | `String` | Optional | - | String getTotNumOwnCompanyAccounts() | setTotNumOwnCompanyAccounts(String totNumOwnCompanyAccounts) |
| `TotNumOwnCompanyDelinquentAccounts` | `String` | Optional | - | String getTotNumOwnCompanyDelinquentAccounts() | setTotNumOwnCompanyDelinquentAccounts(String totNumOwnCompanyDelinquentAccounts) |
| `TotOutstBalOwnCompanyActiveAccounts` | `String` | Optional | - | String getTotOutstBalOwnCompanyActiveAccounts() | setTotOutstBalOwnCompanyActiveAccounts(String totOutstBalOwnCompanyActiveAccounts) |
| `TotOutstBalOwnCompanyActiveAccountsInd` | `String` | Optional | - | String getTotOutstBalOwnCompanyActiveAccountsInd() | setTotOutstBalOwnCompanyActiveAccountsInd(String totOutstBalOwnCompanyActiveAccountsInd) |
| `TotValueCAISDefaultsLast6Yrs` | `String` | Optional | - | String getTotValueCAISDefaultsLast6Yrs() | setTotValueCAISDefaultsLast6Yrs(String totValueCAISDefaultsLast6Yrs) |
| `ValueCAISDefaults` | `String` | Optional | - | String getValueCAISDefaults() | setValueCAISDefaults(String valueCAISDefaults) |
| `ValueCAISDefaultsInd` | `String` | Optional | - | String getValueCAISDefaultsInd() | setValueCAISDefaultsInd(String valueCAISDefaultsInd) |
| `ValueCAISDefaultsOver6YrsInd` | `String` | Optional | - | String getValueCAISDefaultsOver6YrsInd() | setValueCAISDefaultsOver6YrsInd(String valueCAISDefaultsOver6YrsInd) |
| `ValueCAISDefaultsPerEmployee` | `String` | Optional | - | String getValueCAISDefaultsPerEmployee() | setValueCAISDefaultsPerEmployee(String valueCAISDefaultsPerEmployee) |
| `ValueCAISDefaultsPerEmployeeInd` | `String` | Optional | - | String getValueCAISDefaultsPerEmployeeInd() | setValueCAISDefaultsPerEmployeeInd(String valueCAISDefaultsPerEmployeeInd) |
| `ValueDelinquentAccounts` | `String` | Optional | - | String getValueDelinquentAccounts() | setValueDelinquentAccounts(String valueDelinquentAccounts) |
| `WorstCurrStatusActiveAccount` | `String` | Optional | - | String getWorstCurrStatusActiveAccount() | setWorstCurrStatusActiveAccount(String worstCurrStatusActiveAccount) |
| `WorstStatusLast3MthsAccountsOpenedOver12MthsAgo` | `String` | Optional | - | String getWorstStatusLast3MthsAccountsOpenedOver12MthsAgo() | setWorstStatusLast3MthsAccountsOpenedOver12MthsAgo(String worstStatusLast3MthsAccountsOpenedOver12MthsAgo) |

## Example (as JSON)

```json
{
  "NumEmployeesSign": null,
  "NumEmployees": null,
  "PossiblyRelatedData": null,
  "SICInformation1992": null,
  "CIFASIndicator": null,
  "MaxNumDirectorshipsSign": null,
  "MaxNumDirectorships": null,
  "NumDisqualifiedDirectorsSign": null,
  "NumDisqualifiedDirectors": null,
  "NumDirectorConvictionsSign": null,
  "NumDirectorConvictions": null,
  "NOCFlag": null,
  "NumDirectorFailuresSign": null,
  "NumDirectorFailures": null,
  "NumberCollectionLast2YearsSign": null,
  "NumberCollectionLast2Years": null,
  "NumCCJsSign": null,
  "NumCCJs": null,
  "ValueCCJsSign": null,
  "ValueCCJs": null,
  "TimeSinceLastCCJSign": null,
  "TimeSinceLastCCJ": null,
  "BankruptcyFlag": null,
  "NumPrevSearch3MthSign": null,
  "NumPrevSearch3Mth": null,
  "NumPrevSearch6MthSign": null,
  "NumPrevSearch6Mth": null,
  "NumPrevSearch12MthSign": null,
  "NumPrevSearch12Mth": null,
  "NumCCLsSign": null,
  "NumCCLs": null,
  "NumCoFailuresSign": null,
  "NumCoFailures": null,
  "AgeMostRecentCAIS8Mths": null,
  "AvgOutstBalOwnCompanyActiveAccounts": null,
  "AvgOutstBalOwnCompanyActiveAccountsInd": null,
  "HighestFlagSetting": null,
  "NumCAISDefaults": null,
  "NumCAISDefaultsLast6Yrs": null,
  "NumOwnCompanyDefaults": null,
  "NumOwnCompanySettledAccounts": null,
  "NumSettledCAIS0Last12Mths": null,
  "OwnCompanyWorstActiveStatus": null,
  "TimeSinceMostRecentDelinquentAccount": null,
  "TotBalActiveAccountsPerEmployee": null,
  "TotBalActiveAccountsPerEmployeeInd": null,
  "TotBalOutstActiveAccounts": null,
  "TotBalOutstActiveAccountsInd": null,
  "TotNumActiveAccounts": null,
  "TotNumOfDelinquentAccounts": null,
  "TotNumOwnCompanyAccounts": null,
  "TotNumOwnCompanyDelinquentAccounts": null,
  "TotOutstBalOwnCompanyActiveAccounts": null,
  "TotOutstBalOwnCompanyActiveAccountsInd": null,
  "TotValueCAISDefaultsLast6Yrs": null,
  "ValueCAISDefaults": null,
  "ValueCAISDefaultsInd": null,
  "ValueCAISDefaultsOver6YrsInd": null,
  "ValueCAISDefaultsPerEmployee": null,
  "ValueCAISDefaultsPerEmployeeInd": null,
  "ValueDelinquentAccounts": null,
  "WorstCurrStatusActiveAccount": null,
  "WorstStatusLast3MthsAccountsOpenedOver12MthsAgo": null
}
```

