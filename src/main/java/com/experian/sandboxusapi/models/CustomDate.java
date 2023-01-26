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
 * This is a model class for CustomDate type.
 */
public class CustomDate {
    private String dateSuppliedDd;
    private String dateSuppliedMm;
    private String dateSuppliedYyyy;
    private String expiryDateDd;
    private String expiryDateYyyy;
    private String expirydateMm;

    /**
     * Default constructor.
     */
    public CustomDate() {
    }

    /**
     * Initialization constructor.
     * @param  dateSuppliedDd  String value for dateSuppliedDd.
     * @param  dateSuppliedMm  String value for dateSuppliedMm.
     * @param  dateSuppliedYyyy  String value for dateSuppliedYyyy.
     * @param  expiryDateDd  String value for expiryDateDd.
     * @param  expiryDateYyyy  String value for expiryDateYyyy.
     * @param  expirydateMm  String value for expirydateMm.
     */
    public CustomDate(
            String dateSuppliedDd,
            String dateSuppliedMm,
            String dateSuppliedYyyy,
            String expiryDateDd,
            String expiryDateYyyy,
            String expirydateMm) {
        this.dateSuppliedDd = dateSuppliedDd;
        this.dateSuppliedMm = dateSuppliedMm;
        this.dateSuppliedYyyy = dateSuppliedYyyy;
        this.expiryDateDd = expiryDateDd;
        this.expiryDateYyyy = expiryDateYyyy;
        this.expirydateMm = expirydateMm;
    }

    /**
     * Getter for DateSuppliedDd.
     * Date supplied - DD
     * @return Returns the String
     */
    @JsonGetter("DateSuppliedDd")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDateSuppliedDd() {
        return dateSuppliedDd;
    }

    /**
     * Setter for DateSuppliedDd.
     * Date supplied - DD
     * @param dateSuppliedDd Value for String
     */
    @JsonSetter("DateSuppliedDd")
    public void setDateSuppliedDd(String dateSuppliedDd) {
        this.dateSuppliedDd = dateSuppliedDd;
    }

    /**
     * Getter for DateSuppliedMm.
     * Date supplied - MM
     * @return Returns the String
     */
    @JsonGetter("DateSuppliedMm")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDateSuppliedMm() {
        return dateSuppliedMm;
    }

    /**
     * Setter for DateSuppliedMm.
     * Date supplied - MM
     * @param dateSuppliedMm Value for String
     */
    @JsonSetter("DateSuppliedMm")
    public void setDateSuppliedMm(String dateSuppliedMm) {
        this.dateSuppliedMm = dateSuppliedMm;
    }

    /**
     * Getter for DateSuppliedYyyy.
     * Date supplied - YYYY
     * @return Returns the String
     */
    @JsonGetter("DateSuppliedYyyy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDateSuppliedYyyy() {
        return dateSuppliedYyyy;
    }

    /**
     * Setter for DateSuppliedYyyy.
     * Date supplied - YYYY
     * @param dateSuppliedYyyy Value for String
     */
    @JsonSetter("DateSuppliedYyyy")
    public void setDateSuppliedYyyy(String dateSuppliedYyyy) {
        this.dateSuppliedYyyy = dateSuppliedYyyy;
    }

    /**
     * Getter for ExpiryDateDd.
     * Expiry date - DD
     * @return Returns the String
     */
    @JsonGetter("ExpiryDateDd")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpiryDateDd() {
        return expiryDateDd;
    }

    /**
     * Setter for ExpiryDateDd.
     * Expiry date - DD
     * @param expiryDateDd Value for String
     */
    @JsonSetter("ExpiryDateDd")
    public void setExpiryDateDd(String expiryDateDd) {
        this.expiryDateDd = expiryDateDd;
    }

    /**
     * Getter for ExpiryDateYyyy.
     * Expiry date - YYYY
     * @return Returns the String
     */
    @JsonGetter("ExpiryDateYyyy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpiryDateYyyy() {
        return expiryDateYyyy;
    }

    /**
     * Setter for ExpiryDateYyyy.
     * Expiry date - YYYY
     * @param expiryDateYyyy Value for String
     */
    @JsonSetter("ExpiryDateYyyy")
    public void setExpiryDateYyyy(String expiryDateYyyy) {
        this.expiryDateYyyy = expiryDateYyyy;
    }

    /**
     * Getter for ExpirydateMm.
     * Expiry date - MM
     * @return Returns the String
     */
    @JsonGetter("ExpirydateMm")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirydateMm() {
        return expirydateMm;
    }

    /**
     * Setter for ExpirydateMm.
     * Expiry date - MM
     * @param expirydateMm Value for String
     */
    @JsonSetter("ExpirydateMm")
    public void setExpirydateMm(String expirydateMm) {
        this.expirydateMm = expirydateMm;
    }

    /**
     * Converts this CustomDate into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomDate [" + "dateSuppliedDd=" + dateSuppliedDd + ", dateSuppliedMm="
                + dateSuppliedMm + ", dateSuppliedYyyy=" + dateSuppliedYyyy + ", expiryDateDd="
                + expiryDateDd + ", expiryDateYyyy=" + expiryDateYyyy + ", expirydateMm="
                + expirydateMm + "]";
    }

    /**
     * Builds a new {@link CustomDate.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomDate.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dateSuppliedDd(getDateSuppliedDd())
                .dateSuppliedMm(getDateSuppliedMm())
                .dateSuppliedYyyy(getDateSuppliedYyyy())
                .expiryDateDd(getExpiryDateDd())
                .expiryDateYyyy(getExpiryDateYyyy())
                .expirydateMm(getExpirydateMm());
        return builder;
    }

    /**
     * Class to build instances of {@link CustomDate}.
     */
    public static class Builder {
        private String dateSuppliedDd;
        private String dateSuppliedMm;
        private String dateSuppliedYyyy;
        private String expiryDateDd;
        private String expiryDateYyyy;
        private String expirydateMm;



        /**
         * Setter for dateSuppliedDd.
         * @param  dateSuppliedDd  String value for dateSuppliedDd.
         * @return Builder
         */
        public Builder dateSuppliedDd(String dateSuppliedDd) {
            this.dateSuppliedDd = dateSuppliedDd;
            return this;
        }

        /**
         * Setter for dateSuppliedMm.
         * @param  dateSuppliedMm  String value for dateSuppliedMm.
         * @return Builder
         */
        public Builder dateSuppliedMm(String dateSuppliedMm) {
            this.dateSuppliedMm = dateSuppliedMm;
            return this;
        }

        /**
         * Setter for dateSuppliedYyyy.
         * @param  dateSuppliedYyyy  String value for dateSuppliedYyyy.
         * @return Builder
         */
        public Builder dateSuppliedYyyy(String dateSuppliedYyyy) {
            this.dateSuppliedYyyy = dateSuppliedYyyy;
            return this;
        }

        /**
         * Setter for expiryDateDd.
         * @param  expiryDateDd  String value for expiryDateDd.
         * @return Builder
         */
        public Builder expiryDateDd(String expiryDateDd) {
            this.expiryDateDd = expiryDateDd;
            return this;
        }

        /**
         * Setter for expiryDateYyyy.
         * @param  expiryDateYyyy  String value for expiryDateYyyy.
         * @return Builder
         */
        public Builder expiryDateYyyy(String expiryDateYyyy) {
            this.expiryDateYyyy = expiryDateYyyy;
            return this;
        }

        /**
         * Setter for expirydateMm.
         * @param  expirydateMm  String value for expirydateMm.
         * @return Builder
         */
        public Builder expirydateMm(String expirydateMm) {
            this.expirydateMm = expirydateMm;
            return this;
        }

        /**
         * Builds a new {@link CustomDate} object using the set fields.
         * @return {@link CustomDate}
         */
        public CustomDate build() {
            return new CustomDate(dateSuppliedDd, dateSuppliedMm, dateSuppliedYyyy, expiryDateDd,
                    expiryDateYyyy, expirydateMm);
        }
    }
}