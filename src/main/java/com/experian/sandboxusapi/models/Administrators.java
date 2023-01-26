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
 * This is a model class for Administrators type.
 */
public class Administrators {
    private List<Appointment> appointment;
    private List<Discharge> discharge;

    /**
     * Default constructor.
     */
    public Administrators() {
    }

    /**
     * Initialization constructor.
     * @param  appointment  List of Appointment value for appointment.
     * @param  discharge  List of Discharge value for discharge.
     */
    public Administrators(
            List<Appointment> appointment,
            List<Discharge> discharge) {
        this.appointment = appointment;
        this.discharge = discharge;
    }

    /**
     * Getter for Appointment.
     * @return Returns the List of Appointment
     */
    @JsonGetter("Appointment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Appointment> getAppointment() {
        return appointment;
    }

    /**
     * Setter for Appointment.
     * @param appointment Value for List of Appointment
     */
    @JsonSetter("Appointment")
    public void setAppointment(List<Appointment> appointment) {
        this.appointment = appointment;
    }

    /**
     * Getter for Discharge.
     * @return Returns the List of Discharge
     */
    @JsonGetter("Discharge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Discharge> getDischarge() {
        return discharge;
    }

    /**
     * Setter for Discharge.
     * @param discharge Value for List of Discharge
     */
    @JsonSetter("Discharge")
    public void setDischarge(List<Discharge> discharge) {
        this.discharge = discharge;
    }

    /**
     * Converts this Administrators into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Administrators [" + "appointment=" + appointment + ", discharge=" + discharge + "]";
    }

    /**
     * Builds a new {@link Administrators.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Administrators.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .appointment(getAppointment())
                .discharge(getDischarge());
        return builder;
    }

    /**
     * Class to build instances of {@link Administrators}.
     */
    public static class Builder {
        private List<Appointment> appointment;
        private List<Discharge> discharge;



        /**
         * Setter for appointment.
         * @param  appointment  List of Appointment value for appointment.
         * @return Builder
         */
        public Builder appointment(List<Appointment> appointment) {
            this.appointment = appointment;
            return this;
        }

        /**
         * Setter for discharge.
         * @param  discharge  List of Discharge value for discharge.
         * @return Builder
         */
        public Builder discharge(List<Discharge> discharge) {
            this.discharge = discharge;
            return this;
        }

        /**
         * Builds a new {@link Administrators} object using the set fields.
         * @return {@link Administrators}
         */
        public Administrators build() {
            return new Administrators(appointment, discharge);
        }
    }
}
