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
 * This is a model class for Directors type.
 */
public class Directors {
    private List<CurrentDirectors> currentDirector;
    private List<PreviousDirectors> previousDirector;

    /**
     * Default constructor.
     */
    public Directors() {
    }

    /**
     * Initialization constructor.
     * @param  currentDirector  List of CurrentDirectors value for currentDirector.
     * @param  previousDirector  List of PreviousDirectors value for previousDirector.
     */
    public Directors(
            List<CurrentDirectors> currentDirector,
            List<PreviousDirectors> previousDirector) {
        this.currentDirector = currentDirector;
        this.previousDirector = previousDirector;
    }

    /**
     * Getter for CurrentDirector.
     * @return Returns the List of CurrentDirectors
     */
    @JsonGetter("CurrentDirector")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CurrentDirectors> getCurrentDirector() {
        return currentDirector;
    }

    /**
     * Setter for CurrentDirector.
     * @param currentDirector Value for List of CurrentDirectors
     */
    @JsonSetter("CurrentDirector")
    public void setCurrentDirector(List<CurrentDirectors> currentDirector) {
        this.currentDirector = currentDirector;
    }

    /**
     * Getter for PreviousDirector.
     * @return Returns the List of PreviousDirectors
     */
    @JsonGetter("PreviousDirector")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PreviousDirectors> getPreviousDirector() {
        return previousDirector;
    }

    /**
     * Setter for PreviousDirector.
     * @param previousDirector Value for List of PreviousDirectors
     */
    @JsonSetter("PreviousDirector")
    public void setPreviousDirector(List<PreviousDirectors> previousDirector) {
        this.previousDirector = previousDirector;
    }

    /**
     * Converts this Directors into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Directors [" + "currentDirector=" + currentDirector + ", previousDirector="
                + previousDirector + "]";
    }

    /**
     * Builds a new {@link Directors.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Directors.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .currentDirector(getCurrentDirector())
                .previousDirector(getPreviousDirector());
        return builder;
    }

    /**
     * Class to build instances of {@link Directors}.
     */
    public static class Builder {
        private List<CurrentDirectors> currentDirector;
        private List<PreviousDirectors> previousDirector;



        /**
         * Setter for currentDirector.
         * @param  currentDirector  List of CurrentDirectors value for currentDirector.
         * @return Builder
         */
        public Builder currentDirector(List<CurrentDirectors> currentDirector) {
            this.currentDirector = currentDirector;
            return this;
        }

        /**
         * Setter for previousDirector.
         * @param  previousDirector  List of PreviousDirectors value for previousDirector.
         * @return Builder
         */
        public Builder previousDirector(List<PreviousDirectors> previousDirector) {
            this.previousDirector = previousDirector;
            return this;
        }

        /**
         * Builds a new {@link Directors} object using the set fields.
         * @return {@link Directors}
         */
        public Directors build() {
            return new Directors(currentDirector, previousDirector);
        }
    }
}
