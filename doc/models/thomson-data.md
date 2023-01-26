
# Thomson Data

## Structure

`ThomsonData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedDate` | `String` | Optional | The earliest date when this non-limited business became known to Thomson (yyyy-mm-dd) | String getCreatedDate() | setCreatedDate(String createdDate) |
| `PremiseTypeCode` | `String` | Optional | Description of the type of premises for the non-limited business | String getPremiseTypeCode() | setPremiseTypeCode(String premiseTypeCode) |
| `PremisETypeDesc` | `String` | Optional | Code for the type of premises for the non-limited business | String getPremisETypeDesc() | setPremisETypeDesc(String premisETypeDesc) |
| `URL` | `String` | Optional | URL for the website of the non-limited business | String getURL() | setURL(String uRL) |
| `RelocatedFlag` | `String` | Optional | - | String getRelocatedFlag() | setRelocatedFlag(String relocatedFlag) |
| `NumContacts` | `Integer` | Optional | - | Integer getNumContacts() | setNumContacts(Integer numContacts) |
| `Contact` | [`List<Contacts>`](../../doc/models/contacts.md) | Optional | - | List<Contacts> getContact() | setContact(List<Contacts> contact) |

## Example (as JSON)

```json
{
  "CreatedDate": null,
  "PremiseTypeCode": null,
  "Premis:eTypeDesc": null,
  "URL": null,
  "RelocatedFlag": null,
  "NumContacts": null,
  "Contact": null
}
```

