
# Liquidators

## Structure

`Liquidators`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AppointedBy` | `String` | Optional | Liquidators appointed by indicator - MC = Members & Creditors; M = Members; C = Creditors; U = Unknown; Set to spaces when compulsory liquidation. | String getAppointedBy() | setAppointedBy(String appointedBy) |
| `AppointmentDate` | `String` | Optional | Appointment Date for the appointment of Liquidators for the limited company (yyyy-dd-dd) | String getAppointmentDate() | setAppointmentDate(String appointmentDate) |
| `LiquidationType` | `String` | Optional | Liquidation Type indicator - C = Compulsory; V = Voluntary | String getLiquidationType() | setLiquidationType(String liquidationType) |
| `Liquidator` | [`List<Liquidator>`](../../doc/models/liquidator.md) | Optional | - | List<Liquidator> getLiquidator() | setLiquidator(List<Liquidator> liquidator) |
| `NatureOfBusiness` | `String` | Optional | Nature of business of the subject limited company for the appointment of Liquidators | String getNatureOfBusiness() | setNatureOfBusiness(String natureOfBusiness) |
| `NumberLiquidators` | `Integer` | Optional | Number of Liquidators for the appointment of Liquidators for the limited company (max 2) | Integer getNumberLiquidators() | setNumberLiquidators(Integer numberLiquidators) |
| `PublicationDate` | `String` | Optional | Publication Date for the appointment of Liquidators for the limited company (yyyy-dd-dd) | String getPublicationDate() | setPublicationDate(String publicationDate) |
| `TradingName` | `String` | Optional | Trading Name of the subject limited company for the appointment of Liquidators | String getTradingName() | setTradingName(String tradingName) |

## Example (as JSON)

```json
{
  "AppointedBy": null,
  "AppointmentDate": null,
  "LiquidationType": null,
  "Liquidator": null,
  "NatureOfBusiness": null,
  "NumberLiquidators": null,
  "PublicationDate": null,
  "TradingName": null
}
```

