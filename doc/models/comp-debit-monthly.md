
# Comp Debit Monthly

## Structure

`CompDebitMonthly`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CompanyDBT` | `Integer` | Optional | Days beyond terms for payment experience for the experience month for the limited company | Integer getCompanyDBT() | setCompanyDBT(Integer companyDBT) |
| `CompanyExpMonth` | `String` | Optional | DBT experience date (yyyy-mm) | String getCompanyExpMonth() | setCompanyExpMonth(String companyExpMonth) |
| `CompanyNumExp` | `Integer` | Optional | Number of experiences for days beyond terms for payment experience for the experience month for the limited company | Integer getCompanyNumExp() | setCompanyNumExp(Integer companyNumExp) |

## Example (as JSON)

```json
{
  "CompanyDBT": null,
  "CompanyExpMonth": null,
  "CompanyNumExp": null
}
```

