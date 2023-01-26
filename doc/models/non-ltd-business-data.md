
# Non Ltd Business Data

## Structure

`NonLtdBusinessData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NonLimitedKey` | `String` | Optional | Unique identifier for the non-limited business | String getNonLimitedKey() | setNonLimitedKey(String nonLimitedKey) |
| `BusinessName` | `String` | Optional | Name of non-limited business | String getBusinessName() | setBusinessName(String businessName) |
| `OwnershipStartDate` | `String` | Optional | The date when most recently known ownership started (yyyy-mm-dd) | String getOwnershipStartDate() | setOwnershipStartDate(String ownershipStartDate) |
| `OwnershipEndDate` | `String` | Optional | The date when most recently known ownership ended (yyyy-mm-dd) | String getOwnershipEndDate() | setOwnershipEndDate(String ownershipEndDate) |
| `Identification` | [`Identification`](../../doc/models/identification.md) | Optional | - | Identification getIdentification() | setIdentification(Identification identification) |
| `CommercialDelphi` | [`CommercialDelphi`](../../doc/models/commercial-delphi.md) | Optional | - | CommercialDelphi getCommercialDelphi() | setCommercialDelphi(CommercialDelphi commercialDelphi) |
| `CommercialCAISScore` | [`CommercialCAISScore`](../../doc/models/commercial-cais-score.md) | Optional | - | CommercialCAISScore getCommercialCAISScore() | setCommercialCAISScore(CommercialCAISScore commercialCAISScore) |
| `AllCAISSummary` | [`AllCAISSummary`](../../doc/models/all-cais-summary.md) | Optional | - | AllCAISSummary getAllCAISSummary() | setAllCAISSummary(AllCAISSummary allCAISSummary) |
| `OwnCAISSummary` | [`OwnCAISSummary`](../../doc/models/own-cais-summary.md) | Optional | - | OwnCAISSummary getOwnCAISSummary() | setOwnCAISSummary(OwnCAISSummary ownCAISSummary) |
| `PaymentPerformance` | [`PaymentPerformance`](../../doc/models/payment-performance.md) | Optional | - | PaymentPerformance getPaymentPerformance() | setPaymentPerformance(PaymentPerformance paymentPerformance) |
| `NonLimitedCompanyCIFAS` | [`NonLimitedCompanyCIFAS`](../../doc/models/non-limited-company-cifas.md) | Optional | - | NonLimitedCompanyCIFAS getNonLimitedCompanyCIFAS() | setNonLimitedCompanyCIFAS(NonLimitedCompanyCIFAS nonLimitedCompanyCIFAS) |
| `CCJs` | [`CCJNonLtd`](../../doc/models/ccj-non-ltd.md) | Optional | - | CCJNonLtd getCCJs() | setCCJs(CCJNonLtd cCJs) |
| `Bankruptcies` | [`Bankruptcies`](../../doc/models/bankruptcies.md) | Optional | - | Bankruptcies getBankruptcies() | setBankruptcies(Bankruptcies bankruptcies) |
| `CommercialDelphiHistory` | [`DelphiHistoryAndScore`](../../doc/models/delphi-history-and-score.md) | Optional | - | DelphiHistoryAndScore getCommercialDelphiHistory() | setCommercialDelphiHistory(DelphiHistoryAndScore commercialDelphiHistory) |
| `ScoringData` | [`ScoringData`](../../doc/models/scoring-data.md) | Optional | - | ScoringData getScoringData() | setScoringData(ScoringData scoringData) |
| `BusinessLinks` | [`BusinessLinks`](../../doc/models/business-links.md) | Optional | - | BusinessLinks getBusinessLinks() | setBusinessLinks(BusinessLinks businessLinks) |
| `NoticeOfCorrection` | [`NoticeOfCorrection`](../../doc/models/notice-of-correction.md) | Optional | - | NoticeOfCorrection getNoticeOfCorrection() | setNoticeOfCorrection(NoticeOfCorrection noticeOfCorrection) |
| `NonLtdCAISAccountDetail` | [`List<NonLtdCAISAccountDetail>`](../../doc/models/non-ltd-cais-account-detail.md) | Optional | - | List<NonLtdCAISAccountDetail> getNonLtdCAISAccountDetail() | setNonLtdCAISAccountDetail(List<NonLtdCAISAccountDetail> nonLtdCAISAccountDetail) |
| `DirectorData` | [`DirectorData`](../../doc/models/director-data.md) | Optional | - | DirectorData getDirectorData() | setDirectorData(DirectorData directorData) |
| `AddressResolutionOutput` | [`AddressResolutionOutput`](../../doc/models/address-resolution-output.md) | Optional | - | AddressResolutionOutput getAddressResolutionOutput() | setAddressResolutionOutput(AddressResolutionOutput addressResolutionOutput) |
| `Error` | [`Error`](../../doc/models/error.md) | Optional | - | Error getError() | setError(Error error) |

## Example (as JSON)

```json
{
  "NonLimitedKey": null,
  "BusinessName": null,
  "OwnershipStartDate": null,
  "OwnershipEndDate": null,
  "Identification": null,
  "CommercialDelphi": null,
  "CommercialCAISScore": null,
  "AllCAISSummary": null,
  "OwnCAISSummary": null,
  "PaymentPerformance": null,
  "NonLimitedCompanyCIFAS": null,
  "CCJs": null,
  "Bankruptcies": null,
  "CommercialDelphiHistory": null,
  "ScoringData": null,
  "BusinessLinks": null,
  "NoticeOfCorrection": null,
  "NonLtdCAISAccountDetail": null,
  "DirectorData": null,
  "AddressResolutionOutput": null,
  "Error": null
}
```

