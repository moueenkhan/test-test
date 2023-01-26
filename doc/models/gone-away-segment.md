
# Gone Away Segment

## Structure

`GoneAwaySegment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ApplicantIndicator` | `String` | Optional | - | String getApplicantIndicator() | setApplicantIndicator(String applicantIndicator) |
| `InformationSource` | `String` | Optional | - | String getInformationSource() | setInformationSource(String informationSource) |
| `Location` | [`LocationDetail`](../../doc/models/location-detail.md) | Optional | - | LocationDetail getLocation() | setLocation(LocationDetail location) |
| `LocationIndicator` | `String` | Optional | - | String getLocationIndicator() | setLocationIndicator(String locationIndicator) |
| `MatchDetails` | [`MatchDetail`](../../doc/models/match-detail.md) | Optional | - | MatchDetail getMatchDetails() | setMatchDetails(MatchDetail matchDetails) |
| `Members` | [`List<Member>`](../../doc/models/member.md) | Optional | - | List<Member> getMembers() | setMembers(List<Member> members) |
| `MembersCount` | `int` | Required | - | int getMembersCount() | setMembersCount(int membersCount) |
| `Name` | [`InputNameDetail`](../../doc/models/input-name-detail.md) | Optional | - | InputNameDetail getName() | setName(InputNameDetail name) |
| `NameID` | `String` | Optional | - | String getNameID() | setNameID(String nameID) |
| `SearchType` | `String` | Optional | - | String getSearchType() | setSearchType(String searchType) |

## Example (as JSON)

```json
{
  "ApplicantIndicator": null,
  "InformationSource": null,
  "Location": null,
  "LocationIndicator": null,
  "MatchDetails": null,
  "Members": null,
  "MembersCount": 16,
  "Name": null,
  "NameID": null,
  "SearchType": null
}
```

