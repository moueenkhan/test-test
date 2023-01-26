
# Auditor

## Structure

`Auditor`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currency` | `String` | Optional | ISO currency code | String getCurrency() | setCurrency(String currency) |
| `Remuneration` | `String` | Optional | Value for Auditors Remuneration | String getRemuneration() | setRemuneration(String remuneration) |
| `NonAuditFee` | `String` | Optional | Value for Fee for non-audit work | String getNonAuditFee() | setNonAuditFee(String nonAuditFee) |
| `AuditType` | `String` | Optional | Indicator showing the audit type - A = Auditors (No exemptions); C = Chartered accountant; D = Director | String getAuditType() | setAuditType(String auditType) |
| `AuditQual` | `String` | Optional | Indicator showing any audit qualification - 0 = No qualification; 1 = Minor qualification; 2 = Major qualification (Risk index suppressed); 3 = Major qualification (Risk index not suppressed) | String getAuditQual() | setAuditQual(String auditQual) |
| `Auditors` | `String` | Optional | Name of Auditors | String getAuditors() | setAuditors(String auditors) |

## Example (as JSON)

```json
{
  "Currency": null,
  "Remuneration": null,
  "NonAuditFee": null,
  "AuditType": null,
  "AuditQual": null,
  "Auditors": null
}
```

