
# Cashflow

## Structure

`Cashflow`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateOfAccounts` | `String` | Optional | Filing date for the limited company accounts (yyyy-mm-dd) | String getDateOfAccounts() | setDateOfAccounts(String dateOfAccounts) |
| `AccountingPeriod` | `Integer` | Optional | Number of weeks covered by this cash flow | Integer getAccountingPeriod() | setAccountingPeriod(Integer accountingPeriod) |
| `Currency` | `String` | Optional | Currency under which the cash flow has been reported - ISO currency code | String getCurrency() | setCurrency(String currency) |
| `CurrencyMultiplier` | `String` | Optional | Currency multiplier applicable to the cash flow - N = Financial fields in units; T = Financial fields in thousands | String getCurrencyMultiplier() | setCurrencyMultiplier(String currencyMultiplier) |
| `CompanyClass` | `String` | Optional | Size classification for the limited company - S = Small sized company; M=  Medium sized company; L = Large sized company | String getCompanyClass() | setCompanyClass(String companyClass) |
| `ConsAccounts` | `String` | Optional | Indicator showing whether the accounts are consolidated - Y = Consolidated; N = Not consolidated | String getConsAccounts() | setConsAccounts(String consAccounts) |
| `DormancyIndicator` | `String` | Optional | Indicator showing whether the limited company is dormant - Y = Dormant; N = Active; Q = Quasi Dormant; C = Calculated as Dormant; A = Stated as Dormant on Accounts | String getDormancyIndicator() | setDormancyIndicator(String dormancyIndicator) |
| `LatestAccountsType` | `String` | Optional | Indicator of accounting method used to prepare the cash flow- I = IFRS; G = GAAP | String getLatestAccountsType() | setLatestAccountsType(String latestAccountsType) |
| `RestatedAccounts` | `String` | Optional | Indicator showing whether the cash flow is restated - Y = Restated; N = Not restated | String getRestatedAccounts() | setRestatedAccounts(String restatedAccounts) |
| `OperatingActivities` | `Double` | Optional | Value for UK GAAP Cash Flow - Operating Activities for these accounts | Double getOperatingActivities() | setOperatingActivities(Double operatingActivities) |
| `ReturnOnInvestment` | `Double` | Optional | Value for UK GAAP Cash Flow - Return On Investment for these accounts | Double getReturnOnInvestment() | setReturnOnInvestment(Double returnOnInvestment) |
| `Tax` | `Double` | Optional | Value for UK GAAP Cash Flow - Tax for these accounts | Double getTax() | setTax(Double tax) |
| `CapitalExpenditure` | `Double` | Optional | Value for UK GAAP Cash Flow - Capital Expenditure for these accounts | Double getCapitalExpenditure() | setCapitalExpenditure(Double capitalExpenditure) |
| `Acquisitions` | `Double` | Optional | Value for UK GAAP Cash Flow - Acquisitions for these accounts | Double getAcquisitions() | setAcquisitions(Double acquisitions) |
| `EquityDivision` | `Double` | Optional | Value for UK GAAP Cash Flow - Equity Division for these accounts | Double getEquityDivision() | setEquityDivision(Double equityDivision) |
| `ManagementLiquidity` | `Double` | Optional | Value for UK GAAP Cash Flow - Management Liquidity for these accounts | Double getManagementLiquidity() | setManagementLiquidity(Double managementLiquidity) |
| `Financing` | `Double` | Optional | Value for UK GAAP Cash Flow - Financing for these accounts | Double getFinancing() | setFinancing(Double financing) |
| `TotalCash` | `Double` | Optional | Value for UK GAAP Cash Flow - Total Cash for these accounts | Double getTotalCash() | setTotalCash(Double totalCash) |
| `IFRSOperatingActivities` | `Double` | Optional | Value for IFRS Cash Flow - Operating Activities for these accounts | Double getIFRSOperatingActivities() | setIFRSOperatingActivities(Double iFRSOperatingActivities) |
| `IFRSInvestmentActivities` | `Double` | Optional | Value for IFRS Cash Flow - Investment Activities for these accounts | Double getIFRSInvestmentActivities() | setIFRSInvestmentActivities(Double iFRSInvestmentActivities) |
| `FinancingActs` | `Double` | Optional | Value for IFRS Cash Flow - Financing Acts for these accounts | Double getFinancingActs() | setFinancingActs(Double financingActs) |
| `NetChange` | `Double` | Optional | Value for IFRS Cash Flow - Net Change for these accounts | Double getNetChange() | setNetChange(Double netChange) |
| `CashBroughtForward` | `Double` | Optional | Value for IFRS Cash Flow - Cash Brought Forward for these accounts | Double getCashBroughtForward() | setCashBroughtForward(Double cashBroughtForward) |
| `ExchangeRateEffects` | `Double` | Optional | Value for IFRS Cash Flow - Exchange Rate Effects for these accounts | Double getExchangeRateEffects() | setExchangeRateEffects(Double exchangeRateEffects) |
| `CashEquivalents` | `Double` | Optional | Value for IFRS Cash Flow - Cash Equivalents for these accounts | Double getCashEquivalents() | setCashEquivalents(Double cashEquivalents) |

## Example (as JSON)

```json
{
  "DateOfAccounts": null,
  "AccountingPeriod": null,
  "Currency": null,
  "CurrencyMultiplier": null,
  "CompanyClass": null,
  "ConsAccounts": null,
  "DormancyIndicator": null,
  "LatestAccountsType": null,
  "RestatedAccounts": null,
  "OperatingActivities": null,
  "ReturnOnInvestment": null,
  "Tax": null,
  "CapitalExpenditure": null,
  "Acquisitions": null,
  "EquityDivision": null,
  "ManagementLiquidity": null,
  "Financing": null,
  "TotalCash": null,
  "IFRSOperatingActivities": null,
  "IFRSInvestmentActivities": null,
  "FinancingActs": null,
  "NetChange": null,
  "CashBroughtForward": null,
  "ExchangeRateEffects": null,
  "CashEquivalents": null
}
```

