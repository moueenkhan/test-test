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
 * This is a model class for PrevCRO type.
 */
public class PrevCRO {
    private String dateChanged;
    private LtdBusinessLocation registeredOffice;

    /**
     * Default constructor.
     */
    public PrevCRO() {
    }

    /**
     * Initialization constructor.
     * @param  dateChanged  String value for dateChanged.
     * @param  registeredOffice  LtdBusinessLocation value for registeredOffice.
     */
    public PrevCRO(
            String dateChanged,
            LtdBusinessLocation registeredOffice) {
        this.dateChanged = dateChanged;
        this.registeredOffice = registeredOffice;
    }

    /**
     * Getter for DateChanged.
     * Date registered office changed (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("DateChanged")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDateChanged() {
        return dateChanged;
    }

    /**
     * Setter for DateChanged.
     * Date registered office changed (yyyy-mm-dd)
     * @param dateChanged Value for String
     */
    @JsonSetter("DateChanged")
    public void setDateChanged(String dateChanged) {
        this.dateChanged = dateChanged;
    }

    /**
     * Getter for RegisteredOffice.
     * @return Returns the LtdBusinessLocation
     */
    @JsonGetter("RegisteredOffice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LtdBusinessLocation getRegisteredOffice() {
        return registeredOffice;
    }

    /**
     * Setter for RegisteredOffice.
     * @param registeredOffice Value for LtdBusinessLocation
     */
    @JsonSetter("RegisteredOffice")
    public void setRegisteredOffice(LtdBusinessLocation registeredOffice) {
        this.registeredOffice = registeredOffice;
    }

    /**
     * Converts this PrevCRO into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrevCRO [" + "dateChanged=" + dateChanged + ", registeredOffice=" + registeredOffice
                + "]";
    }

    /**
     * Builds a new {@link PrevCRO.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrevCRO.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .dateChanged(getDateChanged())
                .registeredOffice(getRegisteredOffice());
        return builder;
    }

    /**
     * Class to build instances of {@link PrevCRO}.
     */
    public static class Builder {
        private String dateChanged;
        private LtdBusinessLocation registeredOffice;



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
         * Setter for registeredOffice.
         * @param  registeredOffice  LtdBusinessLocation value for registeredOffice.
         * @return Builder
         */
        public Builder registeredOffice(LtdBusinessLocation registeredOffice) {
            this.registeredOffice = registeredOffice;
            return this;
        }

        /**
         * Builds a new {@link PrevCRO} object using the set fields.
         * @return {@link PrevCRO}
         */
        public PrevCRO build() {
            return new PrevCRO(dateChanged, registeredOffice);
        }
    }
}