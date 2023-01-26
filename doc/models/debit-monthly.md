
# Debit Monthly

## Structure

`DebitMonthly`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExpMonth` | `String` | Optional | DBT experience month (yyyy-mm) | String getExpMonth() | setExpMonth(String expMonth) |
| `DBT` | `Integer` | Optional | Days beyond terms for payment experience for the experience month for the non-limited business | Integer getDBT() | setDBT(Integer dBT) |
| `NumExp` | `Integer` | Optional | Number of experiences for days beyond terms for payment experience for the experience month for the non-limited business | Integer getNumExp() | setNumExp(Integer numExp) |

## Example (as JSON)

```json
{
  "ExpMonth": null,
  "DBT": null,
  "NumExp": null
}
```

