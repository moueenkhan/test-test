
# Ltd Payment Full

## Structure

`LtdPaymentFull`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AvgDBT12Mnths` | `Integer` | Optional | Average number of days beyond terms for payment over the previous 12 months for the limited company | Integer getAvgDBT12Mnths() | setAvgDBT12Mnths(Integer avgDBT12Mnths) |
| `AvgDBT3Mnths` | `Integer` | Optional | Average number of days beyond terms for payment over the previous 3 months for the limited company | Integer getAvgDBT3Mnths() | setAvgDBT3Mnths(Integer avgDBT3Mnths) |
| `AvgDBT6Mnths` | `Integer` | Optional | Average number of days beyond terms for payment over the previous 6 months for the limited company | Integer getAvgDBT6Mnths() | setAvgDBT6Mnths(Integer avgDBT6Mnths) |
| `CommonTerms` | [`List<CommonTerms>`](../../doc/models/common-terms.md) | Optional | - | List<CommonTerms> getCommonTerms() | setCommonTerms(List<CommonTerms> commonTerms) |
| `CompanyDBTMonthly` | [`List<CompDebitMonthly>`](../../doc/models/comp-debit-monthly.md) | Optional | - | List<CompDebitMonthly> getCompanyDBTMonthly() | setCompanyDBTMonthly(List<CompDebitMonthly> companyDBTMonthly) |
| `CompanyNumMnths` | `Integer` | Optional | Number of days beyond terms months for the limited company | Integer getCompanyNumMnths() | setCompanyNumMnths(Integer companyNumMnths) |
| `FastestMonth` | `String` | Optional | Month where number of days beyond terms for payment has the lowest average value for the limited company (yyyy-mm) | String getFastestMonth() | setFastestMonth(String fastestMonth) |
| `FastestPayment` | `Integer` | Optional | Number of days beyond terms for payment in the month with the lowest average value for the limited company | Integer getFastestPayment() | setFastestPayment(Integer fastestPayment) |
| `IndAvgDBT12Mnths` | `Integer` | Optional | Average number of days beyond terms for payment over the previous 12 months as an industry average | Integer getIndAvgDBT12Mnths() | setIndAvgDBT12Mnths(Integer indAvgDBT12Mnths) |
| `IndAvgDBT3Mnths` | `Integer` | Optional | Average number of days beyond terms for payment over the previous 3 months as an industry average= | Integer getIndAvgDBT3Mnths() | setIndAvgDBT3Mnths(Integer indAvgDBT3Mnths) |
| `IndAvgDBT6Mnths` | `Integer` | Optional | Average number of days beyond terms for payment over the previous 6 months as an industry average | Integer getIndAvgDBT6Mnths() | setIndAvgDBT6Mnths(Integer indAvgDBT6Mnths) |
| `IndDBTMonthly` | [`List<IndDebitMonthly>`](../../doc/models/ind-debit-monthly.md) | Optional | - | List<IndDebitMonthly> getIndDBTMonthly() | setIndDBTMonthly(List<IndDebitMonthly> indDBTMonthly) |
| `IndNumberDBT100K` | `Integer` | Optional | Number of payments beyond terms where amount is in the range &pound; to &pound; 100,000 as an industry average | Integer getIndNumberDBT100K() | setIndNumberDBT100K(Integer indNumberDBT100K) |
| `IndNumberDBT100KPlus` | `Integer` | Optional | Number of payments beyond terms where amount exceeds &pound; 100,000 as an industry average | Integer getIndNumberDBT100KPlus() | setIndNumberDBT100KPlus(Integer indNumberDBT100KPlus) |
| `IndNumberDBT10K` | `Integer` | Optional | Number of payments beyond terms where amount is in the range &pound; 1,000 to &pound;10,000 as an industry average | Integer getIndNumberDBT10K() | setIndNumberDBT10K(Integer indNumberDBT10K) |
| `IndNumberDBT1K` | `Integer` | Optional | Number of payments beyond terms where amount is up to &pound; 1,000 as an industry average | Integer getIndNumberDBT1K() | setIndNumberDBT1K(Integer indNumberDBT1K) |
| `IndPaymentPattern` | `String` | Optional | Analysis of the payment pattern for the industry - C = Consistent; S = Slower; F = Faster | String getIndPaymentPattern() | setIndPaymentPattern(String indPaymentPattern) |
| `IndustryNumMnths` | `Integer` | Optional | Number of Industry days beyond terms months | Integer getIndustryNumMnths() | setIndustryNumMnths(Integer industryNumMnths) |
| `IndustrySICDesc` | `String` | Optional | The description associated with the SIC code | String getIndustrySICDesc() | setIndustrySICDesc(String industrySICDesc) |
| `NumCommonTerms` | `Integer` | Optional | Number of common terms | Integer getNumCommonTerms() | setNumCommonTerms(Integer numCommonTerms) |
| `NumberCashFirst` | `Double` | Optional | Number of accounts that are Cash First or Pro forma | Double getNumberCashFirst() | setNumberCashFirst(Double numberCashFirst) |
| `NumberCollection` | `Double` | Optional | Number of accounts that are Collection | Double getNumberCollection() | setNumberCollection(Double numberCollection) |
| `NumberDBT100K` | `Integer` | Optional | Number of payments beyond terms where amount is in the range &pound; 10,000 to &pound; 100,000 for the limited company | Integer getNumberDBT100K() | setNumberDBT100K(Integer numberDBT100K) |
| `NumberDBT100KPlus` | `Integer` | Optional | Number of payments beyond terms where amount exceeds &pound;100,000 for the limited company | Integer getNumberDBT100KPlus() | setNumberDBT100KPlus(Integer numberDBT100KPlus) |
| `NumberDBT10K` | `Integer` | Optional | Number of payments beyond terms where amount is in the range &pound;1,000 to &pound;10,000 for the limited company | Integer getNumberDBT10K() | setNumberDBT10K(Integer numberDBT10K) |
| `NumberDBT1K` | `Integer` | Optional | Number of payments beyond terms where amount is up to &pound;1,000 for the limited company | Integer getNumberDBT1K() | setNumberDBT1K(Integer numberDBT1K) |
| `PaymentPattern` | `String` | Optional | Analysis of the payment pattern for the limited company - C = Consistent; W = Worsening; N = Noticeable Worsening; S = Significant Worsening; I = Improvement; O = Noticeable Improvement; T = Significant Improvement | String getPaymentPattern() | setPaymentPattern(String paymentPattern) |
| `PaymentToTerms` | `String` | Optional | Analysis of the payment to terms for the limited company - B = Beyond Terms; W = Within Terms | String getPaymentToTerms() | setPaymentToTerms(String paymentToTerms) |
| `SlowestMonth` | `String` | Optional | Month where number of days beyond terms for payment has the highest average value for the limited company (yyyy-mm) | String getSlowestMonth() | setSlowestMonth(String slowestMonth) |
| `SlowestPayment` | `Integer` | Optional | Number of days beyond terms for payment in the month with the highest average value for the limited company | Integer getSlowestPayment() | setSlowestPayment(Integer slowestPayment) |
| `SuppPaymentPattern` | `String` | Optional | Analysis of the Supplier payment pattern - N = No or little difference; S = Slower; F = Faster | String getSuppPaymentPattern() | setSuppPaymentPattern(String suppPaymentPattern) |
| `UnpaidAccountsDetails` | [`List<UnpaidAccountsDetails>`](../../doc/models/unpaid-accounts-details.md) | Optional | - | List<UnpaidAccountsDetails> getUnpaidAccountsDetails() | setUnpaidAccountsDetails(List<UnpaidAccountsDetails> unpaidAccountsDetails) |
| `ValCollection` | `Double` | Optional | Value of accounts that are Collection | Double getValCollection() | setValCollection(Double valCollection) |

## Example (as JSON)

```json
{
  "AvgDBT12Mnths": null,
  "AvgDBT3Mnths": null,
  "AvgDBT6Mnths": null,
  "CommonTerms": null,
  "CompanyDBTMonthly": null,
  "CompanyNumMnths": null,
  "FastestMonth": null,
  "FastestPayment": null,
  "IndAvgDBT12Mnths": null,
  "IndAvgDBT3Mnths": null,
  "IndAvgDBT6Mnths": null,
  "IndDBTMonthly": null,
  "IndNumberDBT100K": null,
  "IndNumberDBT100KPlus": null,
  "IndNumberDBT10K": null,
  "IndNumberDBT1K": null,
  "IndPaymentPattern": null,
  "IndustryNumMnths": null,
  "IndustrySICDesc": null,
  "NumCommonTerms": null,
  "NumberCashFirst": null,
  "NumberCollection": null,
  "NumberDBT100K": null,
  "NumberDBT100KPlus": null,
  "NumberDBT10K": null,
  "NumberDBT1K": null,
  "PaymentPattern": null,
  "PaymentToTerms": null,
  "SlowestMonth": null,
  "SlowestPayment": null,
  "SuppPaymentPattern": null,
  "UnpaidAccountsDetails": null,
  "ValCollection": null
}
```

