
# Dir Previous Addr

## Structure

`DirPreviousAddr`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateChanged` | `String` | Optional | Address date change (yyyy-mm-dd) | String getDateChanged() | setDateChanged(String dateChanged) |
| `ForeignAddressFlag` | `String` | Optional | Indicator showing whether the person's previous address is foreign - N=UK address, Y=Foreign Address, M=Unknown address | String getForeignAddressFlag() | setForeignAddressFlag(String foreignAddressFlag) |
| `Location` | [`OutputDirLocationDetail`](../../doc/models/output-dir-location-detail.md) | Optional | - | OutputDirLocationDetail getLocation() | setLocation(OutputDirLocationDetail location) |

## Example (as JSON)

```json
{
  "DateChanged": null,
  "ForeignAddressFlag": null,
  "Location": null
}
```

