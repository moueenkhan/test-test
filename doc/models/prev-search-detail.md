
# Prev Search Detail

## Structure

`PrevSearchDetail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SearchDate` | `String` | Optional | Previous search date (yyyy-mm-dd) | String getSearchDate() | setSearchDate(String searchDate) |
| `EnquiryType` | `String` | Optional | Indicator showing the type of enquiry (C = CPU Link Enquiry, D = e-series business Gold Report, E = e-series business Silver Report, F = e-series business Bronze Report, J = e-series business Enhanced Corporate Tree Report, L = XML Bespoke Delivery, N = Commercial Autoscore Application, O = Commercial Autoscore Reprocess Decision, W = Full Profile, X = Credit Profile, Y = Business Profile, Z = Business Confirmation, 6 = Written Report, Other = Miscellaneous) | String getEnquiryType() | setEnquiryType(String enquiryType) |
| `CreditRequired` | `String` | Optional | Value of credit requested where the search is due to a request for credit | String getCreditRequired() | setCreditRequired(String creditRequired) |
| `OwnEnquiryFlag` | `String` | Optional | Indicator showing whether the enquiry was raised by the non-limited business - Y = Own enquiry; N = Not own enquiry | String getOwnEnquiryFlag() | setOwnEnquiryFlag(String ownEnquiryFlag) |
| `SICInformation` | [`CPSNonLtdSICInfo`](../../doc/models/cps-non-ltd-sic-info.md) | Optional | - | CPSNonLtdSICInfo getSICInformation() | setSICInformation(CPSNonLtdSICInfo sICInformation) |

## Example (as JSON)

```json
{
  "SearchDate": null,
  "EnquiryType": null,
  "CreditRequired": null,
  "OwnEnquiryFlag": null,
  "SICInformation": null
}
```

