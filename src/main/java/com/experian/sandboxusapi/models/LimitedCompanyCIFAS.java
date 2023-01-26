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
 * This is a model class for LimitedCompanyCIFAS type.
 */
public class LimitedCompanyCIFAS {
    private List<LimitedCompanyCIFASDetails> limitedCompanyCIFASDetails;
    private LimitedCompanyCIFASSummary limitedCompanyCIFASSummary;

    /**
     * Default constructor.
     */
    public LimitedCompanyCIFAS() {
    }

    /**
     * Initialization constructor.
     * @param  limitedCompanyCIFASDetails  List of LimitedCompanyCIFASDetails value for
     *         limitedCompanyCIFASDetails.
     * @param  limitedCompanyCIFASSummary  LimitedCompanyCIFASSummary value for
     *         limitedCompanyCIFASSummary.
     */
    public LimitedCompanyCIFAS(
            List<LimitedCompanyCIFASDetails> limitedCompanyCIFASDetails,
            LimitedCompanyCIFASSummary limitedCompanyCIFASSummary) {
        this.limitedCompanyCIFASDetails = limitedCompanyCIFASDetails;
        this.limitedCompanyCIFASSummary = limitedCompanyCIFASSummary;
    }

    /**
     * Getter for LimitedCompanyCIFASDetails.
     * @return Returns the List of LimitedCompanyCIFASDetails
     */
    @JsonGetter("LimitedCompanyCIFASDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LimitedCompanyCIFASDetails> getLimitedCompanyCIFASDetails() {
        return limitedCompanyCIFASDetails;
    }

    /**
     * Setter for LimitedCompanyCIFASDetails.
     * @param limitedCompanyCIFASDetails Value for List of LimitedCompanyCIFASDetails
     */
    @JsonSetter("LimitedCompanyCIFASDetails")
    public void setLimitedCompanyCIFASDetails(List<LimitedCompanyCIFASDetails> limitedCompanyCIFASDetails) {
        this.limitedCompanyCIFASDetails = limitedCompanyCIFASDetails;
    }

    /**
     * Getter for LimitedCompanyCIFASSummary.
     * @return Returns the LimitedCompanyCIFASSummary
     */
    @JsonGetter("LimitedCompanyCIFASSummary")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LimitedCompanyCIFASSummary getLimitedCompanyCIFASSummary() {
        return limitedCompanyCIFASSummary;
    }

    /**
     * Setter for LimitedCompanyCIFASSummary.
     * @param limitedCompanyCIFASSummary Value for LimitedCompanyCIFASSummary
     */
    @JsonSetter("LimitedCompanyCIFASSummary")
    public void setLimitedCompanyCIFASSummary(LimitedCompanyCIFASSummary limitedCompanyCIFASSummary) {
        this.limitedCompanyCIFASSummary = limitedCompanyCIFASSummary;
    }

    /**
     * Converts this LimitedCompanyCIFAS into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LimitedCompanyCIFAS [" + "limitedCompanyCIFASDetails=" + limitedCompanyCIFASDetails
                + ", limitedCompanyCIFASSummary=" + limitedCompanyCIFASSummary + "]";
    }

    /**
     * Builds a new {@link LimitedCompanyCIFAS.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LimitedCompanyCIFAS.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .limitedCompanyCIFASDetails(getLimitedCompanyCIFASDetails())
                .limitedCompanyCIFASSummary(getLimitedCompanyCIFASSummary());
        return builder;
    }

    /**
     * Class to build instances of {@link LimitedCompanyCIFAS}.
     */
    public static class Builder {
        private List<LimitedCompanyCIFASDetails> limitedCompanyCIFASDetails;
        private LimitedCompanyCIFASSummary limitedCompanyCIFASSummary;



        /**
         * Setter for limitedCompanyCIFASDetails.
         * @param  limitedCompanyCIFASDetails  List of LimitedCompanyCIFASDetails value for
         *         limitedCompanyCIFASDetails.
         * @return Builder
         */
        public Builder limitedCompanyCIFASDetails(
                List<LimitedCompanyCIFASDetails> limitedCompanyCIFASDetails) {
            this.limitedCompanyCIFASDetails = limitedCompanyCIFASDetails;
            return this;
        }

        /**
         * Setter for limitedCompanyCIFASSummary.
         * @param  limitedCompanyCIFASSummary  LimitedCompanyCIFASSummary value for
         *         limitedCompanyCIFASSummary.
         * @return Builder
         */
        public Builder limitedCompanyCIFASSummary(
                LimitedCompanyCIFASSummary limitedCompanyCIFASSummary) {
            this.limitedCompanyCIFASSummary = limitedCompanyCIFASSummary;
            return this;
        }

        /**
         * Builds a new {@link LimitedCompanyCIFAS} object using the set fields.
         * @return {@link LimitedCompanyCIFAS}
         */
        public LimitedCompanyCIFAS build() {
            return new LimitedCompanyCIFAS(limitedCompanyCIFASDetails, limitedCompanyCIFASSummary);
        }
    }
}