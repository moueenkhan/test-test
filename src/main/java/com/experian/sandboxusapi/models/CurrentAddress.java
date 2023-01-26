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
import java.util.List;

/**
 * This is a model class for CurrentAddress type.
 */
public class CurrentAddress {
    private List<ReturnLocation> alternativeLocation;
    private CheckReturnLocation returnLocation;
    private List<Warning> warning;

    /**
     * Default constructor.
     */
    public CurrentAddress() {
    }

    /**
     * Initialization constructor.
     * @param  alternativeLocation  List of ReturnLocation value for alternativeLocation.
     * @param  returnLocation  CheckReturnLocation value for returnLocation.
     * @param  warning  List of Warning value for warning.
     */
    public CurrentAddress(
            List<ReturnLocation> alternativeLocation,
            CheckReturnLocation returnLocation,
            List<Warning> warning) {
        this.alternativeLocation = alternativeLocation;
        this.returnLocation = returnLocation;
        this.warning = warning;
    }

    /**
     * Getter for AlternativeLocation.
     * @return Returns the List of ReturnLocation
     */
    @JsonGetter("AlternativeLocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ReturnLocation> getAlternativeLocation() {
        return alternativeLocation;
    }

    /**
     * Setter for AlternativeLocation.
     * @param alternativeLocation Value for List of ReturnLocation
     */
    @JsonSetter("AlternativeLocation")
    public void setAlternativeLocation(List<ReturnLocation> alternativeLocation) {
        this.alternativeLocation = alternativeLocation;
    }

    /**
     * Getter for ReturnLocation.
     * @return Returns the CheckReturnLocation
     */
    @JsonGetter("ReturnLocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckReturnLocation getReturnLocation() {
        return returnLocation;
    }

    /**
     * Setter for ReturnLocation.
     * @param returnLocation Value for CheckReturnLocation
     */
    @JsonSetter("ReturnLocation")
    public void setReturnLocation(CheckReturnLocation returnLocation) {
        this.returnLocation = returnLocation;
    }

    /**
     * Getter for Warning.
     * @return Returns the List of Warning
     */
    @JsonGetter("Warning")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Warning> getWarning() {
        return warning;
    }

    /**
     * Setter for Warning.
     * @param warning Value for List of Warning
     */
    @JsonSetter("Warning")
    public void setWarning(List<Warning> warning) {
        this.warning = warning;
    }

    /**
     * Converts this CurrentAddress into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CurrentAddress [" + "alternativeLocation=" + alternativeLocation
                + ", returnLocation=" + returnLocation + ", warning=" + warning + "]";
    }

    /**
     * Builds a new {@link CurrentAddress.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CurrentAddress.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .alternativeLocation(getAlternativeLocation())
                .returnLocation(getReturnLocation())
                .warning(getWarning());
        return builder;
    }

    /**
     * Class to build instances of {@link CurrentAddress}.
     */
    public static class Builder {
        private List<ReturnLocation> alternativeLocation;
        private CheckReturnLocation returnLocation;
        private List<Warning> warning;



        /**
         * Setter for alternativeLocation.
         * @param  alternativeLocation  List of ReturnLocation value for alternativeLocation.
         * @return Builder
         */
        public Builder alternativeLocation(List<ReturnLocation> alternativeLocation) {
            this.alternativeLocation = alternativeLocation;
            return this;
        }

        /**
         * Setter for returnLocation.
         * @param  returnLocation  CheckReturnLocation value for returnLocation.
         * @return Builder
         */
        public Builder returnLocation(CheckReturnLocation returnLocation) {
            this.returnLocation = returnLocation;
            return this;
        }

        /**
         * Setter for warning.
         * @param  warning  List of Warning value for warning.
         * @return Builder
         */
        public Builder warning(List<Warning> warning) {
            this.warning = warning;
            return this;
        }

        /**
         * Builds a new {@link CurrentAddress} object using the set fields.
         * @return {@link CurrentAddress}
         */
        public CurrentAddress build() {
            return new CurrentAddress(alternativeLocation, returnLocation, warning);
        }
    }
}