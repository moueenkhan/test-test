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
 * This is a model class for Quartiles type.
 */
public class Quartiles {
    private FullQuartiles fullQuartiles;
    private MedianQuartiles medianQuartiles;

    /**
     * Default constructor.
     */
    public Quartiles() {
    }

    /**
     * Initialization constructor.
     * @param  fullQuartiles  FullQuartiles value for fullQuartiles.
     * @param  medianQuartiles  MedianQuartiles value for medianQuartiles.
     */
    public Quartiles(
            FullQuartiles fullQuartiles,
            MedianQuartiles medianQuartiles) {
        this.fullQuartiles = fullQuartiles;
        this.medianQuartiles = medianQuartiles;
    }

    /**
     * Getter for FullQuartiles.
     * @return Returns the FullQuartiles
     */
    @JsonGetter("FullQuartiles")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FullQuartiles getFullQuartiles() {
        return fullQuartiles;
    }

    /**
     * Setter for FullQuartiles.
     * @param fullQuartiles Value for FullQuartiles
     */
    @JsonSetter("FullQuartiles")
    public void setFullQuartiles(FullQuartiles fullQuartiles) {
        this.fullQuartiles = fullQuartiles;
    }

    /**
     * Getter for MedianQuartiles.
     * @return Returns the MedianQuartiles
     */
    @JsonGetter("MedianQuartiles")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MedianQuartiles getMedianQuartiles() {
        return medianQuartiles;
    }

    /**
     * Setter for MedianQuartiles.
     * @param medianQuartiles Value for MedianQuartiles
     */
    @JsonSetter("MedianQuartiles")
    public void setMedianQuartiles(MedianQuartiles medianQuartiles) {
        this.medianQuartiles = medianQuartiles;
    }

    /**
     * Converts this Quartiles into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Quartiles [" + "fullQuartiles=" + fullQuartiles + ", medianQuartiles="
                + medianQuartiles + "]";
    }

    /**
     * Builds a new {@link Quartiles.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Quartiles.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .fullQuartiles(getFullQuartiles())
                .medianQuartiles(getMedianQuartiles());
        return builder;
    }

    /**
     * Class to build instances of {@link Quartiles}.
     */
    public static class Builder {
        private FullQuartiles fullQuartiles;
        private MedianQuartiles medianQuartiles;



        /**
         * Setter for fullQuartiles.
         * @param  fullQuartiles  FullQuartiles value for fullQuartiles.
         * @return Builder
         */
        public Builder fullQuartiles(FullQuartiles fullQuartiles) {
            this.fullQuartiles = fullQuartiles;
            return this;
        }

        /**
         * Setter for medianQuartiles.
         * @param  medianQuartiles  MedianQuartiles value for medianQuartiles.
         * @return Builder
         */
        public Builder medianQuartiles(MedianQuartiles medianQuartiles) {
            this.medianQuartiles = medianQuartiles;
            return this;
        }

        /**
         * Builds a new {@link Quartiles} object using the set fields.
         * @return {@link Quartiles}
         */
        public Quartiles build() {
            return new Quartiles(fullQuartiles, medianQuartiles);
        }
    }
}