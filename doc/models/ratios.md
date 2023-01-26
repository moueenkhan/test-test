
# Ratios

## Structure

`Ratios`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateOfAccounts` | `String` | Optional | Filing date for the limited company accounts (yyyy-mm-dd) | String getDateOfAccounts() | setDateOfAccounts(String dateOfAccounts) |
| `Currency` | `String` | Optional | Currency under which the accounts have been reported - ISO currency code | String getCurrency() | setCurrency(String currency) |
| `CompanyClass` | `String` | Optional | Size classification for the limited company - S = Small sized company; M=  Medium sized company; L = Large sized company | String getCompanyClass() | setCompanyClass(String companyClass) |
| `ConsAccounts` | `String` | Optional | Indicator showing whether the accounts are consolidated - Y = Consolidated; N = Not consolidated | String getConsAccounts() | setConsAccounts(String consAccounts) |
| `CurrentRatio` | `Double` | Optional | Value for Ratios - Current Ratios for these accounts (as percentage ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getCurrentRatio() | setCurrentRatio(Double currentRatio) |
| `AcidTest` | `Double` | Optional | Value for Ratios - Acid Test for these accounts (as percentageZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getAcidTest() | setAcidTest(Double acidTest) |
| `StockTurnover` | `Double` | Optional | Value for Ratios - Stock Turnover for these accounts (as percentage ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getStockTurnover() | setStockTurnover(Double stockTurnover) |
| `CreditPeriod` | `Double` | Optional | Value for Ratios - Credit Period in days for these accounts (as ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getCreditPeriod() | setCreditPeriod(Double creditPeriod) |
| `WorkingCapSales` | `Double` | Optional | Value for Ratios - Working Capital / Sales for these accounts (as percentage ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getWorkingCapSales() | setWorkingCapSales(Double workingCapSales) |
| `TradeCredrsDebtrs` | `Double` | Optional | Value for Ratios - Trade Creditors / Debtors for these accounts (as ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getTradeCredrsDebtrs() | setTradeCredrsDebtrs(Double tradeCredrsDebtrs) |
| `ReturnOnCapital` | `Double` | Optional | Value for Ratios - Return On Capital for these accounts (as percentage ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getReturnOnCapital() | setReturnOnCapital(Double returnOnCapital) |
| `ReturnOnAssets` | `Double` | Optional | Value for Ratios - Return On Assets for these accounts (as percentage ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getReturnOnAssets() | setReturnOnAssets(Double returnOnAssets) |
| `PreTaxProfitMargin` | `Double` | Optional | Value for Ratios - Pre-Tax Profit Margin for these accounts (as percentage ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getPreTaxProfitMargin() | setPreTaxProfitMargin(Double preTaxProfitMargin) |
| `ReturnOnShareholdersFunds` | `Double` | Optional | Value for Ratios - Return On Shareholders Funds for these accounts (as percentage ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getReturnOnShareholdersFunds() | setReturnOnShareholdersFunds(Double returnOnShareholdersFunds) |
| `BorrowingRatio` | `Double` | Optional | Value for Ratios - Borrowing Ratio for these accounts (as percentage ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getBorrowingRatio() | setBorrowingRatio(Double borrowingRatio) |
| `EquityGearing` | `Double` | Optional | Value for Ratios - Debt Gearing for these accounts (as percentage ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getEquityGearing() | setEquityGearing(Double equityGearing) |
| `DebtGearing` | `Double` | Optional | Value for Ratios - Equity Gearing for these accounts (as percentage ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getDebtGearing() | setDebtGearing(Double debtGearing) |
| `InterestCover` | `Double` | Optional | Value for Ratios - Interest Cover for these accounts (as ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getInterestCover() | setInterestCover(Double interestCover) |
| `SalesTangAssets` | `Double` | Optional | Value for Ratios - Sales / Tangible Assets for these accounts (as ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getSalesTangAssets() | setSalesTangAssets(Double salesTangAssets) |
| `AvgRemPerEmp` | `Double` | Optional | Value for Ratios - Average Remuneration per Employee for these accounts | Double getAvgRemPerEmp() | setAvgRemPerEmp(Double avgRemPerEmp) |
| `ProfitPerEmp` | `Double` | Optional | Value for Ratios - Profit per Employee for these accounts | Double getProfitPerEmp() | setProfitPerEmp(Double profitPerEmp) |
| `TurnoverPerEmp` | `Double` | Optional | Value for Ratios - Turnover per Employee for these accounts | Double getTurnoverPerEmp() | setTurnoverPerEmp(Double turnoverPerEmp) |
| `CapEmployedPerEmp` | `Double` | Optional | Value for Ratios - Capital Employed per Employee for these accounts | Double getCapEmployedPerEmp() | setCapEmployedPerEmp(Double capEmployedPerEmp) |
| `TangAssetsPerEmp` | `Double` | Optional | Value for Ratios - Tangible Assets per Employee for these accounts | Double getTangAssetsPerEmp() | setTangAssetsPerEmp(Double tangAssetsPerEmp) |
| `TotAssetsPerEmp` | `Double` | Optional | Value for Ratios - Total Assets per Employee for these accounts | Double getTotAssetsPerEmp() | setTotAssetsPerEmp(Double totAssetsPerEmp) |
| `EmpRemuneration` | `Double` | Optional | Value for Ratios - Employee Remuneration for these accounts | Double getEmpRemuneration() | setEmpRemuneration(Double empRemuneration) |
| `NumEmployees` | `Double` | Optional | Value for Ratios - Number of Employees for these accounts | Double getNumEmployees() | setNumEmployees(Double numEmployees) |
| `EmpRemunerationSales` | `Double` | Optional | Value for Ratios - Employee Remuneration / Sales for these accounts (as percentage ZZZZZ.99 or ZZZZZ.9 where least significant is zero) | Double getEmpRemunerationSales() | setEmpRemunerationSales(Double empRemunerationSales) |
| `DirRemuneration` | `Double` | Optional | Value for Ratios - Director Remuneration for these accounts | Double getDirRemuneration() | setDirRemuneration(Double dirRemuneration) |

## Example (as JSON)

```json
{
  "DateOfAccounts": null,
  "Currency": null,
  "CompanyClass": null,
  "ConsAccounts": null,
  "CurrentRatio": null,
  "AcidTest": null,
  "StockTurnover": null,
  "CreditPeriod": null,
  "WorkingCapSales": null,
  "TradeCredrsDebtrs": null,
  "ReturnOnCapital": null,
  "ReturnOnAssets": null,
  "PreTaxProfitMargin": null,
  "ReturnOnShareholdersFunds": null,
  "BorrowingRatio": null,
  "EquityGearing": null,
  "DebtGearing": null,
  "InterestCover": null,
  "SalesTangAssets": null,
  "AvgRemPerEmp": null,
  "ProfitPerEmp": null,
  "TurnoverPerEmp": null,
  "CapEmployedPerEmp": null,
  "TangAssetsPerEmp": null,
  "TotAssetsPerEmp": null,
  "EmpRemuneration": null,
  "NumEmployees": null,
  "EmpRemunerationSales": null,
  "DirRemuneration": null
}
```

