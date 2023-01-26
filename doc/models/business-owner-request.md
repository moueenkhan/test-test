
# Business Owner Request

## Structure

`BusinessOwnerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Control` | [`Control`](../../doc/models/control.md) | Optional | - | Control getControl() | setControl(Control control) |
| `BusinessDetails` | [`BusinessDetail`](../../doc/models/business-detail.md) | Optional | - | BusinessDetail getBusinessDetails() | setBusinessDetails(BusinessDetail businessDetails) |
| `Individuals` | [`List<Individual>`](../../doc/models/individual.md) | Optional | - | List<Individual> getIndividuals() | setIndividuals(List<Individual> individuals) |
| `LengthOwnership` | [`TimeAt`](../../doc/models/time-at.md) | Optional | - | TimeAt getLengthOwnership() | setLengthOwnership(TimeAt lengthOwnership) |

## Example (as JSON)

```json
{
  "Control": null,
  "BusinessDetails": null,
  "Individuals": null,
  "LengthOwnership": null
}
```

