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
 * This is a model class for SICInfo92 type.
 */
public class SICInfo92 {
    private String code;
    private String description;

    /**
     * Default constructor.
     */
    public SICInfo92() {
    }

    /**
     * Initialization constructor.
     * @param  code  String value for code.
     * @param  description  String value for description.
     */
    public SICInfo92(
            String code,
            String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * Getter for Code.
     * The 1992 SIC code for the limited company
     * @return Returns the String
     */
    @JsonGetter("Code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * The 1992 SIC code for the limited company
     * @param code Value for String
     */
    @JsonSetter("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Description.
     * The description associated with The 1992 SIC code for the limited company
     * @return Returns the String
     */
    @JsonGetter("Description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The description associated with The 1992 SIC code for the limited company
     * @param description Value for String
     */
    @JsonSetter("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Converts this SICInfo92 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SICInfo92 [" + "code=" + code + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link SICInfo92.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SICInfo92.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .code(getCode())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link SICInfo92}.
     */
    public static class Builder {
        private String code;
        private String description;



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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link SICInfo92} object using the set fields.
         * @return {@link SICInfo92}
         */
        public SICInfo92 build() {
            return new SICInfo92(code, description);
        }
    }
}
