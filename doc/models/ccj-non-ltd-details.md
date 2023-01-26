
# CCJ Non Ltd Details

## Structure

`CCJNonLtdDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RecordType` | `String` | Optional | Indicator showing record type - M=main, A=Associated, P=Pool | String getRecordType() | setRecordType(String recordType) |
| `JudgmentDate` | `String` | Optional | Judgment Date (yyyy-mm-dd) | String getJudgmentDate() | setJudgmentDate(String judgmentDate) |
| `SatisfactionFlag` | `String` | Optional | Indicator showing satisfaction status - Y=Satisfied, N=Not satisfied | String getSatisfactionFlag() | setSatisfactionFlag(String satisfactionFlag) |
| `SatisfactionDate` | `String` | Optional | Judgment Satisfaction Date (yyyy-mm-dd) | String getSatisfactionDate() | setSatisfactionDate(String satisfactionDate) |
| `JudgmentType` | `String` | Optional | Judgement Type - JG = Judgment; SS = Satisfied Judgment; CU = Certificate of Unenforceability; DO = Discovery Order | String getJudgmentType() | setJudgmentType(String judgmentType) |
| `JudgmentAmount` | `Double` | Optional | Value of County Court Judgement against the non-limited business | Double getJudgmentAmount() | setJudgmentAmount(Double judgmentAmount) |
| `CourtName` | `String` | Optional | Textual name of the County Court at which the County Court Judgement has been registered | String getCourtName() | setCourtName(String courtName) |
| `CaseNumber` | `String` | Optional | Case Number identifying the County Court Judgement against the non-limited business | String getCaseNumber() | setCaseNumber(String caseNumber) |
| `NumberJudgmentNames` | `Integer` | Optional | Number of Judgement names recorded against the County Court Judgement | Integer getNumberJudgmentNames() | setNumberJudgmentNames(Integer numberJudgmentNames) |
| `NumberTradingNames` | `Integer` | Optional | Number of Trading names recorded against the County Court Judgement | Integer getNumberTradingNames() | setNumberTradingNames(Integer numberTradingNames) |
| `JudgmentDetailsArea` | [`JudgmentDetails`](../../doc/models/judgment-details.md) | Optional | - | JudgmentDetails getJudgmentDetailsArea() | setJudgmentDetailsArea(JudgmentDetails judgmentDetailsArea) |

## Example (as JSON)

```json
{
  "RecordType": null,
  "JudgmentDate": null,
  "SatisfactionFlag": null,
  "SatisfactionDate": null,
  "JudgmentType": null,
  "JudgmentAmount": null,
  "CourtName": null,
  "CaseNumber": null,
  "NumberJudgmentNames": null,
  "NumberTradingNames": null,
  "JudgmentDetailsArea": null
}
```

