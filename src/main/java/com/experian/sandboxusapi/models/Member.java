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
 * This is a model class for Member type.
 */
public class Member {
    private String dateOfBirth;
    private String furtherDetails;
    private String iDCode;
    private String iDNumber;
    private String informationDate;
    private String noCReference;

    /**
     * Default constructor.
     */
    public Member() {
    }

    /**
     * Initialization constructor.
     * @param  dateOfBirth  String value for dateOfBirth.
     * @param  furtherDetails  String value for furtherDetails.
     * @param  iDCode  String value for iDCode.
     * @param  iDNumber  String value for iDNumber.
     * @param  informationDate  String value for informationDate.
     * @param  noCReference  String value for noCReference.
     */
    public Member(
            String dateOfBirth,
            String furtherDetails,
            String iDCode,
            String iDNumber,
            String informationDate,
            String noCReference) {
        this.dateOfBirth = dateOfBirth;
        this.furtherDetails = furtherDetails;
        this.iDCode = iDCode;
        this.iDNumber = iDNumber;
        this.informationDate = informationDate;
        this.noCReference = noCReference;
    }

    /**
     * Getter for DateOfBirth.
     * Date of birth (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("DateOfBirth")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Setter for DateOfBirth.
     * Date of birth (yyyy-mm-dd)
     * @param dateOfBirth Value for String
     */
    @JsonSetter("DateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Getter for FurtherDetails.
     * @return Returns the String
     */
    @JsonGetter("FurtherDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFurtherDetails() {
        return furtherDetails;
    }

    /**
     * Setter for FurtherDetails.
     * @param furtherDetails Value for String
     */
    @JsonSetter("FurtherDetails")
    public void setFurtherDetails(String furtherDetails) {
        this.furtherDetails = furtherDetails;
    }

    /**
     * Getter for IDCode.
     * @return Returns the String
     */
    @JsonGetter("IDCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIDCode() {
        return iDCode;
    }

    /**
     * Setter for IDCode.
     * @param iDCode Value for String
     */
    @JsonSetter("IDCode")
    public void setIDCode(String iDCode) {
        this.iDCode = iDCode;
    }

    /**
     * Getter for IDNumber.
     * @return Returns the String
     */
    @JsonGetter("IDNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIDNumber() {
        return iDNumber;
    }

    /**
     * Setter for IDNumber.
     * @param iDNumber Value for String
     */
    @JsonSetter("IDNumber")
    public void setIDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
    }

    /**
     * Getter for InformationDate.
     * Date of information (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("InformationDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInformationDate() {
        return informationDate;
    }

    /**
     * Setter for InformationDate.
     * Date of information (yyyy-mm-dd)
     * @param informationDate Value for String
     */
    @JsonSetter("InformationDate")
    public void setInformationDate(String informationDate) {
        this.informationDate = informationDate;
    }

    /**
     * Getter for NoCReference.
     * @return Returns the String
     */
    @JsonGetter("NoCReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNoCReference() {
        return noCReference;
    }

    /**
     * Setter for NoCReference.
     * @param noCReference Value for String
     */
    @JsonSetter("NoCReference")
    public void setNoCReference(String noCReference) {
        this.noCReference = noCReference;
    }

    /**
     * Converts this Member into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Member [" + "dateOfBirth=" + dateOfBirth + ", furtherDetails=" + furtherDetails
                + ", iDCode=" + iDCode + ", iDNumber=" + iDNumber + ", informationDate="
                + informationDate + ", noCReference=" + noCReference + "]";
    }

    /**
     * Builds a new {@link Member.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Member.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dateOfBirth(getDateOfBirth())
                .furtherDetails(getFurtherDetails())
                .iDCode(getIDCode())
                .iDNumber(getIDNumber())
                .informationDate(getInformationDate())
                .noCReference(getNoCReference());
        return builder;
    }

    /**
     * Class to build instances of {@link Member}.
     */
    public static class Builder {
        private String dateOfBirth;
        private String furtherDetails;
        private String iDCode;
        private String iDNumber;
        private String informationDate;
        private String noCReference;



        /**
         * Setter for dateOfBirth.
         * @param  dateOfBirth  String value for dateOfBirth.
         * @return Builder
         */
        public Builder dateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        /**
         * Setter for furtherDetails.
         * @param  furtherDetails  String value for furtherDetails.
         * @return Builder
         */
        public Builder furtherDetails(String furtherDetails) {
            this.furtherDetails = furtherDetails;
            return this;
        }

        /**
         * Setter for iDCode.
         * @param  iDCode  String value for iDCode.
         * @return Builder
         */
        public Builder iDCode(String iDCode) {
            this.iDCode = iDCode;
            return this;
        }

        /**
         * Setter for iDNumber.
         * @param  iDNumber  String value for iDNumber.
         * @return Builder
         */
        public Builder iDNumber(String iDNumber) {
            this.iDNumber = iDNumber;
            return this;
        }

        /**
         * Setter for informationDate.
         * @param  informationDate  String value for informationDate.
         * @return Builder
         */
        public Builder informationDate(String informationDate) {
            this.informationDate = informationDate;
            return this;
        }

        /**
         * Setter for noCReference.
         * @param  noCReference  String value for noCReference.
         * @return Builder
         */
        public Builder noCReference(String noCReference) {
            this.noCReference = noCReference;
            return this;
        }

        /**
         * Builds a new {@link Member} object using the set fields.
         * @return {@link Member}
         */
        public Member build() {
            return new Member(dateOfBirth, furtherDetails, iDCode, iDNumber, informationDate,
                    noCReference);
        }
    }
}
