
# Bankruptcies

## Structure

`Bankruptcies`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MDataOutOwnshpRange` | `String` | Optional | Indicator showing whether all the Bankruptcies data is in the ownership period - G = Yes, L = No | String getMDataOutOwnshpRange() | setMDataOutOwnshpRange(String mDataOutOwnshpRange) |
| `MBankruptcyCount` | `Integer` | Optional | Number of Bankruptcies recorded against the non-limited business in the ownership period | Integer getMBankruptcyCount() | setMBankruptcyCount(Integer mBankruptcyCount) |
| `MAgeMostRecentBankruptcy` | `Integer` | Optional | The age in months of the most recent Bankruptcy based on Judgement date for the non-limited business | Integer getMAgeMostRecentBankruptcy() | setMAgeMostRecentBankruptcy(Integer mAgeMostRecentBankruptcy) |
| `MNOCFlag` | `String` | Optional | Indicator showing whether there are any Notices of Correction associated with the Bankruptcies - Y=1 or more NOC, N=no NOC | String getMNOCFlag() | setMNOCFlag(String mNOCFlag) |
| `ADataOutOwnshpRange` | `String` | Optional | Indicator showing whether all the Possibly Associated Bankruptcies data is in the ownership period - G = Yes, L = No | String getADataOutOwnshpRange() | setADataOutOwnshpRange(String aDataOutOwnshpRange) |
| `ABankruptcyCount` | `Integer` | Optional | Number of Possibly Associated Bankruptcies recorded against the non-limited business in the ownership period | Integer getABankruptcyCount() | setABankruptcyCount(Integer aBankruptcyCount) |
| `AAgeMostRecentBankruptcy` | `Integer` | Optional | The age in months of the most recent Possibly Associated Bankruptcy based on Judgement date for the non-limited business | Integer getAAgeMostRecentBankruptcy() | setAAgeMostRecentBankruptcy(Integer aAgeMostRecentBankruptcy) |
| `ANOCFlag` | `String` | Optional | Indicator showing whether there are any Notices of Correction associated with the Possibly Associated Bankruptcies - Y=1 or more NOC, N=no NOC | String getANOCFlag() | setANOCFlag(String aNOCFlag) |
| `BankruptcyDetail` | [`List<BankruptcyDetails>`](../../doc/models/bankruptcy-details.md) | Optional | - | List<BankruptcyDetails> getBankruptcyDetail() | setBankruptcyDetail(List<BankruptcyDetails> bankruptcyDetail) |

## Example (as JSON)

```json
{
  "MDataOutOwnshpRange": null,
  "MBankruptcyCount": null,
  "MAgeMostRecentBankruptcy": null,
  "MNOCFlag": null,
  "ADataOutOwnshpRange": null,
  "ABankruptcyCount": null,
  "AAgeMostRecentBankruptcy": null,
  "ANOCFlag": null,
  "BankruptcyDetail": null
}
```

