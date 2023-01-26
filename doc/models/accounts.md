
# Accounts

## Structure

`Accounts`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateOfAccounts` | `String` | Optional | Date of accounts (yyyy-mm-dd) | String getDateOfAccounts() | setDateOfAccounts(String dateOfAccounts) |
| `AccountingPeriod` | `Integer` | Optional | Number of weeks covered by these accounts | Integer getAccountingPeriod() | setAccountingPeriod(Integer accountingPeriod) |
| `Currency` | `String` | Optional | Currency under which the accounts have been reported - ISO currency code | String getCurrency() | setCurrency(String currency) |
| `CurrencyMultiplier` | `String` | Optional | Currency multiplier applicable to these accounts - N = Financial fields in units; T = Financial fields in thousands | String getCurrencyMultiplier() | setCurrencyMultiplier(String currencyMultiplier) |
| `CompanyClass` | `String` | Optional | Size classification for the limited company - S = Small sized company; M = Medium sized company; L = Large sized company | String getCompanyClass() | setCompanyClass(String companyClass) |
| `ConsolidatedAccounts` | `String` | Optional | Indicator showing whether the accounts are consolidated - Y = Consolidated; N = Not consolidated | String getConsolidatedAccounts() | setConsolidatedAccounts(String consolidatedAccounts) |
| `DormancyFlag` | `String` | Optional | Indicator showing the dormancy status of the limited company accounts- C = CRO dormancy; A = Dormant accounts; N = Company not dormant/ No accounts; Q = Quasi-dormant | String getDormancyFlag() | setDormancyFlag(String dormancyFlag) |
| `LatestAccountsType` | `String` | Optional | Indicator of accounting method used to prepare the accounts - I = IFRS; G = GAAP | String getLatestAccountsType() | setLatestAccountsType(String latestAccountsType) |
| `RestatedAccounts` | `String` | Optional | Indicator showing whether the accounts are restated - Y = Restated; N = Not restated | String getRestatedAccounts() | setRestatedAccounts(String restatedAccounts) |
| `BalanceSheet` | [`BalanceSheet`](../../doc/models/balance-sheet.md) | Optional | - | BalanceSheet getBalanceSheet() | setBalanceSheet(BalanceSheet balanceSheet) |
| `ProfitLoss` | [`ProfitLoss`](../../doc/models/profit-loss.md) | Optional | - | ProfitLoss getProfitLoss() | setProfitLoss(ProfitLoss profitLoss) |
| `DiscontinuedOperations` | [`DiscontinuedOperations`](../../doc/models/discontinued-operations.md) | Optional | - | DiscontinuedOperations getDiscontinuedOperations() | setDiscontinuedOperations(DiscontinuedOperations discontinuedOperations) |
| `DisclosureItems` | [`DisclosureItems`](../../doc/models/disclosure-items.md) | Optional | - | DisclosureItems getDisclosureItems() | setDisclosureItems(DisclosureItems disclosureItems) |
| `ContingentLiability` | `String` | Optional | Contingent Liability indicator - Y = There are contingent liabilities; N = There are no contingent liabilities | String getContingentLiability() | setContingentLiability(String contingentLiability) |
| `PostBalanceSheetEvents` | `String` | Optional | Post Balance Sheet Events indicator - Y = There are post balance sheet events; N = There are no post balance sheet events | String getPostBalanceSheetEvents() | setPostBalanceSheetEvents(String postBalanceSheetEvents) |
| `CharitableGivingIndicator` | `String` | Optional | Charitable Giving indicator - Y = There is a charitable giving value; N = There is no charitable giving value | String getCharitableGivingIndicator() | setCharitableGivingIndicator(String charitableGivingIndicator) |
| `CharitableGivingValue` | `Double` | Optional | Value of Charitable Giving for these accounts - Not subject to Currency Multiplier | Double getCharitableGivingValue() | setCharitableGivingValue(Double charitableGivingValue) |

## Example (as JSON)

```json
{
  "DateOfAccounts": null,
  "AccountingPeriod": null,
  "Currency": null,
  "CurrencyMultiplier": null,
  "CompanyClass": null,
  "ConsolidatedAccounts": null,
  "DormancyFlag": null,
  "LatestAccountsType": null,
  "RestatedAccounts": null,
  "BalanceSheet": null,
  "ProfitLoss": null,
  "DiscontinuedOperations": null,
  "DisclosureItems": null,
  "ContingentLiability": null,
  "PostBalanceSheetEvents": null,
  "CharitableGivingIndicator": null,
  "CharitableGivingValue": null
}
```

