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
 * This is a model class for PrevSearchSICInfo type.
 */
public class PrevSearchSICInfo {
    private String code;
    private String description;
    private String type;

    /**
     * Default constructor.
     */
    public PrevSearchSICInfo() {
    }

    /**
     * Initialization constructor.
     * @param  code  String value for code.
     * @param  description  String value for description.
     * @param  type  String value for type.
     */
    public PrevSearchSICInfo(
            String code,
            String description,
            String type) {
        this.code = code;
        this.description = description;
        this.type = type;
    }

    /**
     * Getter for Code.
     * SIC Code of searching organisation
     * @return Returns the String
     */
    @JsonGetter("Code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * SIC Code of searching organisation
     * @param code Value for String
     */
    @JsonSetter("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Description.
     * SIC Description of searching organisation
     * @return Returns the String
     */
    @JsonGetter("Description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * SIC Description of searching organisation
     * @param description Value for String
     */
    @JsonSetter("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Type.
     * SIC Type of searching organisation
     * @return Returns the String
     */
    @JsonGetter("Type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * SIC Type of searching organisation
     * @param type Value for String
     */
    @JsonSetter("Type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Converts this PrevSearchSICInfo into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrevSearchSICInfo [" + "code=" + code + ", description=" + description + ", type="
                + type + "]";
    }

    /**
     * Builds a new {@link PrevSearchSICInfo.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrevSearchSICInfo.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .code(getCode())
                .description(getDescription())
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link PrevSearchSICInfo}.
     */
    public static class Builder {
        private String code;
        private String description;
        private String type;



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
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link PrevSearchSICInfo} object using the set fields.
         * @return {@link PrevSearchSICInfo}
         */
        public PrevSearchSICInfo build() {
            return new PrevSearchSICInfo(code, description, type);
        }
    }
}
