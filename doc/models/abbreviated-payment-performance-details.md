
# Abbreviated Payment Performance Details

## Structure

`AbbreviatedPaymentPerformanceDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AllDataInRange` | `String` | Optional | Indicator showing whether all the Abbreviated Payment data is in the ownership period - G = Yes, L = No | String getAllDataInRange() | setAllDataInRange(String allDataInRange) |
| `NumberCashFirst` | `Integer` | Optional | Number of accounts that are Cash First or Pro forma | Integer getNumberCashFirst() | setNumberCashFirst(Integer numberCashFirst) |
| `NumberCollection` | `Integer` | Optional | Number of accounts that are placed for Collection | Integer getNumberCollection() | setNumberCollection(Integer numberCollection) |
| `ValCollection` | `Double` | Optional | Value of accounts that are placed for Collection | Double getValCollection() | setValCollection(Double valCollection) |
| `NumberCollectionLast2Years` | `Integer` | Optional | Number of accounts that have been placed for Collection in the last 2 years | Integer getNumberCollectionLast2Years() | setNumberCollectionLast2Years(Integer numberCollectionLast2Years) |
| `AcctsUnpaid1Month` | `Integer` | Optional | Number of accounts that have been unpaid for the last month | Integer getAcctsUnpaid1Month() | setAcctsUnpaid1Month(Integer acctsUnpaid1Month) |
| `AcctsUnpaid2Months` | `Integer` | Optional | Number of accounts that have been unpaid for the last 3 months | Integer getAcctsUnpaid2Months() | setAcctsUnpaid2Months(Integer acctsUnpaid2Months) |
| `AcctsUnpaid3Months` | `Integer` | Optional | Number of accounts that have been unpaid for the last 2 months | Integer getAcctsUnpaid3Months() | setAcctsUnpaid3Months(Integer acctsUnpaid3Months) |
| `NumMnths` | `Integer` | Optional | - | Integer getNumMnths() | setNumMnths(Integer numMnths) |
| `DBTMonthly` | [`List<DebitMonthly>`](../../doc/models/debit-monthly.md) | Optional | - | List<DebitMonthly> getDBTMonthly() | setDBTMonthly(List<DebitMonthly> dBTMonthly) |

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
  "NumMnths": null,
  "DBTMonthly": null
}
```

