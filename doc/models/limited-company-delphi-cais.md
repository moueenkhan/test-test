
# Limited Company Delphi CAIS

## Structure

`LimitedCompanyDelphiCAIS`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AgeMostRecent` | `String` | Optional | Age of most recent CAIS 8/9 (Months) | String getAgeMostRecent() | setAgeMostRecent(String ageMostRecent) |
| `AvgBalanceOwnAccounts` | `String` | Optional | Average balance of own company instalment CAIS accounts | String getAvgBalanceOwnAccounts() | setAvgBalanceOwnAccounts(String avgBalanceOwnAccounts) |
| `BalanceActiveAccounts` | `String` | Optional | Total balance outstanding on active accounts | String getBalanceActiveAccounts() | setBalanceActiveAccounts(String balanceActiveAccounts) |
| `NumActiveAccounts` | `String` | Optional | Total number active accounts | String getNumActiveAccounts() | setNumActiveAccounts(String numActiveAccounts) |
| `NumDefaults` | `String` | Optional | Number of CAIS 8/9s | String getNumDefaults() | setNumDefaults(String numDefaults) |
| `NumOwnAccounts` | `String` | Optional | Number of own company instalment CAIS accounts | String getNumOwnAccounts() | setNumOwnAccounts(String numOwnAccounts) |
| `NumSettled` | `String` | Optional | Number of settled CAIS 0s | String getNumSettled() | setNumSettled(String numSettled) |
| `TotalBalanceOwnAccounts` | `String` | Optional | Total value of own company instalment CAIS accounts | String getTotalBalanceOwnAccounts() | setTotalBalanceOwnAccounts(String totalBalanceOwnAccounts) |
| `ValueDefaults` | `String` | Optional | Total value CAIS 8/9s | String getValueDefaults() | setValueDefaults(String valueDefaults) |
| `WorstStatusActive` | `String` | Optional | Worst current status on active accounts | String getWorstStatusActive() | setWorstStatusActive(String worstStatusActive) |
| `WorstStatusOld` | `String` | Optional | Worst status in last 3 months on accounts opened over 12 months ago | String getWorstStatusOld() | setWorstStatusOld(String worstStatusOld) |

## Example (as JSON)

```json
{
  "AgeMostRecent": null,
  "AvgBalanceOwnAccounts": null,
  "BalanceActiveAccounts": null,
  "NumActiveAccounts": null,
  "NumDefaults": null,
  "NumOwnAccounts": null,
  "NumSettled": null,
  "TotalBalanceOwnAccounts": null,
  "ValueDefaults": null,
  "WorstStatusActive": null,
  "WorstStatusOld": null
}
```

