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
 * This is a model class for LimitedCompanyDelphiPayment type.
 */
public class LimitedCompanyDelphiPayment {
    private String averageCurrentDaysBeyondTerm;
    private String averageNumberExperiencesLast3month;
    private String numberOfAccountsCollectionLast12Months;
    private String numberUnpaidAccountsLastMonth;
    private String percentChangeLast3Months;

    /**
     * Default constructor.
     */
    public LimitedCompanyDelphiPayment() {
    }

    /**
     * Initialization constructor.
     * @param  averageCurrentDaysBeyondTerm  String value for averageCurrentDaysBeyondTerm.
     * @param  averageNumberExperiencesLast3month  String value for
     *         averageNumberExperiencesLast3month.
     * @param  numberOfAccountsCollectionLast12Months  String value for
     *         numberOfAccountsCollectionLast12Months.
     * @param  numberUnpaidAccountsLastMonth  String value for numberUnpaidAccountsLastMonth.
     * @param  percentChangeLast3Months  String value for percentChangeLast3Months.
     */
    public LimitedCompanyDelphiPayment(
            String averageCurrentDaysBeyondTerm,
            String averageNumberExperiencesLast3month,
            String numberOfAccountsCollectionLast12Months,
            String numberUnpaidAccountsLastMonth,
            String percentChangeLast3Months) {
        this.averageCurrentDaysBeyondTerm = averageCurrentDaysBeyondTerm;
        this.averageNumberExperiencesLast3month = averageNumberExperiencesLast3month;
        this.numberOfAccountsCollectionLast12Months = numberOfAccountsCollectionLast12Months;
        this.numberUnpaidAccountsLastMonth = numberUnpaidAccountsLastMonth;
        this.percentChangeLast3Months = percentChangeLast3Months;
    }

    /**
     * Getter for AverageCurrentDaysBeyondTerm.
     * Average current Days Beyond Terms
     * @return Returns the String
     */
    @JsonGetter("AverageCurrentDaysBeyondTerm")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAverageCurrentDaysBeyondTerm() {
        return averageCurrentDaysBeyondTerm;
    }

    /**
     * Setter for AverageCurrentDaysBeyondTerm.
     * Average current Days Beyond Terms
     * @param averageCurrentDaysBeyondTerm Value for String
     */
    @JsonSetter("AverageCurrentDaysBeyondTerm")
    public void setAverageCurrentDaysBeyondTerm(String averageCurrentDaysBeyondTerm) {
        this.averageCurrentDaysBeyondTerm = averageCurrentDaysBeyondTerm;
    }

    /**
     * Getter for AverageNumberExperiencesLast3month.
     * Average number of experiences last 3 months
     * @return Returns the String
     */
    @JsonGetter("AverageNumberExperiencesLast3month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAverageNumberExperiencesLast3month() {
        return averageNumberExperiencesLast3month;
    }

    /**
     * Setter for AverageNumberExperiencesLast3month.
     * Average number of experiences last 3 months
     * @param averageNumberExperiencesLast3month Value for String
     */
    @JsonSetter("AverageNumberExperiencesLast3month")
    public void setAverageNumberExperiencesLast3month(String averageNumberExperiencesLast3month) {
        this.averageNumberExperiencesLast3month = averageNumberExperiencesLast3month;
    }

    /**
     * Getter for NumberOfAccountsCollectionLast12Months.
     * Number of accounts placed for collection last 12 months
     * @return Returns the String
     */
    @JsonGetter("NumberOfAccountsCollectionLast12Months")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNumberOfAccountsCollectionLast12Months() {
        return numberOfAccountsCollectionLast12Months;
    }

    /**
     * Setter for NumberOfAccountsCollectionLast12Months.
     * Number of accounts placed for collection last 12 months
     * @param numberOfAccountsCollectionLast12Months Value for String
     */
    @JsonSetter("NumberOfAccountsCollectionLast12Months")
    public void setNumberOfAccountsCollectionLast12Months(String numberOfAccountsCollectionLast12Months) {
        this.numberOfAccountsCollectionLast12Months = numberOfAccountsCollectionLast12Months;
    }

    /**
     * Getter for NumberUnpaidAccountsLastMonth.
     * Number of unpaid accounts last month
     * @return Returns the String
     */
    @JsonGetter("NumberUnpaidAccountsLastMonth")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNumberUnpaidAccountsLastMonth() {
        return numberUnpaidAccountsLastMonth;
    }

    /**
     * Setter for NumberUnpaidAccountsLastMonth.
     * Number of unpaid accounts last month
     * @param numberUnpaidAccountsLastMonth Value for String
     */
    @JsonSetter("NumberUnpaidAccountsLastMonth")
    public void setNumberUnpaidAccountsLastMonth(String numberUnpaidAccountsLastMonth) {
        this.numberUnpaidAccountsLastMonth = numberUnpaidAccountsLastMonth;
    }

    /**
     * Getter for PercentChangeLast3Months.
     * Percentage change in Days Beyond Terms current to 3 months previous
     * @return Returns the String
     */
    @JsonGetter("PercentChangeLast3Months")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPercentChangeLast3Months() {
        return percentChangeLast3Months;
    }

    /**
     * Setter for PercentChangeLast3Months.
     * Percentage change in Days Beyond Terms current to 3 months previous
     * @param percentChangeLast3Months Value for String
     */
    @JsonSetter("PercentChangeLast3Months")
    public void setPercentChangeLast3Months(String percentChangeLast3Months) {
        this.percentChangeLast3Months = percentChangeLast3Months;
    }

    /**
     * Converts this LimitedCompanyDelphiPayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LimitedCompanyDelphiPayment [" + "averageCurrentDaysBeyondTerm="
                + averageCurrentDaysBeyondTerm + ", averageNumberExperiencesLast3month="
                + averageNumberExperiencesLast3month + ", numberOfAccountsCollectionLast12Months="
                + numberOfAccountsCollectionLast12Months + ", numberUnpaidAccountsLastMonth="
                + numberUnpaidAccountsLastMonth + ", percentChangeLast3Months="
                + percentChangeLast3Months + "]";
    }

    /**
     * Builds a new {@link LimitedCompanyDelphiPayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LimitedCompanyDelphiPayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .averageCurrentDaysBeyondTerm(getAverageCurrentDaysBeyondTerm())
                .averageNumberExperiencesLast3month(getAverageNumberExperiencesLast3month())
                .numberOfAccountsCollectionLast12Months(getNumberOfAccountsCollectionLast12Months())
                .numberUnpaidAccountsLastMonth(getNumberUnpaidAccountsLastMonth())
                .percentChangeLast3Months(getPercentChangeLast3Months());
        return builder;
    }

    /**
     * Class to build instances of {@link LimitedCompanyDelphiPayment}.
     */
    public static class Builder {
        private String averageCurrentDaysBeyondTerm;
        private String averageNumberExperiencesLast3month;
        private String numberOfAccountsCollectionLast12Months;
        private String numberUnpaidAccountsLastMonth;
        private String percentChangeLast3Months;



        /**
         * Setter for averageCurrentDaysBeyondTerm.
         * @param  averageCurrentDaysBeyondTerm  String value for averageCurrentDaysBeyondTerm.
         * @return Builder
         */
        public Builder averageCurrentDaysBeyondTerm(String averageCurrentDaysBeyondTerm) {
            this.averageCurrentDaysBeyondTerm = averageCurrentDaysBeyondTerm;
            return this;
        }

        /**
         * Setter for averageNumberExperiencesLast3month.
         * @param  averageNumberExperiencesLast3month  String value for
         *         averageNumberExperiencesLast3month.
         * @return Builder
         */
        public Builder averageNumberExperiencesLast3month(
                String averageNumberExperiencesLast3month) {
            this.averageNumberExperiencesLast3month = averageNumberExperiencesLast3month;
            return this;
        }

        /**
         * Setter for numberOfAccountsCollectionLast12Months.
         * @param  numberOfAccountsCollectionLast12Months  String value for
         *         numberOfAccountsCollectionLast12Months.
         * @return Builder
         */
        public Builder numberOfAccountsCollectionLast12Months(
                String numberOfAccountsCollectionLast12Months) {
            this.numberOfAccountsCollectionLast12Months = numberOfAccountsCollectionLast12Months;
            return this;
        }

        /**
         * Setter for numberUnpaidAccountsLastMonth.
         * @param  numberUnpaidAccountsLastMonth  String value for numberUnpaidAccountsLastMonth.
         * @return Builder
         */
        public Builder numberUnpaidAccountsLastMonth(String numberUnpaidAccountsLastMonth) {
            this.numberUnpaidAccountsLastMonth = numberUnpaidAccountsLastMonth;
            return this;
        }

        /**
         * Setter for percentChangeLast3Months.
         * @param  percentChangeLast3Months  String value for percentChangeLast3Months.
         * @return Builder
         */
        public Builder percentChangeLast3Months(String percentChangeLast3Months) {
            this.percentChangeLast3Months = percentChangeLast3Months;
            return this;
        }

        /**
         * Builds a new {@link LimitedCompanyDelphiPayment} object using the set fields.
         * @return {@link LimitedCompanyDelphiPayment}
         */
        public LimitedCompanyDelphiPayment build() {
            return new LimitedCompanyDelphiPayment(averageCurrentDaysBeyondTerm,
                    averageNumberExperiencesLast3month, numberOfAccountsCollectionLast12Months,
                    numberUnpaidAccountsLastMonth, percentChangeLast3Months);
        }
    }
}
