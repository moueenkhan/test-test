
# Rcvr Appnt Data

## Structure

`RcvrAppntData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirmName` | `String` | Optional | Firm Name of this Receiver for the appointment of Receivers for the limited company | String getFirmName() | setFirmName(String firmName) |
| `ReceiverDate` | `String` | Optional | Receiver appointment date (yyyy-mm-dd) | String getReceiverDate() | setReceiverDate(String receiverDate) |
| `ReceiverLocation` | [`LtdBusinessLocation`](../../doc/models/ltd-business-location.md) | Optional | - | LtdBusinessLocation getReceiverLocation() | setReceiverLocation(LtdBusinessLocation receiverLocation) |
| `ReceiverName` | `String` | Optional | Name of individual Receiver for the appointment of Receivers for the limited company | String getReceiverName() | setReceiverName(String receiverName) |
| `ReceiverType` | `String` | Optional | Receiver Type indicator - Y = Administrative Receiver; N = Receiver | String getReceiverType() | setReceiverType(String receiverType) |

## Example (as JSON)

```json
{
  "FirmName": null,
  "ReceiverDate": null,
  "ReceiverLocation": null,
  "ReceiverName": null,
  "ReceiverType": null
}
```

