
# Bank

## Structure

`Bank`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BankSortcode` | `String` | Optional | Sort Code of the bank used by the limited company | String getBankSortcode() | setBankSortcode(String bankSortcode) |
| `BankName` | `String` | Optional | Bank name of the bank used by the limited company | String getBankName() | setBankName(String bankName) |
| `BankLocation` | [`LtdBusinessLocation`](../../doc/models/ltd-business-location.md) | Optional | - | LtdBusinessLocation getBankLocation() | setBankLocation(LtdBusinessLocation bankLocation) |

## Example (as JSON)

```json
{
  "BankSortcode": null,
  "BankName": null,
  "BankLocation": null
}
```

