
# Conviction Details

## Structure

`ConvictionDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Date` | `String` | Optional | The date of Current Director's conviction (yyyy-mm-dd) | String getDate() | setDate(String date) |
| `Reason` | `String` | Optional | Conviction Reason code - A = Accounts; R = Returns; B = Both | String getReason() | setReason(String reason) |
| `Fine` | `String` | Optional | Value of fine associated with conviction | String getFine() | setFine(String fine) |
| `Costs` | `String` | Optional | Value of costs associated with conviction | String getCosts() | setCosts(String costs) |

## Example (as JSON)

```json
{
  "Date": null,
  "Reason": null,
  "Fine": null,
  "Costs": null
}
```

