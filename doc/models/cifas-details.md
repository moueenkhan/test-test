
# CIFAS Details

## Structure

`CIFASDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reference` | `String` | Optional | Reference | String getReference() | setReference(String reference) |
| `FraudCategory` | `String` | Optional | Fraud category - 00 = Protective Registration - Recorded at request of the person named; 01 = Providing a false name and a true address; 02 = Providing or using the name and particulars of another person; 03 = Providing or using a genuine name and address, but one or more material falsehoods in personal details followed by a serious misuse of the credit or other facility and/or non-payment; 04 = Providing or using a genuine name and address, but one or more material falsehoods in personal details; 05 = Disposal/selling on of goods obtained on credit and failing to settle the finance agreement; 06 = Opening an account for the purpose of fraud; 07 = Aiding and Abetting - Aiding, abetting or assisting, or conspiring with, another or others to fraudulently procure credit, hire or other facilities, or other product or service; 08 = Insurance Fraud - The making of a claim(s) under one or more insurance policy(ies) with one or more material falsehoods or by presenting a false or forged document | String getFraudCategory() | setFraudCategory(String fraudCategory) |
| `SupplierName` | `String` | Optional | Supplier name | String getSupplierName() | setSupplierName(String supplierName) |
| `DateSupplied` | `String` | Optional | Date supplied (yyyy-mm-dd) | String getDateSupplied() | setDateSupplied(String dateSupplied) |
| `ExpiryDate` | `String` | Optional | Expiry Date (yyyy-mm-dd) | String getExpiryDate() | setExpiryDate(String expiryDate) |
| `OtherAddressFlag` | `String` | Optional | Other address flag Y = Fraud has occurred at other addresses | String getOtherAddressFlag() | setOtherAddressFlag(String otherAddressFlag) |
| `NocRef` | `String` | Optional | Not currently supported | String getNocRef() | setNocRef(String nocRef) |
| `Name` | `String` | Optional | Name | String getName() | setName(String name) |
| `LocationLine1` | `String` | Optional | Address line 1 | String getLocationLine1() | setLocationLine1(String locationLine1) |
| `LocationLine2` | `String` | Optional | Address line 2 | String getLocationLine2() | setLocationLine2(String locationLine2) |
| `LocationLine3` | `String` | Optional | Address line 3 | String getLocationLine3() | setLocationLine3(String locationLine3) |
| `LocationLine4` | `String` | Optional | Address line 4 | String getLocationLine4() | setLocationLine4(String locationLine4) |
| `LocationLine5` | `String` | Optional | Address line 5 | String getLocationLine5() | setLocationLine5(String locationLine5) |
| `Postcode` | `String` | Optional | Postcode | String getPostcode() | setPostcode(String postcode) |

## Example (as JSON)

```json
{
  "Reference": null,
  "FraudCategory": null,
  "SupplierName": null,
  "DateSupplied": null,
  "ExpiryDate": null,
  "OtherAddressFlag": null,
  "NocRef": null,
  "Name": null,
  "LocationLine1": null,
  "LocationLine2": null,
  "LocationLine3": null,
  "LocationLine4": null,
  "LocationLine5": null,
  "Postcode": null
}
```

