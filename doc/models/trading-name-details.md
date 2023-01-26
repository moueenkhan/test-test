
# Trading Name Details

## Structure

`TradingNameDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TradingIndicator` | `String` | Optional | Indicator to show whether the County Court Judgement is recorded against the Trading name of the limited company. T = Trading Address; U = Unclassified; Null = In absence of Trading address | String getTradingIndicator() | setTradingIndicator(String tradingIndicator) |
| `TradingName` | `String` | Optional | Trading name of subject limited company as identified in the County Court Judgement | String getTradingName() | setTradingName(String tradingName) |

## Example (as JSON)

```json
{
  "TradingIndicator": null,
  "TradingName": null
}
```

