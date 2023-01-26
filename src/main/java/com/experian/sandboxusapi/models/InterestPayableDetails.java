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
 * This is a model class for InterestPayableDetails type.
 */
public class InterestPayableDetails {
    private Double interestPayable;
    private Double toBank;
    private Double onHirePurchase;
    private Double onLeasing;
    private Double other;

    /**
     * Default constructor.
     */
    public InterestPayableDetails() {
    }

    /**
     * Initialization constructor.
     * @param  interestPayable  Double value for interestPayable.
     * @param  toBank  Double value for toBank.
     * @param  onHirePurchase  Double value for onHirePurchase.
     * @param  onLeasing  Double value for onLeasing.
     * @param  other  Double value for other.
     */
    public InterestPayableDetails(
            Double interestPayable,
            Double toBank,
            Double onHirePurchase,
            Double onLeasing,
            Double other) {
        this.interestPayable = interestPayable;
        this.toBank = toBank;
        this.onHirePurchase = onHirePurchase;
        this.onLeasing = onLeasing;
        this.other = other;
    }

    /**
     * Getter for InterestPayable.
     * Value for Profit & Loss - Interest Payable Details - Interest Payable for these accounts
     * @return Returns the Double
     */
    @JsonGetter("InterestPayable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getInterestPayable() {
        return interestPayable;
    }

    /**
     * Setter for InterestPayable.
     * Value for Profit & Loss - Interest Payable Details - Interest Payable for these accounts
     * @param interestPayable Value for Double
     */
    @JsonSetter("InterestPayable")
    public void setInterestPayable(Double interestPayable) {
        this.interestPayable = interestPayable;
    }

    /**
     * Getter for ToBank.
     * Value for Profit & Loss - Interest Payable Details - To Bank for these accounts
     * @return Returns the Double
     */
    @JsonGetter("ToBank")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getToBank() {
        return toBank;
    }

    /**
     * Setter for ToBank.
     * Value for Profit & Loss - Interest Payable Details - To Bank for these accounts
     * @param toBank Value for Double
     */
    @JsonSetter("ToBank")
    public void setToBank(Double toBank) {
        this.toBank = toBank;
    }

    /**
     * Getter for OnHirePurchase.
     * Value for Profit & Loss - Interest Payable Details - On Hire Purchasing for these accounts
     * @return Returns the Double
     */
    @JsonGetter("OnHirePurchase")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getOnHirePurchase() {
        return onHirePurchase;
    }

    /**
     * Setter for OnHirePurchase.
     * Value for Profit & Loss - Interest Payable Details - On Hire Purchasing for these accounts
     * @param onHirePurchase Value for Double
     */
    @JsonSetter("OnHirePurchase")
    public void setOnHirePurchase(Double onHirePurchase) {
        this.onHirePurchase = onHirePurchase;
    }

    /**
     * Getter for OnLeasing.
     * Value for Profit & Loss - Interest Payable Details - Other for these accounts
     * @return Returns the Double
     */
    @JsonGetter("OnLeasing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getOnLeasing() {
        return onLeasing;
    }

    /**
     * Setter for OnLeasing.
     * Value for Profit & Loss - Interest Payable Details - Other for these accounts
     * @param onLeasing Value for Double
     */
    @JsonSetter("OnLeasing")
    public void setOnLeasing(Double onLeasing) {
        this.onLeasing = onLeasing;
    }

    /**
     * Getter for Other.
     * Value for Profit & Loss - Interest Payable Details - On Leasing for these accounts
     * @return Returns the Double
     */
    @JsonGetter("Other")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getOther() {
        return other;
    }

    /**
     * Setter for Other.
     * Value for Profit & Loss - Interest Payable Details - On Leasing for these accounts
     * @param other Value for Double
     */
    @JsonSetter("Other")
    public void setOther(Double other) {
        this.other = other;
    }

    /**
     * Converts this InterestPayableDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InterestPayableDetails [" + "interestPayable=" + interestPayable + ", toBank="
                + toBank + ", onHirePurchase=" + onHirePurchase + ", onLeasing=" + onLeasing
                + ", other=" + other + "]";
    }

    /**
     * Builds a new {@link InterestPayableDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InterestPayableDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .interestPayable(getInterestPayable())
                .toBank(getToBank())
                .onHirePurchase(getOnHirePurchase())
                .onLeasing(getOnLeasing())
                .other(getOther());
        return builder;
    }

    /**
     * Class to build instances of {@link InterestPayableDetails}.
     */
    public static class Builder {
        private Double interestPayable;
        private Double toBank;
        private Double onHirePurchase;
        private Double onLeasing;
        private Double other;



        /**
         * Setter for interestPayable.
         * @param  interestPayable  Double value for interestPayable.
         * @return Builder
         */
        public Builder interestPayable(Double interestPayable) {
            this.interestPayable = interestPayable;
            return this;
        }

        /**
         * Setter for toBank.
         * @param  toBank  Double value for toBank.
         * @return Builder
         */
        public Builder toBank(Double toBank) {
            this.toBank = toBank;
            return this;
        }

        /**
         * Setter for onHirePurchase.
         * @param  onHirePurchase  Double value for onHirePurchase.
         * @return Builder
         */
        public Builder onHirePurchase(Double onHirePurchase) {
            this.onHirePurchase = onHirePurchase;
            return this;
        }

        /**
         * Setter for onLeasing.
         * @param  onLeasing  Double value for onLeasing.
         * @return Builder
         */
        public Builder onLeasing(Double onLeasing) {
            this.onLeasing = onLeasing;
            return this;
        }

        /**
         * Setter for other.
         * @param  other  Double value for other.
         * @return Builder
         */
        public Builder other(Double other) {
            this.other = other;
            return this;
        }

        /**
         * Builds a new {@link InterestPayableDetails} object using the set fields.
         * @return {@link InterestPayableDetails}
         */
        public InterestPayableDetails build() {
            return new InterestPayableDetails(interestPayable, toBank, onHirePurchase, onLeasing,
                    other);
        }
    }
}