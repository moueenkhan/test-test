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
 * This is a model class for ArrayOfString type.
 */
public class ArrayOfString {
    private List<String> allHistoricalAverageDelphiScore;

    /**
     * Default constructor.
     */
    public ArrayOfString() {
    }

    /**
     * Initialization constructor.
     * @param  allHistoricalAverageDelphiScore  List of String value for
     *         allHistoricalAverageDelphiScore.
     */
    public ArrayOfString(
            List<String> allHistoricalAverageDelphiScore) {
        this.allHistoricalAverageDelphiScore = allHistoricalAverageDelphiScore;
    }

    /**
     * Getter for AllHistoricalAverageDelphiScore.
     * Historical Average Delphi Score - All (x12) Occurs 12 times, monthly data for last year -
     * most recent first 0-100
     * @return Returns the List of String
     */
    @JsonGetter("AllHistoricalAverageDelphiScore")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getAllHistoricalAverageDelphiScore() {
        return allHistoricalAverageDelphiScore;
    }

    /**
     * Setter for AllHistoricalAverageDelphiScore.
     * Historical Average Delphi Score - All (x12) Occurs 12 times, monthly data for last year -
     * most recent first 0-100
     * @param allHistoricalAverageDelphiScore Value for List of String
     */
    @JsonSetter("AllHistoricalAverageDelphiScore")
    public void setAllHistoricalAverageDelphiScore(List<String> allHistoricalAverageDelphiScore) {
        this.allHistoricalAverageDelphiScore = allHistoricalAverageDelphiScore;
    }

    /**
     * Converts this ArrayOfString into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ArrayOfString [" + "allHistoricalAverageDelphiScore="
                + allHistoricalAverageDelphiScore + "]";
    }

    /**
     * Builds a new {@link ArrayOfString.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ArrayOfString.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .allHistoricalAverageDelphiScore(getAllHistoricalAverageDelphiScore());
        return builder;
    }

    /**
     * Class to build instances of {@link ArrayOfString}.
     */
    public static class Builder {
        private List<String> allHistoricalAverageDelphiScore;



        /**
         * Setter for allHistoricalAverageDelphiScore.
         * @param  allHistoricalAverageDelphiScore  List of String value for
         *         allHistoricalAverageDelphiScore.
         * @return Builder
         */
        public Builder allHistoricalAverageDelphiScore(
                List<String> allHistoricalAverageDelphiScore) {
            this.allHistoricalAverageDelphiScore = allHistoricalAverageDelphiScore;
            return this;
        }

        /**
         * Builds a new {@link ArrayOfString} object using the set fields.
         * @return {@link ArrayOfString}
         */
        public ArrayOfString build() {
            return new ArrayOfString(allHistoricalAverageDelphiScore);
        }
    }
}
