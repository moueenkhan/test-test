
# Business Link

## Structure

`BusinessLink`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EarliestDate` | `String` | Optional | The earliest date when this associated non-limited business became known to Experian (yyyy-mm-dd) | String getEarliestDate() | setEarliestDate(String earliestDate) |
| `LatestDate` | `String` | Optional | The latest date when this associated non-limited business became known to Experian (yyyy-mm-dd) | String getLatestDate() | setLatestDate(String latestDate) |
| `Number` | `String` | Optional | Unique identifier for the associated non-limited business | String getNumber() | setNumber(String number) |
| `Name` | `String` | Optional | Name of associated non-limited business | String getName() | setName(String name) |
| `LinkedLocation` | [`NonLtdBusinessLocation`](../../doc/models/non-ltd-business-location.md) | Optional | - | NonLtdBusinessLocation getLinkedLocation() | setLinkedLocation(NonLtdBusinessLocation linkedLocation) |

## Example (as JSON)

```json
{
  "EarliestDate": null,
  "LatestDate": null,
  "Number": null,
  "Name": null,
  "LinkedLocation": null
}
```

