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
 * This is a model class for CIFASIndicator type.
 */
public class CIFASIndicator {
    private String busAddress;
    private String propAddress;

    /**
     * Default constructor.
     */
    public CIFASIndicator() {
    }

    /**
     * Initialization constructor.
     * @param  busAddress  String value for busAddress.
     * @param  propAddress  String value for propAddress.
     */
    public CIFASIndicator(
            String busAddress,
            String propAddress) {
        this.busAddress = busAddress;
        this.propAddress = propAddress;
    }

    /**
     * Getter for BusAddress.
     * Indicator shownig the entitlement / presence of CIFAS data related to the business address -
     * Y = CIFAS information found at business address; N = No CIFAS information found at business
     * address or Requestor has no entitlement to CIFAS data
     * @return Returns the String
     */
    @JsonGetter("BusAddress")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBusAddress() {
        return busAddress;
    }

    /**
     * Setter for BusAddress.
     * Indicator shownig the entitlement / presence of CIFAS data related to the business address -
     * Y = CIFAS information found at business address; N = No CIFAS information found at business
     * address or Requestor has no entitlement to CIFAS data
     * @param busAddress Value for String
     */
    @JsonSetter("BusAddress")
    public void setBusAddress(String busAddress) {
        this.busAddress = busAddress;
    }

    /**
     * Getter for PropAddress.
     * Indicator shownig the entitlement / presence of CIFAS data related to the proprietor address
     * - Y = CIFAS information found at proprietor address; N = No CIFAS information found at
     * proprietor address or Requestor has no entitlement to CIFAS data
     * @return Returns the String
     */
    @JsonGetter("PropAddress")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPropAddress() {
        return propAddress;
    }

    /**
     * Setter for PropAddress.
     * Indicator shownig the entitlement / presence of CIFAS data related to the proprietor address
     * - Y = CIFAS information found at proprietor address; N = No CIFAS information found at
     * proprietor address or Requestor has no entitlement to CIFAS data
     * @param propAddress Value for String
     */
    @JsonSetter("PropAddress")
    public void setPropAddress(String propAddress) {
        this.propAddress = propAddress;
    }

    /**
     * Converts this CIFASIndicator into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CIFASIndicator [" + "busAddress=" + busAddress + ", propAddress=" + propAddress
                + "]";
    }

    /**
     * Builds a new {@link CIFASIndicator.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CIFASIndicator.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .busAddress(getBusAddress())
                .propAddress(getPropAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link CIFASIndicator}.
     */
    public static class Builder {
        private String busAddress;
        private String propAddress;



        /**
         * Setter for busAddress.
         * @param  busAddress  String value for busAddress.
         * @return Builder
         */
        public Builder busAddress(String busAddress) {
            this.busAddress = busAddress;
            return this;
        }

        /**
         * Setter for propAddress.
         * @param  propAddress  String value for propAddress.
         * @return Builder
         */
        public Builder propAddress(String propAddress) {
            this.propAddress = propAddress;
            return this;
        }

        /**
         * Builds a new {@link CIFASIndicator} object using the set fields.
         * @return {@link CIFASIndicator}
         */
        public CIFASIndicator build() {
            return new CIFASIndicator(busAddress, propAddress);
        }
    }
}
