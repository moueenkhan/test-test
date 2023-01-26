
# Commercial CAIS Director

## Structure

`CommercialCAISDirector`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrentDirector` | `String` | Optional | Current Director Flag<br>Only available to Business Person User Group | String getCurrentDirector() | setCurrentDirector(String currentDirector) |
| `DateOfBirth` | `String` | Optional | Only available to Business Person User Group | String getDateOfBirth() | setDateOfBirth(String dateOfBirth) |
| `DateOfDeath` | `String` | Optional | Only available to Business Person User Group | String getDateOfDeath() | setDateOfDeath(String dateOfDeath) |
| `NOCRef` | `String` | Optional | Notice of Correction reference<br>Only available to Business Person User Group | String getNOCRef() | setNOCRef(String nOCRef) |
| `Name` | `String` | Optional | Directors Name | String getName() | setName(String name) |
| `AddressLine1` | `String` | Optional | Current Director's address line 1<br>Only available to Business Person User Group | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | Current Director's address line 2<br>Only available to Business Person User Group | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressLine3` | `String` | Optional | Current Director's address line 3<br>Only available to Business Person User Group | String getAddressLine3() | setAddressLine3(String addressLine3) |
| `AddressLine4` | `String` | Optional | Current Director's address line 4<br>Only available to Business Person User Group | String getAddressLine4() | setAddressLine4(String addressLine4) |
| `Postcode` | `String` | Optional | Current Director's address postcode<br>Only available to Business Person User Group | String getPostcode() | setPostcode(String postcode) |
| `AddressType` | `String` | Optional | Directors address type<br>Only available to Business Person User Group | String getAddressType() | setAddressType(String addressType) |
| `DateAssociationStart` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program. | String getDateAssociationStart() | setDateAssociationStart(String dateAssociationStart) |
| `DateAssociationEnd` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program. | String getDateAssociationEnd() | setDateAssociationEnd(String dateAssociationEnd) |
| `AddressCountry` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program. | String getAddressCountry() | setAddressCountry(String addressCountry) |
| `DateDirectorUpdated` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program. | String getDateDirectorUpdated() | setDateDirectorUpdated(String dateDirectorUpdated) |
| `Title` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program. | String getTitle() | setTitle(String title) |
| `Forename` | `String` | Optional | Only available to Business Person User Group | String getForename() | setForename(String forename) |
| `MiddleNames` | `String` | Optional | Only available to Business Person User Group | String getMiddleNames() | setMiddleNames(String middleNames) |
| `Surname` | `String` | Optional | Only available to Business Person User Group | String getSurname() | setSurname(String surname) |
| `Location` | [`CommercialCaisLocationDetail`](../../doc/models/commercial-cais-location-detail.md) | Optional | - | CommercialCaisLocationDetail getLocation() | setLocation(CommercialCaisLocationDetail location) |
| `PreviousName` | `String` | Optional | Directors Previous Name<br>Only available to Business Person User Group within the CAIS data sharing program. | String getPreviousName() | setPreviousName(String previousName) |
| `PreviousLocation` | [`BusinessLocation`](../../doc/models/business-location.md) | Optional | - | BusinessLocation getPreviousLocation() | setPreviousLocation(BusinessLocation previousLocation) |
| `PreviousLocationCountry` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program. | String getPreviousLocationCountry() | setPreviousLocationCountry(String previousLocationCountry) |
| `SignatoryIndicator` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program. | String getSignatoryIndicator() | setSignatoryIndicator(String signatoryIndicator) |
| `SignatoryDate` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program. | String getSignatoryDate() | setSignatoryDate(String signatoryDate) |
| `ShareholderIndicator` | `String` | Optional | Director is Shareholder indicator<br>Only available to Business Person User Group within the CAIS data sharing program. | String getShareholderIndicator() | setShareholderIndicator(String shareholderIndicator) |
| `ShareholderUpdateDate` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program. | String getShareholderUpdateDate() | setShareholderUpdateDate(String shareholderUpdateDate) |
| `GuaranteeOn` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program.  Field returns ‘Y’ or ‘N’ when a date is present. | String getGuaranteeOn() | setGuaranteeOn(String guaranteeOn) |
| `GuaranteeOnDate` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program. | String getGuaranteeOnDate() | setGuaranteeOnDate(String guaranteeOnDate) |
| `GuaranteeOff` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program.  Field returns ‘Y’ or ‘N’ when a date is present. | String getGuaranteeOff() | setGuaranteeOff(String guaranteeOff) |
| `GuaranteeOffDate` | `String` | Optional | Only available to Business Person User Group within the CAIS data sharing program. | String getGuaranteeOffDate() | setGuaranteeOffDate(String guaranteeOffDate) |

## Example (as JSON)

```json
{
  "CurrentDirector": null,
  "DateOfBirth": null,
  "DateOfDeath": null,
  "NOCRef": null,
  "Name": null,
  "AddressLine1": null,
  "AddressLine2": null,
  "AddressLine3": null,
  "AddressLine4": null,
  "Postcode": null,
  "AddressType": null,
  "DateAssociationStart": null,
  "DateAssociationEnd": null,
  "AddressCountry": null,
  "DateDirectorUpdated": null,
  "Title": null,
  "Forename": null,
  "MiddleNames": null,
  "Surname": null,
  "Location": null,
  "PreviousName": null,
  "PreviousLocation": null,
  "PreviousLocationCountry": null,
  "SignatoryIndicator": null,
  "SignatoryDate": null,
  "ShareholderIndicator": null,
  "ShareholderUpdateDate": null,
  "GuaranteeOn": null,
  "GuaranteeOnDate": null,
  "GuaranteeOff": null,
  "GuaranteeOffDate": null
}
```

