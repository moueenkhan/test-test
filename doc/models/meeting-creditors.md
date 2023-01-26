
# Meeting Creditors

## Structure

`MeetingCreditors`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MeetingDate` | `String` | Optional | Meeting of creditors date for the limited company (yyyy-mm-dd) | String getMeetingDate() | setMeetingDate(String meetingDate) |
| `MeetingTime` | `String` | Optional | Time for the meeting of creditors for the limited company - HHMM | String getMeetingTime() | setMeetingTime(String meetingTime) |
| `MeetingVenue` | [`LtdBusinessLocation`](../../doc/models/ltd-business-location.md) | Optional | - | LtdBusinessLocation getMeetingVenue() | setMeetingVenue(LtdBusinessLocation meetingVenue) |
| `PublicationDate` | `String` | Optional | Publication Meeting of creditors date for the limited company (yyyy-mm-dd) | String getPublicationDate() | setPublicationDate(String publicationDate) |
| `TradingName` | `String` | Optional | Trading Name of ???? for the meeting of creditors for the limited company | String getTradingName() | setTradingName(String tradingName) |

## Example (as JSON)

```json
{
  "MeetingDate": null,
  "MeetingTime": null,
  "MeetingVenue": null,
  "PublicationDate": null,
  "TradingName": null
}
```

