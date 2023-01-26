
# Filing Details

## Structure

`FilingDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DatabaseAccountsOutOfDate` | `String` | Optional | Indicator showing whether more recent accounts are available for the limited company - Y = More recent accounts available; N = Most recent accounts on file | String getDatabaseAccountsOutOfDate() | setDatabaseAccountsOutOfDate(String databaseAccountsOutOfDate) |
| `FiledAccountsOutOfDate` | `String` | Optional | Indicator showing whether the accounts for the limited company are out of date - Y = Filed accounts out of date; N = Filed accounts up to date | String getFiledAccountsOutOfDate() | setFiledAccountsOutOfDate(String filedAccountsOutOfDate) |
| `LatestAccounts` | `String` | Optional | Filing date for the limited company latest accounts (yyyy-mm-dd) | String getLatestAccounts() | setLatestAccounts(String latestAccounts) |
| `LatestReturns` | `String` | Optional | Filing date for the limited company latest returns (yyyy-mm-dd) | String getLatestReturns() | setLatestReturns(String latestReturns) |
| `LatestAccountsReceived` | `String` | Optional | Date latest accounts were received (yyyy-mm-dd) | String getLatestAccountsReceived() | setLatestAccountsReceived(String latestAccountsReceived) |
| `LatestReturnsDatabase` | `String` | Optional | Date latest returns were loaded (yyyy-mm-dd) | String getLatestReturnsDatabase() | setLatestReturnsDatabase(String latestReturnsDatabase) |
| `LatestAccountsDatabase` | `String` | Optional | Date latest accounts were loaded (yyyy-mm-dd) | String getLatestAccountsDatabase() | setLatestAccountsDatabase(String latestAccountsDatabase) |
| `NumAccountsOnFile` | `Integer` | Optional | Number of years for which Experian has stored accounts | Integer getNumAccountsOnFile() | setNumAccountsOnFile(Integer numAccountsOnFile) |
| `LatestAccountType` | `String` | Optional | Indicator showing the type of latest accounts - 0 = Type not available; 1 = Full accounts; 2 = Small company; 3 = Medium company; 4 = Group; 5 = Dormant; 6 = Interim; 7 = Initial; 8 = Total Exemption Full; 9 = Total Exemption small; A = Partial Exemption; G = Micro-Entities Accounts; E = Audit Exemption Subsidiary; F = Filing Exemption Subsidiary; Z = None of the above | String getLatestAccountType() | setLatestAccountType(String latestAccountType) |
| `AccountsRefDate` | [`MMDD`](../../doc/models/mmdd.md) | Optional | - | MMDD getAccountsRefDate() | setAccountsRefDate(MMDD accountsRefDate) |
| `NumberDaysToFileAccounts` | `Integer` | Optional | Number of days difference between Accounts Reference Date and date latest accounts filed at Companies House | Integer getNumberDaysToFileAccounts() | setNumberDaysToFileAccounts(Integer numberDaysToFileAccounts) |

## Example (as JSON)

```json
{
  "DatabaseAccountsOutOfDate": null,
  "FiledAccountsOutOfDate": null,
  "LatestAccounts": null,
  "LatestReturns": null,
  "LatestAccountsReceived": null,
  "LatestReturnsDatabase": null,
  "LatestAccountsDatabase": null,
  "NumAccountsOnFile": null,
  "LatestAccountType": null,
  "AccountsRefDate": null,
  "NumberDaysToFileAccounts": null
}
```

