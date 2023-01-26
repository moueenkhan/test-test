
# Parent Detail

## Structure

`ParentDetail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CommercialName` | `String` | Optional | Parent/Ultimate Parent company name | String getCommercialName() | setCommercialName(String commercialName) |
| `BusinessLocation` | [`LtdBusinessLocation`](../../doc/models/ltd-business-location.md) | Optional | - | LtdBusinessLocation getBusinessLocation() | setBusinessLocation(LtdBusinessLocation businessLocation) |
| `CommDelphiScore` | `Integer` | Optional | Current Commercial Delphi score for the Parent/Ultimate Parent company | Integer getCommDelphiScore() | setCommDelphiScore(Integer commDelphiScore) |
| `CommDelphiBand` | `String` | Optional | Current Commercial Delphi band code for the Parent/Ultimate Parent company | String getCommDelphiBand() | setCommDelphiBand(String commDelphiBand) |
| `StabilityOdds` | `String` | Optional | Current Stability odds for the Parent/Ultimate Parent company | String getStabilityOdds() | setStabilityOdds(String stabilityOdds) |
| `CreditRating` | `Double` | Optional | Commercial Delphi Credit Rating for the Parent/Ultimate Parent company | Double getCreditRating() | setCreditRating(Double creditRating) |
| `CreditLimit` | `Double` | Optional | Commercial Delphi Credit Limit for the Parent/Ultimate Parent company | Double getCreditLimit() | setCreditLimit(Double creditLimit) |
| `DateOfAccounts` | `String` | Optional | Filing date for the Parent company latest accounts (yyyy-mm-dd) | String getDateOfAccounts() | setDateOfAccounts(String dateOfAccounts) |
| `Currency` | `String` | Optional | Currency under which the accounts for the Parent/Ultimate Parent company have been reported - ISO currency code | String getCurrency() | setCurrency(String currency) |
| `CurrencyMultiplier` | `String` | Optional | Currency multiplier applicable to the accounts for the Parent/Ultimate Parent company - N = Financial fields in units; T = Financial fields in thousands | String getCurrencyMultiplier() | setCurrencyMultiplier(String currencyMultiplier) |
| `ConsAccounts` | `String` | Optional | Indicator showing whether the accounts for the Parent/Ultimate Parent company are consolidated - Y = Consolidated; N = Not consolidated | String getConsAccounts() | setConsAccounts(String consAccounts) |
| `LatestAccountsType` | `String` | Optional | Latest Accounts Type Indicator for the Parent/Ultimate Parent company - 0 = Type not available; 1  = Full Accounts; 2 = Small Company; 3 = Medium Company; 4 = Group; 5 = Dormant; 6 = Interim; 7 =  Initial; 8 = Total exemption Full; 9 = Total exemption Small; A = Partial Exemption | String getLatestAccountsType() | setLatestAccountsType(String latestAccountsType) |
| `AccountingPeriod` | `Integer` | Optional | Number of weeks covered by the accounts for the Parent/Ultimate Parent company | Integer getAccountingPeriod() | setAccountingPeriod(Integer accountingPeriod) |
| `NetWorth` | `Double` | Optional | Net Worth for the Parent/Ultimate Parent company accounts | Double getNetWorth() | setNetWorth(Double netWorth) |
| `GrossProfit` | `Double` | Optional | Gross Profit for the Parent/Ultimate Parent company accounts | Double getGrossProfit() | setGrossProfit(Double grossProfit) |
| `TurnoverSales` | `Double` | Optional | Turnover Sales for the Parent/Ultimate Parent company accounts | Double getTurnoverSales() | setTurnoverSales(Double turnoverSales) |
| `TurnoverHomeNation` | `Double` | Optional | Turnover Sales - Home Nation for the Parent/Ultimate Parent company accounts | Double getTurnoverHomeNation() | setTurnoverHomeNation(Double turnoverHomeNation) |
| `TurnoverExport` | `Double` | Optional | Turnover Sales - Export for the Parent/Ultimate Parent company accounts | Double getTurnoverExport() | setTurnoverExport(Double turnoverExport) |
| `GroupLiabilities` | `Double` | Optional | Group Liabilities for the Parent/Ultimate Parent company accounts | Double getGroupLiabilities() | setGroupLiabilities(Double groupLiabilities) |
| `GroupLoans` | `Double` | Optional | Group Loans for the Parent/Ultimate Parent company accounts | Double getGroupLoans() | setGroupLoans(Double groupLoans) |
| `LiquidityRatio` | `Double` | Optional | Liquidity Ratio for the Parent/Ultimate Parent company (to 1dp) | Double getLiquidityRatio() | setLiquidityRatio(Double liquidityRatio) |
| `CurrentDBT` | `Integer` | Optional | Current number of days beyond terms for payment or the Parent/Ultimate Parent company | Integer getCurrentDBT() | setCurrentDBT(Integer currentDBT) |
| `ExperienceMonth` | `String` | Optional | Days beyond terms for payment experience for the Parent company (yyyy-mm) | String getExperienceMonth() | setExperienceMonth(String experienceMonth) |
| `CommDelphiBandText` | `String` | Optional | Current Commercial Delphi band text for the Parent/Ultimate Parent company | String getCommDelphiBandText() | setCommDelphiBandText(String commDelphiBandText) |

## Example (as JSON)

```json
{
  "CommercialName": null,
  "BusinessLocation": null,
  "CommDelphiScore": null,
  "CommDelphiBand": null,
  "StabilityOdds": null,
  "CreditRating": null,
  "CreditLimit": null,
  "DateOfAccounts": null,
  "Currency": null,
  "CurrencyMultiplier": null,
  "ConsAccounts": null,
  "LatestAccountsType": null,
  "AccountingPeriod": null,
  "NetWorth": null,
  "GrossProfit": null,
  "TurnoverSales": null,
  "TurnoverHomeNation": null,
  "TurnoverExport": null,
  "GroupLiabilities": null,
  "GroupLoans": null,
  "LiquidityRatio": null,
  "CurrentDBT": null,
  "ExperienceMonth": null,
  "CommDelphiBandText": null
}
```

