
# CIFAS Indicator

## Structure

`CIFASIndicator`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BusAddress` | `String` | Optional | Indicator shownig the entitlement / presence of CIFAS data related to the business address - Y = CIFAS information found at business address; N = No CIFAS information found at business address or Requestor has no entitlement to CIFAS data | String getBusAddress() | setBusAddress(String busAddress) |
| `PropAddress` | `String` | Optional | Indicator shownig the entitlement / presence of CIFAS data related to the proprietor address - Y = CIFAS information found at proprietor address; N = No CIFAS information found at proprietor address or Requestor has no entitlement to CIFAS data | String getPropAddress() | setPropAddress(String propAddress) |

## Example (as JSON)

```json
{
  "BusAddress": null,
  "PropAddress": null
}
```

