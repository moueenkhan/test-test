
# Comp Rcvr Cessation

## Structure

`CompRcvrCessation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FormType` | `String` | Optional | Cessation of Receivers form type indicator - A = Form 4052; B = Form 3SC; C = Form 33SC | String getFormType() | setFormType(String formType) |
| `LodgedDate` | `String` | Optional | Lodged Date for the cessation of Receivers for the limited company (yyyy-mm-dd) | String getLodgedDate() | setLodgedDate(String lodgedDate) |
| `NumberReceivers` | `Integer` | Optional | Number of Receivers for the cessation of Receivers for the limited company (max 5) | Integer getNumberReceivers() | setNumberReceivers(Integer numberReceivers) |
| `PublicationTown` | `String` | Optional | Publication Town for cessation of Receivers indicator - B = Belfast; C = Cardiff; E = Edinburgh; L = London | String getPublicationTown() | setPublicationTown(String publicationTown) |
| `ReceiverData` | [`List<RcvrCsstnData>`](../../doc/models/rcvr-csstn-data.md) | Optional | - | List<RcvrCsstnData> getReceiverData() | setReceiverData(List<RcvrCsstnData> receiverData) |

## Example (as JSON)

```json
{
  "FormType": null,
  "LodgedDate": null,
  "NumberReceivers": null,
  "PublicationTown": null,
  "ReceiverData": null
}
```

