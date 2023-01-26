
# Delphi History and Score

## Structure

`DelphiHistoryAndScore`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CommDelphiScore` | `String` | Optional | Current Commercial Delphi Score for the non-limited business | String getCommDelphiScore() | setCommDelphiScore(String commDelphiScore) |
| `CommDelphiBand` | `String` | Optional | Current Commercial Delphi Band for the non-limited business | String getCommDelphiBand() | setCommDelphiBand(String commDelphiBand) |
| `StabilityOdds` | `String` | Optional | Stability Odds for the non-limited business | String getStabilityOdds() | setStabilityOdds(String stabilityOdds) |
| `OverrideIndicator` | `String` | Optional | Commercial Delphi Score Override indicator - Y = Overridden; N = Not Overridden | String getOverrideIndicator() | setOverrideIndicator(String overrideIndicator) |
| `TextCount` | `Integer` | Optional | Length of text for Commercial Delphi Band Text | Integer getTextCount() | setTextCount(Integer textCount) |
| `ScoreHistoryCount` | `Integer` | Optional | Number of instances of Commercial Delphi Score History | Integer getScoreHistoryCount() | setScoreHistoryCount(Integer scoreHistoryCount) |
| `CommDelphiBandText` | `String` | Optional | Current Commercial Delphi Band Text | String getCommDelphiBandText() | setCommDelphiBandText(String commDelphiBandText) |
| `ScoreHistory` | [`List<NonLtdScoreHistory>`](../../doc/models/non-ltd-score-history.md) | Optional | - | List<NonLtdScoreHistory> getScoreHistory() | setScoreHistory(List<NonLtdScoreHistory> scoreHistory) |

## Example (as JSON)

```json
{
  "CommDelphiScore": null,
  "CommDelphiBand": null,
  "StabilityOdds": null,
  "OverrideIndicator": null,
  "TextCount": null,
  "ScoreHistoryCount": null,
  "CommDelphiBandText": null,
  "ScoreHistory": null
}
```

