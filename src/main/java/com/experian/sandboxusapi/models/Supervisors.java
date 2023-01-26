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
 * This is a model class for Supervisors type.
 */
public class Supervisors {
    private String firmName;
    private String name;
    private LtdBusinessLocation supervisorLocation;

    /**
     * Default constructor.
     */
    public Supervisors() {
    }

    /**
     * Initialization constructor.
     * @param  firmName  String value for firmName.
     * @param  name  String value for name.
     * @param  supervisorLocation  LtdBusinessLocation value for supervisorLocation.
     */
    public Supervisors(
            String firmName,
            String name,
            LtdBusinessLocation supervisorLocation) {
        this.firmName = firmName;
        this.name = name;
        this.supervisorLocation = supervisorLocation;
    }

    /**
     * Getter for FirmName.
     * Trading Name of Supervisor for the voluntary arrangement for the limited company
     * @return Returns the String
     */
    @JsonGetter("FirmName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirmName() {
        return firmName;
    }

    /**
     * Setter for FirmName.
     * Trading Name of Supervisor for the voluntary arrangement for the limited company
     * @param firmName Value for String
     */
    @JsonSetter("FirmName")
    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    /**
     * Getter for Name.
     * Name of individual Supervisor for the voluntary arrangement for the limited company
     * @return Returns the String
     */
    @JsonGetter("Name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of individual Supervisor for the voluntary arrangement for the limited company
     * @param name Value for String
     */
    @JsonSetter("Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for SupervisorLocation.
     * @return Returns the LtdBusinessLocation
     */
    @JsonGetter("SupervisorLocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LtdBusinessLocation getSupervisorLocation() {
        return supervisorLocation;
    }

    /**
     * Setter for SupervisorLocation.
     * @param supervisorLocation Value for LtdBusinessLocation
     */
    @JsonSetter("SupervisorLocation")
    public void setSupervisorLocation(LtdBusinessLocation supervisorLocation) {
        this.supervisorLocation = supervisorLocation;
    }

    /**
     * Converts this Supervisors into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Supervisors [" + "firmName=" + firmName + ", name=" + name + ", supervisorLocation="
                + supervisorLocation + "]";
    }

    /**
     * Builds a new {@link Supervisors.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Supervisors.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .firmName(getFirmName())
                .name(getName())
                .supervisorLocation(getSupervisorLocation());
        return builder;
    }

    /**
     * Class to build instances of {@link Supervisors}.
     */
    public static class Builder {
        private String firmName;
        private String name;
        private LtdBusinessLocation supervisorLocation;



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
         * Setter for supervisorLocation.
         * @param  supervisorLocation  LtdBusinessLocation value for supervisorLocation.
         * @return Builder
         */
        public Builder supervisorLocation(LtdBusinessLocation supervisorLocation) {
            this.supervisorLocation = supervisorLocation;
            return this;
        }

        /**
         * Builds a new {@link Supervisors} object using the set fields.
         * @return {@link Supervisors}
         */
        public Supervisors build() {
            return new Supervisors(firmName, name, supervisorLocation);
        }
    }
}