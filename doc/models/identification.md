
# Identification

## Structure

`Identification`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EarliestKnownDate` | `String` | Optional | The earliest date when this non-limited business became known to Experian (yyyy-mm-dd) | String getEarliestKnownDate() | setEarliestKnownDate(String earliestKnownDate) |
| `LastUpdated` | `String` | Optional | The date of latest update (yyyy-mm-dd) | String getLastUpdated() | setLastUpdated(String lastUpdated) |
| `Num1992SICCodes` | `Integer` | Optional | The number of 1992 SIC Codes held for the non limited business (max 10) | Integer getNum1992SICCodes() | setNum1992SICCodes(Integer num1992SICCodes) |
| `BusinessLocation` | [`NonLtdBusinessLocation`](../../doc/models/non-ltd-business-location.md) | Optional | - | NonLtdBusinessLocation getBusinessLocation() | setBusinessLocation(NonLtdBusinessLocation businessLocation) |
| `TelephoneNumber` | `String` | Optional | Non-limited business telephone number | String getTelephoneNumber() | setTelephoneNumber(String telephoneNumber) |
| `PrincipalActivities` | `String` | Optional | Principle activities for the non-limited business | String getPrincipalActivities() | setPrincipalActivities(String principalActivities) |
| `SICInformation1992` | [`List<SICInfo92>`](../../doc/models/sic-info-92.md) | Optional | - | List<SICInfo92> getSICInformation1992() | setSICInformation1992(List<SICInfo92> sICInformation1992) |
| `AvgNumEmployees` | `Double` | Optional | The average number of employees for the non-limited business | Double getAvgNumEmployees() | setAvgNumEmployees(Double avgNumEmployees) |
| `NumTelephone` | `Integer` | Optional | The number of telephone numbers held for the non-limited business | Integer getNumTelephone() | setNumTelephone(Integer numTelephone) |
| `NumFax` | `Integer` | Optional | The number of fax numbers held for the non-limited business | Integer getNumFax() | setNumFax(Integer numFax) |
| `Telephone` | [`List<TelephoneDetails>`](../../doc/models/telephone-details.md) | Optional | - | List<TelephoneDetails> getTelephone() | setTelephone(List<TelephoneDetails> telephone) |
| `Fax` | [`List<FaxDetails>`](../../doc/models/fax-details.md) | Optional | - | List<FaxDetails> getFax() | setFax(List<FaxDetails> fax) |
| `ThomsonData` | [`ThomsonData`](../../doc/models/thomson-data.md) | Optional | - | ThomsonData getThomsonData() | setThomsonData(ThomsonData thomsonData) |
| `PrevSearches` | [`PrevSearches`](../../doc/models/prev-searches.md) | Optional | - | PrevSearches getPrevSearches() | setPrevSearches(PrevSearches prevSearches) |
| `ConsumerCreditLicenceSummary` | [`ConsumerCreditLicenceSummary`](../../doc/models/consumer-credit-licence-summary.md) | Optional | - | ConsumerCreditLicenceSummary getConsumerCreditLicenceSummary() | setConsumerCreditLicenceSummary(ConsumerCreditLicenceSummary consumerCreditLicenceSummary) |
| `CCLs` | [`ArrayOfCCLDetail`](../../doc/models/array-of-ccl-detail.md) | Optional | - | ArrayOfCCLDetail getCCLs() | setCCLs(ArrayOfCCLDetail cCLs) |

## Example (as JSON)

```json
{
  "EarliestKnownDate": null,
  "LastUpdated": null,
  "Num1992SICCodes": null,
  "BusinessLocation": null,
  "TelephoneNumber": null,
  "PrincipalActivities": null,
  "SICInformation1992": null,
  "AvgNumEmployees": null,
  "NumTelephone": null,
  "NumFax": null,
  "Telephone": null,
  "Fax": null,
  "ThomsonData": null,
  "PrevSearches": null,
  "ConsumerCreditLicenceSummary": null,
  "CCLs": null
}
```

