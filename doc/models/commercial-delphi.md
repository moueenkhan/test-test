
# Commercial Delphi

## Structure

`CommercialDelphi`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `KeySegmentData` | `String` | Optional | Key Segment data | String getKeySegmentData() | setKeySegmentData(String keySegmentData) |
| `Consent` | `String` | Optional | Indicator showing whether property consent has been obtained for the non-limited business - 'Y' if consent provided, 'N' if consent not provided | String getConsent() | setConsent(String consent) |
| `SearchType` | `String` | Optional | Search Type from Strategy Driver Output block | String getSearchType() | setSearchType(String searchType) |
| `CommDelphiScore` | `String` | Optional | Current Commercial Delphi score for the non-limited business | String getCommDelphiScore() | setCommDelphiScore(String commDelphiScore) |
| `CreditRating` | `String` | Optional | Current Commercial Delphi Credit Rating for the non-limited business | String getCreditRating() | setCreditRating(String creditRating) |
| `CreditLimit` | `String` | Optional | Current Commercial Delphi Credit Limit for the non-limited business | String getCreditLimit() | setCreditLimit(String creditLimit) |
| `ProbabilityDefaultScore` | `String` | Optional | Current probability of Default score for the non-limited business | String getProbabilityDefaultScore() | setProbabilityDefaultScore(String probabilityDefaultScore) |
| `StabilityOdds` | `String` | Optional | Current Stability odds for the non-limited business | String getStabilityOdds() | setStabilityOdds(String stabilityOdds) |
| `CommDelphiBand` | `String` | Optional | Code for current Commercial Delphi Band Text for the non-limited business | String getCommDelphiBand() | setCommDelphiBand(String commDelphiBand) |
| `PossRelatedDataFlag` | `String` | Optional | Indicator showing whether there are any Possibly Related businesses which have not been included in the derivation of the Commercial Delphi score- Y = Possibly Related business identified; N = no Possibly Related business identified | String getPossRelatedDataFlag() | setPossRelatedDataFlag(String possRelatedDataFlag) |
| `BusinessNOCFlag` | `String` | Optional | Indicator showing whether there are any Notices of Corrections recorded against the non-limited business - | String getBusinessNOCFlag() | setBusinessNOCFlag(String businessNOCFlag) |
| `Proprietor1NOCFlag` | `String` | Optional | Indicator showing whether there are any Notices of Corrections recorded against the first Proprietor of the non-limited business - | String getProprietor1NOCFlag() | setProprietor1NOCFlag(String proprietor1NOCFlag) |
| `Proprietor2NOCFlag` | `String` | Optional | Indicator showing whether there are any Notices of Corrections recorded against the second Proprietor of the non-limited business - | String getProprietor2NOCFlag() | setProprietor2NOCFlag(String proprietor2NOCFlag) |
| `Proprietor3NOCFlag` | `String` | Optional | Indicator showing whether there are any Notices of Corrections recorded against the third Proprietor of the non-limited business - | String getProprietor3NOCFlag() | setProprietor3NOCFlag(String proprietor3NOCFlag) |
| `OverrideIndicator` | `String` | Optional | Indicator showing whether the current Commercial Delphi score of the non-limited business has been manually overridden - Y = overridden; N = not overridden | String getOverrideIndicator() | setOverrideIndicator(String overrideIndicator) |
| `CreditRatingOverrideIndicator` | `String` | Optional | the current Commercial Delphi Credit Rating of the non-limited business has been manually overridden - Y = overridden; N = not overridden | String getCreditRatingOverrideIndicator() | setCreditRatingOverrideIndicator(String creditRatingOverrideIndicator) |
| `CreditLimitOverrideIndicator` | `String` | Optional | Indicator showing whether the current Commercial Delphi Credit Limit of the non-limited business has been manually overridden - Y = overridden; N = not overridden | String getCreditLimitOverrideIndicator() | setCreditLimitOverrideIndicator(String creditLimitOverrideIndicator) |
| `CreditTextOverrideIndicator` | `String` | Optional | Indicator showing whether the current Commercial Delphi Credit Text of the non-limited business has been manually overridden - Y = overridden; N = not overridden | String getCreditTextOverrideIndicator() | setCreditTextOverrideIndicator(String creditTextOverrideIndicator) |
| `NumPropsSearched` | `Integer` | Optional | Number of Proprietors of the non-limited business searched | Integer getNumPropsSearched() | setNumPropsSearched(Integer numPropsSearched) |
| `NumPropsFound` | `Integer` | Optional | Number of Proprietors of the non-limited business searched and successfully found | Integer getNumPropsFound() | setNumPropsFound(Integer numPropsFound) |
| `NumPropsNoData` | `Integer` | Optional | Number of Proprietors of the non-limited business searched and no data found | Integer getNumPropsNoData() | setNumPropsNoData(Integer numPropsNoData) |
| `NumPropsNotTraced` | `Integer` | Optional | Number of Proprietors of the non-limited business searched and not traced | Integer getNumPropsNotTraced() | setNumPropsNotTraced(Integer numPropsNotTraced) |
| `NameAddressFlag1` | `String` | Optional | Proprietor Searched / Found Flag(1) | String getNameAddressFlag1() | setNameAddressFlag1(String nameAddressFlag1) |
| `NameAddressFlag2` | `String` | Optional | Proprietor Searched / Found Flag(2) | String getNameAddressFlag2() | setNameAddressFlag2(String nameAddressFlag2) |
| `NameAddressFlag3` | `String` | Optional | Proprietor Searched / Found Flag(3) | String getNameAddressFlag3() | setNameAddressFlag3(String nameAddressFlag3) |
| `RiskText` | `String` | Optional | Risk text for the non-limited business | String getRiskText() | setRiskText(String riskText) |
| `CreditText` | `String` | Optional | Credit text for the non-limited business | String getCreditText() | setCreditText(String creditText) |
| `ConcludingText` | `String` | Optional | Concluding text for the non-limited business | String getConcludingText() | setConcludingText(String concludingText) |
| `NOCText` | `String` | Optional | Notice of Correction text for the non-limited business | String getNOCText() | setNOCText(String nOCText) |
| `PossRelatedDataText` | `String` | Optional | Possibly Related data text for the non-limited business | String getPossRelatedDataText() | setPossRelatedDataText(String possRelatedDataText) |

## Example (as JSON)

```json
{
  "KeySegmentData": null,
  "Consent": null,
  "SearchType": null,
  "CommDelphiScore": null,
  "CreditRating": null,
  "CreditLimit": null,
  "ProbabilityDefaultScore": null,
  "StabilityOdds": null,
  "CommDelphiBand": null,
  "PossRelatedDataFlag": null,
  "BusinessNOCFlag": null,
  "Proprietor1NOCFlag": null,
  "Proprietor2NOCFlag": null,
  "Proprietor3NOCFlag": null,
  "OverrideIndicator": null,
  "CreditRatingOverrideIndicator": null,
  "CreditLimitOverrideIndicator": null,
  "CreditTextOverrideIndicator": null,
  "NumPropsSearched": null,
  "NumPropsFound": null,
  "NumPropsNoData": null,
  "NumPropsNotTraced": null,
  "NameAddressFlag1": null,
  "NameAddressFlag2": null,
  "NameAddressFlag3": null,
  "RiskText": null,
  "CreditText": null,
  "ConcludingText": null,
  "NOCText": null,
  "PossRelatedDataText": null
}
```

