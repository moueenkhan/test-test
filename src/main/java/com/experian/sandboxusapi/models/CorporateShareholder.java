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
 * This is a model class for CorporateShareholder type.
 */
public class CorporateShareholder {
    private String regNumber;
    private String country;
    private String name;
    private String holding;

    /**
     * Default constructor.
     */
    public CorporateShareholder() {
    }

    /**
     * Initialization constructor.
     * @param  regNumber  String value for regNumber.
     * @param  country  String value for country.
     * @param  name  String value for name.
     * @param  holding  String value for holding.
     */
    public CorporateShareholder(
            String regNumber,
            String country,
            String name,
            String holding) {
        this.regNumber = regNumber;
        this.country = country;
        this.name = name;
        this.holding = holding;
    }

    /**
     * Getter for RegNumber.
     * Corporate shareholding company registered number
     * @return Returns the String
     */
    @JsonGetter("RegNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Setter for RegNumber.
     * Corporate shareholding company registered number
     * @param regNumber Value for String
     */
    @JsonSetter("RegNumber")
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /**
     * Getter for Country.
     * ISO country code of corporate shareholding company country of origin
     * @return Returns the String
     */
    @JsonGetter("Country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * ISO country code of corporate shareholding company country of origin
     * @param country Value for String
     */
    @JsonSetter("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for Name.
     * Corporate shareholding company name
     * @return Returns the String
     */
    @JsonGetter("Name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Corporate shareholding company name
     * @param name Value for String
     */
    @JsonSetter("Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Holding.
     * Corporate shareholding company shareholding
     * @return Returns the String
     */
    @JsonGetter("Holding")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHolding() {
        return holding;
    }

    /**
     * Setter for Holding.
     * Corporate shareholding company shareholding
     * @param holding Value for String
     */
    @JsonSetter("Holding")
    public void setHolding(String holding) {
        this.holding = holding;
    }

    /**
     * Converts this CorporateShareholder into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CorporateShareholder [" + "regNumber=" + regNumber + ", country=" + country
                + ", name=" + name + ", holding=" + holding + "]";
    }

    /**
     * Builds a new {@link CorporateShareholder.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CorporateShareholder.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .regNumber(getRegNumber())
                .country(getCountry())
                .name(getName())
                .holding(getHolding());
        return builder;
    }

    /**
     * Class to build instances of {@link CorporateShareholder}.
     */
    public static class Builder {
        private String regNumber;
        private String country;
        private String name;
        private String holding;



        /**
         * Setter for regNumber.
         * @param  regNumber  String value for regNumber.
         * @return Builder
         */
        public Builder regNumber(String regNumber) {
            this.regNumber = regNumber;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = country;
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
         * Setter for holding.
         * @param  holding  String value for holding.
         * @return Builder
         */
        public Builder holding(String holding) {
            this.holding = holding;
            return this;
        }

        /**
         * Builds a new {@link CorporateShareholder} object using the set fields.
         * @return {@link CorporateShareholder}
         */
        public CorporateShareholder build() {
            return new CorporateShareholder(regNumber, country, name, holding);
        }
    }
}