
# Mortgages

## Structure

`Mortgages`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateMostRecentMort` | `String` | Optional | Most recent date that a mortgage for the limited company was created (yyyy-mm-dd) | String getDateMostRecentMort() | setDateMostRecentMort(String dateMostRecentMort) |
| `DateMostRecentSat` | `String` | Optional | Most recent date that a mortgage for the limited company was satisfied (yyyy-mm-dd) | String getDateMostRecentSat() | setDateMostRecentSat(String dateMostRecentSat) |
| `MortgageDetail` | [`List<MortgageDetail>`](../../doc/models/mortgage-detail.md) | Optional | - | List<MortgageDetail> getMortgageDetail() | setMortgageDetail(List<MortgageDetail> mortgageDetail) |
| `NumMortgages` | `Integer` | Optional | Number of mortgages for the limited company | Integer getNumMortgages() | setNumMortgages(Integer numMortgages) |
| `NumSatMortgages` | `Integer` | Optional | Number of mortgages for the limited company that are satisfied | Integer getNumSatMortgages() | setNumSatMortgages(Integer numSatMortgages) |
| `NumUnsatMortgages` | `Integer` | Optional | Number of mortgages for the limited company that are Unsatisfied / Partially satisfied | Integer getNumUnsatMortgages() | setNumUnsatMortgages(Integer numUnsatMortgages) |
| `RecMortDateFlag` | `String` | Optional | Indicator of whether 'date of most recent mortgage' is derived from a mortgage creation date (Date charge created/Date of deed) or mortgage registration date (Date mortgage registered/Lodgement date) - C = Date derived from Date Mortgage Created/Date Of Deed; R = Date derived from Date Mortgage Registered/ Lodgement Date | String getRecMortDateFlag() | setRecMortDateFlag(String recMortDateFlag) |

## Example (as JSON)

```json
{
  "DateMostRecentMort": null,
  "DateMostRecentSat": null,
  "MortgageDetail": null,
  "NumMortgages": null,
  "NumSatMortgages": null,
  "NumUnsatMortgages": null,
  "RecMortDateFlag": null
}
```

