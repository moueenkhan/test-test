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
 * This is a model class for BankruptcyDetails type.
 */
public class BankruptcyDetails {
    private String recordType;
    private String gazetteDate;
    private String bankruptcyType;
    private String name;
    private NonLtdBusinessLocation bankruptcyLocation;
    private String bankruptcyText;

    /**
     * Default constructor.
     */
    public BankruptcyDetails() {
    }

    /**
     * Initialization constructor.
     * @param  recordType  String value for recordType.
     * @param  gazetteDate  String value for gazetteDate.
     * @param  bankruptcyType  String value for bankruptcyType.
     * @param  name  String value for name.
     * @param  bankruptcyLocation  NonLtdBusinessLocation value for bankruptcyLocation.
     * @param  bankruptcyText  String value for bankruptcyText.
     */
    public BankruptcyDetails(
            String recordType,
            String gazetteDate,
            String bankruptcyType,
            String name,
            NonLtdBusinessLocation bankruptcyLocation,
            String bankruptcyText) {
        this.recordType = recordType;
        this.gazetteDate = gazetteDate;
        this.bankruptcyType = bankruptcyType;
        this.name = name;
        this.bankruptcyLocation = bankruptcyLocation;
        this.bankruptcyText = bankruptcyText;
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
     * Getter for GazetteDate.
     * Gazette date (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("GazetteDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGazetteDate() {
        return gazetteDate;
    }

    /**
     * Setter for GazetteDate.
     * Gazette date (yyyy-mm-dd)
     * @param gazetteDate Value for String
     */
    @JsonSetter("GazetteDate")
    public void setGazetteDate(String gazetteDate) {
        this.gazetteDate = gazetteDate;
    }

    /**
     * Getter for BankruptcyType.
     * Bankruptcy Type - BO = Bankruptcy Order; SEQ= Sequestration etc.
     * @return Returns the String
     */
    @JsonGetter("BankruptcyType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankruptcyType() {
        return bankruptcyType;
    }

    /**
     * Setter for BankruptcyType.
     * Bankruptcy Type - BO = Bankruptcy Order; SEQ= Sequestration etc.
     * @param bankruptcyType Value for String
     */
    @JsonSetter("BankruptcyType")
    public void setBankruptcyType(String bankruptcyType) {
        this.bankruptcyType = bankruptcyType;
    }

    /**
     * Getter for Name.
     * Trading name of subject non-limited business as identified for the bankruptcy
     * @return Returns the String
     */
    @JsonGetter("Name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Trading name of subject non-limited business as identified for the bankruptcy
     * @param name Value for String
     */
    @JsonSetter("Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for BankruptcyLocation.
     * @return Returns the NonLtdBusinessLocation
     */
    @JsonGetter("BankruptcyLocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NonLtdBusinessLocation getBankruptcyLocation() {
        return bankruptcyLocation;
    }

    /**
     * Setter for BankruptcyLocation.
     * @param bankruptcyLocation Value for NonLtdBusinessLocation
     */
    @JsonSetter("BankruptcyLocation")
    public void setBankruptcyLocation(NonLtdBusinessLocation bankruptcyLocation) {
        this.bankruptcyLocation = bankruptcyLocation;
    }

    /**
     * Getter for BankruptcyText.
     * Bankruptcy text
     * @return Returns the String
     */
    @JsonGetter("BankruptcyText")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankruptcyText() {
        return bankruptcyText;
    }

    /**
     * Setter for BankruptcyText.
     * Bankruptcy text
     * @param bankruptcyText Value for String
     */
    @JsonSetter("BankruptcyText")
    public void setBankruptcyText(String bankruptcyText) {
        this.bankruptcyText = bankruptcyText;
    }

    /**
     * Converts this BankruptcyDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankruptcyDetails [" + "recordType=" + recordType + ", gazetteDate=" + gazetteDate
                + ", bankruptcyType=" + bankruptcyType + ", name=" + name + ", bankruptcyLocation="
                + bankruptcyLocation + ", bankruptcyText=" + bankruptcyText + "]";
    }

    /**
     * Builds a new {@link BankruptcyDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankruptcyDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .recordType(getRecordType())
                .gazetteDate(getGazetteDate())
                .bankruptcyType(getBankruptcyType())
                .name(getName())
                .bankruptcyLocation(getBankruptcyLocation())
                .bankruptcyText(getBankruptcyText());
        return builder;
    }

    /**
     * Class to build instances of {@link BankruptcyDetails}.
     */
    public static class Builder {
        private String recordType;
        private String gazetteDate;
        private String bankruptcyType;
        private String name;
        private NonLtdBusinessLocation bankruptcyLocation;
        private String bankruptcyText;



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
         * Setter for gazetteDate.
         * @param  gazetteDate  String value for gazetteDate.
         * @return Builder
         */
        public Builder gazetteDate(String gazetteDate) {
            this.gazetteDate = gazetteDate;
            return this;
        }

        /**
         * Setter for bankruptcyType.
         * @param  bankruptcyType  String value for bankruptcyType.
         * @return Builder
         */
        public Builder bankruptcyType(String bankruptcyType) {
            this.bankruptcyType = bankruptcyType;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for bankruptcyLocation.
         * @param  bankruptcyLocation  NonLtdBusinessLocation value for bankruptcyLocation.
         * @return Builder
         */
        public Builder bankruptcyLocation(NonLtdBusinessLocation bankruptcyLocation) {
            this.bankruptcyLocation = bankruptcyLocation;
            return this;
        }

        /**
         * Setter for bankruptcyText.
         * @param  bankruptcyText  String value for bankruptcyText.
         * @return Builder
         */
        public Builder bankruptcyText(String bankruptcyText) {
            this.bankruptcyText = bankruptcyText;
            return this;
        }

        /**
         * Builds a new {@link BankruptcyDetails} object using the set fields.
         * @return {@link BankruptcyDetails}
         */
        public BankruptcyDetails build() {
            return new BankruptcyDetails(recordType, gazetteDate, bankruptcyType, name,
                    bankruptcyLocation, bankruptcyText);
        }
    }
}
