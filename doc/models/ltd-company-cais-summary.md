
# Ltd Company CAIS Summary

## Structure

`LtdCompanyCAISSummary`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AgeSinceLast89` | `int` | Required | Time since last status 8 or 9 (Months) | int getAgeSinceLast89() | setAgeSinceLast89(int ageSinceLast89) |
| `MonthCount` | `int` | Required | Number of months data (Currently set to 12) | int getMonthCount() | setMonthCount(int monthCount) |
| `MonthlyData` | [`List<LtdMonthlyData>`](../../doc/models/ltd-monthly-data.md) | Optional | - | List<LtdMonthlyData> getMonthlyData() | setMonthlyData(List<LtdMonthlyData> monthlyData) |

## Example (as JSON)

```json
{
  "AgeSinceLast89": 38,
  "MonthCount": 122,
  "MonthlyData": null
}
```

