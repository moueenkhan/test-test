
# CCJ Ltd Detail

## Structure

`CCJLtdDetail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CaseNumber` | `String` | Optional | Value of County Court Judgement against the limited company | String getCaseNumber() | setCaseNumber(String caseNumber) |
| `CourtName` | `String` | Optional | Textual name of the County Court at which the County Court Judgement has been registered | String getCourtName() | setCourtName(String courtName) |
| `JudgmentAgainst` | `String` | Optional | Name of subject limited company as identified in the County Court Judgement | String getJudgmentAgainst() | setJudgmentAgainst(String judgmentAgainst) |
| `JudgmentAmount` | `Double` | Optional | Case Number identifying the County Court Judgement against the limited company | Double getJudgmentAmount() | setJudgmentAmount(Double judgmentAmount) |
| `JudgmentDate` | `String` | Optional | The date of County Court Judgement against the limited company (yyyy-mm-dd) | String getJudgmentDate() | setJudgmentDate(String judgmentDate) |
| `JudgmentSource` | `String` | Optional | Judgement Source - LCH = Lord Chancellor; NICS = Northern Ireland Court Service; RTLS = Registry Trust Limited Scotland; SGEI = Stubbs Gazette Eire; SGNI = Stubbs Gazette Northern Ireland; SGSC = Stubbs Gazette Scotland; RTLN = Registry Trust Limited Northern Ireland | String getJudgmentSource() | setJudgmentSource(String judgmentSource) |
| `JudgmentType` | `String` | Optional | Judgement Type - JG = Judgment; SS = Satisfied Judgment; SA = Set-Aside Judgment; CU = Certificate of Unenforceability; DO = Discovery Order | String getJudgmentType() | setJudgmentType(String judgmentType) |
| `RegisteredOfficeIndicator` | `String` | Optional | Indicator of address used in the County Court Judgement - R = Registered Office U = Unclassified Null = In absence of Registered address | String getRegisteredOfficeIndicator() | setRegisteredOfficeIndicator(String registeredOfficeIndicator) |
| `SatisfactionDate` | `String` | Optional | The date of satisfaction of the County Court Judgement by the limited company (yyyy-mm-dd) | String getSatisfactionDate() | setSatisfactionDate(String satisfactionDate) |
| `TradingLocation` | [`LtdBusinessLocation`](../../doc/models/ltd-business-location.md) | Optional | - | LtdBusinessLocation getTradingLocation() | setTradingLocation(LtdBusinessLocation tradingLocation) |
| `TradingNameDetails` | [`List<TradingNameDetails>`](../../doc/models/trading-name-details.md) | Optional | - | List<TradingNameDetails> getTradingNameDetails() | setTradingNameDetails(List<TradingNameDetails> tradingNameDetails) |

## Example (as JSON)

```json
{
  "CaseNumber": null,
  "CourtName": null,
  "JudgmentAgainst": null,
  "JudgmentAmount": null,
  "JudgmentDate": null,
  "JudgmentSource": null,
  "JudgmentType": null,
  "RegisteredOfficeIndicator": null,
  "SatisfactionDate": null,
  "TradingLocation": null,
  "TradingNameDetails": null
}
```

