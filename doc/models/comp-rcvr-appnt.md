
# Comp Rcvr Appnt

## Structure

`CompRcvrAppnt`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FormType` | `String` | Optional | Appointment of Receivers form type indicator - A = Form 4051; B = Form 1SC; C = Form 2SC | String getFormType() | setFormType(String formType) |
| `InstrumentDate` | `String` | Optional | Instrument Date for the appointment of Receivers for the limited company (yyyy-mm-dd) | String getInstrumentDate() | setInstrumentDate(String instrumentDate) |
| `InstrumentHolder` | [`List<InstrHolder>`](../../doc/models/instr-holder.md) | Optional | - | List<InstrHolder> getInstrumentHolder() | setInstrumentHolder(List<InstrHolder> instrumentHolder) |
| `LodgedDate` | `String` | Optional | Lodged Date for the appointment of Receivers for the limited company (yyyy-mm-dd) | String getLodgedDate() | setLodgedDate(String lodgedDate) |
| `NumberInstrumentHolders` | `Integer` | Optional | Number of instrument holders | Integer getNumberInstrumentHolders() | setNumberInstrumentHolders(Integer numberInstrumentHolders) |
| `NumberReceivers` | `Integer` | Optional | Number of Receivers for the appointment of Receivers for the limited company (max 5) | Integer getNumberReceivers() | setNumberReceivers(Integer numberReceivers) |
| `PublicationTown` | `String` | Optional | Publication Town for appointment of Receivers indicator - B = Belfast; C = Cardiff; E = Edinburgh; L = London | String getPublicationTown() | setPublicationTown(String publicationTown) |
| `ReceiverData` | [`List<RcvrAppntData>`](../../doc/models/rcvr-appnt-data.md) | Optional | - | List<RcvrAppntData> getReceiverData() | setReceiverData(List<RcvrAppntData> receiverData) |

## Example (as JSON)

```json
{
  "FormType": null,
  "InstrumentDate": null,
  "InstrumentHolder": null,
  "LodgedDate": null,
  "NumberInstrumentHolders": null,
  "NumberReceivers": null,
  "PublicationTown": null,
  "ReceiverData": null
}
```

