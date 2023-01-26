
# All CAIS Summary

## Structure

`AllCAISSummary`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AgeSinceLastStatus8` | `String` | Optional | Time since last status 8 in months | String getAgeSinceLastStatus8() | setAgeSinceLastStatus8(String ageSinceLastStatus8) |
| `WorstCurrentStatus` | `String` | Optional | Value of highest status record received from a Contributor within the last month of CAIS data provided. | String getWorstCurrentStatus() | setWorstCurrentStatus(String worstCurrentStatus) |
| `ValueHighestStatus` | `String` | Optional | Value of highest status record received from a Contributor within the last 12 months of CAIS data provided. | String getValueHighestStatus() | setValueHighestStatus(String valueHighestStatus) |
| `SummaryStatus0` | `int` | Required | Summary of all Status 0 for 12 months period | int getSummaryStatus0() | setSummaryStatus0(int summaryStatus0) |
| `SummaryStatus1` | `int` | Required | Summary of all Status 1 for 12 months period | int getSummaryStatus1() | setSummaryStatus1(int summaryStatus1) |
| `SummaryStatus2` | `int` | Required | Summary of all Status2 for 12 months period | int getSummaryStatus2() | setSummaryStatus2(int summaryStatus2) |
| `SummaryStatus3` | `int` | Required | Summary of all Status 3 for 12 months period | int getSummaryStatus3() | setSummaryStatus3(int summaryStatus3) |
| `SummaryStatus4` | `int` | Required | Summary of all Status 4 for 12 months period | int getSummaryStatus4() | setSummaryStatus4(int summaryStatus4) |
| `SummaryStatus5` | `int` | Required | Summary of all Status 5 for 12 months period | int getSummaryStatus5() | setSummaryStatus5(int summaryStatus5) |
| `SummaryStatus6` | `int` | Required | Summary of all Status 6 for 12 months period | int getSummaryStatus6() | setSummaryStatus6(int summaryStatus6) |
| `SummaryStatus7` | `int` | Required | Summary of all Status U for 12 months period | int getSummaryStatus7() | setSummaryStatus7(int summaryStatus7) |
| `SummaryStatus8` | `int` | Required | Summary of all Status 8 for 12 months period | int getSummaryStatus8() | setSummaryStatus8(int summaryStatus8) |
| `CurrentBalance` | `String` | Optional | Current balance for latest month | String getCurrentBalance() | setCurrentBalance(String currentBalance) |
| `CurrentBalanceIndicator` | `String` | Optional | Current balance indicator | String getCurrentBalanceIndicator() | setCurrentBalanceIndicator(String currentBalanceIndicator) |
| `NumberActiveAccounts` | `int` | Required | Total number of Active Accounts for 12 month period | int getNumberActiveAccounts() | setNumberActiveAccounts(int numberActiveAccounts) |
| `TotalDefaultBalance` | `String` | Optional | Total of Default Balances  for 12 month period | String getTotalDefaultBalance() | setTotalDefaultBalance(String totalDefaultBalance) |
| `TotalDefaultBalanceIndicator` | `String` | Optional | Indicator | String getTotalDefaultBalanceIndicator() | setTotalDefaultBalanceIndicator(String totalDefaultBalanceIndicator) |
| `NumberOfMonthsData` | `int` | Required | Number of months data (currently set to 12) Data is returned with most recent month first | int getNumberOfMonthsData() | setNumberOfMonthsData(int numberOfMonthsData) |
| `BestCAISStatus` | `String` | Optional | Best Historical CAIS Status in Last 12 Months across all CAIS accounts. Value of lowest status record received from a Contributor within the last 12 months of CAIS data provided, '0' being the lowest value available | String getBestCAISStatus() | setBestCAISStatus(String bestCAISStatus) |
| `MonthlyData` | [`List<MonthlyData>`](../../doc/models/monthly-data.md) | Optional | - | List<MonthlyData> getMonthlyData() | setMonthlyData(List<MonthlyData> monthlyData) |

## Example (as JSON)

```json
{
  "AgeSinceLastStatus8": null,
  "WorstCurrentStatus": null,
  "ValueHighestStatus": null,
  "SummaryStatus0": 138,
  "SummaryStatus1": 36,
  "SummaryStatus2": 116,
  "SummaryStatus3": 162,
  "SummaryStatus4": 0,
  "SummaryStatus5": 62,
  "SummaryStatus6": 94,
  "SummaryStatus7": 84,
  "SummaryStatus8": 48,
  "CurrentBalance": null,
  "CurrentBalanceIndicator": null,
  "NumberActiveAccounts": 162,
  "TotalDefaultBalance": null,
  "TotalDefaultBalanceIndicator": null,
  "NumberOfMonthsData": 158,
  "BestCAISStatus": null,
  "MonthlyData": null
}
```

