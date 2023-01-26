
# Current Address

## Structure

`CurrentAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AlternativeLocation` | [`List<ReturnLocation>`](../../doc/models/return-location.md) | Optional | - | List<ReturnLocation> getAlternativeLocation() | setAlternativeLocation(List<ReturnLocation> alternativeLocation) |
| `ReturnLocation` | [`CheckReturnLocation`](../../doc/models/check-return-location.md) | Optional | - | CheckReturnLocation getReturnLocation() | setReturnLocation(CheckReturnLocation returnLocation) |
| `Warning` | [`List<Warning>`](../../doc/models/warning.md) | Optional | - | List<Warning> getWarning() | setWarning(List<Warning> warning) |

## Example (as JSON)

```json
{
  "AlternativeLocation": null,
  "ReturnLocation": null,
  "Warning": null
}
```

