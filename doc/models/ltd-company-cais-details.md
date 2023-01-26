
# Ltd Company CAIS Details

## Structure

`LtdCompanyCAISDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountState` | `String` | Optional | Account state. A = Active; D = Defaulted; S = Settled | String getAccountState() | setAccountState(String accountState) |
| `AccountStatus12` | `String` | Optional | Account status (Last 12 account statuses) | String getAccountStatus12() | setAccountStatus12(String accountStatus12) |
| `AccountType` | `String` | Optional | Account type. 0 = Bank. These accounts are normally defaults but can cover any type of account provided by a bank where the product can no longer be identified; 1 = Hire purchase (including Lease Purchase)/ Conditional sale. An account where the merchandise remains the property of the lender until all repayments are completed; 2 = Unsecured loan (personal loans etc.). An account covering the borrowing of a fixed amount which is not secured; 3 = Mortgage. A loan for the purchase of a property that is secured by a mortgage deed until the final payment is made; 4 = Budget (revolving account). A provision of an account or an agreement for the purchase of goods up to an agreed credit limit. A revolving account may involve numerous drawdowns and repayments of a percentage of the balance, whereas the budget accounts credit facility is repaid by constant regular amounts; 5 = Credit card/Store card. The customers are allowed to spend up to an agreed credit limit and repayments are a minimal value or a percentage of the balance outstanding; 6 = Charge card. Spending is allowed up to a credit limit but full repayment is expected against the monthly statement; 7 = Rental (TV, brown and white goods). Where the merchandise always remains the property of the lender/lessor. The customer makes payments for the use of these goods; 8 = Mail Order. For all types of mail order portfolios; 12 = CML member. Possession order; 13 = CML member . Voluntary surrender; 14 = CML member. Arrears move; 15 = Current accounts . For all portfolios operating along the lines of current accounts; 16 = Secured loan or Second mortgage. A loan secured against an asset or property but the security ranks after the prime mortgage above on a second mortgage; 17 = Credit sale fixed term. Title to the goods passes to the customer on signing the agreement; 18 = Communications . For use by mobile phone, cable or landline communication service providers; 19 = Fixed term deferred payment. `Buy now pay later` types of arrangements. The conditions are similar to HP and credit sale except that the first payment is deferred for an agreed period of time; 20 = Variable subscription. Variable rate HP where the monthly payments can vary depending on base rate adjustments; 21 = Utility. This category includes gas, water and electricity portfolios but not communications; 22 = Finance Lease. Where the rental covers the total amount of the asset plus charges, i.e. the lessor is not at risk; 23 = Operating Lease. The lessee's rentals do not cover more than 90% of the costs of the goods and charges i.e. the lessor is taking part of the risk; 24 = Unpresentable cheques. To be used by cheque guarantee companies for a bounced cheque; 25 = Flexible Mortgages. An account that is secured by a mortgage deed until the final payment is made but the account has flexible terms or elements of multiple products i.e. contains a current account included in the main mortgage account; 26 = Consolidated Debt. This category should be used where a CAIS member transfers multiple accounts into one collection account for the purposes of debt recovery. This process is referred to as 'consolidating debt'; 27 = Primary Lease. Where the rental covers the total amount of the asset plus charges, i.e. the lessor is not at risk; 28 = Secondary Lease. Where the lessee continues to lease the goods at an annual peppercorn rental; 29 = Balloon Rental. Same as Rental but with an amount due in lump sum; 30 = Dealer buy-back. Where the dealer/supplier has agreed to repurchase the goods at a pre-determined amount, normally at the completion of the leasing period; 31 = Fixed Term Account. An account when the rate of interest and term is agreed at the opening of the account for the duration of the agreement; 32 = Variable Term Account. An account when the rate of interest is subject to change and the term of the agreement may or may not be fixed for the duration of the agreement; 34 = Flexi Rate Credit Card. The ability to make overpayments and underpayments, revolving credit facility which may or may not be linked to a customers' current account; 35 = Merchant Account. An account that allows businesses to accept payments by payment cards, typically debit or credit cards. A merchant account is established under an agreement between a merchant and a merchant acquirer for the settlement of payment card transactions; 61 = Home Credit. Specifically to be used by those lenders who have actively offer home based credit through e.g. on a door to door basis.  Typically payment is made weekly and in cash to an agent and is collected from the customers address; 71 = Contract Hire. Contract hire is a form of operating lease and it is often used for vehicles. The leasing company undertakes some responsibility for the management and maintenance of the vehicles. Services can include regular maintenance and repair costs, replacement of tyres and batteries, providing replacement vehicles, roadside assistance and recovery services and payment of the vehicle licences | String getAccountType() | setAccountType(String accountType) |
| `AgreemtNum` | `String` | Optional | Agreement number | String getAgreemtNum() | setAgreemtNum(String agreemtNum) |
| `CaisLastUpdate` | `String` | Optional | - | String getCaisLastUpdate() | setCaisLastUpdate(String caisLastUpdate) |
| `CompanyType` | `String` | Optional | Company type. 0 = Other; 1 = FLA Member; 2 = CCTA Member; 3 = RETRA Member; 4 = CCAUK Member; 5 = LPFA Member; 6 = Bank; 7 = Building Society; 8 = Clothing; 9 = Canvassing Sales; 10 = Credit Card; 11 = Department Store; 12 = Electric Sale/Rent; 13 = Enquiry Agent; 14 = Fuel Supplies; 15 = Home Improvements; 16 = House Furnisher; 17 = Insurance; 18 = Mail Order; 19 = Personal Loans; 20 = Property Sales; 21 = Property Repairs; 22 = Public Utility; 23 = Professional Services; 24 = Unclassified; 25 = Publishers; 26 = Hotel; 27 = Leasing; 28 = Car Hire; 29 = CIH Member; 30 = Commercial Enquiry; 31 = Finance Company; 32 = Retail General; 33 = Communications; 34 = Broker; 35 = Home Credit; 36 = Student Loans; 37 = Police Service; 38 = Housing Association; 39 = The Cabinet Office; 40 = HM Treasury; 41 = DCA; 42 = Department of Health; 43 = Credit Union; 44 = Education; 45 = Internet Service Provider; 46 = Home Office; 47 = Department for Transport; 48 = Central Government Agency (Other); 49 = Ministry of Defence; 50 = DWP; 51 = NDBP; 52 = Chamber of Commerce; 53 = Local and Regional Government; 54 = Factoring and Discounting; 55 = Merchant Acquirer | String getCompanyType() | setCompanyType(String companyType) |
| `CurrentBalance` | `String` | Optional | Current balance | String getCurrentBalance() | setCurrentBalance(String currentBalance) |
| `DefaultBalance` | `String` | Optional | Default balance | String getDefaultBalance() | setDefaultBalance(String defaultBalance) |
| `DefaultDate` | `String` | Optional | - | String getDefaultDate() | setDefaultDate(String defaultDate) |
| `MonthsData` | `Integer` | Optional | Months data | Integer getMonthsData() | setMonthsData(Integer monthsData) |
| `SettlementDate` | `String` | Optional | - | String getSettlementDate() | setSettlementDate(String settlementDate) |
| `Status1To2` | `Integer` | Optional | Status 1-2 | Integer getStatus1To2() | setStatus1To2(Integer status1To2) |
| `Status3To9` | `Integer` | Optional | Status 3-9 | Integer getStatus3To9() | setStatus3To9(Integer status3To9) |
| `SourceCode` | `String` | Optional | The Source Code should be defined as numeric 4. Defaults to '0000' if CAIS record is not own CAIS record, otherwise value is as provided by the Source Code Owner (own data) | String getSourceCode() | setSourceCode(String sourceCode) |
| `AccountNumber` | `String` | Optional | The Account Number which should be defined as 20 bytes Character. Default to an Experian reference value for not own CAIS records, otherwise the account number is shown as provided by the Source Code Owner (own data) | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `PrimaryAccountIndicator` | `String` | Optional | Primary Account Indicator Flag.<br>“all data”<br>Y Yes<br>N or ' ' No<br>Only available to Current Account User Group within the CAIS data sharing program. | String getPrimaryAccountIndicator() | setPrimaryAccountIndicator(String primaryAccountIndicator) |
| `RepayPeriod` | `String` | Optional | Repayment Period in Months for the CAIS record<br>“all data” | String getRepayPeriod() | setRepayPeriod(String repayPeriod) |
| `BalanceType` | `String` | Optional | Type of balance.<br>“all data”<br>A - Average Balance in month<br>P - Balance at time<br>' ' – Unknown (default)<br>Only available to Current Account User Group within the CAIS data sharing program. | String getBalanceType() | setBalanceType(String balanceType) |
| `PreviousStatementBalance` | `String` | Optional | The previous statement balance for the CAIS record<br>Credit Card type accounts only | String getPreviousStatementBalance() | setPreviousStatementBalance(String previousStatementBalance) |
| `PreviousStatementIndicator` | `String` | Optional | Credit Card type accounts only<br>“-“ to denote credit<br>or “ “ to denote debt on Previous Statement Balance | String getPreviousStatementIndicator() | setPreviousStatementIndicator(String previousStatementIndicator) |
| `PaymentFrequency` | `String` | Optional | Payment Frequency Indicator.<br>“all data”<br>W= Weekly<br>F = Fortnightly<br>M = Monthly<br>Q = Quarterly<br>A = Annually<br>P = Periodically | String getPaymentFrequency() | setPaymentFrequency(String paymentFrequency) |
| `PaymentAmount` | `Integer` | Optional | Payment - in £'s sterling Leading zeroes | Integer getPaymentAmount() | setPaymentAmount(Integer paymentAmount) |
| `PaymentIndicator` | `String` | Optional | Credit Card type accounts only<br>“-“ to denote credit<br>or “ “ to denote debt on Payment Amount | String getPaymentIndicator() | setPaymentIndicator(String paymentIndicator) |
| `PaymentCode` | `String` | Optional | Credit Card type accounts only<br>M or ‘ ‘<br>M = Minimum Payment Only | String getPaymentCode() | setPaymentCode(String paymentCode) |
| `PaymentType` | `String` | Optional | Form in which payment is made e.g. Cash, Cheque etc<br>B = Debit Card<br>C = Cash<br>D = Direct Debit<br>Q = Cheque<br>S = Standing Order<br>T = Credit Card | String getPaymentType() | setPaymentType(String paymentType) |
| `CreditLimit` | `Integer` | Optional | Credit Limit - in £'s sterling<br>“all data” | Integer getCreditLimit() | setCreditLimit(Integer creditLimit) |
| `CreditTurnover` | `String` | Optional | Value of all payments into account during most recent month<br>“all data”<br>Only available to Current Account User Group within the CAIS data sharing program. | String getCreditTurnover() | setCreditTurnover(String creditTurnover) |
| `NumberCashAdvances` | `Integer` | Optional | Credit Card type accounts only | Integer getNumberCashAdvances() | setNumberCashAdvances(Integer numberCashAdvances) |
| `PromotionActivity` | `String` | Optional | Credit Card type accounts only<br>Y Current Promotional Activity<br>N or ' ' No promotional activity.<br>? TBC | String getPromotionActivity() | setPromotionActivity(String promotionActivity) |
| `Rejection` | `String` | Optional | Current account unpaid transactions in the last month.<br>Only available to the provider of this CAIS record/R4<br>0 - No unpaid transactions<br>1 - Unpaid transactions<br>Only available to Current Account User Group within the CAIS data sharing program. | String getRejection() | setRejection(String rejection) |
| `MortgageFlag` | `String` | Optional | “all data”<br>C = Arrears Capitalisation<br>A = Mortgage repossession applied for<br>G = Mortgage repossession granted | String getMortgageFlag() | setMortgageFlag(String mortgageFlag) |
| `ValueCashAdvances` | `Integer` | Optional | Credit Card type accounts only within the CAIS data sharing program. | Integer getValueCashAdvances() | setValueCashAdvances(Integer valueCashAdvances) |
| `FlagSetting` | `String` | Optional | See "CAIS Flag Setting" tab for details | String getFlagSetting() | setFlagSetting(String flagSetting) |
| `BestCAISStatus` | `String` | Optional | This is the best CAIS status recorded | String getBestCAISStatus() | setBestCAISStatus(String bestCAISStatus) |
| `AccountStartDate` | `String` | Optional | Start Date YYYY-MM-DD<br>00 = Date Unknown<br>“all data” | String getAccountStartDate() | setAccountStartDate(String accountStartDate) |
| `WorstCurrentStatus` | `String` | Optional | This is the worst Current (this month)  CAIS status recorded for all active accounts | String getWorstCurrentStatus() | setWorstCurrentStatus(String worstCurrentStatus) |
| `WorstHistoricalStatus` | `String` | Optional | This is the worst CAIS status recorded during the last 12 months across all accounts | String getWorstHistoricalStatus() | setWorstHistoricalStatus(String worstHistoricalStatus) |
| `WorstStatus` | `String` | Optional | This is the worst CAIS status recorded during the last 12 months for updates for an individual account (shown against each CAIS account).   Duplicate of WorstHistoricalStatus. | String getWorstStatus() | setWorstStatus(String worstStatus) |
| `CollectionDate` | `String` | Optional | Transaction Collection Date (YYYY-MM-DD)<br>00 = Date Unknown<br>“all data” | String getCollectionDate() | setCollectionDate(String collectionDate) |
| `OwnDataFlag` | `String` | Optional | Own Data Flag Y Own Data N Not Own Data<br>When = Y, then fields denoted as “Own Data” should be displayed with their data values as applicable.  When OWNDATAFLAG does not = Y, then “Own Data “Field labels and values should be hidden. | String getOwnDataFlag() | setOwnDataFlag(String ownDataFlag) |
| `Airtime` | `String` | Optional | Only for FCS Members (Airtime retailers)<br>“own data”<br>L Live<br>B Barred<br>D Disconnected | String getAirtime() | setAirtime(String airtime) |
| `NoticeOfCorrectionRef` | `String` | Optional | Notice of Correction reference<br>“all data” | String getNoticeOfCorrectionRef() | setNoticeOfCorrectionRef(String noticeOfCorrectionRef) |
| `BusinessName` | `String` | Optional | Business Name<br>“all data” | String getBusinessName() | setBusinessName(String businessName) |
| `AdditionalTradeStyle` | `String` | Optional | Additional Trading Style | String getAdditionalTradeStyle() | setAdditionalTradeStyle(String additionalTradeStyle) |
| `VATNumber` | `String` | Optional | VAT Number<br>“own data” | String getVATNumber() | setVATNumber(String vATNumber) |
| `SICCode` | `String` | Optional | Trailing Zero 0<br>“own data” | String getSICCode() | setSICCode(String sICCode) |
| `SICDescription1992` | `String` | Optional | - | String getSICDescription1992() | setSICDescription1992(String sICDescription1992) |
| `NameChange` | `String` | Optional | Name Change Flag<br>(internal processing)<br>Y Name changed<br>N Name unchanged | String getNameChange() | setNameChange(String nameChange) |
| `Location` | [`LtdBusinessLocation`](../../doc/models/ltd-business-location.md) | Optional | - | LtdBusinessLocation getLocation() | setLocation(LtdBusinessLocation location) |
| `BusinessTelNum` | `String` | Optional | Business Telephone Number<br>“own data” | String getBusinessTelNum() | setBusinessTelNum(String businessTelNum) |
| `BusinessAddressType` | `String` | Optional | All data”<br>""BusinessAddressType"" field to have the following details:<br>‘R’ - Registered<br>‘H’ - Head Office<br>‘T’ - Trading<br>‘B’ - Branch<br>‘D’ - Delivery<br>‘O’ - Other | String getBusinessAddressType() | setBusinessAddressType(String businessAddressType) |
| `BankSortCode` | `String` | Optional | “own data” | String getBankSortCode() | setBankSortCode(String bankSortCode) |
| `ContactName` | `String` | Optional | Only returned for own CAIS accounts | String getContactName() | setContactName(String contactName) |
| `ContactJob` | `String` | Optional | Only returned for own CAIS accounts | String getContactJob() | setContactJob(String contactJob) |
| `MonthlyPayment` | `Integer` | Optional | Payment - in £'s sterling Leading zeroes<br>“all data” | Integer getMonthlyPayment() | setMonthlyPayment(Integer monthlyPayment) |
| `DateLastStatus` | `String` | Optional | Date of the last change in Status | String getDateLastStatus() | setDateLastStatus(String dateLastStatus) |
| `DateFlagChange` | `String` | Optional | DD-MM-YYY. “All data” | String getDateFlagChange() | setDateFlagChange(String dateFlagChange) |
| `Debenture` | `String` | Optional | “Own Data” | String getDebenture() | setDebenture(String debenture) |
| `DateDebenture` | `String` | Optional | Only returned for own CAIS accounts<br>Default value of '0000-00-00' | String getDateDebenture() | setDateDebenture(String dateDebenture) |
| `PreviousCreditLimit` | `Integer` | Optional | “All data” | Integer getPreviousCreditLimit() | setPreviousCreditLimit(Integer previousCreditLimit) |
| `DateCreditLimitChange` | `String` | Optional | format of YYYY-MM-DD<br>Default value of '9998-12-31' | String getDateCreditLimitChange() | setDateCreditLimitChange(String dateCreditLimitChange) |
| `PortfolioName` | `String` | Optional | Portfolio Name Assigned by Experian with Source code | String getPortfolioName() | setPortfolioName(String portfolioName) |
| `YearBusinessStart` | `Integer` | Optional | YYYY. | Integer getYearBusinessStart() | setYearBusinessStart(Integer yearBusinessStart) |
| `NumberCreditCard` | `Integer` | Optional | Total Number of Credit Cards for Business Add total volume of credit cards | Integer getNumberCreditCard() | setNumberCreditCard(Integer numberCreditCard) |
| `PreviousRejection1` | `Integer` | Optional | 0 - No unpaid transactions<br>1 - Unpaid transactions<br>Only available to Current Account User Group within the CAIS data sharing program. | Integer getPreviousRejection1() | setPreviousRejection1(Integer previousRejection1) |
| `PreviousRejection2` | `Integer` | Optional | 0 - No unpaid transactions<br>1 - Unpaid transactions<br>Only available to Current Account User Group within the CAIS data sharing program. | Integer getPreviousRejection2() | setPreviousRejection2(Integer previousRejection2) |
| `DateContactChange` | `String` | Optional | YYYY-MM-DD | String getDateContactChange() | setDateContactChange(String dateContactChange) |
| `ContactTel` | `String` | Optional | “Own Data” | String getContactTel() | setContactTel(String contactTel) |
| `ParentRegNum` | `String` | Optional | “Own Data” | String getParentRegNum() | setParentRegNum(String parentRegNum) |
| `ParentTel` | `String` | Optional | “Own Data” | String getParentTel() | setParentTel(String parentTel) |
| `ParentVATNum` | `String` | Optional | “Own Data” | String getParentVATNum() | setParentVATNum(String parentVATNum) |
| `DateBusinessInfoChange` | `String` | Optional | YYYY-MM-DD<br>"Own Data" | String getDateBusinessInfoChange() | setDateBusinessInfoChange(String dateBusinessInfoChange) |
| `DateBusinessNameAddressChange` | `String` | Optional | Date when A flag is dropped from Flag Settings. YYYY-MM-DD<br>"Own Data" | String getDateBusinessNameAddressChange() | setDateBusinessNameAddressChange(String dateBusinessNameAddressChange) |
| `DateArrangeEnd` | `String` | Optional | - | String getDateArrangeEnd() | setDateArrangeEnd(String dateArrangeEnd) |
| `DateQueryEnd` | `String` | Optional | Date when flag setting Q is dropped.<br>CCYY-MM-DD | String getDateQueryEnd() | setDateQueryEnd(String dateQueryEnd) |
| `DateClaimEnd` | `String` | Optional | Date when flag setting I is dropped<br>CCYY-MM_DD | String getDateClaimEnd() | setDateClaimEnd(String dateClaimEnd) |
| `PreviousBusinessName` | `String` | Optional | “Own Data”<br>45 bytes max | String getPreviousBusinessName() | setPreviousBusinessName(String previousBusinessName) |
| `ParentBusinessName` | `String` | Optional | “Own Data” 175 bytes max in total for these fields | String getParentBusinessName() | setParentBusinessName(String parentBusinessName) |
| `ParentLocation` | [`LtdBusinessLocation`](../../doc/models/ltd-business-location.md) | Optional | - | LtdBusinessLocation getParentLocation() | setParentLocation(LtdBusinessLocation parentLocation) |
| `PreviousLocation` | [`LtdBusinessLocation`](../../doc/models/ltd-business-location.md) | Optional | - | LtdBusinessLocation getPreviousLocation() | setPreviousLocation(LtdBusinessLocation previousLocation) |
| `BusinessWebsite` | `String` | Optional | “Own Data”<br>Max 100 bytes | String getBusinessWebsite() | setBusinessWebsite(String businessWebsite) |
| `ContactEmail` | `String` | Optional | “Own Data”<br>Max 100 bytes | String getContactEmail() | setContactEmail(String contactEmail) |
| `CurrentDirectors` | `Integer` | Optional | Number of Commercial CAIS Director blocks being returned for this CAIS record | Integer getCurrentDirectors() | setCurrentDirectors(Integer currentDirectors) |
| `CommercialCAISDirector` | [`List<CommercialCAISDirector>`](../../doc/models/commercial-cais-director.md) | Optional | - | List<CommercialCAISDirector> getCommercialCAISDirector() | setCommercialCAISDirector(List<CommercialCAISDirector> commercialCAISDirector) |

## Example (as JSON)

```json
{
  "AccountState": null,
  "AccountStatus12": null,
  "AccountType": null,
  "AgreemtNum": null,
  "CaisLastUpdate": null,
  "CompanyType": null,
  "CurrentBalance": null,
  "DefaultBalance": null,
  "DefaultDate": null,
  "MonthsData": null,
  "SettlementDate": null,
  "Status1To2": null,
  "Status3To9": null,
  "SourceCode": null,
  "AccountNumber": null,
  "PrimaryAccountIndicator": null,
  "RepayPeriod": null,
  "BalanceType": null,
  "PreviousStatementBalance": null,
  "PreviousStatementIndicator": null,
  "PaymentFrequency": null,
  "PaymentAmount": null,
  "PaymentIndicator": null,
  "PaymentCode": null,
  "PaymentType": null,
  "CreditLimit": null,
  "CreditTurnover": null,
  "NumberCashAdvances": null,
  "PromotionActivity": null,
  "Rejection": null,
  "MortgageFlag": null,
  "ValueCashAdvances": null,
  "FlagSetting": null,
  "BestCAISStatus": null,
  "AccountStartDate": null,
  "WorstCurrentStatus": null,
  "WorstHistoricalStatus": null,
  "WorstStatus": null,
  "CollectionDate": null,
  "OwnDataFlag": null,
  "Airtime": null,
  "NoticeOfCorrectionRef": null,
  "BusinessName": null,
  "AdditionalTradeStyle": null,
  "VATNumber": null,
  "SICCode": null,
  "SICDescription1992": null,
  "NameChange": null,
  "Location": null,
  "BusinessTelNum": null,
  "BusinessAddressType": null,
  "BankSortCode": null,
  "ContactName": null,
  "ContactJob": null,
  "MonthlyPayment": null,
  "DateLastStatus": null,
  "DateFlagChange": null,
  "Debenture": null,
  "DateDebenture": null,
  "PreviousCreditLimit": null,
  "DateCreditLimitChange": null,
  "PortfolioName": null,
  "YearBusinessStart": null,
  "NumberCreditCard": null,
  "PreviousRejection1": null,
  "PreviousRejection2": null,
  "DateContactChange": null,
  "ContactTel": null,
  "ParentRegNum": null,
  "ParentTel": null,
  "ParentVATNum": null,
  "DateBusinessInfoChange": null,
  "DateBusinessNameAddressChange": null,
  "DateArrangeEnd": null,
  "DateQueryEnd": null,
  "DateClaimEnd": null,
  "PreviousBusinessName": null,
  "ParentBusinessName": null,
  "ParentLocation": null,
  "PreviousLocation": null,
  "BusinessWebsite": null,
  "ContactEmail": null,
  "CurrentDirectors": null,
  "CommercialCAISDirector": null
}
```

