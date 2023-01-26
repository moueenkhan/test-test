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
 * This is a model class for SICInfo1980 type.
 */
public class SICInfo1980 {
    private String code;

    /**
     * Default constructor.
     */
    public SICInfo1980() {
    }

    /**
     * Initialization constructor.
     * @param  code  String value for code.
     */
    public SICInfo1980(
            String code) {
        this.code = code;
    }

    /**
     * Getter for Code.
     * The 1980 SIC code for the limited company
     * @return Returns the String
     */
    @JsonGetter("Code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * The 1980 SIC code for the limited company
     * @param code Value for String
     */
    @JsonSetter("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Converts this SICInfo1980 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SICInfo1980 [" + "code=" + code + "]";
    }

    /**
     * Builds a new {@link SICInfo1980.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SICInfo1980.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .code(getCode());
        return builder;
    }

    /**
     * Class to build instances of {@link SICInfo1980}.
     */
    public static class Builder {
        private String code;



        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Builds a new {@link SICInfo1980} object using the set fields.
         * @return {@link SICInfo1980}
         */
        public SICInfo1980 build() {
            return new SICInfo1980(code);
        }
    }
}