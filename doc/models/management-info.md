
# Management Info

## Structure

`ManagementInfo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LatestReturns` | `String` | Optional | Filing date for the limited company latest Confirmation Statement accepted and loaded by Experian (yyyy-mm-dd) | String getLatestReturns() | setLatestReturns(String latestReturns) |
| `NumDirs` | `Integer` | Optional | Number of Directors recorded for the company | Integer getNumDirs() | setNumDirs(Integer numDirs) |
| `NumSecs` | `Integer` | Optional | Number of Secretaries recorded for the company | Integer getNumSecs() | setNumSecs(Integer numSecs) |
| `NumCurrDirs` | `Integer` | Optional | Number of Directors recorded for the company that are current | Integer getNumCurrDirs() | setNumCurrDirs(Integer numCurrDirs) |
| `NumPrevDirs` | `Integer` | Optional | Number of previous Directors recorded for the company | Integer getNumPrevDirs() | setNumPrevDirs(Integer numPrevDirs) |
| `DirectorAvgAge` | `Integer` | Optional | Average length of Directorship in months | Integer getDirectorAvgAge() | setDirectorAvgAge(Integer directorAvgAge) |
| `DirectorAvgLength` | `Integer` | Optional | Average age of Directors in years | Integer getDirectorAvgLength() | setDirectorAvgLength(Integer directorAvgLength) |
| `NumCurrDirectorLast12` | `Integer` | Optional | Number of Current Directors of the limited company who were appointed in the last 12 months | Integer getNumCurrDirectorLast12() | setNumCurrDirectorLast12(Integer numCurrDirectorLast12) |
| `NumAppointmentsLast12` | `Integer` | Optional | Number of director appointments for the limited company during the last 12 months | Integer getNumAppointmentsLast12() | setNumAppointmentsLast12(Integer numAppointmentsLast12) |
| `NumResignationsLast12` | `Integer` | Optional | Number of director resignations for the limited company during the last 12 months | Integer getNumResignationsLast12() | setNumResignationsLast12(Integer numResignationsLast12) |
| `NumDisqualifications` | `Integer` | Optional | Number of disqualifications against any of the Current Directors of the limited company | Integer getNumDisqualifications() | setNumDisqualifications(Integer numDisqualifications) |
| `Directors` | [`Directors`](../../doc/models/directors.md) | Optional | - | Directors getDirectors() | setDirectors(Directors directors) |
| `Secretaries` | [`Secretaries`](../../doc/models/secretaries.md) | Optional | - | Secretaries getSecretaries() | setSecretaries(Secretaries secretaries) |

## Example (as JSON)

```json
{
  "LatestReturns": null,
  "NumDirs": null,
  "NumSecs": null,
  "NumCurrDirs": null,
  "NumPrevDirs": null,
  "DirectorAvgAge": null,
  "DirectorAvgLength": null,
  "NumCurrDirectorLast12": null,
  "NumAppointmentsLast12": null,
  "NumResignationsLast12": null,
  "NumDisqualifications": null,
  "Directors": null,
  "Secretaries": null
}
```

