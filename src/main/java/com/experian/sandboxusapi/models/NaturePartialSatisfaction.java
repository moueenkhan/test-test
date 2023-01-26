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
 * This is a model class for NaturePartialSatisfaction type.
 */
public class NaturePartialSatisfaction {
    private String partialSatisfactionDetails;

    /**
     * Default constructor.
     */
    public NaturePartialSatisfaction() {
    }

    /**
     * Initialization constructor.
     * @param  partialSatisfactionDetails  String value for partialSatisfactionDetails.
     */
    public NaturePartialSatisfaction(
            String partialSatisfactionDetails) {
        this.partialSatisfactionDetails = partialSatisfactionDetails;
    }

    /**
     * Getter for PartialSatisfactionDetails.
     * Nature of Partial Satisfaction Details - P = Partial satisfaction; X = Partial satisfaction;
     * R = Partial property release; B = Property ceasing to belong
     * @return Returns the String
     */
    @JsonGetter("PartialSatisfactionDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPartialSatisfactionDetails() {
        return partialSatisfactionDetails;
    }

    /**
     * Setter for PartialSatisfactionDetails.
     * Nature of Partial Satisfaction Details - P = Partial satisfaction; X = Partial satisfaction;
     * R = Partial property release; B = Property ceasing to belong
     * @param partialSatisfactionDetails Value for String
     */
    @JsonSetter("PartialSatisfactionDetails")
    public void setPartialSatisfactionDetails(String partialSatisfactionDetails) {
        this.partialSatisfactionDetails = partialSatisfactionDetails;
    }

    /**
     * Converts this NaturePartialSatisfaction into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NaturePartialSatisfaction [" + "partialSatisfactionDetails="
                + partialSatisfactionDetails + "]";
    }

    /**
     * Builds a new {@link NaturePartialSatisfaction.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NaturePartialSatisfaction.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .partialSatisfactionDetails(getPartialSatisfactionDetails());
        return builder;
    }

    /**
     * Class to build instances of {@link NaturePartialSatisfaction}.
     */
    public static class Builder {
        private String partialSatisfactionDetails;



        /**
         * Setter for partialSatisfactionDetails.
         * @param  partialSatisfactionDetails  String value for partialSatisfactionDetails.
         * @return Builder
         */
        public Builder partialSatisfactionDetails(String partialSatisfactionDetails) {
            this.partialSatisfactionDetails = partialSatisfactionDetails;
            return this;
        }

        /**
         * Builds a new {@link NaturePartialSatisfaction} object using the set fields.
         * @return {@link NaturePartialSatisfaction}
         */
        public NaturePartialSatisfaction build() {
            return new NaturePartialSatisfaction(partialSatisfactionDetails);
        }
    }
}
