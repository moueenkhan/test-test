
# UK Subsidiaries

## Structure

`UKSubsidiaries`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubRegNumber` | `String` | Optional | Registered number of UK subsidiary | String getSubRegNumber() | setSubRegNumber(String subRegNumber) |
| `SubStatus` | `String` | Optional | Status of UK subsidiary - L = Live; D = Dormant; S = Dissolved | String getSubStatus() | setSubStatus(String subStatus) |
| `SubLegalStatus` | `String` | Optional | Legal status of UK subsidiary - 1 = Registered Office / Company Profile; 2 = Profile & Credit; 3 = Financial Analysis; 4 = On-line Report; 6 = Written Report; 7 = Microfiche / Document Copy Request; 8 = Director Information; C = CPU Link Enquiry; D = e-series Gold Report; E = e-series Silver Report; F = e-series Bronze Report; G = e-series Basic; H = Document Image; I = Corporate Tree; J = Enhanced Corporate Tree; L = BIGNet Report; M = Report Builder; N = Commercial Autoscore Application; O = Commercial Autoscore Reprocess Decision; P = Mortgages & Charges; Q = Credit Card Report; X = XML Bespoke Delivery | String getSubLegalStatus() | setSubLegalStatus(String subLegalStatus) |
| `SubName` | `String` | Optional | UK subsidiary company name | String getSubName() | setSubName(String subName) |

## Example (as JSON)

```json
{
  "SubRegNumber": null,
  "SubStatus": null,
  "SubLegalStatus": null,
  "SubName": null
}
```

