
# Own CAIS Summary

## Structure

`OwnCAISSummary`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SourceCode` | `int` | Required | The Source Code should be defined as numeric 4. Only returned for own CAIS accounts. | int getSourceCode() | setSourceCode(int sourceCode) |
| `AgeSinceLastStatus8` | `String` | Optional | Time since last status 8 in months | String getAgeSinceLastStatus8() | setAgeSinceLastStatus8(String ageSinceLastStatus8) |
| `SummaryStatus0` | `int` | Required | - | int getSummaryStatus0() | setSummaryStatus0(int summaryStatus0) |
| `SummaryStatus1` | `int` | Required | - | int getSummaryStatus1() | setSummaryStatus1(int summaryStatus1) |
| `SummaryStatus2` | `int` | Required | - | int getSummaryStatus2() | setSummaryStatus2(int summaryStatus2) |
| `SummaryStatus3` | `int` | Required | - | int getSummaryStatus3() | setSummaryStatus3(int summaryStatus3) |
| `SummaryStatus4` | `int` | Required | - | int getSummaryStatus4() | setSummaryStatus4(int summaryStatus4) |
| `SummaryStatus5` | `int` | Required | - | int getSummaryStatus5() | setSummaryStatus5(int summaryStatus5) |
| `SummaryStatus6` | `int` | Required | - | int getSummaryStatus6() | setSummaryStatus6(int summaryStatus6) |
| `SummaryStatusU` | `int` | Required | - | int getSummaryStatusU() | setSummaryStatusU(int summaryStatusU) |
| `SummaryStatus8` | `int` | Required | - | int getSummaryStatus8() | setSummaryStatus8(int summaryStatus8) |
| `SummaryBalance` | `String` | Optional | - | String getSummaryBalance() | setSummaryBalance(String summaryBalance) |
| `SummaryBalanceIndicator` | `String` | Optional | - | String getSummaryBalanceIndicator() | setSummaryBalanceIndicator(String summaryBalanceIndicator) |
| `SummaryActiveAccounts` | `int` | Required | - | int getSummaryActiveAccounts() | setSummaryActiveAccounts(int summaryActiveAccounts) |
| `SummaryDefaultBalance` | `String` | Optional | - | String getSummaryDefaultBalance() | setSummaryDefaultBalance(String summaryDefaultBalance) |
| `SummaryDefaultBalanceIndicator` | `String` | Optional | - | String getSummaryDefaultBalanceIndicator() | setSummaryDefaultBalanceIndicator(String summaryDefaultBalanceIndicator) |
| `MonthCount` | `int` | Required | - | int getMonthCount() | setMonthCount(int monthCount) |
| `MonthlyData` | [`List<MonthlyData>`](../../doc/models/monthly-data.md) | Optional | - | List<MonthlyData> getMonthlyData() | setMonthlyData(List<MonthlyData> monthlyData) |

## Example (as JSON)

```json
{
  "SourceCode": 240,
  "AgeSinceLastStatus8": null,
  "SummaryStatus0": 138,
  "SummaryStatus1": 36,
  "SummaryStatus2": 116,
  "SummaryStatus3": 162,
  "SummaryStatus4": 0,
  "SummaryStatus5": 62,
  "SummaryStatus6": 94,
  "SummaryStatusU": 160,
  "SummaryStatus8": 48,
  "SummaryBalance": null,
  "SummaryBalanceIndicator": null,
  "SummaryActiveAccounts": 60,
  "SummaryDefaultBalance": null,
  "SummaryDefaultBalanceIndicator": null,
  "MonthCount": 122,
  "MonthlyData": null
}
```

