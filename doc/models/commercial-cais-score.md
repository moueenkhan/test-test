
# Commercial CAIS Score

## Structure

`CommercialCAISScore`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NumberDefaultsLastYear` | `String` | Optional | The number of Commercial CAIS accounts which have defaulted in last 12 months | String getNumberDefaultsLastYear() | setNumberDefaultsLastYear(String numberDefaultsLastYear) |
| `NumberDefaultsLastSixYears` | `String` | Optional | The number of Commercial CAIS accounts which have defaulted in last 6 years | String getNumberDefaultsLastSixYears() | setNumberDefaultsLastSixYears(String numberDefaultsLastSixYears) |
| `ValueDefaultLastYear` | `String` | Optional | The value of Commercial CAIS accounts which have defaulted in last 12 months | String getValueDefaultLastYear() | setValueDefaultLastYear(String valueDefaultLastYear) |
| `ValueIndicator` | `String` | Optional | Indicator | String getValueIndicator() | setValueIndicator(String valueIndicator) |
| `ValueDefaultPerEmployee` | `String` | Optional | The value of Commercial CAIS accounts which have defaulted in last 12 months per Employee | String getValueDefaultPerEmployee() | setValueDefaultPerEmployee(String valueDefaultPerEmployee) |
| `ValuePerEmployeeIndicator` | `String` | Optional | Indicator | String getValuePerEmployeeIndicator() | setValuePerEmployeeIndicator(String valuePerEmployeeIndicator) |
| `ValueDefaultsLastSixYears` | `String` | Optional | The value of Commercial CAIS accounts which have defaulted in last 6 years | String getValueDefaultsLastSixYears() | setValueDefaultsLastSixYears(String valueDefaultsLastSixYears) |
| `LastSixYearValueIndicator` | `String` | Optional | Indicator | String getLastSixYearValueIndicator() | setLastSixYearValueIndicator(String lastSixYearValueIndicator) |
| `AgeMostRecent` | `String` | Optional | The number of months since the last default of a Commercial CAIS account.  0 indicates no CAIS 8/9 | String getAgeMostRecent() | setAgeMostRecent(String ageMostRecent) |
| `TimeSinceDelinquent` | `String` | Optional | The number of months since the last delinquent account | String getTimeSinceDelinquent() | setTimeSinceDelinquent(String timeSinceDelinquent) |
| `NumberDelinquentAccounts` | `String` | Optional | Total number of Delinquent Accounts | String getNumberDelinquentAccounts() | setNumberDelinquentAccounts(String numberDelinquentAccounts) |
| `ValueDelinquentAccounts` | `String` | Optional | Total value of Delinquent Accounts | String getValueDelinquentAccounts() | setValueDelinquentAccounts(String valueDelinquentAccounts) |
| `NumberSettled` | `String` | Optional | The number of Commercial CAIS accounts that settled at 0. | String getNumberSettled() | setNumberSettled(String numberSettled) |
| `NumberOwnAccounts` | `String` | Optional | The number of Own Company Commercial CAIS Accounts | String getNumberOwnAccounts() | setNumberOwnAccounts(String numberOwnAccounts) |
| `NumberOwnDelinquentAccounts` | `String` | Optional | The number of Own Company delinquent Commercial CAIS Accounts | String getNumberOwnDelinquentAccounts() | setNumberOwnDelinquentAccounts(String numberOwnDelinquentAccounts) |
| `TotalBalanceOwnAccounts` | `String` | Optional | The total Balance of Own Commercial CAIS Accounts | String getTotalBalanceOwnAccounts() | setTotalBalanceOwnAccounts(String totalBalanceOwnAccounts) |
| `TotalBalanceOwnAccountsIndicator` | `String` | Optional | Indicator | String getTotalBalanceOwnAccountsIndicator() | setTotalBalanceOwnAccountsIndicator(String totalBalanceOwnAccountsIndicator) |
| `AverageBalance` | `String` | Optional | Average Balance of Own Commercial CAIS Accounts. | String getAverageBalance() | setAverageBalance(String averageBalance) |
| `AverageBalanceIndicator` | `String` | Optional | Average balance indicator | String getAverageBalanceIndicator() | setAverageBalanceIndicator(String averageBalanceIndicator) |
| `WorstStatusOld` | `String` | Optional | Worst status in last 3 months on active accounts opened over 12 months ago | String getWorstStatusOld() | setWorstStatusOld(String worstStatusOld) |
| `WorstStatusActive` | `String` | Optional | Worst current status on active accounts | String getWorstStatusActive() | setWorstStatusActive(String worstStatusActive) |
| `NumberActiveAccounts` | `String` | Optional | Total number active accounts | String getNumberActiveAccounts() | setNumberActiveAccounts(String numberActiveAccounts) |
| `BalanceActiveAccounts` | `String` | Optional | Total balance outstanding on active accounts | String getBalanceActiveAccounts() | setBalanceActiveAccounts(String balanceActiveAccounts) |
| `BalanceActiveAccountsIndicator` | `String` | Optional | Indicator | String getBalanceActiveAccountsIndicator() | setBalanceActiveAccountsIndicator(String balanceActiveAccountsIndicator) |
| `BalanceActiveAccountsPerEmployee` | `String` | Optional | Total balance outstanding on active accounts per Employee | String getBalanceActiveAccountsPerEmployee() | setBalanceActiveAccountsPerEmployee(String balanceActiveAccountsPerEmployee) |
| `BalancePerEmployeeIndicator` | `String` | Optional | Indicator | String getBalancePerEmployeeIndicator() | setBalancePerEmployeeIndicator(String balancePerEmployeeIndicator) |
| `HighestFlagSetting` | `String` | Optional | Highest value of flag setting for business based on values of flag setting provided by Clients. | String getHighestFlagSetting() | setHighestFlagSetting(String highestFlagSetting) |
| `OwnCompanyWorstStatus` | `String` | Optional | The worst current status refers to the accounts status and takes values 0 (up to date) to 9 (default) with some set to '?' and U | String getOwnCompanyWorstStatus() | setOwnCompanyWorstStatus(String ownCompanyWorstStatus) |
| `NumberOwnDefaults` | `String` | Optional | The total number of own company CAIS status 8 and 9 accounts | String getNumberOwnDefaults() | setNumberOwnDefaults(String numberOwnDefaults) |
| `NumberOwnSettled` | `String` | Optional | The total number of own company settled CAIS 0 accounts. | String getNumberOwnSettled() | setNumberOwnSettled(String numberOwnSettled) |
| `NumberCreditCards` | `int` | Required | Total Number of Credit Cards for Business | int getNumberCreditCards() | setNumberCreditCards(int numberCreditCards) |
| `YearBusinessStarted` | `int` | Required | Year Business Started YYYY | int getYearBusinessStarted() | setYearBusinessStarted(int yearBusinessStarted) |

## Example (as JSON)

```json
{
  "NumberDefaultsLastYear": null,
  "NumberDefaultsLastSixYears": null,
  "ValueDefaultLastYear": null,
  "ValueIndicator": null,
  "ValueDefaultPerEmployee": null,
  "ValuePerEmployeeIndicator": null,
  "ValueDefaultsLastSixYears": null,
  "LastSixYearValueIndicator": null,
  "AgeMostRecent": null,
  "TimeSinceDelinquent": null,
  "NumberDelinquentAccounts": null,
  "ValueDelinquentAccounts": null,
  "NumberSettled": null,
  "NumberOwnAccounts": null,
  "NumberOwnDelinquentAccounts": null,
  "TotalBalanceOwnAccounts": null,
  "TotalBalanceOwnAccountsIndicator": null,
  "AverageBalance": null,
  "AverageBalanceIndicator": null,
  "WorstStatusOld": null,
  "WorstStatusActive": null,
  "NumberActiveAccounts": null,
  "BalanceActiveAccounts": null,
  "BalanceActiveAccountsIndicator": null,
  "BalanceActiveAccountsPerEmployee": null,
  "BalancePerEmployeeIndicator": null,
  "HighestFlagSetting": null,
  "OwnCompanyWorstStatus": null,
  "NumberOwnDefaults": null,
  "NumberOwnSettled": null,
  "NumberCreditCards": 86,
  "YearBusinessStarted": 130
}
```

