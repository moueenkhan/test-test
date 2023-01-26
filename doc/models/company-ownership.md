
# Company Ownership

## Structure

`CompanyOwnership`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ParRegNumber` | `String` | Optional | Parent company registered number | String getParRegNumber() | setParRegNumber(String parRegNumber) |
| `ParCountry` | `String` | Optional | ISO country code of parent company country of origin | String getParCountry() | setParCountry(String parCountry) |
| `PrevParRegNumber` | `String` | Optional | Previous parent company registered number | String getPrevParRegNumber() | setPrevParRegNumber(String prevParRegNumber) |
| `PrevParCountry` | `String` | Optional | ISO country code of previous parent company country of origin | String getPrevParCountry() | setPrevParCountry(String prevParCountry) |
| `UltParRegNumber` | `String` | Optional | Ultimate parent company registered number | String getUltParRegNumber() | setUltParRegNumber(String ultParRegNumber) |
| `UltParCountry` | `String` | Optional | ISO country code of ultimate parent company country of origin | String getUltParCountry() | setUltParCountry(String ultParCountry) |
| `PrevUltParRegNumber` | `String` | Optional | Previous ultimate parent company registered number | String getPrevUltParRegNumber() | setPrevUltParRegNumber(String prevUltParRegNumber) |
| `PrevUltParCountry` | `String` | Optional | ISO country code of previous ultimate parent company country of origin | String getPrevUltParCountry() | setPrevUltParCountry(String prevUltParCountry) |
| `BulkShareHolders` | `String` | Optional | Bulk shareholders - Y = Bulk shareholders list; N = No bulk shareholders list | String getBulkShareHolders() | setBulkShareHolders(String bulkShareHolders) |
| `BulkTelephone` | `String` | Optional | Bulk shareholders contact telephone number | String getBulkTelephone() | setBulkTelephone(String bulkTelephone) |
| `NumPrincShareHldrs` | `Integer` | Optional | Number of Principal Shareholders (0 - 10) | Integer getNumPrincShareHldrs() | setNumPrincShareHldrs(Integer numPrincShareHldrs) |
| `ParentDetail` | [`ParentDetail`](../../doc/models/parent-detail.md) | Optional | - | ParentDetail getParentDetail() | setParentDetail(ParentDetail parentDetail) |
| `PrevParName` | [`ParentName`](../../doc/models/parent-name.md) | Optional | - | ParentName getPrevParName() | setPrevParName(ParentName prevParName) |
| `UltParentDetail` | [`ParentDetail`](../../doc/models/parent-detail.md) | Optional | - | ParentDetail getUltParentDetail() | setUltParentDetail(ParentDetail ultParentDetail) |
| `PrevUltParName` | [`ParentName`](../../doc/models/parent-name.md) | Optional | - | ParentName getPrevUltParName() | setPrevUltParName(ParentName prevUltParName) |
| `CorporateShareholder` | [`List<CorporateShareholder>`](../../doc/models/corporate-shareholder.md) | Optional | - | List<CorporateShareholder> getCorporateShareholder() | setCorporateShareholder(List<CorporateShareholder> corporateShareholder) |

## Example (as JSON)

```json
{
  "ParRegNumber": null,
  "ParCountry": null,
  "PrevParRegNumber": null,
  "PrevParCountry": null,
  "UltParRegNumber": null,
  "UltParCountry": null,
  "PrevUltParRegNumber": null,
  "PrevUltParCountry": null,
  "BulkShareHolders": null,
  "BulkTelephone": null,
  "NumPrincShareHldrs": null,
  "ParentDetail": null,
  "PrevParName": null,
  "UltParentDetail": null,
  "PrevUltParName": null,
  "CorporateShareholder": null
}
```

