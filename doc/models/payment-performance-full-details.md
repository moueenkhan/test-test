
# Payment Performance Full Details

## Structure

`PaymentPerformanceFullDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AllDataInRange` | `String` | Optional | Indicator showing whether all the Full Payment data is in the ownership period - G = Yes, L = No | String getAllDataInRange() | setAllDataInRange(String allDataInRange) |
| `NumberCashFirst` | `Integer` | Optional | Number of accounts that are Cash First or Pro forma | Integer getNumberCashFirst() | setNumberCashFirst(Integer numberCashFirst) |
| `NumberCollection` | `Integer` | Optional | Number of accounts that are placed for Collection | Integer getNumberCollection() | setNumberCollection(Integer numberCollection) |
| `ValCollection` | `Double` | Optional | Value of accounts that are placed for Collection | Double getValCollection() | setValCollection(Double valCollection) |
| `NumberCollectionLast2Years` | `Integer` | Optional | Number of accounts that have been placed for Collection in the last 2 years | Integer getNumberCollectionLast2Years() | setNumberCollectionLast2Years(Integer numberCollectionLast2Years) |
| `AcctsUnpaid1Month` | `Integer` | Optional | Number of accounts that have been unpaid for the last month | Integer getAcctsUnpaid1Month() | setAcctsUnpaid1Month(Integer acctsUnpaid1Month) |
| `AcctsUnpaid2Months` | `Integer` | Optional | Number of accounts that have been unpaid for the last 2 months | Integer getAcctsUnpaid2Months() | setAcctsUnpaid2Months(Integer acctsUnpaid2Months) |
| `AcctsUnpaid3Months` | `Integer` | Optional | Number of accounts that have been unpaid for the last 3 months | Integer getAcctsUnpaid3Months() | setAcctsUnpaid3Months(Integer acctsUnpaid3Months) |
| `NumberDBT0100` | `Integer` | Optional | Number of payments beyond terms where amount is up to &pound;1,000 for the non-limited business | Integer getNumberDBT0100() | setNumberDBT0100(Integer numberDBT0100) |
| `NumberDBT100110000` | `Integer` | Optional | Number of payments beyond terms where amount is in the range &pound;1,000 to &pound;10,000 for the non-limited business | Integer getNumberDBT100110000() | setNumberDBT100110000(Integer numberDBT100110000) |
| `NumberDBT1011000` | `Integer` | Optional | Number of payments beyond terms where amount is in the range &pound;10,000 to &pound;100,000 for the non-limited business | Integer getNumberDBT1011000() | setNumberDBT1011000(Integer numberDBT1011000) |
| `NumberDBT10kPlus` | `Integer` | Optional | Number of payments beyond terms where amount exceeds &pound;100,000 for the non-limited business | Integer getNumberDBT10kPlus() | setNumberDBT10kPlus(Integer numberDBT10kPlus) |
| `AvgDBT3Mnths` | `Integer` | Optional | Average number of days beyond terms for payment over the previous 3 months for the non-limited business | Integer getAvgDBT3Mnths() | setAvgDBT3Mnths(Integer avgDBT3Mnths) |
| `AvgDBT6Mnths` | `Integer` | Optional | Average number of days beyond terms for payment over the previous 6 months for the non-limited business | Integer getAvgDBT6Mnths() | setAvgDBT6Mnths(Integer avgDBT6Mnths) |
| `AvgDBT12Mnths` | `Integer` | Optional | Average number of days beyond terms for payment over the previous 12 months for the non-limited business | Integer getAvgDBT12Mnths() | setAvgDBT12Mnths(Integer avgDBT12Mnths) |
| `AvgCurrDebt` | `Double` | Optional | Current average debt for the non-limited business | Double getAvgCurrDebt() | setAvgCurrDebt(Double avgCurrDebt) |
| `AvgDebt3Months` | `Double` | Optional | Average debt for the non-limited business in last 3 months | Double getAvgDebt3Months() | setAvgDebt3Months(Double avgDebt3Months) |
| `AvgDebt12Months` | `Double` | Optional | Average debt for the non-limited business in last 12 months | Double getAvgDebt12Months() | setAvgDebt12Months(Double avgDebt12Months) |
| `PaymentPattern` | `String` | Optional | Analysis of the payment pattern for the non-limited business - C = Consistent; W = Worsening; N = Noticeable Worsening; S = Significant Worsening; I = Improvement; O = Noticeable Improvement; T = Significant Improvement | String getPaymentPattern() | setPaymentPattern(String paymentPattern) |
| `PaymentToTerms` | `String` | Optional | Analysis of the payment to terms for the non-limited business - B = Beyond Terms; W = Within Terms | String getPaymentToTerms() | setPaymentToTerms(String paymentToTerms) |
| `FastestPayment` | `Integer` | Optional | Number of days beyond terms for payment in the month with the lowest average value for the non-limited business | Integer getFastestPayment() | setFastestPayment(Integer fastestPayment) |
| `FastestMonth` | `String` | Optional | Month where number of days beyond terms for payment has the lowest average value for the non-limited business (yyyy-mm) | String getFastestMonth() | setFastestMonth(String fastestMonth) |
| `SlowestPayment` | `Integer` | Optional | Number of days beyond terms for payment in the month with the highest average value for the non-limited business | Integer getSlowestPayment() | setSlowestPayment(Integer slowestPayment) |
| `SlowestMonth` | `String` | Optional | Month where number of days beyond terms for payment has the highest average value for the non-limited business (yyyy-mm) | String getSlowestMonth() | setSlowestMonth(String slowestMonth) |
| `NumMnths` | `Integer` | Optional | Number of days beyond terms months for the non-limited business | Integer getNumMnths() | setNumMnths(Integer numMnths) |
| `NumCommonTerms` | `Integer` | Optional | Number of common terms | Integer getNumCommonTerms() | setNumCommonTerms(Integer numCommonTerms) |
| `DBTMonthly` | [`List<DebitMonthly>`](../../doc/models/debit-monthly.md) | Optional | - | List<DebitMonthly> getDBTMonthly() | setDBTMonthly(List<DebitMonthly> dBTMonthly) |
| `CommonTerms` | [`List<CommonTerm>`](../../doc/models/common-term.md) | Optional | - | List<CommonTerm> getCommonTerms() | setCommonTerms(List<CommonTerm> commonTerms) |
| `PaymentSummary` | [`PaymentSummary`](../../doc/models/payment-summary.md) | Optional | - | PaymentSummary getPaymentSummary() | setPaymentSummary(PaymentSummary paymentSummary) |

## Example (as JSON)

```json
{
  "AllDataInRange": null,
  "NumberCashFirst": null,
  "NumberCollection": null,
  "ValCollection": null,
  "NumberCollectionLast2Years": null,
  "AcctsUnpaid1Month": null,
  "AcctsUnpaid2Months": null,
  "AcctsUnpaid3Months": null,
  "NumberDBT0-100": null,
  "NumberDBT1001-10000": null,
  "NumberDBT101-1000": null,
  "NumberDBT10kPlus": null,
  "AvgDBT3Mnths": null,
  "AvgDBT6Mnths": null,
  "AvgDBT12Mnths": null,
  "AvgCurrDebt": null,
  "AvgDebt3Months": null,
  "AvgDebt12Months": null,
  "PaymentPattern": null,
  "PaymentToTerms": null,
  "FastestPayment": null,
  "FastestMonth": null,
  "SlowestPayment": null,
  "SlowestMonth": null,
  "NumMnths": null,
  "NumCommonTerms": null,
  "DBTMonthly": null,
  "CommonTerms": null,
  "PaymentSummary": null
}
```

