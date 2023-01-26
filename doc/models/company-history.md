
# Company History

## Structure

`CompanyHistory`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CommDelphiBand` | `String` | Optional | Current Commercial Delphi Band for the limited company | String getCommDelphiBand() | setCommDelphiBand(String commDelphiBand) |
| `CommDelphiBandText` | `String` | Optional | Current Commercial Delphi Band Text | String getCommDelphiBandText() | setCommDelphiBandText(String commDelphiBandText) |
| `CommDelphiScore` | `String` | Optional | Current Commercial Delphi Score for the limited company | String getCommDelphiScore() | setCommDelphiScore(String commDelphiScore) |
| `OverrideIndicator` | `String` | Optional | Commercial Delphi Score Override indicator - Y = Overridden; N = Not Overridden | String getOverrideIndicator() | setOverrideIndicator(String overrideIndicator) |
| `ScoreHistory` | [`List<ScoreHistory>`](../../doc/models/score-history.md) | Optional | - | List<ScoreHistory> getScoreHistory() | setScoreHistory(List<ScoreHistory> scoreHistory) |
| `ScoreHistoryCount` | `Integer` | Optional | Number of instances of Commercial Delphi Score History | Integer getScoreHistoryCount() | setScoreHistoryCount(Integer scoreHistoryCount) |
| `StabilityOdds` | `String` | Optional | Stability Odds for the limited company | String getStabilityOdds() | setStabilityOdds(String stabilityOdds) |
| `TextCount` | `Integer` | Optional | Length of text for Commercial Delphi Band Text | Integer getTextCount() | setTextCount(Integer textCount) |

## Example (as JSON)

```json
{
  "CommDelphiBand": null,
  "CommDelphiBandText": null,
  "CommDelphiScore": null,
  "OverrideIndicator": null,
  "ScoreHistory": null,
  "ScoreHistoryCount": null,
  "StabilityOdds": null,
  "TextCount": null
}
```

