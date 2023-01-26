
# Limited Company CAIS Portfolio Summary

## Structure

`LimitedCompanyCAISPortfolioSummary`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SourceCode` | `String` | Optional | Source Code of the portfolio the client has provided and is entitled to view the data | String getSourceCode() | setSourceCode(String sourceCode) |
| `MonthCount` | `String` | Optional | Number of months data (Currently set to 12) | String getMonthCount() | setMonthCount(String monthCount) |
| `MonthlyData` | [`List<LtdMonthlyData>`](../../doc/models/ltd-monthly-data.md) | Optional | - | List<LtdMonthlyData> getMonthlyData() | setMonthlyData(List<LtdMonthlyData> monthlyData) |

## Example (as JSON)

```json
{
  "SourceCode": null,
  "MonthCount": null,
  "MonthlyData": null
}
```

