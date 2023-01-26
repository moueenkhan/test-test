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
 * This is a model class for MonthlyData type.
 */
public class MonthlyData {
    private String monthYYYY;
    private String monthMM;
    private int status0;
    private int status1;
    private int status2;
    private int status3;
    private int status4;
    private int status5;
    private int status6;
    private int statusU;
    private int status8;
    private String currentBalance;
    private String currentDefaultBalanceIndicator;
    private int numberActiveAccounts;
    private String defaultBalance;
    private String defaultBalanceIndicator;
    private int dateLastStatus;

    /**
     * Default constructor.
     */
    public MonthlyData() {
    }

    /**
     * Initialization constructor.
     * @param  status0  int value for status0.
     * @param  status1  int value for status1.
     * @param  status2  int value for status2.
     * @param  status3  int value for status3.
     * @param  status4  int value for status4.
     * @param  status5  int value for status5.
     * @param  status6  int value for status6.
     * @param  statusU  int value for statusU.
     * @param  status8  int value for status8.
     * @param  numberActiveAccounts  int value for numberActiveAccounts.
     * @param  dateLastStatus  int value for dateLastStatus.
     * @param  monthYYYY  String value for monthYYYY.
     * @param  monthMM  String value for monthMM.
     * @param  currentBalance  String value for currentBalance.
     * @param  currentDefaultBalanceIndicator  String value for currentDefaultBalanceIndicator.
     * @param  defaultBalance  String value for defaultBalance.
     * @param  defaultBalanceIndicator  String value for defaultBalanceIndicator.
     */
    public MonthlyData(
            int status0,
            int status1,
            int status2,
            int status3,
            int status4,
            int status5,
            int status6,
            int statusU,
            int status8,
            int numberActiveAccounts,
            int dateLastStatus,
            String monthYYYY,
            String monthMM,
            String currentBalance,
            String currentDefaultBalanceIndicator,
            String defaultBalance,
            String defaultBalanceIndicator) {
        this.monthYYYY = monthYYYY;
        this.monthMM = monthMM;
        this.status0 = status0;
        this.status1 = status1;
        this.status2 = status2;
        this.status3 = status3;
        this.status4 = status4;
        this.status5 = status5;
        this.status6 = status6;
        this.statusU = statusU;
        this.status8 = status8;
        this.currentBalance = currentBalance;
        this.currentDefaultBalanceIndicator = currentDefaultBalanceIndicator;
        this.numberActiveAccounts = numberActiveAccounts;
        this.defaultBalance = defaultBalance;
        this.defaultBalanceIndicator = defaultBalanceIndicator;
        this.dateLastStatus = dateLastStatus;
    }

    /**
     * Getter for MonthYYYY.
     * @return Returns the String
     */
    @JsonGetter("MonthYYYY")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMonthYYYY() {
        return monthYYYY;
    }

    /**
     * Setter for MonthYYYY.
     * @param monthYYYY Value for String
     */
    @JsonSetter("MonthYYYY")
    public void setMonthYYYY(String monthYYYY) {
        this.monthYYYY = monthYYYY;
    }

    /**
     * Getter for MonthMM.
     * @return Returns the String
     */
    @JsonGetter("MonthMM")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMonthMM() {
        return monthMM;
    }

    /**
     * Setter for MonthMM.
     * @param monthMM Value for String
     */
    @JsonSetter("MonthMM")
    public void setMonthMM(String monthMM) {
        this.monthMM = monthMM;
    }

    /**
     * Getter for Status0.
     * @return Returns the int
     */
    @JsonGetter("Status0")
    public int getStatus0() {
        return status0;
    }

    /**
     * Setter for Status0.
     * @param status0 Value for int
     */
    @JsonSetter("Status0")
    public void setStatus0(int status0) {
        this.status0 = status0;
    }

    /**
     * Getter for Status1.
     * @return Returns the int
     */
    @JsonGetter("Status1")
    public int getStatus1() {
        return status1;
    }

    /**
     * Setter for Status1.
     * @param status1 Value for int
     */
    @JsonSetter("Status1")
    public void setStatus1(int status1) {
        this.status1 = status1;
    }

    /**
     * Getter for Status2.
     * @return Returns the int
     */
    @JsonGetter("Status2")
    public int getStatus2() {
        return status2;
    }

    /**
     * Setter for Status2.
     * @param status2 Value for int
     */
    @JsonSetter("Status2")
    public void setStatus2(int status2) {
        this.status2 = status2;
    }

    /**
     * Getter for Status3.
     * @return Returns the int
     */
    @JsonGetter("Status3")
    public int getStatus3() {
        return status3;
    }

    /**
     * Setter for Status3.
     * @param status3 Value for int
     */
    @JsonSetter("Status3")
    public void setStatus3(int status3) {
        this.status3 = status3;
    }

    /**
     * Getter for Status4.
     * @return Returns the int
     */
    @JsonGetter("Status4")
    public int getStatus4() {
        return status4;
    }

    /**
     * Setter for Status4.
     * @param status4 Value for int
     */
    @JsonSetter("Status4")
    public void setStatus4(int status4) {
        this.status4 = status4;
    }

    /**
     * Getter for Status5.
     * @return Returns the int
     */
    @JsonGetter("Status5")
    public int getStatus5() {
        return status5;
    }

    /**
     * Setter for Status5.
     * @param status5 Value for int
     */
    @JsonSetter("Status5")
    public void setStatus5(int status5) {
        this.status5 = status5;
    }

    /**
     * Getter for Status6.
     * @return Returns the int
     */
    @JsonGetter("Status6")
    public int getStatus6() {
        return status6;
    }

    /**
     * Setter for Status6.
     * @param status6 Value for int
     */
    @JsonSetter("Status6")
    public void setStatus6(int status6) {
        this.status6 = status6;
    }

    /**
     * Getter for StatusU.
     * Status U = Unknown
     * @return Returns the int
     */
    @JsonGetter("StatusU")
    public int getStatusU() {
        return statusU;
    }

    /**
     * Setter for StatusU.
     * Status U = Unknown
     * @param statusU Value for int
     */
    @JsonSetter("StatusU")
    public void setStatusU(int statusU) {
        this.statusU = statusU;
    }

    /**
     * Getter for Status8.
     * @return Returns the int
     */
    @JsonGetter("Status8")
    public int getStatus8() {
        return status8;
    }

    /**
     * Setter for Status8.
     * @param status8 Value for int
     */
    @JsonSetter("Status8")
    public void setStatus8(int status8) {
        this.status8 = status8;
    }

    /**
     * Getter for CurrentBalance.
     * Current Balance
     * @return Returns the String
     */
    @JsonGetter("CurrentBalance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Setter for CurrentBalance.
     * Current Balance
     * @param currentBalance Value for String
     */
    @JsonSetter("CurrentBalance")
    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }

    /**
     * Getter for CurrentDefaultBalanceIndicator.
     * Default balance indicator set to '-' if bal field above it is negative
     * @return Returns the String
     */
    @JsonGetter("CurrentDefaultBalanceIndicator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrentDefaultBalanceIndicator() {
        return currentDefaultBalanceIndicator;
    }

    /**
     * Setter for CurrentDefaultBalanceIndicator.
     * Default balance indicator set to '-' if bal field above it is negative
     * @param currentDefaultBalanceIndicator Value for String
     */
    @JsonSetter("CurrentDefaultBalanceIndicator")
    public void setCurrentDefaultBalanceIndicator(String currentDefaultBalanceIndicator) {
        this.currentDefaultBalanceIndicator = currentDefaultBalanceIndicator;
    }

    /**
     * Getter for NumberActiveAccounts.
     * Number of active accounts
     * @return Returns the int
     */
    @JsonGetter("NumberActiveAccounts")
    public int getNumberActiveAccounts() {
        return numberActiveAccounts;
    }

    /**
     * Setter for NumberActiveAccounts.
     * Number of active accounts
     * @param numberActiveAccounts Value for int
     */
    @JsonSetter("NumberActiveAccounts")
    public void setNumberActiveAccounts(int numberActiveAccounts) {
        this.numberActiveAccounts = numberActiveAccounts;
    }

    /**
     * Getter for DefaultBalance.
     * Default balance
     * @return Returns the String
     */
    @JsonGetter("DefaultBalance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDefaultBalance() {
        return defaultBalance;
    }

    /**
     * Setter for DefaultBalance.
     * Default balance
     * @param defaultBalance Value for String
     */
    @JsonSetter("DefaultBalance")
    public void setDefaultBalance(String defaultBalance) {
        this.defaultBalance = defaultBalance;
    }

    /**
     * Getter for DefaultBalanceIndicator.
     * Default balance indicator set to '-' if bal field above it is negative
     * @return Returns the String
     */
    @JsonGetter("DefaultBalanceIndicator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDefaultBalanceIndicator() {
        return defaultBalanceIndicator;
    }

    /**
     * Setter for DefaultBalanceIndicator.
     * Default balance indicator set to '-' if bal field above it is negative
     * @param defaultBalanceIndicator Value for String
     */
    @JsonSetter("DefaultBalanceIndicator")
    public void setDefaultBalanceIndicator(String defaultBalanceIndicator) {
        this.defaultBalanceIndicator = defaultBalanceIndicator;
    }

    /**
     * Getter for DateLastStatus.
     * Date of Last Status Change DDMMYYY. Date of the last change in Status
     * @return Returns the int
     */
    @JsonGetter("DateLastStatus")
    public int getDateLastStatus() {
        return dateLastStatus;
    }

    /**
     * Setter for DateLastStatus.
     * Date of Last Status Change DDMMYYY. Date of the last change in Status
     * @param dateLastStatus Value for int
     */
    @JsonSetter("DateLastStatus")
    public void setDateLastStatus(int dateLastStatus) {
        this.dateLastStatus = dateLastStatus;
    }

    /**
     * Converts this MonthlyData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MonthlyData [" + "status0=" + status0 + ", status1=" + status1 + ", status2="
                + status2 + ", status3=" + status3 + ", status4=" + status4 + ", status5=" + status5
                + ", status6=" + status6 + ", statusU=" + statusU + ", status8=" + status8
                + ", numberActiveAccounts=" + numberActiveAccounts + ", dateLastStatus="
                + dateLastStatus + ", monthYYYY=" + monthYYYY + ", monthMM=" + monthMM
                + ", currentBalance=" + currentBalance + ", currentDefaultBalanceIndicator="
                + currentDefaultBalanceIndicator + ", defaultBalance=" + defaultBalance
                + ", defaultBalanceIndicator=" + defaultBalanceIndicator + "]";
    }

    /**
     * Builds a new {@link MonthlyData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MonthlyData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(status0, status1, status2, status3, status4, status5, status6,
                statusU, status8, numberActiveAccounts, dateLastStatus)
                .monthYYYY(getMonthYYYY())
                .monthMM(getMonthMM())
                .currentBalance(getCurrentBalance())
                .currentDefaultBalanceIndicator(getCurrentDefaultBalanceIndicator())
                .defaultBalance(getDefaultBalance())
                .defaultBalanceIndicator(getDefaultBalanceIndicator());
        return builder;
    }

    /**
     * Class to build instances of {@link MonthlyData}.
     */
    public static class Builder {
        private int status0;
        private int status1;
        private int status2;
        private int status3;
        private int status4;
        private int status5;
        private int status6;
        private int statusU;
        private int status8;
        private int numberActiveAccounts;
        private int dateLastStatus;
        private String monthYYYY;
        private String monthMM;
        private String currentBalance;
        private String currentDefaultBalanceIndicator;
        private String defaultBalance;
        private String defaultBalanceIndicator;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  status0  int value for status0.
         * @param  status1  int value for status1.
         * @param  status2  int value for status2.
         * @param  status3  int value for status3.
         * @param  status4  int value for status4.
         * @param  status5  int value for status5.
         * @param  status6  int value for status6.
         * @param  statusU  int value for statusU.
         * @param  status8  int value for status8.
         * @param  numberActiveAccounts  int value for numberActiveAccounts.
         * @param  dateLastStatus  int value for dateLastStatus.
         */
        public Builder(int status0, int status1, int status2, int status3, int status4, int status5,
                int status6, int statusU, int status8, int numberActiveAccounts,
                int dateLastStatus) {
            this.status0 = status0;
            this.status1 = status1;
            this.status2 = status2;
            this.status3 = status3;
            this.status4 = status4;
            this.status5 = status5;
            this.status6 = status6;
            this.statusU = statusU;
            this.status8 = status8;
            this.numberActiveAccounts = numberActiveAccounts;
            this.dateLastStatus = dateLastStatus;
        }

        /**
         * Setter for status0.
         * @param  status0  int value for status0.
         * @return Builder
         */
        public Builder status0(int status0) {
            this.status0 = status0;
            return this;
        }

        /**
         * Setter for status1.
         * @param  status1  int value for status1.
         * @return Builder
         */
        public Builder status1(int status1) {
            this.status1 = status1;
            return this;
        }

        /**
         * Setter for status2.
         * @param  status2  int value for status2.
         * @return Builder
         */
        public Builder status2(int status2) {
            this.status2 = status2;
            return this;
        }

        /**
         * Setter for status3.
         * @param  status3  int value for status3.
         * @return Builder
         */
        public Builder status3(int status3) {
            this.status3 = status3;
            return this;
        }

        /**
         * Setter for status4.
         * @param  status4  int value for status4.
         * @return Builder
         */
        public Builder status4(int status4) {
            this.status4 = status4;
            return this;
        }

        /**
         * Setter for status5.
         * @param  status5  int value for status5.
         * @return Builder
         */
        public Builder status5(int status5) {
            this.status5 = status5;
            return this;
        }

        /**
         * Setter for status6.
         * @param  status6  int value for status6.
         * @return Builder
         */
        public Builder status6(int status6) {
            this.status6 = status6;
            return this;
        }

        /**
         * Setter for statusU.
         * @param  statusU  int value for statusU.
         * @return Builder
         */
        public Builder statusU(int statusU) {
            this.statusU = statusU;
            return this;
        }

        /**
         * Setter for status8.
         * @param  status8  int value for status8.
         * @return Builder
         */
        public Builder status8(int status8) {
            this.status8 = status8;
            return this;
        }

        /**
         * Setter for numberActiveAccounts.
         * @param  numberActiveAccounts  int value for numberActiveAccounts.
         * @return Builder
         */
        public Builder numberActiveAccounts(int numberActiveAccounts) {
            this.numberActiveAccounts = numberActiveAccounts;
            return this;
        }

        /**
         * Setter for dateLastStatus.
         * @param  dateLastStatus  int value for dateLastStatus.
         * @return Builder
         */
        public Builder dateLastStatus(int dateLastStatus) {
            this.dateLastStatus = dateLastStatus;
            return this;
        }

        /**
         * Setter for monthYYYY.
         * @param  monthYYYY  String value for monthYYYY.
         * @return Builder
         */
        public Builder monthYYYY(String monthYYYY) {
            this.monthYYYY = monthYYYY;
            return this;
        }

        /**
         * Setter for monthMM.
         * @param  monthMM  String value for monthMM.
         * @return Builder
         */
        public Builder monthMM(String monthMM) {
            this.monthMM = monthMM;
            return this;
        }

        /**
         * Setter for currentBalance.
         * @param  currentBalance  String value for currentBalance.
         * @return Builder
         */
        public Builder currentBalance(String currentBalance) {
            this.currentBalance = currentBalance;
            return this;
        }

        /**
         * Setter for currentDefaultBalanceIndicator.
         * @param  currentDefaultBalanceIndicator  String value for currentDefaultBalanceIndicator.
         * @return Builder
         */
        public Builder currentDefaultBalanceIndicator(String currentDefaultBalanceIndicator) {
            this.currentDefaultBalanceIndicator = currentDefaultBalanceIndicator;
            return this;
        }

        /**
         * Setter for defaultBalance.
         * @param  defaultBalance  String value for defaultBalance.
         * @return Builder
         */
        public Builder defaultBalance(String defaultBalance) {
            this.defaultBalance = defaultBalance;
            return this;
        }

        /**
         * Setter for defaultBalanceIndicator.
         * @param  defaultBalanceIndicator  String value for defaultBalanceIndicator.
         * @return Builder
         */
        public Builder defaultBalanceIndicator(String defaultBalanceIndicator) {
            this.defaultBalanceIndicator = defaultBalanceIndicator;
            return this;
        }

        /**
         * Builds a new {@link MonthlyData} object using the set fields.
         * @return {@link MonthlyData}
         */
        public MonthlyData build() {
            return new MonthlyData(status0, status1, status2, status3, status4, status5, status6,
                    statusU, status8, numberActiveAccounts, dateLastStatus, monthYYYY, monthMM,
                    currentBalance, currentDefaultBalanceIndicator, defaultBalance,
                    defaultBalanceIndicator);
        }
    }
}
