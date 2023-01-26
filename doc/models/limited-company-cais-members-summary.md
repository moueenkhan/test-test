
# Limited Company CAIS Members Summary

## Structure

`LimitedCompanyCAISMembersSummary`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AgeSinceLast89` | `String` | Optional | Time since last status 8 or 9 (Months) | String getAgeSinceLast89() | setAgeSinceLast89(String ageSinceLast89) |
| `MonthCount` | `String` | Optional | Number of months data (Currently set to 12) | String getMonthCount() | setMonthCount(String monthCount) |
| `MonthlyData` | [`List<LtdMonthlyData>`](../../doc/models/ltd-monthly-data.md) | Optional | - | List<LtdMonthlyData> getMonthlyData() | setMonthlyData(List<LtdMonthlyData> monthlyData) |

## Example (as JSON)

```json
{
  "AgeSinceLast89": null,
  "MonthCount": null,
  "MonthlyData": null
}
```

