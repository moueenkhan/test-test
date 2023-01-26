
# Median Quartiles

## Structure

`MedianQuartiles`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `YearEnd` | `String` | Optional | The date of the latest quarter for the limited company quartile values (yyyy-mm-dd) | String getYearEnd() | setYearEnd(String yearEnd) |
| `DateOfAccounts` | `String` | Optional | Filing date for the limited company accounts (yyyy-mm-dd) | String getDateOfAccounts() | setDateOfAccounts(String dateOfAccounts) |
| `NumCompanies` | `Double` | Optional | Number of companies which have filed accounts in this industry sector, during the quarter stated in the "Year End" field. | Double getNumCompanies() | setNumCompanies(Double numCompanies) |
| `CurrentRatioMedian` | `Double` | Optional | Median quartile value for Current Ratio for this industry sector | Double getCurrentRatioMedian() | setCurrentRatioMedian(Double currentRatioMedian) |
| `AcidTestMedian` | `Double` | Optional | Median quartile value for Acid Test for this industry sector | Double getAcidTestMedian() | setAcidTestMedian(Double acidTestMedian) |
| `StockTurnoverMedian` | `Double` | Optional | Median quartile value for Stock Turnover for this industry sector | Double getStockTurnoverMedian() | setStockTurnoverMedian(Double stockTurnoverMedian) |
| `CreditPeriodMedian` | `Double` | Optional | Median quartile value for Credit Period for this industry sector | Double getCreditPeriodMedian() | setCreditPeriodMedian(Double creditPeriodMedian) |
| `WorkingCapMedian` | `Double` | Optional | Median quartile value for Working Capital for this industry sector | Double getWorkingCapMedian() | setWorkingCapMedian(Double workingCapMedian) |
| `TradeCredrsDebtrsMedian` | `Double` | Optional | Median quartile value for Trade Creditors / Debtors for this industry sector | Double getTradeCredrsDebtrsMedian() | setTradeCredrsDebtrsMedian(Double tradeCredrsDebtrsMedian) |
| `ReturnOnAssetsMedian` | `Double` | Optional | Median quartile value for Return On Assets for this industry sector | Double getReturnOnAssetsMedian() | setReturnOnAssetsMedian(Double returnOnAssetsMedian) |
| `ReturnOnCapitalMedian` | `Double` | Optional | Median quartile value for Return On Capital for this industry sector | Double getReturnOnCapitalMedian() | setReturnOnCapitalMedian(Double returnOnCapitalMedian) |
| `PreTaxMarginMedian` | `Double` | Optional | Median quartile value for Pre-Tax Profit Margin for this industry sector | Double getPreTaxMarginMedian() | setPreTaxMarginMedian(Double preTaxMarginMedian) |
| `ReturnOnShareholdersFundsMedian` | `Double` | Optional | Median quartile value for Return On Shareholders Funds for this industry sector | Double getReturnOnShareholdersFundsMedian() | setReturnOnShareholdersFundsMedian(Double returnOnShareholdersFundsMedian) |
| `BorrowingRatioMedian` | `Double` | Optional | Median quartile value for Borrowing Ratio for this industry sector | Double getBorrowingRatioMedian() | setBorrowingRatioMedian(Double borrowingRatioMedian) |
| `EquityGearingMedian` | `Double` | Optional | Median quartile value for Equity Gearing for this industry sector | Double getEquityGearingMedian() | setEquityGearingMedian(Double equityGearingMedian) |
| `DebtGearingMedian` | `Double` | Optional | Median quartile value for Debt Gearing for this industry sector | Double getDebtGearingMedian() | setDebtGearingMedian(Double debtGearingMedian) |
| `InterestCoverMedian` | `Double` | Optional | Median quartile value for Interest Cover for this industry sector | Double getInterestCoverMedian() | setInterestCoverMedian(Double interestCoverMedian) |
| `SalesTangAssetsMedian` | `Double` | Optional | Median quartile value for Sales /Tangible Assets  for this industry sector | Double getSalesTangAssetsMedian() | setSalesTangAssetsMedian(Double salesTangAssetsMedian) |
| `EmpRemunerationSalesMedian` | `Double` | Optional | Median quartile value for Employee Remuneration / Sales for this industry sector | Double getEmpRemunerationSalesMedian() | setEmpRemunerationSalesMedian(Double empRemunerationSalesMedian) |
| `AvgRemPerEmpMedian` | `Double` | Optional | Median quartile value for Average Remuneration per Employee for this industry sector | Double getAvgRemPerEmpMedian() | setAvgRemPerEmpMedian(Double avgRemPerEmpMedian) |
| `ProfitPerEmpMedian` | `Double` | Optional | Median quartile value for Profit per Employee for this industry sector | Double getProfitPerEmpMedian() | setProfitPerEmpMedian(Double profitPerEmpMedian) |
| `TurnoverPerEmpMedian` | `Double` | Optional | Median quartile value for Turnover per Employee for this industry sector | Double getTurnoverPerEmpMedian() | setTurnoverPerEmpMedian(Double turnoverPerEmpMedian) |
| `CapEmployedPerEmpMedian` | `Double` | Optional | Median quartile value for Capital Employed per Employee for this industry sector | Double getCapEmployedPerEmpMedian() | setCapEmployedPerEmpMedian(Double capEmployedPerEmpMedian) |
| `TangAssetsPerEmpMedian` | `Double` | Optional | Median quartile value for Tangible Assets per Employee for this industry sector | Double getTangAssetsPerEmpMedian() | setTangAssetsPerEmpMedian(Double tangAssetsPerEmpMedian) |
| `TotAssetsPerEmpMedian` | `Double` | Optional | Median quartile value for Total Assets per Employee for this industry sector | Double getTotAssetsPerEmpMedian() | setTotAssetsPerEmpMedian(Double totAssetsPerEmpMedian) |
| `SICInformation1980` | [`SICInfo80`](../../doc/models/sic-info-80.md) | Optional | - | SICInfo80 getSICInformation1980() | setSICInformation1980(SICInfo80 sICInformation1980) |
| `SICInformation1992` | [`SICInfo92`](../../doc/models/sic-info-92.md) | Optional | - | SICInfo92 getSICInformation1992() | setSICInformation1992(SICInfo92 sICInformation1992) |

## Example (as JSON)

```json
{
  "YearEnd": null,
  "DateOfAccounts": null,
  "NumCompanies": null,
  "CurrentRatioMedian": null,
  "AcidTestMedian": null,
  "StockTurnoverMedian": null,
  "CreditPeriodMedian": null,
  "WorkingCapMedian": null,
  "TradeCredrsDebtrsMedian": null,
  "ReturnOnAssetsMedian": null,
  "ReturnOnCapitalMedian": null,
  "PreTaxMarginMedian": null,
  "ReturnOnShareholdersFundsMedian": null,
  "BorrowingRatioMedian": null,
  "EquityGearingMedian": null,
  "DebtGearingMedian": null,
  "InterestCoverMedian": null,
  "SalesTangAssetsMedian": null,
  "EmpRemunerationSalesMedian": null,
  "AvgRemPerEmpMedian": null,
  "ProfitPerEmpMedian": null,
  "TurnoverPerEmpMedian": null,
  "CapEmployedPerEmpMedian": null,
  "TangAssetsPerEmpMedian": null,
  "TotAssetsPerEmpMedian": null,
  "SICInformation1980": null,
  "SICInformation1992": null
}
```

