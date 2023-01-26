
# Search Results

## Structure

`SearchResults`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LegalEntity` | `String` | Optional | Legal status of business returned from the Business search (L = Limited; N = Non Limited) | String getLegalEntity() | setLegalEntity(String legalEntity) |
| `BusinessRef` | `String` | Optional | Business reference (Registerd number / URN) of the business returned from the Business search | String getBusinessRef() | setBusinessRef(String businessRef) |
| `CommercialName` | `String` | Optional | Commercial name of the business returned from the Business search | String getCommercialName() | setCommercialName(String commercialName) |
| `BusinessLocation` | [`BusinessLocation`](../../doc/models/business-location.md) | Optional | - | BusinessLocation getBusinessLocation() | setBusinessLocation(BusinessLocation businessLocation) |
| `SICInformation` | [`SICInfo`](../../doc/models/sic-info.md) | Optional | - | SICInfo getSICInformation() | setSICInformation(SICInfo sICInformation) |
| `BusinessStatus` | `String` | Optional | Status of the business returned from the Business search. 'A' = Active; 'D' = Dissolved; ' ' = unknown | String getBusinessStatus() | setBusinessStatus(String businessStatus) |
| `BusinessActivities` | `String` | Optional | Main Activities derived from Thomson category code of the business returned from the Business search (Non Limited businesses only) | String getBusinessActivities() | setBusinessActivities(String businessActivities) |
| `Name` | `String` | Optional | Business name returned from the Business search where a name other than the current registered name contributed to the matching. | String getName() | setName(String name) |
| `NameType` | `String` | Optional | Name type for result returned from the Business search. 'RC' = Registered name (current); 'RP' = Previous registered name; 'TC' = Trading name (limited); 'NL' = Trading name (non-limited) | String getNameType() | setNameType(String nameType) |
| `MatchedPhoneNumber` | `String` | Optional | Matched telephone number of the business returned from the Business search | String getMatchedPhoneNumber() | setMatchedPhoneNumber(String matchedPhoneNumber) |
| `MatchedPostcode` | `String` | Optional | Matched post code of the business returned from the Business search | String getMatchedPostcode() | setMatchedPostcode(String matchedPostcode) |

## Example (as JSON)

```json
{
  "LegalEntity": null,
  "BusinessRef": null,
  "CommercialName": null,
  "BusinessLocation": null,
  "SICInformation": null,
  "BusinessStatus": null,
  "BusinessActivities": null,
  "Name": null,
  "NameType": null,
  "MatchedPhoneNumber": null,
  "MatchedPostcode": null
}
```

