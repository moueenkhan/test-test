
# Previous Search Detail

## Structure

`PreviousSearchDetail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SearchDate` | `String` | Optional | Previous search date (yyyy-mm-dd) | String getSearchDate() | setSearchDate(String searchDate) |
| `EnquiryType` | `String` | Optional | Indicator showing search enquiry type against the limited company. A = Registered Office / Company Profile; B = Director Information; C = CPU Link Enquiry; D = e-series business Gold Report; E = e-series business Silver Report; F = e-series business Bronze Report; G = e-series business Basic Report; H = e-series business Document Image; I = e-series business Corporate Tree Report; J = e-series business Enhanced Corporate Tree Report; L = BIGNet Report; M = Report Builder; N = Commercial Autoscore Application; O = Commercial Autoscore Reprocess Decision; P = e-series business Mortgages & Charges Report; X = XML Bespoke Delivery; 1 = Registered Office / Company Profile ;2 = Registered Office / Company Profile; 3 = Profile and Credit; 4 = Profile and Credit; 5 = Microfiche / Document Copy Request; 6 = Written Report; 7 = On-line Report (Legacy); 8 = On-line Report (Legacy); 9 = Financial Analysis; Other = Non-Specific Report | String getEnquiryType() | setEnquiryType(String enquiryType) |
| `OwnEnquiryFlag` | `String` | Optional | Indicator showing whether the enquiry was raised by the limited company - Y = Own enquiry; N = Not own enquiry | String getOwnEnquiryFlag() | setOwnEnquiryFlag(String ownEnquiryFlag) |
| `SICInformation` | [`PrevSearchSICInfo`](../../doc/models/prev-search-sic-info.md) | Optional | - | PrevSearchSICInfo getSICInformation() | setSICInformation(PrevSearchSICInfo sICInformation) |

## Example (as JSON)

```json
{
  "SearchDate": null,
  "EnquiryType": null,
  "OwnEnquiryFlag": null,
  "SICInformation": null
}
```

