
# Ltd Identification

## Structure

`LtdIdentification`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LegalStatus` | `String` | Optional | Indicator showing the legal status of the limited company - 1 = Private Unlimited; 2 = Private Limited; 3 = PLC; 4 = Old Public Company; 5 = Private Company Limited by Guarantee (Exempt from using word 'Limited'); 6 = Limited Partnership; 7 = Private Limited Company Without Share Capital; 8 = Company Converted / Closed; 9 = Private Unlimited Company Without Share Capital; 0 = Other; A = Private Company Limited by Shares (Exempt from using word 'Limited'). When the Company Number Prefix = CI or SL, there are 3 flags as follows; 1 = ICVC (Securities); 2 = ICVC (Warrant); 3 = ICVC (Umbrella) | String getLegalStatus() | setLegalStatus(String legalStatus) |
| `IncorporationDate` | `String` | Optional | Incorporation Date (yyyy-mm-dd) | String getIncorporationDate() | setIncorporationDate(String incorporationDate) |
| `DissolutionDate` | `String` | Optional | Dissolution Date (yyyy-mm-dd) | String getDissolutionDate() | setDissolutionDate(String dissolutionDate) |
| `RegisteredOffice` | [`LtdBusinessLocation`](../../doc/models/ltd-business-location.md) | Optional | - | LtdBusinessLocation getRegisteredOffice() | setRegisteredOffice(LtdBusinessLocation registeredOffice) |
| `Currency` | `String` | Optional | ISO currency code | String getCurrency() | setCurrency(String currency) |
| `IssuedCapital` | `Double` | Optional | Issued capital (Figure taken from the latest Confirmation Statement - not the accounts) | Double getIssuedCapital() | setIssuedCapital(Double issuedCapital) |
| `AsRegisteredOffice` | `String` | Optional | Y = Trading address identical to registered office address; N = Trading address not identical to registered office address | String getAsRegisteredOffice() | setAsRegisteredOffice(String asRegisteredOffice) |
| `TradingTelephoneNum` | `String` | Optional | Limited company trading telephone number | String getTradingTelephoneNum() | setTradingTelephoneNum(String tradingTelephoneNum) |
| `TradingLocation` | [`LtdBusinessLocation`](../../doc/models/ltd-business-location.md) | Optional | - | LtdBusinessLocation getTradingLocation() | setTradingLocation(LtdBusinessLocation tradingLocation) |
| `PrincipalActivities` | `String` | Optional | Text description of the Principal Activities of the limited company | String getPrincipalActivities() | setPrincipalActivities(String principalActivities) |
| `SICInformation1980` | [`List<SICInfo80>`](../../doc/models/sic-info-80.md) | Optional | - | List<SICInfo80> getSICInformation1980() | setSICInformation1980(List<SICInfo80> sICInformation1980) |
| `SICInformation1992` | [`List<SICInfo92>`](../../doc/models/sic-info-92.md) | Optional | - | List<SICInfo92> getSICInformation1992() | setSICInformation1992(List<SICInfo92> sICInformation1992) |
| `PreviousNames` | [`PreviousNames`](../../doc/models/previous-names.md) | Optional | - | PreviousNames getPreviousNames() | setPreviousNames(PreviousNames previousNames) |
| `PreviousAddresses` | [`PreviousAddresses`](../../doc/models/previous-addresses.md) | Optional | - | PreviousAddresses getPreviousAddresses() | setPreviousAddresses(PreviousAddresses previousAddresses) |
| `ThomsonData` | [`LtdThomsonData`](../../doc/models/ltd-thomson-data.md) | Optional | - | LtdThomsonData getThomsonData() | setThomsonData(LtdThomsonData thomsonData) |
| `FilingDetails` | [`FilingDetails`](../../doc/models/filing-details.md) | Optional | - | FilingDetails getFilingDetails() | setFilingDetails(FilingDetails filingDetails) |
| `Auditor` | [`Auditor`](../../doc/models/auditor.md) | Optional | - | Auditor getAuditor() | setAuditor(Auditor auditor) |
| `Bank` | [`Bank`](../../doc/models/bank.md) | Optional | - | Bank getBank() | setBank(Bank bank) |
| `CROChanges` | [`CROChanges`](../../doc/models/cro-changes.md) | Optional | - | CROChanges getCROChanges() | setCROChanges(CROChanges cROChanges) |
| `PrevSearches` | [`LtdPrevSearches`](../../doc/models/ltd-prev-searches.md) | Optional | - | LtdPrevSearches getPrevSearches() | setPrevSearches(LtdPrevSearches prevSearches) |
| `CCLs` | [`CCLLtd`](../../doc/models/ccl-ltd.md) | Optional | - | CCLLtd getCCLs() | setCCLs(CCLLtd cCLs) |

## Example (as JSON)

```json
{
  "LegalStatus": null,
  "IncorporationDate": null,
  "DissolutionDate": null,
  "RegisteredOffice": null,
  "Currency": null,
  "IssuedCapital": null,
  "AsRegisteredOffice": null,
  "TradingTelephoneNum": null,
  "TradingLocation": null,
  "PrincipalActivities": null,
  "SICInformation1980": null,
  "SICInformation1992": null,
  "PreviousNames": null,
  "PreviousAddresses": null,
  "ThomsonData": null,
  "FilingDetails": null,
  "Auditor": null,
  "Bank": null,
  "CROChanges": null,
  "PrevSearches": null,
  "CCLs": null
}
```

