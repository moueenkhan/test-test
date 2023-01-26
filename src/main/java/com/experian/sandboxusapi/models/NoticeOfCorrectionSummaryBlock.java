/*
 * CommercialCreditAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.experian.sandboxusapi.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for NoticeOfCorrectionSummaryBlock type.
 */
public class NoticeOfCorrectionSummaryBlock {
    private int numberOfNoticesOfCorrection;

    /**
     * Default constructor.
     */
    public NoticeOfCorrectionSummaryBlock() {
    }

    /**
     * Initialization constructor.
     * @param  numberOfNoticesOfCorrection  int value for numberOfNoticesOfCorrection.
     */
    public NoticeOfCorrectionSummaryBlock(
            int numberOfNoticesOfCorrection) {
        this.numberOfNoticesOfCorrection = numberOfNoticesOfCorrection;
    }

    /**
     * Getter for NumberOfNoticesOfCorrection.
     * @return Returns the int
     */
    @JsonGetter("NumberOfNoticesOfCorrection")
    public int getNumberOfNoticesOfCorrection() {
        return numberOfNoticesOfCorrection;
    }

    /**
     * Setter for NumberOfNoticesOfCorrection.
     * @param numberOfNoticesOfCorrection Value for int
     */
    @JsonSetter("NumberOfNoticesOfCorrection")
    public void setNumberOfNoticesOfCorrection(int numberOfNoticesOfCorrection) {
        this.numberOfNoticesOfCorrection = numberOfNoticesOfCorrection;
    }

    /**
     * Converts this NoticeOfCorrectionSummaryBlock into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NoticeOfCorrectionSummaryBlock [" + "numberOfNoticesOfCorrection="
                + numberOfNoticesOfCorrection + "]";
    }

    /**
     * Builds a new {@link NoticeOfCorrectionSummaryBlock.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NoticeOfCorrectionSummaryBlock.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(numberOfNoticesOfCorrection);
        return builder;
    }

    /**
     * Class to build instances of {@link NoticeOfCorrectionSummaryBlock}.
     */
    public static class Builder {
        private int numberOfNoticesOfCorrection;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  numberOfNoticesOfCorrection  int value for numberOfNoticesOfCorrection.
         */
        public Builder(int numberOfNoticesOfCorrection) {
            this.numberOfNoticesOfCorrection = numberOfNoticesOfCorrection;
        }

        /**
         * Setter for numberOfNoticesOfCorrection.
         * @param  numberOfNoticesOfCorrection  int value for numberOfNoticesOfCorrection.
         * @return Builder
         */
        public Builder numberOfNoticesOfCorrection(int numberOfNoticesOfCorrection) {
            this.numberOfNoticesOfCorrection = numberOfNoticesOfCorrection;
            return this;
        }

        /**
         * Builds a new {@link NoticeOfCorrectionSummaryBlock} object using the set fields.
         * @return {@link NoticeOfCorrectionSummaryBlock}
         */
        public NoticeOfCorrectionSummaryBlock build() {
            return new NoticeOfCorrectionSummaryBlock(numberOfNoticesOfCorrection);
        }
    }
}
