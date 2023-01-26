
# Monthly Data

## Structure

`MonthlyData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MonthYYYY` | `String` | Optional | - | String getMonthYYYY() | setMonthYYYY(String monthYYYY) |
| `MonthMM` | `String` | Optional | - | String getMonthMM() | setMonthMM(String monthMM) |
| `Status0` | `int` | Required | - | int getStatus0() | setStatus0(int status0) |
| `Status1` | `int` | Required | - | int getStatus1() | setStatus1(int status1) |
| `Status2` | `int` | Required | - | int getStatus2() | setStatus2(int status2) |
| `Status3` | `int` | Required | - | int getStatus3() | setStatus3(int status3) |
| `Status4` | `int` | Required | - | int getStatus4() | setStatus4(int status4) |
| `Status5` | `int` | Required | - | int getStatus5() | setStatus5(int status5) |
| `Status6` | `int` | Required | - | int getStatus6() | setStatus6(int status6) |
| `StatusU` | `int` | Required | Status U = Unknown | int getStatusU() | setStatusU(int statusU) |
| `Status8` | `int` | Required | - | int getStatus8() | setStatus8(int status8) |
| `CurrentBalance` | `String` | Optional | Current Balance | String getCurrentBalance() | setCurrentBalance(String currentBalance) |
| `CurrentDefaultBalanceIndicator` | `String` | Optional | Default balance indicator set to '-' if bal field above it is negative | String getCurrentDefaultBalanceIndicator() | setCurrentDefaultBalanceIndicator(String currentDefaultBalanceIndicator) |
| `NumberActiveAccounts` | `int` | Required | Number of active accounts | int getNumberActiveAccounts() | setNumberActiveAccounts(int numberActiveAccounts) |
| `DefaultBalance` | `String` | Optional | Default balance | String getDefaultBalance() | setDefaultBalance(String defaultBalance) |
| `DefaultBalanceIndicator` | `String` | Optional | Default balance indicator set to '-' if bal field above it is negative | String getDefaultBalanceIndicator() | setDefaultBalanceIndicator(String defaultBalanceIndicator) |
| `DateLastStatus` | `int` | Required | Date of Last Status Change DDMMYYY. Date of the last change in Status | int getDateLastStatus() | setDateLastStatus(int dateLastStatus) |

## Example (as JSON)

```json
{
  "MonthYYYY": null,
  "MonthMM": null,
  "Status0": 108,
  "Status1": 164,
  "Status2": 136,
  "Status3": 62,
  "Status4": 206,
  "Status5": 140,
  "Status6": 230,
  "StatusU": 176,
  "Status8": 218,
  "CurrentBalance": null,
  "CurrentDefaultBalanceIndicator": null,
  "NumberActiveAccounts": 162,
  "DefaultBalance": null,
  "DefaultBalanceIndicator": null,
  "DateLastStatus": 224
}
```

