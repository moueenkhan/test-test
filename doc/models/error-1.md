
# Error 1

## Structure

`Error1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `Integer` | Optional | API error response code | Integer getCode() | setCode(Integer code) |
| `Message` | `String` | Optional | API error message | String getMessage() | setMessage(String message) |
| `InternalError` | `String` | Optional | Additional information to support Experian investigation of issues | String getInternalError() | setInternalError(String internalError) |
| `MoreInfo` | `String` | Optional | Additional information to support developers | String getMoreInfo() | setMoreInfo(String moreInfo) |

## Example (as JSON)

```json
{
  "Code": null,
  "Message": null,
  "InternalError": null,
  "MoreInfo": null
}
```

