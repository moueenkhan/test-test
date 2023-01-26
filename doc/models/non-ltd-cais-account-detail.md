
# Non Ltd CAIS Account Detail

## Structure

`NonLtdCAISAccountDetail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NonLtdKey` | `String` | Optional | External format | String getNonLtdKey() | setNonLtdKey(String nonLtdKey) |
| `ExperianRef` | `String` | Optional | Currently not supported | String getExperianRef() | setExperianRef(String experianRef) |
| `PrimaryAccountIndicator` | `String` | Optional | Primary Account Indicator Flag. Y Yes , N or ' ' No | String getPrimaryAccountIndicator() | setPrimaryAccountIndicator(String primaryAccountIndicator) |
| `RepayPeriod` | `String` | Optional | Repayment Period Months | String getRepayPeriod() | setRepayPeriod(String repayPeriod) |
| `BalanceType` | `String` | Optional | Type of balance. A - Average Balance in month, P - Balance at time, ' ' - Unknown (default) | String getBalanceType() | setBalanceType(String balanceType) |
| `PrevStatementBalance` | `String` | Optional | Credit Card type accounts only | String getPrevStatementBalance() | setPrevStatementBalance(String prevStatementBalance) |
| `PrevStatementBalanceCredit` | `String` | Optional | Credit Card type accounts only. - to denote credit or ' ' to denote debt on Previous Statement Balance | String getPrevStatementBalanceCredit() | setPrevStatementBalanceCredit(String prevStatementBalanceCredit) |
| `PaymentFrequency` | `String` | Optional | Payment Frequency Indicator. W= Weekly, F = Fortnightly, M = Monthly, Q = Quarterly, A = Annually, P = Periodically | String getPaymentFrequency() | setPaymentFrequency(String paymentFrequency) |
| `PaymentAmount` | `int` | Required | Payment - in &pound; sterling Leading zeroes | int getPaymentAmount() | setPaymentAmount(int paymentAmount) |
| `PaymentIndicator` | `String` | Optional | Credit Card type accounts only. - to denote credit or ' ' to denote debt on Payment Amount | String getPaymentIndicator() | setPaymentIndicator(String paymentIndicator) |
| `PaymentCode` | `String` | Optional | Credit Card type accounts only. M or ' '. M = Minimum Payment Only | String getPaymentCode() | setPaymentCode(String paymentCode) |
| `PaymentType` | `String` | Optional | Form in which payment is made e.g. Cash, Cheque etc (B = Debit Card, C = Cash, D = Direct Debit, Q = Cheque, S = Standing Order, T = Credit Card | String getPaymentType() | setPaymentType(String paymentType) |
| `CreditLimit` | `int` | Required | Credit Limit - in &pound; sterling | int getCreditLimit() | setCreditLimit(int creditLimit) |
| `CreditTurnover` | `String` | Optional | Value of all payments into account during most recent month. Current Accounts Only | String getCreditTurnover() | setCreditTurnover(String creditTurnover) |
| `NumCashAdvances` | `int` | Required | Credit Card type accounts only | int getNumCashAdvances() | setNumCashAdvances(int numCashAdvances) |
| `PromotionAct` | `String` | Optional | Credit Card type accounts only. Y Current Promotional Activity, N or ' ' No promotional activity. | String getPromotionAct() | setPromotionAct(String promotionAct) |
| `Rejection` | `String` | Optional | Current account unpaid transactions in the last month. 0 - No unpaid transactions, 1 - Unpaid transactions | String getRejection() | setRejection(String rejection) |
| `MortgageFlag` | `String` | Optional | C = Arrears Capitalisation, A = Mortgage repossession applied for, G = Mortgage repossession granted | String getMortgageFlag() | setMortgageFlag(String mortgageFlag) |
| `ValueCashAdvances` | `int` | Required | Credit Card type accounts only | int getValueCashAdvances() | setValueCashAdvances(int valueCashAdvances) |
| `FlagSetting` | `String` | Optional | See Non-limited CAIS file layout specification | String getFlagSetting() | setFlagSetting(String flagSetting) |
| `AccountStatStatusCodes` | `String` | Optional | Account Status Codes Please refer to the CAIS File Layout specification available from Account Management | String getAccountStatStatusCodes() | setAccountStatStatusCodes(String accountStatStatusCodes) |
| `Status12` | `int` | Required | Status 1-2 Count | int getStatus12() | setStatus12(int status12) |
| `Status3` | `int` | Required | Status 3+ Count | int getStatus3() | setStatus3(int status3) |
| `NumbOfMonthsHistory` | `int` | Required | Number of months history | int getNumbOfMonthsHistory() | setNumbOfMonthsHistory(int numbOfMonthsHistory) |
| `AccountStartDate` | `String` | Optional | Start date (yyyy-mm-dd) | String getAccountStartDate() | setAccountStartDate(String accountStartDate) |
| `SettlementDate` | `String` | Optional | Settlement Date (yyyy-mm-dd) | String getSettlementDate() | setSettlementDate(String settlementDate) |
| `DefaultSatisfactionDate` | `String` | Optional | Default Satisfaction Date (yyyy-mm-dd) | String getDefaultSatisfactionDate() | setDefaultSatisfactionDate(String defaultSatisfactionDate) |
| `LastUpdateDate` | `String` | Optional | Last Update Date (yyyy-mm-dd) | String getLastUpdateDate() | setLastUpdateDate(String lastUpdateDate) |
| `WorstStatus` | `String` | Optional | This is the worst CAIS status recorded | String getWorstStatus() | setWorstStatus(String worstStatus) |
| `MCollection` | `String` | Optional | Transferred to collection account | String getMCollection() | setMCollection(String collection) |
| `OwnDataFlag` | `String` | Optional | Own Data Flag. Y Own Data, N Not Own Data. When = Y, then fields denoted as Own Data should be displayed with their data values as applicable.  When OwnDataFlag does not = Y, then Own Data Field labels and values should be hidden. | String getOwnDataFlag() | setOwnDataFlag(String ownDataFlag) |
| `CompanyType` | `int` | Required | Company Type Refer to Data Codes Document for details. | int getCompanyType() | setCompanyType(int companyType) |
| `AccountType` | `int` | Required | Account Type Please refer to the CAIS File Layout specification | int getAccountType() | setAccountType(int accountType) |
| `Airtime` | `String` | Optional | Only for FCS Members (Airtime retailers). L Live, B Barred, D Disconnected | String getAirtime() | setAirtime(String airtime) |
| `SourceCode` | `int` | Required | The Source Code should be defined as numeric 4.  Only returned for own CAIS accounts. | int getSourceCode() | setSourceCode(int sourceCode) |
| `AccountNum` | `String` | Optional | The Account Number which should be defined as 20 bytes Character.  Only returned for own CAIS accounts. | String getAccountNum() | setAccountNum(String accountNum) |
| `NewAccountNum` | `String` | Optional | New account number should be defined as 20 bytes Character.  Only returned for own CAIS accounts. | String getNewAccountNum() | setNewAccountNum(String newAccountNum) |
| `OriginalDefaultBalance` | `int` | Required | Balance at time of default. | int getOriginalDefaultBalance() | setOriginalDefaultBalance(int originalDefaultBalance) |
| `CurrentDefaultBalance` | `int` | Required | Current Default Balance In &pound; sterling Leading zeroes | int getCurrentDefaultBalance() | setCurrentDefaultBalance(int currentDefaultBalance) |
| `NoticeOfCorrectionRef` | `String` | Optional | Notice of Correction reference | String getNoticeOfCorrectionRef() | setNoticeOfCorrectionRef(String noticeOfCorrectionRef) |
| `BussinessName` | `String` | Optional | Business Name | String getBussinessName() | setBussinessName(String bussinessName) |
| `AdditionalTradeStyle` | `String` | Optional | Additional Trading Style | String getAdditionalTradeStyle() | setAdditionalTradeStyle(String additionalTradeStyle) |
| `VatNumber` | `String` | Optional | VAT Number | String getVatNumber() | setVatNumber(String vatNumber) |
| `SICCode` | `String` | Optional | - | String getSICCode() | setSICCode(String sICCode) |
| `SICDescription1992` | `String` | Optional | - | String getSICDescription1992() | setSICDescription1992(String sICDescription1992) |
| `NameChange` | `String` | Optional | Name Change Flag (internal processing). Y Name changed, N Name unchanged | String getNameChange() | setNameChange(String nameChange) |
| `Location` | [`NonLtdBusinessLocation`](../../doc/models/non-ltd-business-location.md) | Optional | - | NonLtdBusinessLocation getLocation() | setLocation(NonLtdBusinessLocation location) |
| `BusinessTelNum` | `String` | Optional | Business Telephone Number | String getBusinessTelNum() | setBusinessTelNum(String businessTelNum) |
| `BusinessAddressType` | `String` | Optional | - | String getBusinessAddressType() | setBusinessAddressType(String businessAddressType) |
| `BankSortCode` | `String` | Optional | - | String getBankSortCode() | setBankSortCode(String bankSortCode) |
| `ContactName` | `String` | Optional | - | String getContactName() | setContactName(String contactName) |
| `ContactJob` | `String` | Optional | - | String getContactJob() | setContactJob(String contactJob) |
| `MonthlyPayment` | `int` | Required | Payment - in &pound; sterling Leading zeroes | int getMonthlyPayment() | setMonthlyPayment(int monthlyPayment) |
| `CurrentBalance` | `int` | Required | Outstanding Balance as of this submission | int getCurrentBalance() | setCurrentBalance(int currentBalance) |
| `CurrentBalanceInd` | `String` | Optional | Set to '-' to denote credit or ' ' to denote debt on balance | String getCurrentBalanceInd() | setCurrentBalanceInd(String currentBalanceInd) |
| `DateLastStatus` | `String` | Optional | Date Last Status (yyyy-mm-dd) | String getDateLastStatus() | setDateLastStatus(String dateLastStatus) |
| `DateFlagChange` | `int` | Required | - | int getDateFlagChange() | setDateFlagChange(int dateFlagChange) |
| `Debenture` | `String` | Optional | - | String getDebenture() | setDebenture(String debenture) |
| `DateDebenture` | `String` | Optional | Date Debenture (yyyy-mm-dd) | String getDateDebenture() | setDateDebenture(String dateDebenture) |
| `PrevCreditLimit` | `int` | Required | - | int getPrevCreditLimit() | setPrevCreditLimit(int prevCreditLimit) |
| `DateCreditLimitChange` | `String` | Optional | Date Credit Limit Changed (yyyy-mm-dd) | String getDateCreditLimitChange() | setDateCreditLimitChange(String dateCreditLimitChange) |
| `PortfolioName` | `String` | Optional | Portfolio Name Assigned by Experian with Source code | String getPortfolioName() | setPortfolioName(String portfolioName) |
| `YearBusinessStart` | `int` | Required | - | int getYearBusinessStart() | setYearBusinessStart(int yearBusinessStart) |
| `NumCreditCard` | `int` | Required | Total Number of Credit Cards for Business. Add total volume of credit cards | int getNumCreditCard() | setNumCreditCard(int numCreditCard) |
| `PrevRejection1` | `int` | Required | 0 - No unpaid transactions, 1 - Unpaid transactions | int getPrevRejection1() | setPrevRejection1(int prevRejection1) |
| `PrevRejection2` | `int` | Required | 0 - No unpaid transactions, 1 - Unpaid transactions | int getPrevRejection2() | setPrevRejection2(int prevRejection2) |
| `DateContactChange` | `String` | Optional | Date Contact Changed (yyyy-mm-dd) | String getDateContactChange() | setDateContactChange(String dateContactChange) |
| `ContactTel` | `String` | Optional | - | String getContactTel() | setContactTel(String contactTel) |
| `ParentRegNum` | `String` | Optional | - | String getParentRegNum() | setParentRegNum(String parentRegNum) |
| `ParentTel` | `int` | Required | - | int getParentTel() | setParentTel(int parentTel) |
| `ParentVatNum` | `int` | Required | - | int getParentVatNum() | setParentVatNum(int parentVatNum) |
| `PrevBusinessTel` | `int` | Required | - | int getPrevBusinessTel() | setPrevBusinessTel(int prevBusinessTel) |
| `DateBusinessInfoChange` | `String` | Optional | Date Business Information Changed (yyyy-mm-dd) | String getDateBusinessInfoChange() | setDateBusinessInfoChange(String dateBusinessInfoChange) |
| `DateBusinessNameAddresChange` | `String` | Optional | Date Business Name/Address Changed (yyyy-mm-dd) | String getDateBusinessNameAddresChange() | setDateBusinessNameAddresChange(String dateBusinessNameAddresChange) |
| `DateArrangeEnd` | `String` | Optional | Date when flag setting Q is dropped (yyyy-mm-dd) | String getDateArrangeEnd() | setDateArrangeEnd(String dateArrangeEnd) |
| `DateQueryEnd` | `String` | Optional | Date when flag setting Q is dropped (yyyy-mm-dd) | String getDateQueryEnd() | setDateQueryEnd(String dateQueryEnd) |
| `NocRef2` | `String` | Optional | NOC reference (including Y1 ref for NOD) Ref = 2 character NOC ref + 9 characters for report ID | String getNocRef2() | setNocRef2(String nocRef2) |
| `BdsFlag` | `String` | Optional | If = Y then flag is enabled - display credit card fields when Account Type = 05 | String getBdsFlag() | setBdsFlag(String bdsFlag) |
| `AirTimeAccessFlag` | `String` | Optional | If = Y then flag is enabled | String getAirTimeAccessFlag() | setAirTimeAccessFlag(String airTimeAccessFlag) |
| `CurrentAccountFlag` | `String` | Optional | If = Y then flag is enabled - display credit card fields when Account Type = 15 & 25 | String getCurrentAccountFlag() | setCurrentAccountFlag(String currentAccountFlag) |
| `ViewAccNumberFlag` | `String` | Optional | If = Y then flag is enabled - display Account number field in accordance with OWNDATAFLAG setting and CHSFAG setting | String getViewAccNumberFlag() | setViewAccNumberFlag(String viewAccNumberFlag) |
| `ChsFlag` | `String` | Optional | If = Y then flag is enabled - in this case, OWNDATAFLAG will = Y also, BUT if CHSFLAG field does = Y, and ViewAccNumberFlag does not =Y, then hide account number value. | String getChsFlag() | setChsFlag(String chsFlag) |
| `PreviousContact` | `String` | Optional | - | String getPreviousContact() | setPreviousContact(String previousContact) |
| `PrevTradingStyle` | `String` | Optional | - | String getPrevTradingStyle() | setPrevTradingStyle(String prevTradingStyle) |
| `ParentBusiness` | `String` | Optional | - | String getParentBusiness() | setParentBusiness(String parentBusiness) |
| `ParentLocation` | [`NonLtdParentLocation`](../../doc/models/non-ltd-parent-location.md) | Optional | - | NonLtdParentLocation getParentLocation() | setParentLocation(NonLtdParentLocation parentLocation) |
| `PreviousLocation` | [`NonLtdPreviousLocation`](../../doc/models/non-ltd-previous-location.md) | Optional | - | NonLtdPreviousLocation getPreviousLocation() | setPreviousLocation(NonLtdPreviousLocation previousLocation) |
| `BusinessWebsite` | `String` | Optional | - | String getBusinessWebsite() | setBusinessWebsite(String businessWebsite) |
| `ContactEmail` | `String` | Optional | - | String getContactEmail() | setContactEmail(String contactEmail) |
| `NumberOfProprietors` | `Integer` | Optional | - | Integer getNumberOfProprietors() | setNumberOfProprietors(Integer numberOfProprietors) |
| `CAISProprietors` | [`CAISProprietors`](../../doc/models/cais-proprietors.md) | Optional | - | CAISProprietors getCAISProprietors() | setCAISProprietors(CAISProprietors cAISProprietors) |

## Example (as JSON)

```json
{
  "NonLtdKey": null,
  "ExperianRef": null,
  "PrimaryAccountIndicator": null,
  "RepayPeriod": null,
  "BalanceType": null,
  "PrevStatementBalance": null,
  "PrevStatementBalanceCredit": null,
  "PaymentFrequency": null,
  "PaymentAmount": 48,
  "PaymentIndicator": null,
  "PaymentCode": null,
  "PaymentType": null,
  "CreditLimit": 0,
  "CreditTurnover": null,
  "NumCashAdvances": 6,
  "PromotionAct": null,
  "Rejection": null,
  "MortgageFlag": null,
  "ValueCashAdvances": 190,
  "FlagSetting": null,
  "AccountStatStatusCodes": null,
  "Status_1_2": 194,
  "Status_3": 4,
  "NumbOfMonthsHistory": 6,
  "AccountStartDate": null,
  "SettlementDate": null,
  "DefaultSatisfactionDate": null,
  "LastUpdateDate": null,
  "WorstStatus": null,
  "Collection": null,
  "OwnDataFlag": null,
  "CompanyType": 62,
  "AccountType": 214,
  "Airtime": null,
  "SourceCode": 240,
  "AccountNum": null,
  "NewAccountNum": null,
  "OriginalDefaultBalance": 66,
  "CurrentDefaultBalance": 252,
  "NoticeOfCorrectionRef": null,
  "BussinessName": null,
  "AdditionalTradeStyle": null,
  "VatNumber": null,
  "SICCode": null,
  "SICDescription1992": null,
  "NameChange": null,
  "Location": null,
  "BusinessTelNum": null,
  "BusinessAddressType": null,
  "BankSortCode": null,
  "ContactName": null,
  "ContactJob": null,
  "MonthlyPayment": 36,
  "CurrentBalance": 32,
  "CurrentBalanceInd": null,
  "DateLastStatus": null,
  "DateFlagChange": 4,
  "Debenture": null,
  "DateDebenture": null,
  "PrevCreditLimit": 24,
  "DateCreditLimitChange": null,
  "PortfolioName": null,
  "YearBusinessStart": 104,
  "NumCreditCard": 182,
  "PrevRejection1": 212,
  "PrevRejection2": 120,
  "DateContactChange": null,
  "ContactTel": null,
  "ParentRegNum": null,
  "ParentTel": 22,
  "ParentVatNum": 64,
  "PrevBusinessTel": 246,
  "DateBusinessInfoChange": null,
  "DateBusinessNameAddresChange": null,
  "DateArrangeEnd": null,
  "DateQueryEnd": null,
  "NocRef2": null,
  "BdsFlag": null,
  "AirTimeAccessFlag": null,
  "CurrentAccountFlag": null,
  "ViewAccNumberFlag": null,
  "ChsFlag": null,
  "PreviousContact": null,
  "PrevTradingStyle": null,
  "ParentBusiness": null,
  "ParentLocation": null,
  "PreviousLocation": null,
  "BusinessWebsite": null,
  "ContactEmail": null,
  "NumberOfProprietors": null,
  "CAISProprietors": null
}
```

