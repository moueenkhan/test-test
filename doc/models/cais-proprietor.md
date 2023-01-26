
# CAIS Proprietor

## Structure

`CAISProprietor`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProprietorNumber` | `Integer` | Optional | A Proprietor Number provided by the CAIS supplier | Integer getProprietorNumber() | setProprietorNumber(Integer proprietorNumber) |
| `CurrentProprietor` | `String` | Optional | Current Proprietor Flag. Y (Yes) or N (No) values<br>Only available to Business Person User Group | String getCurrentProprietor() | setCurrentProprietor(String currentProprietor) |
| `DateOfBirth` | `String` | Optional | Only available to Business Person User Group | String getDateOfBirth() | setDateOfBirth(String dateOfBirth) |
| `DateOfDeath` | `String` | Optional | Only available to Business Person User Group<br>Default value to '9998-12-31' | String getDateOfDeath() | setDateOfDeath(String dateOfDeath) |
| `Name` | `String` | Optional | Proprietors Name<br>Only available to Business Person User Group | String getName() | setName(String name) |
| `CurrentAddress` | [`CurrentAddress1`](../../doc/models/current-address-1.md) | Optional | - | CurrentAddress1 getCurrentAddress() | setCurrentAddress(CurrentAddress1 currentAddress) |
| `DateAssociationStart` | `String` | Optional | Only available to Business Person User Group<br>Default value to '9998-12-31 | String getDateAssociationStart() | setDateAssociationStart(String dateAssociationStart) |
| `DateAssociationEnd` | `String` | Optional | Only available to Business Person User Group<br>Default value to '9998-12-31' | String getDateAssociationEnd() | setDateAssociationEnd(String dateAssociationEnd) |
| `AddressCountry` | `String` | Optional | Only available to Business Person User Group | String getAddressCountry() | setAddressCountry(String addressCountry) |
| `SignatoryIndicator` | `String` | Optional | Identification flag for signatories.<br>Only available to Business Person User Group within the CAIS data sharing program. | String getSignatoryIndicator() | setSignatoryIndicator(String signatoryIndicator) |
| `GuaranteeOn` | `String` | Optional | Y / N<br>Only available to Business Person User Group within the CAIS data sharing program. | String getGuaranteeOn() | setGuaranteeOn(String guaranteeOn) |
| `GuaranteeOff` | `String` | Optional | Y / N<br>Only available to Business Person User Group within the CAIS data sharing program. | String getGuaranteeOff() | setGuaranteeOff(String guaranteeOff) |
| `DatePersonUpdated` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program. | String getDatePersonUpdated() | setDatePersonUpdated(String datePersonUpdated) |
| `Title` | `String` | Optional | Only available to Business Person User Group | String getTitle() | setTitle(String title) |
| `Forename` | `String` | Optional | Only available to Business Person User Group | String getForename() | setForename(String forename) |
| `MiddleNames` | `String` | Optional | Only available to Business Person User Group | String getMiddleNames() | setMiddleNames(String middleNames) |
| `Surname` | `String` | Optional | Only available to Business Person User Group | String getSurname() | setSurname(String surname) |
| `PreviousName` | `String` | Optional | Proprietor's Previous Name<br>Only available to Business Person User Group within the CAIS data sharing program. | String getPreviousName() | setPreviousName(String previousName) |
| `Location` | [`Location1`](../../doc/models/location-1.md) | Optional | - | Location1 getLocation() | setLocation(Location1 location) |
| `PreviousLocation` | [`PreviousLocation`](../../doc/models/previous-location.md) | Optional | - | PreviousLocation getPreviousLocation() | setPreviousLocation(PreviousLocation previousLocation) |
| `PreviousLocationCountry` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program. | String getPreviousLocationCountry() | setPreviousLocationCountry(String previousLocationCountry) |

## Example (as JSON)

```json
{
  "ProprietorNumber": null,
  "CurrentProprietor": null,
  "DateOfBirth": null,
  "DateOfDeath": null,
  "Name": null,
  "CurrentAddress": null,
  "DateAssociationStart": null,
  "DateAssociationEnd": null,
  "AddressCountry": null,
  "SignatoryIndicator": null,
  "GuaranteeOn": null,
  "GuaranteeOff": null,
  "DatePersonUpdated": null,
  "Title": null,
  "Forename": null,
  "MiddleNames": null,
  "Surname": null,
  "PreviousName": null,
  "Location": null,
  "PreviousLocation": null,
  "PreviousLocationCountry": null
}
```

