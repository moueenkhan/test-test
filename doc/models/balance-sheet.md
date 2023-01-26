
# Balance Sheet

## Structure

`BalanceSheet`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TangibleAssetsDetails` | [`TangibleAssetsDetails`](../../doc/models/tangible-assets-details.md) | Optional | - | TangibleAssetsDetails getTangibleAssetsDetails() | setTangibleAssetsDetails(TangibleAssetsDetails tangibleAssetsDetails) |
| `IntangibleAssets` | `Double` | Optional | Value for Balance Sheet - Intangible Assets for these accounts | Double getIntangibleAssets() | setIntangibleAssets(Double intangibleAssets) |
| `InvestmentAssetsDetails` | [`InvestmentAssetsDetails`](../../doc/models/investment-assets-details.md) | Optional | - | InvestmentAssetsDetails getInvestmentAssetsDetails() | setInvestmentAssetsDetails(InvestmentAssetsDetails investmentAssetsDetails) |
| `FinancialAssetsNonCurrentDetails` | [`FinancialAssetsNonCurrentDetails`](../../doc/models/financial-assets-non-current-details.md) | Optional | - | FinancialAssetsNonCurrentDetails getFinancialAssetsNonCurrentDetails() | setFinancialAssetsNonCurrentDetails(FinancialAssetsNonCurrentDetails financialAssetsNonCurrentDetails) |
| `OtherNonCurrentAssetsDetails` | [`OtherNonCurrentAssetsDetails`](../../doc/models/other-non-current-assets-details.md) | Optional | - | OtherNonCurrentAssetsDetails getOtherNonCurrentAssetsDetails() | setOtherNonCurrentAssetsDetails(OtherNonCurrentAssetsDetails otherNonCurrentAssetsDetails) |
| `TotalFixedNonCurrentAssets` | `Double` | Optional | Value for Balance Sheet - Total Fixed Non Current Assets for these accounts | Double getTotalFixedNonCurrentAssets() | setTotalFixedNonCurrentAssets(Double totalFixedNonCurrentAssets) |
| `InventoriesDetails` | [`InventoriesDetails`](../../doc/models/inventories-details.md) | Optional | - | InventoriesDetails getInventoriesDetails() | setInventoriesDetails(InventoriesDetails inventoriesDetails) |
| `DebtorsDetails` | [`DebtorsDetails`](../../doc/models/debtors-details.md) | Optional | - | DebtorsDetails getDebtorsDetails() | setDebtorsDetails(DebtorsDetails debtorsDetails) |
| `TotalCashDetails` | [`TotalCashDetails`](../../doc/models/total-cash-details.md) | Optional | - | TotalCashDetails getTotalCashDetails() | setTotalCashDetails(TotalCashDetails totalCashDetails) |
| `FinancialAssetsCurrentDetails` | [`FinancialAssetsCurrentDetails`](../../doc/models/financial-assets-current-details.md) | Optional | - | FinancialAssetsCurrentDetails getFinancialAssetsCurrentDetails() | setFinancialAssetsCurrentDetails(FinancialAssetsCurrentDetails financialAssetsCurrentDetails) |
| `OtherCurrentAssetsDetails` | [`OtherCurrentAssetsDetails`](../../doc/models/other-current-assets-details.md) | Optional | - | OtherCurrentAssetsDetails getOtherCurrentAssetsDetails() | setOtherCurrentAssetsDetails(OtherCurrentAssetsDetails otherCurrentAssetsDetails) |
| `TotalCurrentAssets` | `Double` | Optional | Value for Balance Sheet - Total Current Assets for these account | Double getTotalCurrentAssets() | setTotalCurrentAssets(Double totalCurrentAssets) |
| `CreditorsDetails` | [`CreditorsDetails`](../../doc/models/creditors-details.md) | Optional | - | CreditorsDetails getCreditorsDetails() | setCreditorsDetails(CreditorsDetails creditorsDetails) |
| `FinancialLiabilitiesDetails` | [`FinancialLiabilitiesDetails`](../../doc/models/financial-liabilities-details.md) | Optional | - | FinancialLiabilitiesDetails getFinancialLiabilitiesDetails() | setFinancialLiabilitiesDetails(FinancialLiabilitiesDetails financialLiabilitiesDetails) |
| `OtherCurrentLiabilitiesDetails` | [`OtherCurrentLiabilitiesDetails`](../../doc/models/other-current-liabilities-details.md) | Optional | - | OtherCurrentLiabilitiesDetails getOtherCurrentLiabilitiesDetails() | setOtherCurrentLiabilitiesDetails(OtherCurrentLiabilitiesDetails otherCurrentLiabilitiesDetails) |
| `TotalCurrentLiabilities` | `Double` | Optional | Value for Balance Sheet - Total Current Liabilities for these accounts | Double getTotalCurrentLiabilities() | setTotalCurrentLiabilities(Double totalCurrentLiabilities) |
| `WorkingCapital` | `Double` | Optional | Value for Balance Sheet - Working Capital for these accounts | Double getWorkingCapital() | setWorkingCapital(Double workingCapital) |
| `CapitalEmployed` | `Double` | Optional | Value for Balance Sheet - Capital Employed for these accounts | Double getCapitalEmployed() | setCapitalEmployed(Double capitalEmployed) |
| `LongTermFinancialLiabilitiesDetails` | [`LongTermFinancialLiabilitiesDetails`](../../doc/models/long-term-financial-liabilities-details.md) | Optional | - | LongTermFinancialLiabilitiesDetails getLongTermFinancialLiabilitiesDetails() | setLongTermFinancialLiabilitiesDetails(LongTermFinancialLiabilitiesDetails longTermFinancialLiabilitiesDetails) |
| `OtherNonCurrentLiabilitiesDetails` | [`OtherNonCurrentLiabilitiesDetails`](../../doc/models/other-non-current-liabilities-details.md) | Optional | - | OtherNonCurrentLiabilitiesDetails getOtherNonCurrentLiabilitiesDetails() | setOtherNonCurrentLiabilitiesDetails(OtherNonCurrentLiabilitiesDetails otherNonCurrentLiabilitiesDetails) |
| `TotalNonCurrentLiabilities` | `Double` | Optional | Value for Balance Sheet - Total Non-current Liabilities for these accounts | Double getTotalNonCurrentLiabilities() | setTotalNonCurrentLiabilities(Double totalNonCurrentLiabilities) |
| `ProvisionsDetails` | [`ProvisionsDetails`](../../doc/models/provisions-details.md) | Optional | - | ProvisionsDetails getProvisionsDetails() | setProvisionsDetails(ProvisionsDetails provisionsDetails) |
| `MinorityInterestsUKGAAP` | `Double` | Optional | Value for Balance Sheet - Minority Interests for these accounts (applicable to UK GAAP only) | Double getMinorityInterestsUKGAAP() | setMinorityInterestsUKGAAP(Double minorityInterestsUKGAAP) |
| `NetAssets` | `Double` | Optional | Value for Balance Sheet - Net Assets for these accounts | Double getNetAssets() | setNetAssets(Double netAssets) |
| `IssuedCapitalDetails` | [`IssuedCapitalDetails`](../../doc/models/issued-capital-details.md) | Optional | - | IssuedCapitalDetails getIssuedCapitalDetails() | setIssuedCapitalDetails(IssuedCapitalDetails issuedCapitalDetails) |
| `SharePremium` | `Double` | Optional | Value for Balance Sheet - Share Premium for these accounts | Double getSharePremium() | setSharePremium(Double sharePremium) |
| `InterestInOwnShares` | `Double` | Optional | Value for Balance Sheet - Interest In Own Shares for these accounts | Double getInterestInOwnShares() | setInterestInOwnShares(Double interestInOwnShares) |
| `RetainedEarnings` | `Double` | Optional | Value for Balance Sheet - Retained Earnings for these accounts | Double getRetainedEarnings() | setRetainedEarnings(Double retainedEarnings) |
| `RevaluationReserve` | `Double` | Optional | Value for Balance Sheet - Revaluation Reserve for these accounts | Double getRevaluationReserve() | setRevaluationReserve(Double revaluationReserve) |
| `CurrencyTranslationReserve` | `Double` | Optional | Value for Balance Sheet - Currency Translation Reserve for these accounts | Double getCurrencyTranslationReserve() | setCurrencyTranslationReserve(Double currencyTranslationReserve) |
| `Other` | `Double` | Optional | Value for Balance Sheet - Other for these accounts | Double getOther() | setOther(Double other) |
| `TotalShareholdersFunds` | `Double` | Optional | Value for Balance Sheet - Total Shareholders' Funds (Total Equity) for these accounts | Double getTotalShareholdersFunds() | setTotalShareholdersFunds(Double totalShareholdersFunds) |
| `MinorityInterestsIFRS` | `Double` | Optional | Value for Balance Sheet - Minority Interests for these accounts (applicable to IFRS only) | Double getMinorityInterestsIFRS() | setMinorityInterestsIFRS(Double minorityInterestsIFRS) |
| `NetWorth` | `Double` | Optional | Value for Balance Sheet - Net Worth for these accounts | Double getNetWorth() | setNetWorth(Double netWorth) |

## Example (as JSON)

```json
{
  "TangibleAssetsDetails": null,
  "IntangibleAssets": null,
  "InvestmentAssetsDetails": null,
  "FinancialAssetsNonCurrentDetails": null,
  "OtherNonCurrentAssetsDetails": null,
  "TotalFixedNonCurrentAssets": null,
  "InventoriesDetails": null,
  "DebtorsDetails": null,
  "TotalCashDetails": null,
  "FinancialAssetsCurrentDetails": null,
  "OtherCurrentAssetsDetails": null,
  "TotalCurrentAssets": null,
  "CreditorsDetails": null,
  "FinancialLiabilitiesDetails": null,
  "OtherCurrentLiabilitiesDetails": null,
  "TotalCurrentLiabilities": null,
  "WorkingCapital": null,
  "CapitalEmployed": null,
  "LongTermFinancialLiabilitiesDetails": null,
  "OtherNonCurrentLiabilitiesDetails": null,
  "TotalNonCurrentLiabilities": null,
  "ProvisionsDetails": null,
  "MinorityInterestsUKGAAP": null,
  "NetAssets": null,
  "IssuedCapitalDetails": null,
  "SharePremium": null,
  "InterestInOwnShares": null,
  "RetainedEarnings": null,
  "RevaluationReserve": null,
  "CurrencyTranslationReserve": null,
  "Other": null,
  "TotalShareholdersFunds": null,
  "MinorityInterestsIFRS": null,
  "NetWorth": null
}
```

