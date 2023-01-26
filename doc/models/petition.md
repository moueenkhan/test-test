
# Petition

## Structure

`Petition`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CourtName` | `String` | Optional | Court for the Winding Up Petition for the limited company | String getCourtName() | setCourtName(String courtName) |
| `HearingDate` | `String` | Optional | Hearing Date for the Winding Up Petition for the limited company (yyyy-mm-dd) | String getHearingDate() | setHearingDate(String hearingDate) |
| `NumberPetitioners` | `Integer` | Optional | Number of Petitioners for the Winding Up Petition for the limited company (max 2) | Integer getNumberPetitioners() | setNumberPetitioners(Integer numberPetitioners) |
| `Petitioners` | [`List<Petitioners>`](../../doc/models/petitioners.md) | Optional | - | List<Petitioners> getPetitioners() | setPetitioners(List<Petitioners> petitioners) |
| `PresentationDate` | `String` | Optional | Presentation Date for the Winding Up Petition for the limited company (yyyy-mm-dd) | String getPresentationDate() | setPresentationDate(String presentationDate) |
| `PublicationDate` | `String` | Optional | Publication Date for the Winding Up Petition for the limited company (yyyy-mm-dd) | String getPublicationDate() | setPublicationDate(String publicationDate) |
| `Solicitors` | [`Solicitors`](../../doc/models/solicitors.md) | Optional | - | Solicitors getSolicitors() | setSolicitors(Solicitors solicitors) |

## Example (as JSON)

```json
{
  "CourtName": null,
  "HearingDate": null,
  "NumberPetitioners": null,
  "Petitioners": null,
  "PresentationDate": null,
  "PublicationDate": null,
  "Solicitors": null
}
```

