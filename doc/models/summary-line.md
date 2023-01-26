
# Summary Line

## Structure

`SummaryLine`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EventCount` | `Integer` | Optional | Sequential identifier of the Credit Events for the limited company | Integer getEventCount() | setEventCount(Integer eventCount) |
| `EventDate` | `String` | Optional | The date for the credit event for the limited company (yyyy-mm-dd) | String getEventDate() | setEventDate(String eventDate) |
| `EventType` | `String` | Optional | Credit Event Type indicator - C = Receiver appointments; D = Cessations of Receiver; E = Winding up petitions; F = Dismissals of winding up petitions; G = Winding up orders; H = Voluntary appointments of liquidators; I = Meetings of creditors; J = Resolutions to wind up; K = Intentions to dissolve; L = Dissolution notices; M = Reinstatement notices; Q = Administrators appointed; R = Administrators dismissals; S = Approvals of Voluntary arrangements; T = Completions of Voluntary arrangements; U = Compulsory appointments of liquidators; V = Revocations of Voluntary arrangements; W = Suspensions of Voluntary arrangements; X = Intention to Dissolve Discontinued | String getEventType() | setEventType(String eventType) |

## Example (as JSON)

```json
{
  "EventCount": null,
  "EventDate": null,
  "EventType": null
}
```

