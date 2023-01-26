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
 * This is a model class for ConvictionDetails type.
 */
public class ConvictionDetails {
    private String date;
    private String reason;
    private String fine;
    private String costs;

    /**
     * Default constructor.
     */
    public ConvictionDetails() {
    }

    /**
     * Initialization constructor.
     * @param  date  String value for date.
     * @param  reason  String value for reason.
     * @param  fine  String value for fine.
     * @param  costs  String value for costs.
     */
    public ConvictionDetails(
            String date,
            String reason,
            String fine,
            String costs) {
        this.date = date;
        this.reason = reason;
        this.fine = fine;
        this.costs = costs;
    }

    /**
     * Getter for Date.
     * The date of Current Director's conviction (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("Date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDate() {
        return date;
    }

    /**
     * Setter for Date.
     * The date of Current Director's conviction (yyyy-mm-dd)
     * @param date Value for String
     */
    @JsonSetter("Date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Getter for Reason.
     * Conviction Reason code - A = Accounts; R = Returns; B = Both
     * @return Returns the String
     */
    @JsonGetter("Reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReason() {
        return reason;
    }

    /**
     * Setter for Reason.
     * Conviction Reason code - A = Accounts; R = Returns; B = Both
     * @param reason Value for String
     */
    @JsonSetter("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Getter for Fine.
     * Value of fine associated with conviction
     * @return Returns the String
     */
    @JsonGetter("Fine")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFine() {
        return fine;
    }

    /**
     * Setter for Fine.
     * Value of fine associated with conviction
     * @param fine Value for String
     */
    @JsonSetter("Fine")
    public void setFine(String fine) {
        this.fine = fine;
    }

    /**
     * Getter for Costs.
     * Value of costs associated with conviction
     * @return Returns the String
     */
    @JsonGetter("Costs")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCosts() {
        return costs;
    }

    /**
     * Setter for Costs.
     * Value of costs associated with conviction
     * @param costs Value for String
     */
    @JsonSetter("Costs")
    public void setCosts(String costs) {
        this.costs = costs;
    }

    /**
     * Converts this ConvictionDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConvictionDetails [" + "date=" + date + ", reason=" + reason + ", fine=" + fine
                + ", costs=" + costs + "]";
    }

    /**
     * Builds a new {@link ConvictionDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ConvictionDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .date(getDate())
                .reason(getReason())
                .fine(getFine())
                .costs(getCosts());
        return builder;
    }

    /**
     * Class to build instances of {@link ConvictionDetails}.
     */
    public static class Builder {
        private String date;
        private String reason;
        private String fine;
        private String costs;



        /**
         * Setter for date.
         * @param  date  String value for date.
         * @return Builder
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }

        /**
         * Setter for reason.
         * @param  reason  String value for reason.
         * @return Builder
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Setter for fine.
         * @param  fine  String value for fine.
         * @return Builder
         */
        public Builder fine(String fine) {
            this.fine = fine;
            return this;
        }

        /**
         * Setter for costs.
         * @param  costs  String value for costs.
         * @return Builder
         */
        public Builder costs(String costs) {
            this.costs = costs;
            return this;
        }

        /**
         * Builds a new {@link ConvictionDetails} object using the set fields.
         * @return {@link ConvictionDetails}
         */
        public ConvictionDetails build() {
            return new ConvictionDetails(date, reason, fine, costs);
        }
    }
}