
# Liquidator

## Structure

`Liquidator`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirmName` | `String` | Optional | Trading Name of Liquidator's organisation for the appointment of Liquidators for the limited company | String getFirmName() | setFirmName(String firmName) |
| `LiquidatorLocation` | [`LtdBusinessLocation`](../../doc/models/ltd-business-location.md) | Optional | - | LtdBusinessLocation getLiquidatorLocation() | setLiquidatorLocation(LtdBusinessLocation liquidatorLocation) |
| `Name` | `String` | Optional | Name of individual Liquidator for the appointment of Liquidators for the limited company | String getName() | setName(String name) |

## Example (as JSON)

```json
{
  "FirmName": null,
  "LiquidatorLocation": null,
  "Name": null
}
```

