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
 * This is a model class for PrevName type.
 */
public class PrevName {
    private String dateChanged;
    private String name;

    /**
     * Default constructor.
     */
    public PrevName() {
    }

    /**
     * Initialization constructor.
     * @param  dateChanged  String value for dateChanged.
     * @param  name  String value for name.
     */
    public PrevName(
            String dateChanged,
            String name) {
        this.dateChanged = dateChanged;
        this.name = name;
    }

    /**
     * Getter for DateChanged.
     * Date company name changed (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("DateChanged")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDateChanged() {
        return dateChanged;
    }

    /**
     * Setter for DateChanged.
     * Date company name changed (yyyy-mm-dd)
     * @param dateChanged Value for String
     */
    @JsonSetter("DateChanged")
    public void setDateChanged(String dateChanged) {
        this.dateChanged = dateChanged;
    }

    /**
     * Getter for Name.
     * Name prior to associated change date that the limited company name changed
     * @return Returns the String
     */
    @JsonGetter("Name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name prior to associated change date that the limited company name changed
     * @param name Value for String
     */
    @JsonSetter("Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Converts this PrevName into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrevName [" + "dateChanged=" + dateChanged + ", name=" + name + "]";
    }

    /**
     * Builds a new {@link PrevName.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrevName.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dateChanged(getDateChanged())
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link PrevName}.
     */
    public static class Builder {
        private String dateChanged;
        private String name;



        /**
         * Setter for dateChanged.
         * @param  dateChanged  String value for dateChanged.
         * @return Builder
         */
        public Builder dateChanged(String dateChanged) {
            this.dateChanged = dateChanged;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Builds a new {@link PrevName} object using the set fields.
         * @return {@link PrevName}
         */
        public PrevName build() {
            return new PrevName(dateChanged, name);
        }
    }
}
