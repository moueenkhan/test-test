
# Supervisors

## Structure

`Supervisors`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FirmName` | `String` | Optional | Trading Name of Supervisor for the voluntary arrangement for the limited company | String getFirmName() | setFirmName(String firmName) |
| `Name` | `String` | Optional | Name of individual Supervisor for the voluntary arrangement for the limited company | String getName() | setName(String name) |
| `SupervisorLocation` | [`LtdBusinessLocation`](../../doc/models/ltd-business-location.md) | Optional | - | LtdBusinessLocation getSupervisorLocation() | setSupervisorLocation(LtdBusinessLocation supervisorLocation) |

## Example (as JSON)

```json
{
  "FirmName": null,
  "Name": null,
  "SupervisorLocation": null
}
```

