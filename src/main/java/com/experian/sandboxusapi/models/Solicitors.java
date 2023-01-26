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
 * This is a model class for Solicitors type.
 */
public class Solicitors {
    private String firmName;
    private String name;
    private LtdBusinessLocation solicitorLocation;

    /**
     * Default constructor.
     */
    public Solicitors() {
    }

    /**
     * Initialization constructor.
     * @param  firmName  String value for firmName.
     * @param  name  String value for name.
     * @param  solicitorLocation  LtdBusinessLocation value for solicitorLocation.
     */
    public Solicitors(
            String firmName,
            String name,
            LtdBusinessLocation solicitorLocation) {
        this.firmName = firmName;
        this.name = name;
        this.solicitorLocation = solicitorLocation;
    }

    /**
     * Getter for FirmName.
     * Trading Name of Solicitor for the Winding Up Petition for the limited company
     * @return Returns the String
     */
    @JsonGetter("FirmName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirmName() {
        return firmName;
    }

    /**
     * Setter for FirmName.
     * Trading Name of Solicitor for the Winding Up Petition for the limited company
     * @param firmName Value for String
     */
    @JsonSetter("FirmName")
    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    /**
     * Getter for Name.
     * Name of individual Solicitor for the Winding Up Petition for the limited company
     * @return Returns the String
     */
    @JsonGetter("Name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of individual Solicitor for the Winding Up Petition for the limited company
     * @param name Value for String
     */
    @JsonSetter("Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for SolicitorLocation.
     * @return Returns the LtdBusinessLocation
     */
    @JsonGetter("SolicitorLocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LtdBusinessLocation getSolicitorLocation() {
        return solicitorLocation;
    }

    /**
     * Setter for SolicitorLocation.
     * @param solicitorLocation Value for LtdBusinessLocation
     */
    @JsonSetter("SolicitorLocation")
    public void setSolicitorLocation(LtdBusinessLocation solicitorLocation) {
        this.solicitorLocation = solicitorLocation;
    }

    /**
     * Converts this Solicitors into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Solicitors [" + "firmName=" + firmName + ", name=" + name + ", solicitorLocation="
                + solicitorLocation + "]";
    }

    /**
     * Builds a new {@link Solicitors.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Solicitors.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .firmName(getFirmName())
                .name(getName())
                .solicitorLocation(getSolicitorLocation());
        return builder;
    }

    /**
     * Class to build instances of {@link Solicitors}.
     */
    public static class Builder {
        private String firmName;
        private String name;
        private LtdBusinessLocation solicitorLocation;



        /**
         * Setter for firmName.
         * @param  firmName  String value for firmName.
         * @return Builder
         */
        public Builder firmName(String firmName) {
            this.firmName = firmName;
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
         * Setter for solicitorLocation.
         * @param  solicitorLocation  LtdBusinessLocation value for solicitorLocation.
         * @return Builder
         */
        public Builder solicitorLocation(LtdBusinessLocation solicitorLocation) {
            this.solicitorLocation = solicitorLocation;
            return this;
        }

        /**
         * Builds a new {@link Solicitors} object using the set fields.
         * @return {@link Solicitors}
         */
        public Solicitors build() {
            return new Solicitors(firmName, name, solicitorLocation);
        }
    }
}