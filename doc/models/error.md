
# Error

## Structure

`Error`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ErrorCode` | `String` | Optional | The error code associated with the error | String getErrorCode() | setErrorCode(String errorCode) |
| `Severity` | `String` | Optional | A numeric indicator from 0 to 9 representing the severity of the error, 9 being the worst | String getSeverity() | setSeverity(String severity) |
| `Code` | `int` | Required | - | int getCode() | setCode(int code) |
| `Message` | `String` | Required | - | String getMessage() | setMessage(String message) |

## Example (as JSON)

```json
{
  "ErrorCode": null,
  "Severity": null,
  "code": 130,
  "message": "message0"
}
```

