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
 * This is a model class for PrevSearchDetail type.
 */
public class PrevSearchDetail {
    private String searchDate;
    private String enquiryType;
    private String creditRequired;
    private String ownEnquiryFlag;
    private CPSNonLtdSICInfo sICInformation;

    /**
     * Default constructor.
     */
    public PrevSearchDetail() {
    }

    /**
     * Initialization constructor.
     * @param  searchDate  String value for searchDate.
     * @param  enquiryType  String value for enquiryType.
     * @param  creditRequired  String value for creditRequired.
     * @param  ownEnquiryFlag  String value for ownEnquiryFlag.
     * @param  sICInformation  CPSNonLtdSICInfo value for sICInformation.
     */
    public PrevSearchDetail(
            String searchDate,
            String enquiryType,
            String creditRequired,
            String ownEnquiryFlag,
            CPSNonLtdSICInfo sICInformation) {
        this.searchDate = searchDate;
        this.enquiryType = enquiryType;
        this.creditRequired = creditRequired;
        this.ownEnquiryFlag = ownEnquiryFlag;
        this.sICInformation = sICInformation;
    }

    /**
     * Getter for SearchDate.
     * Previous search date (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("SearchDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSearchDate() {
        return searchDate;
    }

    /**
     * Setter for SearchDate.
     * Previous search date (yyyy-mm-dd)
     * @param searchDate Value for String
     */
    @JsonSetter("SearchDate")
    public void setSearchDate(String searchDate) {
        this.searchDate = searchDate;
    }

    /**
     * Getter for EnquiryType.
     * Indicator showing the type of enquiry (C = CPU Link Enquiry, D = e-series business Gold
     * Report, E = e-series business Silver Report, F = e-series business Bronze Report, J =
     * e-series business Enhanced Corporate Tree Report, L = XML Bespoke Delivery, N = Commercial
     * Autoscore Application, O = Commercial Autoscore Reprocess Decision, W = Full Profile, X =
     * Credit Profile, Y = Business Profile, Z = Business Confirmation, 6 = Written Report, Other =
     * Miscellaneous)
     * @return Returns the String
     */
    @JsonGetter("EnquiryType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEnquiryType() {
        return enquiryType;
    }

    /**
     * Setter for EnquiryType.
     * Indicator showing the type of enquiry (C = CPU Link Enquiry, D = e-series business Gold
     * Report, E = e-series business Silver Report, F = e-series business Bronze Report, J =
     * e-series business Enhanced Corporate Tree Report, L = XML Bespoke Delivery, N = Commercial
     * Autoscore Application, O = Commercial Autoscore Reprocess Decision, W = Full Profile, X =
     * Credit Profile, Y = Business Profile, Z = Business Confirmation, 6 = Written Report, Other =
     * Miscellaneous)
     * @param enquiryType Value for String
     */
    @JsonSetter("EnquiryType")
    public void setEnquiryType(String enquiryType) {
        this.enquiryType = enquiryType;
    }

    /**
     * Getter for CreditRequired.
     * Value of credit requested where the search is due to a request for credit
     * @return Returns the String
     */
    @JsonGetter("CreditRequired")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreditRequired() {
        return creditRequired;
    }

    /**
     * Setter for CreditRequired.
     * Value of credit requested where the search is due to a request for credit
     * @param creditRequired Value for String
     */
    @JsonSetter("CreditRequired")
    public void setCreditRequired(String creditRequired) {
        this.creditRequired = creditRequired;
    }

    /**
     * Getter for OwnEnquiryFlag.
     * Indicator showing whether the enquiry was raised by the non-limited business - Y = Own
     * enquiry; N = Not own enquiry
     * @return Returns the String
     */
    @JsonGetter("OwnEnquiryFlag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOwnEnquiryFlag() {
        return ownEnquiryFlag;
    }

    /**
     * Setter for OwnEnquiryFlag.
     * Indicator showing whether the enquiry was raised by the non-limited business - Y = Own
     * enquiry; N = Not own enquiry
     * @param ownEnquiryFlag Value for String
     */
    @JsonSetter("OwnEnquiryFlag")
    public void setOwnEnquiryFlag(String ownEnquiryFlag) {
        this.ownEnquiryFlag = ownEnquiryFlag;
    }

    /**
     * Getter for SICInformation.
     * @return Returns the CPSNonLtdSICInfo
     */
    @JsonGetter("SICInformation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CPSNonLtdSICInfo getSICInformation() {
        return sICInformation;
    }

    /**
     * Setter for SICInformation.
     * @param sICInformation Value for CPSNonLtdSICInfo
     */
    @JsonSetter("SICInformation")
    public void setSICInformation(CPSNonLtdSICInfo sICInformation) {
        this.sICInformation = sICInformation;
    }

    /**
     * Converts this PrevSearchDetail into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrevSearchDetail [" + "searchDate=" + searchDate + ", enquiryType=" + enquiryType
                + ", creditRequired=" + creditRequired + ", ownEnquiryFlag=" + ownEnquiryFlag
                + ", sICInformation=" + sICInformation + "]";
    }

    /**
     * Builds a new {@link PrevSearchDetail.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrevSearchDetail.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .searchDate(getSearchDate())
                .enquiryType(getEnquiryType())
                .creditRequired(getCreditRequired())
                .ownEnquiryFlag(getOwnEnquiryFlag())
                .sICInformation(getSICInformation());
        return builder;
    }

    /**
     * Class to build instances of {@link PrevSearchDetail}.
     */
    public static class Builder {
        private String searchDate;
        private String enquiryType;
        private String creditRequired;
        private String ownEnquiryFlag;
        private CPSNonLtdSICInfo sICInformation;



        /**
         * Setter for searchDate.
         * @param  searchDate  String value for searchDate.
         * @return Builder
         */
        public Builder searchDate(String searchDate) {
            this.searchDate = searchDate;
            return this;
        }

        /**
         * Setter for enquiryType.
         * @param  enquiryType  String value for enquiryType.
         * @return Builder
         */
        public Builder enquiryType(String enquiryType) {
            this.enquiryType = enquiryType;
            return this;
        }

        /**
         * Setter for creditRequired.
         * @param  creditRequired  String value for creditRequired.
         * @return Builder
         */
        public Builder creditRequired(String creditRequired) {
            this.creditRequired = creditRequired;
            return this;
        }

        /**
         * Setter for ownEnquiryFlag.
         * @param  ownEnquiryFlag  String value for ownEnquiryFlag.
         * @return Builder
         */
        public Builder ownEnquiryFlag(String ownEnquiryFlag) {
            this.ownEnquiryFlag = ownEnquiryFlag;
            return this;
        }

        /**
         * Setter for sICInformation.
         * @param  sICInformation  CPSNonLtdSICInfo value for sICInformation.
         * @return Builder
         */
        public Builder sICInformation(CPSNonLtdSICInfo sICInformation) {
            this.sICInformation = sICInformation;
            return this;
        }

        /**
         * Builds a new {@link PrevSearchDetail} object using the set fields.
         * @return {@link PrevSearchDetail}
         */
        public PrevSearchDetail build() {
            return new PrevSearchDetail(searchDate, enquiryType, creditRequired, ownEnquiryFlag,
                    sICInformation);
        }
    }
}
