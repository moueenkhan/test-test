/*
 * CommercialCreditAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.experian.sandboxusapi.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CCJNonLtdDetails type.
 */
public class CCJNonLtdDetails {
    private String recordType;
    private String judgmentDate;
    private String satisfactionFlag;
    private String satisfactionDate;
    private String judgmentType;
    private Double judgmentAmount;
    private String courtName;
    private String caseNumber;
    private Integer numberJudgmentNames;
    private Integer numberTradingNames;
    private JudgmentDetails judgmentDetailsArea;

    /**
     * Default constructor.
     */
    public CCJNonLtdDetails() {
    }

    /**
     * Initialization constructor.
     * @param  recordType  String value for recordType.
     * @param  judgmentDate  String value for judgmentDate.
     * @param  satisfactionFlag  String value for satisfactionFlag.
     * @param  satisfactionDate  String value for satisfactionDate.
     * @param  judgmentType  String value for judgmentType.
     * @param  judgmentAmount  Double value for judgmentAmount.
     * @param  courtName  String value for courtName.
     * @param  caseNumber  String value for caseNumber.
     * @param  numberJudgmentNames  Integer value for numberJudgmentNames.
     * @param  numberTradingNames  Integer value for numberTradingNames.
     * @param  judgmentDetailsArea  JudgmentDetails value for judgmentDetailsArea.
     */
    public CCJNonLtdDetails(
            String recordType,
            String judgmentDate,
            String satisfactionFlag,
            String satisfactionDate,
            String judgmentType,
            Double judgmentAmount,
            String courtName,
            String caseNumber,
            Integer numberJudgmentNames,
            Integer numberTradingNames,
            JudgmentDetails judgmentDetailsArea) {
        this.recordType = recordType;
        this.judgmentDate = judgmentDate;
        this.satisfactionFlag = satisfactionFlag;
        this.satisfactionDate = satisfactionDate;
        this.judgmentType = judgmentType;
        this.judgmentAmount = judgmentAmount;
        this.courtName = courtName;
        this.caseNumber = caseNumber;
        this.numberJudgmentNames = numberJudgmentNames;
        this.numberTradingNames = numberTradingNames;
        this.judgmentDetailsArea = judgmentDetailsArea;
    }

    /**
     * Getter for RecordType.
     * Indicator showing record type - M=main, A=Associated, P=Pool
     * @return Returns the String
     */
    @JsonGetter("RecordType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecordType() {
        return recordType;
    }

    /**
     * Setter for RecordType.
     * Indicator showing record type - M=main, A=Associated, P=Pool
     * @param recordType Value for String
     */
    @JsonSetter("RecordType")
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    /**
     * Getter for JudgmentDate.
     * Judgment Date (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("JudgmentDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getJudgmentDate() {
        return judgmentDate;
    }

    /**
     * Setter for JudgmentDate.
     * Judgment Date (yyyy-mm-dd)
     * @param judgmentDate Value for String
     */
    @JsonSetter("JudgmentDate")
    public void setJudgmentDate(String judgmentDate) {
        this.judgmentDate = judgmentDate;
    }

    /**
     * Getter for SatisfactionFlag.
     * Indicator showing satisfaction status - Y=Satisfied, N=Not satisfied
     * @return Returns the String
     */
    @JsonGetter("SatisfactionFlag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSatisfactionFlag() {
        return satisfactionFlag;
    }

    /**
     * Setter for SatisfactionFlag.
     * Indicator showing satisfaction status - Y=Satisfied, N=Not satisfied
     * @param satisfactionFlag Value for String
     */
    @JsonSetter("SatisfactionFlag")
    public void setSatisfactionFlag(String satisfactionFlag) {
        this.satisfactionFlag = satisfactionFlag;
    }

    /**
     * Getter for SatisfactionDate.
     * Judgment Satisfaction Date (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("SatisfactionDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSatisfactionDate() {
        return satisfactionDate;
    }

    /**
     * Setter for SatisfactionDate.
     * Judgment Satisfaction Date (yyyy-mm-dd)
     * @param satisfactionDate Value for String
     */
    @JsonSetter("SatisfactionDate")
    public void setSatisfactionDate(String satisfactionDate) {
        this.satisfactionDate = satisfactionDate;
    }

    /**
     * Getter for JudgmentType.
     * Judgement Type - JG = Judgment; SS = Satisfied Judgment; CU = Certificate of
     * Unenforceability; DO = Discovery Order
     * @return Returns the String
     */
    @JsonGetter("JudgmentType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getJudgmentType() {
        return judgmentType;
    }

    /**
     * Setter for JudgmentType.
     * Judgement Type - JG = Judgment; SS = Satisfied Judgment; CU = Certificate of
     * Unenforceability; DO = Discovery Order
     * @param judgmentType Value for String
     */
    @JsonSetter("JudgmentType")
    public void setJudgmentType(String judgmentType) {
        this.judgmentType = judgmentType;
    }

    /**
     * Getter for JudgmentAmount.
     * Value of County Court Judgement against the non-limited business
     * @return Returns the Double
     */
    @JsonGetter("JudgmentAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getJudgmentAmount() {
        return judgmentAmount;
    }

    /**
     * Setter for JudgmentAmount.
     * Value of County Court Judgement against the non-limited business
     * @param judgmentAmount Value for Double
     */
    @JsonSetter("JudgmentAmount")
    public void setJudgmentAmount(Double judgmentAmount) {
        this.judgmentAmount = judgmentAmount;
    }

    /**
     * Getter for CourtName.
     * Textual name of the County Court at which the County Court Judgement has been registered
     * @return Returns the String
     */
    @JsonGetter("CourtName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCourtName() {
        return courtName;
    }

    /**
     * Setter for CourtName.
     * Textual name of the County Court at which the County Court Judgement has been registered
     * @param courtName Value for String
     */
    @JsonSetter("CourtName")
    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    /**
     * Getter for CaseNumber.
     * Case Number identifying the County Court Judgement against the non-limited business
     * @return Returns the String
     */
    @JsonGetter("CaseNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * Setter for CaseNumber.
     * Case Number identifying the County Court Judgement against the non-limited business
     * @param caseNumber Value for String
     */
    @JsonSetter("CaseNumber")
    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    /**
     * Getter for NumberJudgmentNames.
     * Number of Judgement names recorded against the County Court Judgement
     * @return Returns the Integer
     */
    @JsonGetter("NumberJudgmentNames")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumberJudgmentNames() {
        return numberJudgmentNames;
    }

    /**
     * Setter for NumberJudgmentNames.
     * Number of Judgement names recorded against the County Court Judgement
     * @param numberJudgmentNames Value for Integer
     */
    @JsonSetter("NumberJudgmentNames")
    public void setNumberJudgmentNames(Integer numberJudgmentNames) {
        this.numberJudgmentNames = numberJudgmentNames;
    }

    /**
     * Getter for NumberTradingNames.
     * Number of Trading names recorded against the County Court Judgement
     * @return Returns the Integer
     */
    @JsonGetter("NumberTradingNames")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumberTradingNames() {
        return numberTradingNames;
    }

    /**
     * Setter for NumberTradingNames.
     * Number of Trading names recorded against the County Court Judgement
     * @param numberTradingNames Value for Integer
     */
    @JsonSetter("NumberTradingNames")
    public void setNumberTradingNames(Integer numberTradingNames) {
        this.numberTradingNames = numberTradingNames;
    }

    /**
     * Getter for JudgmentDetailsArea.
     * @return Returns the JudgmentDetails
     */
    @JsonGetter("JudgmentDetailsArea")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public JudgmentDetails getJudgmentDetailsArea() {
        return judgmentDetailsArea;
    }

    /**
     * Setter for JudgmentDetailsArea.
     * @param judgmentDetailsArea Value for JudgmentDetails
     */
    @JsonSetter("JudgmentDetailsArea")
    public void setJudgmentDetailsArea(JudgmentDetails judgmentDetailsArea) {
        this.judgmentDetailsArea = judgmentDetailsArea;
    }

    /**
     * Converts this CCJNonLtdDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CCJNonLtdDetails [" + "recordType=" + recordType + ", judgmentDate=" + judgmentDate
                + ", satisfactionFlag=" + satisfactionFlag + ", satisfactionDate="
                + satisfactionDate + ", judgmentType=" + judgmentType + ", judgmentAmount="
                + judgmentAmount + ", courtName=" + courtName + ", caseNumber=" + caseNumber
                + ", numberJudgmentNames=" + numberJudgmentNames + ", numberTradingNames="
                + numberTradingNames + ", judgmentDetailsArea=" + judgmentDetailsArea + "]";
    }

    /**
     * Builds a new {@link CCJNonLtdDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CCJNonLtdDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .recordType(getRecordType())
                .judgmentDate(getJudgmentDate())
                .satisfactionFlag(getSatisfactionFlag())
                .satisfactionDate(getSatisfactionDate())
                .judgmentType(getJudgmentType())
                .judgmentAmount(getJudgmentAmount())
                .courtName(getCourtName())
                .caseNumber(getCaseNumber())
                .numberJudgmentNames(getNumberJudgmentNames())
                .numberTradingNames(getNumberTradingNames())
                .judgmentDetailsArea(getJudgmentDetailsArea());
        return builder;
    }

    /**
     * Class to build instances of {@link CCJNonLtdDetails}.
     */
    public static class Builder {
        private String recordType;
        private String judgmentDate;
        private String satisfactionFlag;
        private String satisfactionDate;
        private String judgmentType;
        private Double judgmentAmount;
        private String courtName;
        private String caseNumber;
        private Integer numberJudgmentNames;
        private Integer numberTradingNames;
        private JudgmentDetails judgmentDetailsArea;



        /**
         * Setter for recordType.
         * @param  recordType  String value for recordType.
         * @return Builder
         */
        public Builder recordType(String recordType) {
            this.recordType = recordType;
            return this;
        }

        /**
         * Setter for judgmentDate.
         * @param  judgmentDate  String value for judgmentDate.
         * @return Builder
         */
        public Builder judgmentDate(String judgmentDate) {
            this.judgmentDate = judgmentDate;
            return this;
        }

        /**
         * Setter for satisfactionFlag.
         * @param  satisfactionFlag  String value for satisfactionFlag.
         * @return Builder
         */
        public Builder satisfactionFlag(String satisfactionFlag) {
            this.satisfactionFlag = satisfactionFlag;
            return this;
        }

        /**
         * Setter for satisfactionDate.
         * @param  satisfactionDate  String value for satisfactionDate.
         * @return Builder
         */
        public Builder satisfactionDate(String satisfactionDate) {
            this.satisfactionDate = satisfactionDate;
            return this;
        }

        /**
         * Setter for judgmentType.
         * @param  judgmentType  String value for judgmentType.
         * @return Builder
         */
        public Builder judgmentType(String judgmentType) {
            this.judgmentType = judgmentType;
            return this;
        }

        /**
         * Setter for judgmentAmount.
         * @param  judgmentAmount  Double value for judgmentAmount.
         * @return Builder
         */
        public Builder judgmentAmount(Double judgmentAmount) {
            this.judgmentAmount = judgmentAmount;
            return this;
        }

        /**
         * Setter for courtName.
         * @param  courtName  String value for courtName.
         * @return Builder
         */
        public Builder courtName(String courtName) {
            this.courtName = courtName;
            return this;
        }

        /**
         * Setter for caseNumber.
         * @param  caseNumber  String value for caseNumber.
         * @return Builder
         */
        public Builder caseNumber(String caseNumber) {
            this.caseNumber = caseNumber;
            return this;
        }

        /**
         * Setter for numberJudgmentNames.
         * @param  numberJudgmentNames  Integer value for numberJudgmentNames.
         * @return Builder
         */
        public Builder numberJudgmentNames(Integer numberJudgmentNames) {
            this.numberJudgmentNames = numberJudgmentNames;
            return this;
        }

        /**
         * Setter for numberTradingNames.
         * @param  numberTradingNames  Integer value for numberTradingNames.
         * @return Builder
         */
        public Builder numberTradingNames(Integer numberTradingNames) {
            this.numberTradingNames = numberTradingNames;
            return this;
        }

        /**
         * Setter for judgmentDetailsArea.
         * @param  judgmentDetailsArea  JudgmentDetails value for judgmentDetailsArea.
         * @return Builder
         */
        public Builder judgmentDetailsArea(JudgmentDetails judgmentDetailsArea) {
            this.judgmentDetailsArea = judgmentDetailsArea;
            return this;
        }

        /**
         * Builds a new {@link CCJNonLtdDetails} object using the set fields.
         * @return {@link CCJNonLtdDetails}
         */
        public CCJNonLtdDetails build() {
            return new CCJNonLtdDetails(recordType, judgmentDate, satisfactionFlag,
                    satisfactionDate, judgmentType, judgmentAmount, courtName, caseNumber,
                    numberJudgmentNames, numberTradingNames, judgmentDetailsArea);
        }
    }
}