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
 * This is a model class for ProvisionsDetails type.
 */
public class ProvisionsDetails {
    private Double provisions;
    private Double deferredTaxation;
    private Double pension;
    private Double otherProvision;

    /**
     * Default constructor.
     */
    public ProvisionsDetails() {
    }

    /**
     * Initialization constructor.
     * @param  provisions  Double value for provisions.
     * @param  deferredTaxation  Double value for deferredTaxation.
     * @param  pension  Double value for pension.
     * @param  otherProvision  Double value for otherProvision.
     */
    public ProvisionsDetails(
            Double provisions,
            Double deferredTaxation,
            Double pension,
            Double otherProvision) {
        this.provisions = provisions;
        this.deferredTaxation = deferredTaxation;
        this.pension = pension;
        this.otherProvision = otherProvision;
    }

    /**
     * Getter for Provisions.
     * Value for Balance Sheet - Provisions - Provisions for these accounts
     * @return Returns the Double
     */
    @JsonGetter("Provisions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getProvisions() {
        return provisions;
    }

    /**
     * Setter for Provisions.
     * Value for Balance Sheet - Provisions - Provisions for these accounts
     * @param provisions Value for Double
     */
    @JsonSetter("Provisions")
    public void setProvisions(Double provisions) {
        this.provisions = provisions;
    }

    /**
     * Getter for DeferredTaxation.
     * Value for Balance Sheet - Provisions - Deferred Taxation for these accounts
     * @return Returns the Double
     */
    @JsonGetter("DeferredTaxation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getDeferredTaxation() {
        return deferredTaxation;
    }

    /**
     * Setter for DeferredTaxation.
     * Value for Balance Sheet - Provisions - Deferred Taxation for these accounts
     * @param deferredTaxation Value for Double
     */
    @JsonSetter("DeferredTaxation")
    public void setDeferredTaxation(Double deferredTaxation) {
        this.deferredTaxation = deferredTaxation;
    }

    /**
     * Getter for Pension.
     * Value for Balance Sheet - Provisions - Pension for these accounts
     * @return Returns the Double
     */
    @JsonGetter("Pension")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getPension() {
        return pension;
    }

    /**
     * Setter for Pension.
     * Value for Balance Sheet - Provisions - Pension for these accounts
     * @param pension Value for Double
     */
    @JsonSetter("Pension")
    public void setPension(Double pension) {
        this.pension = pension;
    }

    /**
     * Getter for OtherProvision.
     * Value for Balance Sheet - Provisions - Other Provisions for these accounts
     * @return Returns the Double
     */
    @JsonGetter("OtherProvision")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getOtherProvision() {
        return otherProvision;
    }

    /**
     * Setter for OtherProvision.
     * Value for Balance Sheet - Provisions - Other Provisions for these accounts
     * @param otherProvision Value for Double
     */
    @JsonSetter("OtherProvision")
    public void setOtherProvision(Double otherProvision) {
        this.otherProvision = otherProvision;
    }

    /**
     * Converts this ProvisionsDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProvisionsDetails [" + "provisions=" + provisions + ", deferredTaxation="
                + deferredTaxation + ", pension=" + pension + ", otherProvision=" + otherProvision
                + "]";
    }

    /**
     * Builds a new {@link ProvisionsDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProvisionsDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .provisions(getProvisions())
                .deferredTaxation(getDeferredTaxation())
                .pension(getPension())
                .otherProvision(getOtherProvision());
        return builder;
    }

    /**
     * Class to build instances of {@link ProvisionsDetails}.
     */
    public static class Builder {
        private Double provisions;
        private Double deferredTaxation;
        private Double pension;
        private Double otherProvision;



        /**
         * Setter for provisions.
         * @param  provisions  Double value for provisions.
         * @return Builder
         */
        public Builder provisions(Double provisions) {
            this.provisions = provisions;
            return this;
        }

        /**
         * Setter for deferredTaxation.
         * @param  deferredTaxation  Double value for deferredTaxation.
         * @return Builder
         */
        public Builder deferredTaxation(Double deferredTaxation) {
            this.deferredTaxation = deferredTaxation;
            return this;
        }

        /**
         * Setter for pension.
         * @param  pension  Double value for pension.
         * @return Builder
         */
        public Builder pension(Double pension) {
            this.pension = pension;
            return this;
        }

        /**
         * Setter for otherProvision.
         * @param  otherProvision  Double value for otherProvision.
         * @return Builder
         */
        public Builder otherProvision(Double otherProvision) {
            this.otherProvision = otherProvision;
            return this;
        }

        /**
         * Builds a new {@link ProvisionsDetails} object using the set fields.
         * @return {@link ProvisionsDetails}
         */
        public ProvisionsDetails build() {
            return new ProvisionsDetails(provisions, deferredTaxation, pension, otherProvision);
        }
    }
}