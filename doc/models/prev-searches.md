
# Prev Searches

## Structure

`PrevSearches`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DataOutOwnshpRange` | `String` | Optional | Indicator showing whether there is any Previous Search data outside the ownership range for the non-limited business - Y - Data outside ownership range; N- No data outside ownership range | String getDataOutOwnshpRange() | setDataOutOwnshpRange(String dataOutOwnshpRange) |
| `NumPrevSearch3Mth` | `Integer` | Optional | Number of previous searches of the non-limited business in the preceding 3 months (0 - 99) | Integer getNumPrevSearch3Mth() | setNumPrevSearch3Mth(Integer numPrevSearch3Mth) |
| `NumPrevSearch6Mth` | `Integer` | Optional | Number of previous searches of the non-limited business in the preceding 6 months (0 - 99) | Integer getNumPrevSearch6Mth() | setNumPrevSearch6Mth(Integer numPrevSearch6Mth) |
| `NumPrevSearch12Mth` | `Integer` | Optional | Number of previous searches of the non-limited business in the preceding 12 months (0 - 99) | Integer getNumPrevSearch12Mth() | setNumPrevSearch12Mth(Integer numPrevSearch12Mth) |
| `NOCFlag` | `String` | Optional | Indicator showing whether there are any associated Notices of Correction - Y=1 or more NOC, N=no NOC | String getNOCFlag() | setNOCFlag(String nOCFlag) |
| `PrevSearchDetail` | [`List<PrevSearchDetail>`](../../doc/models/prev-search-detail.md) | Optional | - | List<PrevSearchDetail> getPrevSearchDetail() | setPrevSearchDetail(List<PrevSearchDetail> prevSearchDetail) |

## Example (as JSON)

```json
{
  "DataOutOwnshpRange": null,
  "NumPrevSearch3Mth": null,
  "NumPrevSearch6Mth": null,
  "NumPrevSearch12Mth": null,
  "NOCFlag": null,
  "PrevSearchDetail": null
}
```

