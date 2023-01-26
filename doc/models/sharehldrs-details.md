
# Sharehldrs Details

## Structure

`SharehldrsDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ShareholderType` | `String` | Optional | Indicator showing whether this shareholder is an Individual (I) or Corporate (C) | String getShareholderType() | setShareholderType(String shareholderType) |
| `Name` | [`ShareHolderNameDetls`](../../doc/models/share-holder-name-detls.md) | Optional | Shareholder's surname | ShareHolderNameDetls getName() | setName(ShareHolderNameDetls name) |
| `ShareholderQualifications` | `String` | Optional | Shareholder's qualifications (BSC, etc) | String getShareholderQualifications() | setShareholderQualifications(String shareholderQualifications) |
| `ShareholderTitle` | `String` | Optional | Shareholder's title (Lord, Dame, etc.) | String getShareholderTitle() | setShareholderTitle(String shareholderTitle) |
| `CommercialDetail` | [`CommercialDetail`](../../doc/models/commercial-detail.md) | Optional | - | CommercialDetail getCommercialDetail() | setCommercialDetail(CommercialDetail commercialDetail) |
| `ShareholderLocation` | [`ShareHoldersLocation`](../../doc/models/share-holders-location.md) | Optional | - | ShareHoldersLocation getShareholderLocation() | setShareholderLocation(ShareHoldersLocation shareholderLocation) |
| `SuppressionFlag` | `String` | Optional | Indicator showing whether this data is suppressed from client applications - Y = Suppress from client applications | String getSuppressionFlag() | setSuppressionFlag(String suppressionFlag) |

## Example (as JSON)

```json
{
  "ShareholderType": null,
  "Name": null,
  "ShareholderQualifications": null,
  "ShareholderTitle": null,
  "CommercialDetail": null,
  "ShareholderLocation": null,
  "SuppressionFlag": null
}
```

