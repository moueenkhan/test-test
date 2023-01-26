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
 * This is a model class for Control type.
 */
public class Control {
    private String consent;

    /**
     * Default constructor.
     */
    public Control() {
        consent = "true";
    }

    /**
     * Initialization constructor.
     * @param  consent  String value for consent.
     */
    public Control(
            String consent) {
        this.consent = consent;
    }

    /**
     * Getter for Consent.
     * The API will leave a footprint on the consumer bureau, so consent to perform the search needs
     * to be provided
     * @return Returns the String
     */
    @JsonGetter("Consent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConsent() {
        return consent;
    }

    /**
     * Setter for Consent.
     * The API will leave a footprint on the consumer bureau, so consent to perform the search needs
     * to be provided
     * @param consent Value for String
     */
    @JsonSetter("Consent")
    public void setConsent(String consent) {
        this.consent = consent;
    }

    /**
     * Converts this Control into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Control [" + "consent=" + consent + "]";
    }

    /**
     * Builds a new {@link Control.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Control.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .consent(getConsent());
        return builder;
    }

    /**
     * Class to build instances of {@link Control}.
     */
    public static class Builder {
        private String consent = "true";



        /**
         * Setter for consent.
         * @param  consent  String value for consent.
         * @return Builder
         */
        public Builder consent(String consent) {
            this.consent = consent;
            return this;
        }

        /**
         * Builds a new {@link Control} object using the set fields.
         * @return {@link Control}
         */
        public Control build() {
            return new Control(consent);
        }
    }
}