
# Ltd Scoring Data

## Structure

`LtdScoringData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountingPeriod` | `Integer` | Optional | The accounting period for the latest accounts for the limited company in weeks Default value of -999 indicates not applicable= | Integer getAccountingPeriod() | setAccountingPeriod(Integer accountingPeriod) |
| `AcidTest` | `Double` | Optional | Value for Acid Test for the latest accounts for the limited company. Defaul -999999.9 | Double getAcidTest() | setAcidTest(Double acidTest) |
| `AgeMostRecentCCJ` | `Integer` | Optional | The number of months since the most recent County Court Judgement was registered against the limited company Fefault -999 | Integer getAgeMostRecentCCJ() | setAgeMostRecentCCJ(Integer ageMostRecentCCJ) |
| `AuditType` | `String` | Optional | Indicator showing the level of auditing provided - A = Auditors; C = Chartered accountant; D = Director | String getAuditType() | setAuditType(String auditType) |
| `AuditorsQualifications` | `String` | Optional | Indicator showing whether the auditor has made significant comments - 0 = No qualifications; 1 = Minor qualifications; 2 = Major qualifications; 3 = Major qualifications; X = No accounts | String getAuditorsQualifications() | setAuditorsQualifications(String auditorsQualifications) |
| `BaseTrendShareholdersFunds` | `Integer` | Optional | Indicator showing the Base Trend in Shareholders Funds= | Integer getBaseTrendShareholdersFunds() | setBaseTrendShareholdersFunds(Integer baseTrendShareholdersFunds) |
| `BorrowingRatio` | `Double` | Optional | Value for Borrowing Ratio for the latest accounts for the limited company (as percentage ZZZZZ.9) Defaul -999999.9 | Double getBorrowingRatio() | setBorrowingRatio(Double borrowingRatio) |
| `CapitalEmployed` | `Double` | Optional | Value for Capital Employed for the latest accounts for the limited company. Default -999999999999999 | Double getCapitalEmployed() | setCapitalEmployed(Double capitalEmployed) |
| `CapitalEmployedPercentTotalAssets` | `Double` | Optional | Value for Capital Employed as a percentage of Total Assets for the latest accounts for the limited company (as percentage ZZZZZ.9). Default -99999999.9 | Double getCapitalEmployedPercentTotalAssets() | setCapitalEmployedPercentTotalAssets(Double capitalEmployedPercentTotalAssets) |
| `CompanyAge` | `String` | Optional | The number of months (rounded up) since the date of incorporation of the limited company | String getCompanyAge() | setCompanyAge(String companyAge) |
| `CompanyClass` | `String` | Optional | Size classification for the limited company - S = Small sized company; M=  Medium sized company; L = Large sized company | String getCompanyClass() | setCompanyClass(String companyClass) |
| `ConsAccounts` | `String` | Optional | Indicator showing whether the latest accounts for the limited company are consolidated - Y = Consolidated; N = Not consolidated | String getConsAccounts() | setConsAccounts(String consAccounts) |
| `CreditPeriod` | `Double` | Optional | Value for Retained Profit for the latest accounts for the limited company. Default -9999999 | Double getCreditPeriod() | setCreditPeriod(Double creditPeriod) |
| `CurrAccsAvailabe` | `String` | Optional | Indicator showing whether current accounts are available for the limited company - Y = Current accounts available; N = Current accounts filed but unavailable; X = No accounts filed | String getCurrAccsAvailabe() | setCurrAccsAvailabe(String currAccsAvailabe) |
| `Currency` | `String` | Optional | Currency under which the latest accounts for the limited company have been reported - ISO currency code | String getCurrency() | setCurrency(String currency) |
| `CurrentLiabilitiesPercentTotalAssets` | `Double` | Optional | Value for Current Liabilities as a percentage of Total Assets for the latest accounts for the limited company (as percentage ZZZZZ.9) Default -99999999.9 | Double getCurrentLiabilitiesPercentTotalAssets() | setCurrentLiabilitiesPercentTotalAssets(Double currentLiabilitiesPercentTotalAssets) |
| `Currentratio` | `Double` | Optional | Value for Current Ratio for the latest accounts for the limited company. Default -999999.9 | Double getCurrentratio() | setCurrentratio(Double currentratio) |
| `DateOfAccounts` | `String` | Optional | Date of accounts (yyyy-mm-dd) | String getDateOfAccounts() | setDateOfAccounts(String dateOfAccounts) |
| `DebtGearing` | `Double` | Optional | Value for Debt Gearing for the latest accounts for the limited company (as percentage ZZZZZ.9) Defaul -999999.9 | Double getDebtGearing() | setDebtGearing(Double debtGearing) |
| `DirectorsCIFASFlag` | `String` | Optional | Indicator showing whether CIFAS information is available against any of the company directors - Y = Information detected; N = No information detected; BLANK = No entitlement to CIFAS | String getDirectorsCIFASFlag() | setDirectorsCIFASFlag(String directorsCIFASFlag) |
| `DirectorsNOCFlag` | `String` | Optional | Indicator showing whether a Notice of Correction has been filed against any of the company directors - Y = NOC filed; BLANK = No NOC filed | String getDirectorsNOCFlag() | setDirectorsNOCFlag(String directorsNOCFlag) |
| `Dividends` | `Double` | Optional | Value for Dividends for the latest accounts for the limited company. Default -999999999999999 | Double getDividends() | setDividends(Double dividends) |
| `DormancyFlag` | `String` | Optional | Indicator showing the dormancy status of the limited company - C = CRO dormancy; A = Dormant accounts; N = Company not dormant/ No accounts; Q = Quasi-dormant | String getDormancyFlag() | setDormancyFlag(String dormancyFlag) |
| `EquityGearing` | `Double` | Optional | Value for Equity Gearing for the latest accounts for the limited company (as percentage ZZZZZ.9) Defaul -999999.9 | Double getEquityGearing() | setEquityGearing(Double equityGearing) |
| `FicheDate` | `String` | Optional | The date that the accounts for the limited company became available at Companies House (yyyy-mm-dd) | String getFicheDate() | setFicheDate(String ficheDate) |
| `FiledAccsType` | `String` | Optional | Indicator of accounting method used to prepare the accounts - I = IFRS; G = GAAP | String getFiledAccsType() | setFiledAccsType(String filedAccsType) |
| `FixedAssets` | `Double` | Optional | Value for Fixed Assets for the latest accounts for the limited company. Default -999999999999999 | Double getFixedAssets() | setFixedAssets(Double fixedAssets) |
| `GrossAssets` | `Double` | Optional | Value for Gross Assets for the latest accounts for the limited company  Default -999999999999999 | Double getGrossAssets() | setGrossAssets(Double grossAssets) |
| `HasSubsidiaries` | `String` | Optional | Indicator showing whether the limited company has subsidiaries - Y = 1 or more subsidiaries; N = No subsidiaries | String getHasSubsidiaries() | setHasSubsidiaries(String hasSubsidiaries) |
| `HighestValueCCJ` | `Double` | Optional | The value of the highest value County Court Judgement registered against the limited company during the last 6 years | Double getHighestValueCCJ() | setHighestValueCCJ(Double highestValueCCJ) |
| `IncompleteDirsFlag` | `String` | Optional | Indicator showing whether full directors information is available from a Confirmation Statement, or information is available only from '288' directors change documents - Y = Confirmation Statement date is present; N = No Confirmation Statement date present | String getIncompleteDirsFlag() | setIncompleteDirsFlag(String incompleteDirsFlag) |
| `IntangibleAssets` | `Double` | Optional | Value for Intangible Assets for the latest accounts for the limited company  Default -999999999999999 | Double getIntangibleAssets() | setIntangibleAssets(Double intangibleAssets) |
| `IsSubsidiary` | `String` | Optional | Indicator showing whether the limited company is a subsidiary - 1 = No parent/ultimate; 2 = Same parent & ultimate; 3 = Different parent & ultimate | String getIsSubsidiary() | setIsSubsidiary(String isSubsidiary) |
| `IssuedCapital` | `Double` | Optional | Value for Issued Capital for the latest accounts for the limited company Default -999999999999999 | Double getIssuedCapital() | setIssuedCapital(Double issuedCapital) |
| `LastDerogatoryItem` | `String` | Optional | Specification of the type of the last Derogatory Item against the limited company - C = Receiver Appointment; D = Cessation of Receiver; E = Winding up Petition; F = Dismissal of Winding up Petition; G = Winding up Order; H = Voluntary Appointment of Liquidator; I = Meeting of Creditors; J = Resolution to Wind Up; K = Intentions to Dissolve; L = Dissolution ; M = Reinstatement; Q = Administrator Appointed; R = Administrator Dismissal; S = Approval of Voluntary Arrangement; T = Completion of Voluntary Arrangement; U = Compulsory Appointment of Liquidator; V = Revocations of Voluntary Arrangement; W = Suspension of Voluntary Arrangement; X = Intention to Dissolve Discontinued; BLANK = Not Applicable | String getLastDerogatoryItem() | setLastDerogatoryItem(String lastDerogatoryItem) |
| `LatenessAccounts` | `String` | Optional | The number of whole months by which the accounts for the limited company are overdue - Positive Number = Late Accounts; Negative Number = Accounts Not Yet Due. Default -999 | String getLatenessAccounts() | setLatenessAccounts(String latenessAccounts) |
| `LatestAccountsType` | `String` | Optional | Indicator showing the type of accounts - 0 = Type not available; 1 = Full accounts; 2 = Small company; 3 = Medium company; 4 = Group; 5 = Dormant; 6 = Interim; 7 = Initial; 8 = Total exemption (Full); 9 = Total exemption (Small); A = Partial exemption G = Micro-Entities Accounts; E = Audit Exemption Subsidiary; F = Filing Exemption Subsidiary; Z = None of the above | String getLatestAccountsType() | setLatestAccountsType(String latestAccountsType) |
| `LegalStatus` | `String` | Optional | The legal status of the limited company - ' ' = Blank;  1 = Private Unlimited; 2 = Private Limited;  3 = PLC; 4 = Old Public Company; 5 = Private Company Limited by Guarantee (Exempt from using word 'Limited'); 6 = Limited Partnership; 7 = Private Limited Company Without Share Capital; 8 = Company Converted / Closed; 9 = Private Unlimited Company Without Share Capital;  0 = Other; A = Private Company Limited by Shares (Exempt from using word 'Limited'); When the Company Number Prefix = CI or SL, there are 3 flags as follows - 1 = ICVC (Securities); 2 = ICVC (Warrant); 3 = ICVC (Umbrella) | String getLegalStatus() | setLegalStatus(String legalStatus) |
| `LimitedCompanyDelphiPayment` | [`List<LimitedCompanyDelphiPayment>`](../../doc/models/limited-company-delphi-payment.md) | Optional | - | List<LimitedCompanyDelphiPayment> getLimitedCompanyDelphiPayment() | setLimitedCompanyDelphiPayment(List<LimitedCompanyDelphiPayment> limitedCompanyDelphiPayment) |
| `LimitedCompanyDelphiRisk` | [`List<LimitedCompanyDelphiRisk>`](../../doc/models/limited-company-delphi-risk.md) | Optional | - | List<LimitedCompanyDelphiRisk> getLimitedCompanyDelphiRisk() | setLimitedCompanyDelphiRisk(List<LimitedCompanyDelphiRisk> limitedCompanyDelphiRisk) |
| `LimitedCompanyDelphiCAIS` | [`LimitedCompanyDelphiCAIS`](../../doc/models/limited-company-delphi-cais.md) | Optional | - | LimitedCompanyDelphiCAIS getLimitedCompanyDelphiCAIS() | setLimitedCompanyDelphiCAIS(LimitedCompanyDelphiCAIS limitedCompanyDelphiCAIS) |
| `LiquidityStandardRatio` | `Double` | Optional | Value for Liquidity Standard Ratio for the latest accounts for the limited company. Default -999999.9 | Double getLiquidityStandardRatio() | setLiquidityStandardRatio(Double liquidityStandardRatio) |
| `NetWorth` | `Double` | Optional | Value for Net Worth for the latest accounts for the limited company  Default -999999999999999 | Double getNetWorth() | setNetWorth(Double netWorth) |
| `NumAppointmentsLast12` | `Double` | Optional | The number of appointments during the last 12 months, expressed as a percentage of the number of directors of the current board | Double getNumAppointmentsLast12() | setNumAppointmentsLast12(Double numAppointmentsLast12) |
| `NumApprovalVolArrangement` | `Integer` | Optional | The number of voluntary arrangements that have been approved for the limited company | Integer getNumApprovalVolArrangement() | setNumApprovalVolArrangement(Integer numApprovalVolArrangement) |
| `NumApptAdministrator` | `Integer` | Optional | The number of appointments of administrators to the limited company | Integer getNumApptAdministrator() | setNumApptAdministrator(Integer numApptAdministrator) |
| `NumApptCompLiquidator` | `Integer` | Optional | The number of compulsory appointments of a liquidator to the limited company | Integer getNumApptCompLiquidator() | setNumApptCompLiquidator(Integer numApptCompLiquidator) |
| `NumApptReceiver` | `Integer` | Optional | The number of appointments of a receiver or administrative receiver to the limited company | Integer getNumApptReceiver() | setNumApptReceiver(Integer numApptReceiver) |
| `NumApptVolLiquidator` | `Integer` | Optional | The number of voluntary appointments of a liquidator to the limited company | Integer getNumApptVolLiquidator() | setNumApptVolLiquidator(Integer numApptVolLiquidator) |
| `NumCompanyDissolved` | `Integer` | Optional | The number of dissolution notices against the limited company | Integer getNumCompanyDissolved() | setNumCompanyDissolved(Integer numCompanyDissolved) |
| `NumCompanyReinstated` | `Integer` | Optional | The number of reinstated notices against the limited company | Integer getNumCompanyReinstated() | setNumCompanyReinstated(Integer numCompanyReinstated) |
| `NumCompletionsVolArrangement` | `Integer` | Optional | The number of voluntary arrangements that have been completed by the limited company | Integer getNumCompletionsVolArrangement() | setNumCompletionsVolArrangement(Integer numCompletionsVolArrangement) |
| `NumCurrDirs` | `Integer` | Optional | The number of current directors for the limited company | Integer getNumCurrDirs() | setNumCurrDirs(Integer numCurrDirs) |
| `NumDirsHoldingShares` | `Integer` | Optional | The number of directors holding shares in the limited company | Integer getNumDirsHoldingShares() | setNumDirsHoldingShares(Integer numDirsHoldingShares) |
| `NumDirsIncorpAgents` | `Integer` | Optional | The number of current directors of the limited company that act as incorporation agents | Integer getNumDirsIncorpAgents() | setNumDirsIncorpAgents(Integer numDirsIncorpAgents) |
| `NumDischargeAdministrator` | `Integer` | Optional | The number of discharges of administrators from the limited company | Integer getNumDischargeAdministrator() | setNumDischargeAdministrator(Integer numDischargeAdministrator) |
| `NumDismissedPetition` | `Integer` | Optional | The number of dismissals of winding up petitions recorded against the limited company | Integer getNumDismissedPetition() | setNumDismissedPetition(Integer numDismissedPetition) |
| `NumDisqCurrDirs` | `Integer` | Optional | The number of current directors of the limited company that are disqualified directors | Integer getNumDisqCurrDirs() | setNumDisqCurrDirs(Integer numDisqCurrDirs) |
| `NumEmployees` | `Double` | Optional | The number of employees for the limited company | Double getNumEmployees() | setNumEmployees(Double numEmployees) |
| `NumIntentionToDissolve` | `Integer` | Optional | The number of notices of intention to dissolve the company by Companies House | Integer getNumIntentionToDissolve() | setNumIntentionToDissolve(Integer numIntentionToDissolve) |
| `NumMeetingsCreditors` | `Integer` | Optional | The number of meeting of creditors registered against the limited company | Integer getNumMeetingsCreditors() | setNumMeetingsCreditors(Integer numMeetingsCreditors) |
| `NumMemArtsChangesLast12Months` | `Integer` | Optional | The number of changes to the memorandum and / or articles of association for the limited company in the last 12 months | Integer getNumMemArtsChangesLast12Months() | setNumMemArtsChangesLast12Months(Integer numMemArtsChangesLast12Months) |
| `NumPetitionCompWindUp` | `Integer` | Optional | The number of winding up petitions presented against the limited company | Integer getNumPetitionCompWindUp() | setNumPetitionCompWindUp(Integer numPetitionCompWindUp) |
| `NumReceiverCeasing` | `Integer` | Optional | The number of cessations of a receiver or administrative receiver from the limited company | Integer getNumReceiverCeasing() | setNumReceiverCeasing(Integer numReceiverCeasing) |
| `NumRegOfficeChangesLast12Months` | `Integer` | Optional | The number of changes to the Registered Office for the limited company in the last 12 months | Integer getNumRegOfficeChangesLast12Months() | setNumRegOfficeChangesLast12Months(Integer numRegOfficeChangesLast12Months) |
| `NumResolutionWindUp` | `Integer` | Optional | The number of resolutions to wind up the limited company | Integer getNumResolutionWindUp() | setNumResolutionWindUp(Integer numResolutionWindUp) |
| `NumRevocationVoluntaryArrangement` | `Integer` | Optional | The number of voluntary arrangements that have been revoked for the limited company | Integer getNumRevocationVoluntaryArrangement() | setNumRevocationVoluntaryArrangement(Integer numRevocationVoluntaryArrangement) |
| `NumSatMortgages` | `Integer` | Optional | The total number of wholly satisfied mortgages and charges for the limited company | Integer getNumSatMortgages() | setNumSatMortgages(Integer numSatMortgages) |
| `NumSuspensionVolArrangement` | `Integer` | Optional | The number of voluntary arrangements that have been suspended for the limited company | Integer getNumSuspensionVolArrangement() | setNumSuspensionVolArrangement(Integer numSuspensionVolArrangement) |
| `NumUnsatMortgages` | `Integer` | Optional | The total number of wholly unsatisfied mortgages and charges for the limited company | Integer getNumUnsatMortgages() | setNumUnsatMortgages(Integer numUnsatMortgages) |
| `NumUnsatPartSatMortgages` | `Integer` | Optional | The total number of unsatisfied and partially satisfied mortgages and charges for the limited company | Integer getNumUnsatPartSatMortgages() | setNumUnsatPartSatMortgages(Integer numUnsatPartSatMortgages) |
| `NumWindUpOrders` | `Integer` | Optional | The number of winding up orders registered against the limited company. | Integer getNumWindUpOrders() | setNumWindUpOrders(Integer numWindUpOrders) |
| `NumYearsAccosAvailable` | `Integer` | Optional | The number of years of accounts available for the limited company | Integer getNumYearsAccosAvailable() | setNumYearsAccosAvailable(Integer numYearsAccosAvailable) |
| `NumYearsPreTaxProfitLessThan0Last4Years` | `Integer` | Optional | Value for Number of Years in the last 4 where the Pre-Tax Profit has been less than zero | Integer getNumYearsPreTaxProfitLessThan0Last4Years() | setNumYearsPreTaxProfitLessThan0Last4Years(Integer numYearsPreTaxProfitLessThan0Last4Years) |
| `NumberCCJs0To72` | `Integer` | Optional | The number of County Court Judgements registered against the limited company during the last 6 years | Integer getNumberCCJs0To72() | setNumberCCJs0To72(Integer numberCCJs0To72) |
| `NumberCCJs13To24` | `Integer` | Optional | The number of County Court Judgements registered against the limited company between 12 and 24 months ago | Integer getNumberCCJs13To24() | setNumberCCJs13To24(Integer numberCCJs13To24) |
| `NumberCCJs25To36` | `Integer` | Optional | The number of County Court Judgements registered against the limited company between 24 and 36 months ago | Integer getNumberCCJs25To36() | setNumberCCJs25To36(Integer numberCCJs25To36) |
| `NumberCCJs37To48` | `Integer` | Optional | The number of County Court Judgements registered against the limited company between 36 and 48 months ago | Integer getNumberCCJs37To48() | setNumberCCJs37To48(Integer numberCCJs37To48) |
| `NumberCCJs49To60` | `Integer` | Optional | The number of County Court Judgements registered against the limited company between 48 and 60 months ago | Integer getNumberCCJs49To60() | setNumberCCJs49To60(Integer numberCCJs49To60) |
| `NumberCCJs61To72` | `Integer` | Optional | The number of County Court Judgements registered against the limited company between 60 and 72 months ago | Integer getNumberCCJs61To72() | setNumberCCJs61To72(Integer numberCCJs61To72) |
| `NumberCCJsLast12Months` | `Integer` | Optional | The number of County Court Judgements registered against the limited company during the last 12 months | Integer getNumberCCJsLast12Months() | setNumberCCJsLast12Months(Integer numberCCJsLast12Months) |
| `NumberDaysToFile` | `Integer` | Optional | The number of days between the accounting date of latest filed accounts for the limited company and the date recorded at Companies House. Default -999 | Integer getNumberDaysToFile() | setNumberDaysToFile(Integer numberDaysToFile) |
| `OldestCurrDirAge` | `Integer` | Optional | The age in years of the oldest current director of the limited company. Default -999 | Integer getOldestCurrDirAge() | setOldestCurrDirAge(Integer oldestCurrDirAge) |
| `OutOfDateFlag` | `String` | Optional | Indicator showing whether more recent accounts for the limited company have been filed at Companies House - Y = Accounts are out of date; N = Accounts are not out of date | String getOutOfDateFlag() | setOutOfDateFlag(String outOfDateFlag) |
| `PercentChangeCapitalEmployed` | `Double` | Optional | Value for percentage change of Capital Employed between the latest accounts and the previous accounts for the limited company (as percentage ZZZZZ.9). Default -999999.9 | Double getPercentChangeCapitalEmployed() | setPercentChangeCapitalEmployed(Double percentChangeCapitalEmployed) |
| `PercentChangeCurrentRatio` | `Double` | Optional | Value for percentage change of Current Ratio between the latest accounts and the previous accounts for the limited company (as percentage ZZZZZ.9) Default  -999999.9 | Double getPercentChangeCurrentRatio() | setPercentChangeCurrentRatio(Double percentChangeCurrentRatio) |
| `PercentChangePreTaxProfitLoss` | `Double` | Optional | Value for percentage change of Pre-Tax Profit Loss between the latest accounts and the previous accounts for the limited company (as percentage ZZZZZ.9) | Double getPercentChangePreTaxProfitLoss() | setPercentChangePreTaxProfitLoss(Double percentChangePreTaxProfitLoss) |
| `PercentChangeShareholdersFunds` | `Double` | Optional | Value for percentage change of Shareholders Funds between the latest accounts and the previous accounts for the limited company (as percentage ZZZZZ.9) Default  -999999.9 | Double getPercentChangeShareholdersFunds() | setPercentChangeShareholdersFunds(Double percentChangeShareholdersFunds) |
| `PercentChangeTotalAssets` | `Double` | Optional | Value for percentage change of Total Assets between the latest accounts and the previous accounts for the limited company (as percentage ZZZZZ.9) Default  -999999.9 | Double getPercentChangeTotalAssets() | setPercentChangeTotalAssets(Double percentChangeTotalAssets) |
| `PercentageDirsResidentUK` | `Double` | Optional | The percentage of the current board of directors who are resident within the UK. Default -9999.9 | Double getPercentageDirsResidentUK() | setPercentageDirsResidentUK(Double percentageDirsResidentUK) |
| `PreTaxMarginQuartile` | `Integer` | Optional | Indicator showing the Pre-Tax Margin Quartile - 1 = Well above average; 2 = Above average; 3 = Below average; 4 = Well below average; Default 9 | Integer getPreTaxMarginQuartile() | setPreTaxMarginQuartile(Integer preTaxMarginQuartile) |
| `PreTaxProfitLoss` | `Double` | Optional | Value for Pre-Tax Profit Loss for the latest accounts for the limited company  Default -999999999999999 | Double getPreTaxProfitLoss() | setPreTaxProfitLoss(Double preTaxProfitLoss) |
| `PreTaxProfitMargin` | `Double` | Optional | Value for Pre-Tax Profit Loss for the latest accounts for the limited company (as percentage ZZZZZ.9) Defaul -999999.9 | Double getPreTaxProfitMargin() | setPreTaxProfitMargin(Double preTaxProfitMargin) |
| `PrevAccountsDormancyFlag` | `String` | Optional | Indicator showing the dormancy status of the limited company at the previous accounts - C = CRO dormancy; A = Dormant accounts; N = Company not dormant/ No accounts; Q = Quasi-dormant | String getPrevAccountsDormancyFlag() | setPrevAccountsDormancyFlag(String prevAccountsDormancyFlag) |
| `PrevAccsAvailabile` | `String` | Optional | Indicator showing whether previous accounts are available for the limited company - Y = Previous accounts available; N = Previous accounts filed but unavailable; X = No previous accounts filed | String getPrevAccsAvailabile() | setPrevAccsAvailabile(String prevAccsAvailabile) |
| `PrevAccsConsAccounts` | `String` | Optional | Indicator showing whether the previous accounts for the limited company were consolidated - Y = Consolidated; N = Not consolidated | String getPrevAccsConsAccounts() | setPrevAccsConsAccounts(String prevAccsConsAccounts) |
| `PrevAccsCurrency` | `String` | Optional | Currency under which the previous accounts for the limited company have been reported - ISO currency code | String getPrevAccsCurrency() | setPrevAccsCurrency(String prevAccsCurrency) |
| `ProportionCurrDirsToPrevDirLast12` | `Double` | Optional | The number of current directors expressed as a proportion of the number of directors who have resigned during the last 12 months | Double getProportionCurrDirsToPrevDirLast12() | setProportionCurrDirsToPrevDirLast12(Double proportionCurrDirsToPrevDirLast12) |
| `RegOfficeCIFASIndicator` | `String` | Optional | Indicator showing whether CIFAS information is available at the companies registered office - Y = Information detected; N = No information detected; BLANK = No entitlement to CIFAS | String getRegOfficeCIFASIndicator() | setRegOfficeCIFASIndicator(String regOfficeCIFASIndicator) |
| `Region` | `String` | Optional | The regional location for the limited company provided by the initial Alpha Numeric of the post code | String getRegion() | setRegion(String region) |
| `ReportUpdateFlag` | `String` | Optional | Indicator showing Commercial Delphi Report Update Flag - 0 = No Update Available; 1 = More Recent Accounts Filed; 2 = Accounts Imbalanced; 3 = Auditors Qualification Level 2; 4 = Foreign Currency | String getReportUpdateFlag() | setReportUpdateFlag(String reportUpdateFlag) |
| `RetainedEarnings` | `Double` | Optional | Value for Retained Earnings for the latest accounts for the limited company Default -999999999999999 | Double getRetainedEarnings() | setRetainedEarnings(Double retainedEarnings) |
| `RetainedProfit` | `Double` | Optional | Value for Retained Profit for the latest accounts for the limited company  Default -999999999999999 | Double getRetainedProfit() | setRetainedProfit(Double retainedProfit) |
| `ReturnOnAssets` | `Double` | Optional | Value for Return On Assets for the latest accounts for the limited company (as percentage ZZZZZ.9) Defaul -999999.9 | Double getReturnOnAssets() | setReturnOnAssets(Double returnOnAssets) |
| `ReturnOnAssetsQuartile` | `Integer` | Optional | Indicator showing the Return On Assets Quartile - 1 = Well above average; 2 = Above average; 3 = Below average; 4 = Well below average; Default 9 | Integer getReturnOnAssetsQuartile() | setReturnOnAssetsQuartile(Integer returnOnAssetsQuartile) |
| `ReturnOnCapital` | `Double` | Optional | Value for Return On Capital for the latest accounts for the limited company (as percentage ZZZZZ.9) Defaul -999999.9 | Double getReturnOnCapital() | setReturnOnCapital(Double returnOnCapital) |
| `RevaluationReserves` | `Double` | Optional | Value for Revaluation Reserves for the latest accounts for the limited company  Default -999999999999999 | Double getRevaluationReserves() | setRevaluationReserves(Double revaluationReserves) |
| `SICInformation1980` | [`SICInfo1980`](../../doc/models/sic-info-1980.md) | Optional | - | SICInfo1980 getSICInformation1980() | setSICInformation1980(SICInfo1980 sICInformation1980) |
| `SICInformation1992` | [`SICInfo1992`](../../doc/models/sic-info-1992.md) | Optional | - | SICInfo1992 getSICInformation1992() | setSICInformation1992(SICInfo1992 sICInformation1992) |
| `ShareholdersFunds` | `Double` | Optional | Value for Shareholders Funds for the latest accounts for the limited company  Default -999999999999999 | Double getShareholdersFunds() | setShareholdersFunds(Double shareholdersFunds) |
| `ShortLoans` | `Double` | Optional | Value for Short Term Loans for the latest accounts for the limited company Default -999999999999999 | Double getShortLoans() | setShortLoans(Double shortLoans) |
| `StocksWorkInProgressPercentCurrentAssets` | `Double` | Optional | Value for Stocks Work In Progress as a percentage of Current Assets for the latest accounts for the limited company (as percentage ZZZZZ.9) | Double getStocksWorkInProgressPercentCurrentAssets() | setStocksWorkInProgressPercentCurrentAssets(Double stocksWorkInProgressPercentCurrentAssets) |
| `TimeSinceLastAccsSubmitted` | `Integer` | Optional | The number of months since the last accounts for the limited company were filed at Companies House. Default -99999 | Integer getTimeSinceLastAccsSubmitted() | setTimeSinceLastAccsSubmitted(Integer timeSinceLastAccsSubmitted) |
| `TimeSinceLastApprovalVolArrangement` | `Double` | Optional | The number of months since the last voluntary arrangement has been approved for the limited company. Default -99999 | Double getTimeSinceLastApprovalVolArrangement() | setTimeSinceLastApprovalVolArrangement(Double timeSinceLastApprovalVolArrangement) |
| `TimeSinceLastApptAdministrator` | `Double` | Optional | The number of months since the date of the last appointment of an administrator to the limited company  Default -99999 | Double getTimeSinceLastApptAdministrator() | setTimeSinceLastApptAdministrator(Double timeSinceLastApptAdministrator) |
| `TimeSinceLastApptCompLiquidator` | `Double` | Optional | The number of months since the last compulsory appointment of a liquidator to the limited company  Default -99999 | Double getTimeSinceLastApptCompLiquidator() | setTimeSinceLastApptCompLiquidator(Double timeSinceLastApptCompLiquidator) |
| `TimeSinceLastApptReceiver` | `Double` | Optional | The number of months since the last appointment of a receiver or administrative receiver to the limited company  Default -99999 | Double getTimeSinceLastApptReceiver() | setTimeSinceLastApptReceiver(Double timeSinceLastApptReceiver) |
| `TimeSinceLastApptVolLiquidator` | `Double` | Optional | The number of months since the last voluntary appointment of a liquidator to the limited company. Default value of -99999 indicates not applicable | Double getTimeSinceLastApptVolLiquidator() | setTimeSinceLastApptVolLiquidator(Double timeSinceLastApptVolLiquidator) |
| `TimeSinceLastCompanyDissolved` | `Double` | Optional | The number of months since the last dissolution notice against the limited company | Double getTimeSinceLastCompanyDissolved() | setTimeSinceLastCompanyDissolved(Double timeSinceLastCompanyDissolved) |
| `TimeSinceLastCompanyReinstated` | `Double` | Optional | The number of months since the last reinstated notice against the limited company  Default -99999 | Double getTimeSinceLastCompanyReinstated() | setTimeSinceLastCompanyReinstated(Double timeSinceLastCompanyReinstated) |
| `TimeSinceLastCompletionVolArrangement` | `Double` | Optional | The number of months since the last voluntary arrangement has been completed by the limited company  Default -99999 | Double getTimeSinceLastCompletionVolArrangement() | setTimeSinceLastCompletionVolArrangement(Double timeSinceLastCompletionVolArrangement) |
| `TimeSinceLastDerogatoryItem` | `Double` | Optional | The number of months since the date of the latest derogatory data item against the limited company  Default -99999 | Double getTimeSinceLastDerogatoryItem() | setTimeSinceLastDerogatoryItem(Double timeSinceLastDerogatoryItem) |
| `TimeSinceLastDirAppt` | `Integer` | Optional | The number of months since the last appointment of a director to the limited company | Integer getTimeSinceLastDirAppt() | setTimeSinceLastDirAppt(Integer timeSinceLastDirAppt) |
| `TimeSinceLastDischargeAdministrator` | `Double` | Optional | The number of months since the last discharge of an administrator from the limited company  Default -99999 | Double getTimeSinceLastDischargeAdministrator() | setTimeSinceLastDischargeAdministrator(Double timeSinceLastDischargeAdministrator) |
| `TimeSinceLastDismissedPetition` | `Double` | Optional | The number of months since the date of the last dismissal of a winding up petition registered against the limited company  Default -99999 | Double getTimeSinceLastDismissedPetition() | setTimeSinceLastDismissedPetition(Double timeSinceLastDismissedPetition) |
| `TimeSinceLastIntentionToDissolve` | `Double` | Optional | The number of months since the last intention to dissolve the company by Companies House  Default -99999 | Double getTimeSinceLastIntentionToDissolve() | setTimeSinceLastIntentionToDissolve(Double timeSinceLastIntentionToDissolve) |
| `TimeSinceLastMeetingCreditors` | `Double` | Optional | The number of months since the date of the last meeting of creditors of the limited company Default value of -99999 indicates not applicable | Double getTimeSinceLastMeetingCreditors() | setTimeSinceLastMeetingCreditors(Double timeSinceLastMeetingCreditors) |
| `TimeSinceLastPetitionCompWindUp` | `Double` | Optional | The number of months since the date of the last winding up petition against the limited company  Default -99999 | Double getTimeSinceLastPetitionCompWindUp() | setTimeSinceLastPetitionCompWindUp(Double timeSinceLastPetitionCompWindUp) |
| `TimeSinceLastReceiverCeasing` | `Double` | Optional | The number of months since the last cessation of a receiver of administrative receiver from the limited company  Default -99999 | Double getTimeSinceLastReceiverCeasing() | setTimeSinceLastReceiverCeasing(Double timeSinceLastReceiverCeasing) |
| `TimeSinceLastRegOfficeChange` | `Integer` | Optional | The number of months since the last change to the Registered Office for the limited company. Default-99999 | Integer getTimeSinceLastRegOfficeChange() | setTimeSinceLastRegOfficeChange(Integer timeSinceLastRegOfficeChange) |
| `TimeSinceLastResolutionWindUp` | `Double` | Optional | The number of months since the date of the last resolution to wind up the limited company  Default -99999 | Double getTimeSinceLastResolutionWindUp() | setTimeSinceLastResolutionWindUp(Double timeSinceLastResolutionWindUp) |
| `TimeSinceLastRetsSubmitted` | `Integer` | Optional | The number of months since the last Confirmation Statement for the limited company was filed at Companies House. Default -99999 | Integer getTimeSinceLastRetsSubmitted() | setTimeSinceLastRetsSubmitted(Integer timeSinceLastRetsSubmitted) |
| `TimeSinceLastRevocationVolArrangement` | `Double` | Optional | The number of months since the last voluntary arrangement has been revoked for the limited company  Default -99999 | Double getTimeSinceLastRevocationVolArrangement() | setTimeSinceLastRevocationVolArrangement(Double timeSinceLastRevocationVolArrangement) |
| `TimeSinceLastSuspensionVolArrangement` | `Double` | Optional | The number of months since the last voluntary arrangement has been suspended for the limited company  Default -99999 | Double getTimeSinceLastSuspensionVolArrangement() | setTimeSinceLastSuspensionVolArrangement(Double timeSinceLastSuspensionVolArrangement) |
| `TimeSinceLastWindUpHearing` | `Integer` | Optional | The number of months since the date of the latest Winding Up hearing for the limited company. Default -99999 | Integer getTimeSinceLastWindUpHearing() | setTimeSinceLastWindUpHearing(Integer timeSinceLastWindUpHearing) |
| `TimeSinceLastWindUpOrder` | `Double` | Optional | The number of months since the last winding up order against the limited company. Default value of -99999 indicates not applicable | Double getTimeSinceLastWindUpOrder() | setTimeSinceLastWindUpOrder(Double timeSinceLastWindUpOrder) |
| `TotAssetsEmp` | `Double` | Optional | Value for Turnover per Employee for the latest accounts for the limited company. Default -999999.9 | Double getTotAssetsEmp() | setTotAssetsEmp(Double totAssetsEmp) |
| `TotValCCJsPropShareFunds` | `Double` | Optional | The value of all County Court Judgements registered against the limited company as a proportion of Shareholders' Funds. Default -999999.900 | Double getTotValCCJsPropShareFunds() | setTotValCCJsPropShareFunds(Double totValCCJsPropShareFunds) |
| `TotalAssets` | `Double` | Optional | Value for Total Assets for the latest accounts for the limited company  Default -999999999999999 | Double getTotalAssets() | setTotalAssets(Double totalAssets) |
| `TotalCurrentAssets` | `Double` | Optional | Value for Total Current Assets for the latest accounts for the limited company  Default -999999999999999 | Double getTotalCurrentAssets() | setTotalCurrentAssets(Double totalCurrentAssets) |
| `TotalCurrentLiabilities` | `Double` | Optional | Value for Total Current Liabilities for the latest accounts for the limited company Default -999999999999999 | Double getTotalCurrentLiabilities() | setTotalCurrentLiabilities(Double totalCurrentLiabilities) |
| `TotalFixedAssetsPercentTotalAssets` | `Double` | Optional | Value for Total Fixed Assets as a percentage of Total Assets for the latest accounts for the limited company (as percentage ZZZZZ.9)  Default -99999999.9 | Double getTotalFixedAssetsPercentTotalAssets() | setTotalFixedAssetsPercentTotalAssets(Double totalFixedAssetsPercentTotalAssets) |
| `TotalLongTermLiabilities` | `Double` | Optional | Value for Total Long Term Liabilities for the latest accounts for the limited company  Default -999999999999999 | Double getTotalLongTermLiabilities() | setTotalLongTermLiabilities(Double totalLongTermLiabilities) |
| `TotalTurnover` | `Double` | Optional | Value for Total Turnover for the latest accounts for the limited company  Default -999999999999999 | Double getTotalTurnover() | setTotalTurnover(Double totalTurnover) |
| `TurnoverPerEmp` | `Double` | Optional | Value for Total Assets per Employee for the latest accounts for the limited company | Double getTurnoverPerEmp() | setTurnoverPerEmp(Double turnoverPerEmp) |
| `ValCCJsLast24MonthsPropShareFunds` | `Double` | Optional | The value of County Court Judgements registered against the limited company in the last 24 months as a proportion of Shareholders' Funds. Default -999999.900 | Double getValCCJsLast24MonthsPropShareFunds() | setValCCJsLast24MonthsPropShareFunds(Double valCCJsLast24MonthsPropShareFunds) |
| `ValueCCJs0To72` | `Double` | Optional | The value of County Court Judgements registered against the limited company during the last 6 years | Double getValueCCJs0To72() | setValueCCJs0To72(Double valueCCJs0To72) |
| `ValueCCJs13To24` | `Double` | Optional | The value of County Court Judgements registered against the limited company between 12 and 24 months ago | Double getValueCCJs13To24() | setValueCCJs13To24(Double valueCCJs13To24) |
| `ValueCCJs25To36` | `Double` | Optional | The value of County Court Judgements registered against the limited company between 24 and 36 months ago | Double getValueCCJs25To36() | setValueCCJs25To36(Double valueCCJs25To36) |
| `ValueCCJs37To48` | `Double` | Optional | The value of County Court Judgements registered against the limited company between 36 and 48 months ago | Double getValueCCJs37To48() | setValueCCJs37To48(Double valueCCJs37To48) |
| `ValueCCJs49To60` | `Double` | Optional | The value of County Court Judgements registered against the limited company between 48 and 60 months ago | Double getValueCCJs49To60() | setValueCCJs49To60(Double valueCCJs49To60) |
| `ValueCCJs61To72` | `Double` | Optional | The value of County Court Judgements registered against the limited company between 60 and 72 months ago | Double getValueCCJs61To72() | setValueCCJs61To72(Double valueCCJs61To72) |
| `ValueCCJsLast12Months` | `Double` | Optional | The value of County Court Judgements registered against the limited company during the last 12 months | Double getValueCCJsLast12Months() | setValueCCJsLast12Months(Double valueCCJsLast12Months) |
| `ValueMostRecentCCJ` | `Double` | Optional | The value of the most recent County Court Judgement registered against the limited company | Double getValueMostRecentCCJ() | setValueMostRecentCCJ(Double valueMostRecentCCJ) |
| `WorkingCapital` | `Double` | Optional | Value for Working Capital for the latest accounts for the limited company  Default -999999999999999 | Double getWorkingCapital() | setWorkingCapital(Double workingCapital) |
| `WorkingCapitalPercentCurrentPlusFixedAssets` | `Double` | Optional | Value for Working Capital as a percentage of (Current Assets plus Fixed Assets) for the latest accounts for the limited company (as percentage ZZZZZ.9) | Double getWorkingCapitalPercentCurrentPlusFixedAssets() | setWorkingCapitalPercentCurrentPlusFixedAssets(Double workingCapitalPercentCurrentPlusFixedAssets) |

## Example (as JSON)

```json
{
  "AccountingPeriod": null,
  "AcidTest": null,
  "AgeMostRecentCCJ": null,
  "AuditType": null,
  "AuditorsQualifications": null,
  "BaseTrendShareholdersFunds": null,
  "BorrowingRatio": null,
  "CapitalEmployed": null,
  "CapitalEmployedPercentTotalAssets": null,
  "CompanyAge": null,
  "CompanyClass": null,
  "ConsAccounts": null,
  "CreditPeriod": null,
  "CurrAccsAvailabe": null,
  "Currency": null,
  "CurrentLiabilitiesPercentTotalAssets": null,
  "Currentratio": null,
  "DateOfAccounts": null,
  "DebtGearing": null,
  "DirectorsCIFASFlag": null,
  "DirectorsNOCFlag": null,
  "Dividends": null,
  "DormancyFlag": null,
  "EquityGearing": null,
  "FicheDate": null,
  "FiledAccsType": null,
  "FixedAssets": null,
  "GrossAssets": null,
  "HasSubsidiaries": null,
  "HighestValueCCJ": null,
  "IncompleteDirsFlag": null,
  "IntangibleAssets": null,
  "IsSubsidiary": null,
  "IssuedCapital": null,
  "LastDerogatoryItem": null,
  "LatenessAccounts": null,
  "LatestAccountsType": null,
  "LegalStatus": null,
  "LimitedCompanyDelphiPayment": null,
  "LimitedCompanyDelphiRisk": null,
  "LimitedCompanyDelphiCAIS": null,
  "LiquidityStandardRatio": null,
  "NetWorth": null,
  "NumAppointmentsLast12": null,
  "NumApprovalVolArrangement": null,
  "NumApptAdministrator": null,
  "NumApptCompLiquidator": null,
  "NumApptReceiver": null,
  "NumApptVolLiquidator": null,
  "NumCompanyDissolved": null,
  "NumCompanyReinstated": null,
  "NumCompletionsVolArrangement": null,
  "NumCurrDirs": null,
  "NumDirsHoldingShares": null,
  "NumDirsIncorpAgents": null,
  "NumDischargeAdministrator": null,
  "NumDismissedPetition": null,
  "NumDisqCurrDirs": null,
  "NumEmployees": null,
  "NumIntentionToDissolve": null,
  "NumMeetingsCreditors": null,
  "NumMemArtsChangesLast12Months": null,
  "NumPetitionCompWindUp": null,
  "NumReceiverCeasing": null,
  "NumRegOfficeChangesLast12Months": null,
  "NumResolutionWindUp": null,
  "NumRevocationVoluntaryArrangement": null,
  "NumSatMortgages": null,
  "NumSuspensionVolArrangement": null,
  "NumUnsatMortgages": null,
  "NumUnsatPartSatMortgages": null,
  "NumWindUpOrders": null,
  "NumYearsAccosAvailable": null,
  "NumYearsPreTaxProfitLessThan0Last4Years": null,
  "NumberCCJs0To72": null,
  "NumberCCJs13To24": null,
  "NumberCCJs25To36": null,
  "NumberCCJs37To48": null,
  "NumberCCJs49To60": null,
  "NumberCCJs61To72": null,
  "NumberCCJsLast12Months": null,
  "NumberDaysToFile": null,
  "OldestCurrDirAge": null,
  "OutOfDateFlag": null,
  "PercentChangeCapitalEmployed": null,
  "PercentChangeCurrentRatio": null,
  "PercentChangePreTaxProfitLoss": null,
  "PercentChangeShareholdersFunds": null,
  "PercentChangeTotalAssets": null,
  "PercentageDirsResidentUK": null,
  "PreTaxMarginQuartile": null,
  "PreTaxProfitLoss": null,
  "PreTaxProfitMargin": null,
  "PrevAccountsDormancyFlag": null,
  "PrevAccsAvailabile": null,
  "PrevAccsConsAccounts": null,
  "PrevAccsCurrency": null,
  "ProportionCurrDirsToPrevDirLast12": null,
  "RegOfficeCIFASIndicator": null,
  "Region": null,
  "ReportUpdateFlag": null,
  "RetainedEarnings": null,
  "RetainedProfit": null,
  "ReturnOnAssets": null,
  "ReturnOnAssetsQuartile": null,
  "ReturnOnCapital": null,
  "RevaluationReserves": null,
  "SICInformation1980": null,
  "SICInformation1992": null,
  "ShareholdersFunds": null,
  "ShortLoans": null,
  "StocksWorkInProgressPercentCurrentAssets": null,
  "TimeSinceLastAccsSubmitted": null,
  "TimeSinceLastApprovalVolArrangement": null,
  "TimeSinceLastApptAdministrator": null,
  "TimeSinceLastApptCompLiquidator": null,
  "TimeSinceLastApptReceiver": null,
  "TimeSinceLastApptVolLiquidator": null,
  "TimeSinceLastCompanyDissolved": null,
  "TimeSinceLastCompanyReinstated": null,
  "TimeSinceLastCompletionVolArrangement": null,
  "TimeSinceLastDerogatoryItem": null,
  "TimeSinceLastDirAppt": null,
  "TimeSinceLastDischargeAdministrator": null,
  "TimeSinceLastDismissedPetition": null,
  "TimeSinceLastIntentionToDissolve": null,
  "TimeSinceLastMeetingCreditors": null,
  "TimeSinceLastPetitionCompWindUp": null,
  "TimeSinceLastReceiverCeasing": null,
  "TimeSinceLastRegOfficeChange": null,
  "TimeSinceLastResolutionWindUp": null,
  "TimeSinceLastRetsSubmitted": null,
  "TimeSinceLastRevocationVolArrangement": null,
  "TimeSinceLastSuspensionVolArrangement": null,
  "TimeSinceLastWindUpHearing": null,
  "TimeSinceLastWindUpOrder": null,
  "TotAssetsEmp": null,
  "TotValCCJsPropShareFunds": null,
  "TotalAssets": null,
  "TotalCurrentAssets": null,
  "TotalCurrentLiabilities": null,
  "TotalFixedAssetsPercentTotalAssets": null,
  "TotalLongTermLiabilities": null,
  "TotalTurnover": null,
  "TurnoverPerEmp": null,
  "ValCCJsLast24MonthsPropShareFunds": null,
  "ValueCCJs0To72": null,
  "ValueCCJs13To24": null,
  "ValueCCJs25To36": null,
  "ValueCCJs37To48": null,
  "ValueCCJs49To60": null,
  "ValueCCJs61To72": null,
  "ValueCCJsLast12Months": null,
  "ValueMostRecentCCJ": null,
  "WorkingCapital": null,
  "WorkingCapitalPercentCurrentPlusFixedAssets": null
}
```

