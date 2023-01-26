
# Rcvr Csstn Data

## Structure

`RcvrCsstnData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CessationDate` | `String` | Optional | A Receiver Cessation Date for the mortgage for the limited company (yyyy-mm-dd) | String getCessationDate() | setCessationDate(String cessationDate) |
| `ReceiverLocation` | [`LtdBusinessLocation`](../../doc/models/ltd-business-location.md) | Optional | - | LtdBusinessLocation getReceiverLocation() | setReceiverLocation(LtdBusinessLocation receiverLocation) |
| `ReceiverName` | `String` | Optional | Name of this Receiver for the cessation of Receivers for the limited company | String getReceiverName() | setReceiverName(String receiverName) |

## Example (as JSON)

```json
{
  "CessationDate": null,
  "ReceiverLocation": null,
  "ReceiverName": null
}
```

