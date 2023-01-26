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
 * This is a model class for FilingDetails type.
 */
public class FilingDetails {
    private String databaseAccountsOutOfDate;
    private String filedAccountsOutOfDate;
    private String latestAccounts;
    private String latestReturns;
    private String latestAccountsReceived;
    private String latestReturnsDatabase;
    private String latestAccountsDatabase;
    private Integer numAccountsOnFile;
    private String latestAccountType;
    private MMDD accountsRefDate;
    private Integer numberDaysToFileAccounts;

    /**
     * Default constructor.
     */
    public FilingDetails() {
    }

    /**
     * Initialization constructor.
     * @param  databaseAccountsOutOfDate  String value for databaseAccountsOutOfDate.
     * @param  filedAccountsOutOfDate  String value for filedAccountsOutOfDate.
     * @param  latestAccounts  String value for latestAccounts.
     * @param  latestReturns  String value for latestReturns.
     * @param  latestAccountsReceived  String value for latestAccountsReceived.
     * @param  latestReturnsDatabase  String value for latestReturnsDatabase.
     * @param  latestAccountsDatabase  String value for latestAccountsDatabase.
     * @param  numAccountsOnFile  Integer value for numAccountsOnFile.
     * @param  latestAccountType  String value for latestAccountType.
     * @param  accountsRefDate  MMDD value for accountsRefDate.
     * @param  numberDaysToFileAccounts  Integer value for numberDaysToFileAccounts.
     */
    public FilingDetails(
            String databaseAccountsOutOfDate,
            String filedAccountsOutOfDate,
            String latestAccounts,
            String latestReturns,
            String latestAccountsReceived,
            String latestReturnsDatabase,
            String latestAccountsDatabase,
            Integer numAccountsOnFile,
            String latestAccountType,
            MMDD accountsRefDate,
            Integer numberDaysToFileAccounts) {
        this.databaseAccountsOutOfDate = databaseAccountsOutOfDate;
        this.filedAccountsOutOfDate = filedAccountsOutOfDate;
        this.latestAccounts = latestAccounts;
        this.latestReturns = latestReturns;
        this.latestAccountsReceived = latestAccountsReceived;
        this.latestReturnsDatabase = latestReturnsDatabase;
        this.latestAccountsDatabase = latestAccountsDatabase;
        this.numAccountsOnFile = numAccountsOnFile;
        this.latestAccountType = latestAccountType;
        this.accountsRefDate = accountsRefDate;
        this.numberDaysToFileAccounts = numberDaysToFileAccounts;
    }

    /**
     * Getter for DatabaseAccountsOutOfDate.
     * Indicator showing whether more recent accounts are available for the limited company - Y =
     * More recent accounts available; N = Most recent accounts on file
     * @return Returns the String
     */
    @JsonGetter("DatabaseAccountsOutOfDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDatabaseAccountsOutOfDate() {
        return databaseAccountsOutOfDate;
    }

    /**
     * Setter for DatabaseAccountsOutOfDate.
     * Indicator showing whether more recent accounts are available for the limited company - Y =
     * More recent accounts available; N = Most recent accounts on file
     * @param databaseAccountsOutOfDate Value for String
     */
    @JsonSetter("DatabaseAccountsOutOfDate")
    public void setDatabaseAccountsOutOfDate(String databaseAccountsOutOfDate) {
        this.databaseAccountsOutOfDate = databaseAccountsOutOfDate;
    }

    /**
     * Getter for FiledAccountsOutOfDate.
     * Indicator showing whether the accounts for the limited company are out of date - Y = Filed
     * accounts out of date; N = Filed accounts up to date
     * @return Returns the String
     */
    @JsonGetter("FiledAccountsOutOfDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFiledAccountsOutOfDate() {
        return filedAccountsOutOfDate;
    }

    /**
     * Setter for FiledAccountsOutOfDate.
     * Indicator showing whether the accounts for the limited company are out of date - Y = Filed
     * accounts out of date; N = Filed accounts up to date
     * @param filedAccountsOutOfDate Value for String
     */
    @JsonSetter("FiledAccountsOutOfDate")
    public void setFiledAccountsOutOfDate(String filedAccountsOutOfDate) {
        this.filedAccountsOutOfDate = filedAccountsOutOfDate;
    }

    /**
     * Getter for LatestAccounts.
     * Filing date for the limited company latest accounts (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("LatestAccounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLatestAccounts() {
        return latestAccounts;
    }

    /**
     * Setter for LatestAccounts.
     * Filing date for the limited company latest accounts (yyyy-mm-dd)
     * @param latestAccounts Value for String
     */
    @JsonSetter("LatestAccounts")
    public void setLatestAccounts(String latestAccounts) {
        this.latestAccounts = latestAccounts;
    }

    /**
     * Getter for LatestReturns.
     * Filing date for the limited company latest returns (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("LatestReturns")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLatestReturns() {
        return latestReturns;
    }

    /**
     * Setter for LatestReturns.
     * Filing date for the limited company latest returns (yyyy-mm-dd)
     * @param latestReturns Value for String
     */
    @JsonSetter("LatestReturns")
    public void setLatestReturns(String latestReturns) {
        this.latestReturns = latestReturns;
    }

    /**
     * Getter for LatestAccountsReceived.
     * Date latest accounts were received (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("LatestAccountsReceived")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLatestAccountsReceived() {
        return latestAccountsReceived;
    }

    /**
     * Setter for LatestAccountsReceived.
     * Date latest accounts were received (yyyy-mm-dd)
     * @param latestAccountsReceived Value for String
     */
    @JsonSetter("LatestAccountsReceived")
    public void setLatestAccountsReceived(String latestAccountsReceived) {
        this.latestAccountsReceived = latestAccountsReceived;
    }

    /**
     * Getter for LatestReturnsDatabase.
     * Date latest returns were loaded (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("LatestReturnsDatabase")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLatestReturnsDatabase() {
        return latestReturnsDatabase;
    }

    /**
     * Setter for LatestReturnsDatabase.
     * Date latest returns were loaded (yyyy-mm-dd)
     * @param latestReturnsDatabase Value for String
     */
    @JsonSetter("LatestReturnsDatabase")
    public void setLatestReturnsDatabase(String latestReturnsDatabase) {
        this.latestReturnsDatabase = latestReturnsDatabase;
    }

    /**
     * Getter for LatestAccountsDatabase.
     * Date latest accounts were loaded (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("LatestAccountsDatabase")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLatestAccountsDatabase() {
        return latestAccountsDatabase;
    }

    /**
     * Setter for LatestAccountsDatabase.
     * Date latest accounts were loaded (yyyy-mm-dd)
     * @param latestAccountsDatabase Value for String
     */
    @JsonSetter("LatestAccountsDatabase")
    public void setLatestAccountsDatabase(String latestAccountsDatabase) {
        this.latestAccountsDatabase = latestAccountsDatabase;
    }

    /**
     * Getter for NumAccountsOnFile.
     * Number of years for which Experian has stored accounts
     * @return Returns the Integer
     */
    @JsonGetter("NumAccountsOnFile")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumAccountsOnFile() {
        return numAccountsOnFile;
    }

    /**
     * Setter for NumAccountsOnFile.
     * Number of years for which Experian has stored accounts
     * @param numAccountsOnFile Value for Integer
     */
    @JsonSetter("NumAccountsOnFile")
    public void setNumAccountsOnFile(Integer numAccountsOnFile) {
        this.numAccountsOnFile = numAccountsOnFile;
    }

    /**
     * Getter for LatestAccountType.
     * Indicator showing the type of latest accounts - 0 = Type not available; 1 = Full accounts; 2
     * = Small company; 3 = Medium company; 4 = Group; 5 = Dormant; 6 = Interim; 7 = Initial; 8 =
     * Total Exemption Full; 9 = Total Exemption small; A = Partial Exemption; G = Micro-Entities
     * Accounts; E = Audit Exemption Subsidiary; F = Filing Exemption Subsidiary; Z = None of the
     * above
     * @return Returns the String
     */
    @JsonGetter("LatestAccountType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLatestAccountType() {
        return latestAccountType;
    }

    /**
     * Setter for LatestAccountType.
     * Indicator showing the type of latest accounts - 0 = Type not available; 1 = Full accounts; 2
     * = Small company; 3 = Medium company; 4 = Group; 5 = Dormant; 6 = Interim; 7 = Initial; 8 =
     * Total Exemption Full; 9 = Total Exemption small; A = Partial Exemption; G = Micro-Entities
     * Accounts; E = Audit Exemption Subsidiary; F = Filing Exemption Subsidiary; Z = None of the
     * above
     * @param latestAccountType Value for String
     */
    @JsonSetter("LatestAccountType")
    public void setLatestAccountType(String latestAccountType) {
        this.latestAccountType = latestAccountType;
    }

    /**
     * Getter for AccountsRefDate.
     * @return Returns the MMDD
     */
    @JsonGetter("AccountsRefDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MMDD getAccountsRefDate() {
        return accountsRefDate;
    }

    /**
     * Setter for AccountsRefDate.
     * @param accountsRefDate Value for MMDD
     */
    @JsonSetter("AccountsRefDate")
    public void setAccountsRefDate(MMDD accountsRefDate) {
        this.accountsRefDate = accountsRefDate;
    }

    /**
     * Getter for NumberDaysToFileAccounts.
     * Number of days difference between Accounts Reference Date and date latest accounts filed at
     * Companies House
     * @return Returns the Integer
     */
    @JsonGetter("NumberDaysToFileAccounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumberDaysToFileAccounts() {
        return numberDaysToFileAccounts;
    }

    /**
     * Setter for NumberDaysToFileAccounts.
     * Number of days difference between Accounts Reference Date and date latest accounts filed at
     * Companies House
     * @param numberDaysToFileAccounts Value for Integer
     */
    @JsonSetter("NumberDaysToFileAccounts")
    public void setNumberDaysToFileAccounts(Integer numberDaysToFileAccounts) {
        this.numberDaysToFileAccounts = numberDaysToFileAccounts;
    }

    /**
     * Converts this FilingDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FilingDetails [" + "databaseAccountsOutOfDate=" + databaseAccountsOutOfDate
                + ", filedAccountsOutOfDate=" + filedAccountsOutOfDate + ", latestAccounts="
                + latestAccounts + ", latestReturns=" + latestReturns + ", latestAccountsReceived="
                + latestAccountsReceived + ", latestReturnsDatabase=" + latestReturnsDatabase
                + ", latestAccountsDatabase=" + latestAccountsDatabase + ", numAccountsOnFile="
                + numAccountsOnFile + ", latestAccountType=" + latestAccountType
                + ", accountsRefDate=" + accountsRefDate + ", numberDaysToFileAccounts="
                + numberDaysToFileAccounts + "]";
    }

    /**
     * Builds a new {@link FilingDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FilingDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .databaseAccountsOutOfDate(getDatabaseAccountsOutOfDate())
                .filedAccountsOutOfDate(getFiledAccountsOutOfDate())
                .latestAccounts(getLatestAccounts())
                .latestReturns(getLatestReturns())
                .latestAccountsReceived(getLatestAccountsReceived())
                .latestReturnsDatabase(getLatestReturnsDatabase())
                .latestAccountsDatabase(getLatestAccountsDatabase())
                .numAccountsOnFile(getNumAccountsOnFile())
                .latestAccountType(getLatestAccountType())
                .accountsRefDate(getAccountsRefDate())
                .numberDaysToFileAccounts(getNumberDaysToFileAccounts());
        return builder;
    }

    /**
     * Class to build instances of {@link FilingDetails}.
     */
    public static class Builder {
        private String databaseAccountsOutOfDate;
        private String filedAccountsOutOfDate;
        private String latestAccounts;
        private String latestReturns;
        private String latestAccountsReceived;
        private String latestReturnsDatabase;
        private String latestAccountsDatabase;
        private Integer numAccountsOnFile;
        private String latestAccountType;
        private MMDD accountsRefDate;
        private Integer numberDaysToFileAccounts;



        /**
         * Setter for databaseAccountsOutOfDate.
         * @param  databaseAccountsOutOfDate  String value for databaseAccountsOutOfDate.
         * @return Builder
         */
        public Builder databaseAccountsOutOfDate(String databaseAccountsOutOfDate) {
            this.databaseAccountsOutOfDate = databaseAccountsOutOfDate;
            return this;
        }

        /**
         * Setter for filedAccountsOutOfDate.
         * @param  filedAccountsOutOfDate  String value for filedAccountsOutOfDate.
         * @return Builder
         */
        public Builder filedAccountsOutOfDate(String filedAccountsOutOfDate) {
            this.filedAccountsOutOfDate = filedAccountsOutOfDate;
            return this;
        }

        /**
         * Setter for latestAccounts.
         * @param  latestAccounts  String value for latestAccounts.
         * @return Builder
         */
        public Builder latestAccounts(String latestAccounts) {
            this.latestAccounts = latestAccounts;
            return this;
        }

        /**
         * Setter for latestReturns.
         * @param  latestReturns  String value for latestReturns.
         * @return Builder
         */
        public Builder latestReturns(String latestReturns) {
            this.latestReturns = latestReturns;
            return this;
        }

        /**
         * Setter for latestAccountsReceived.
         * @param  latestAccountsReceived  String value for latestAccountsReceived.
         * @return Builder
         */
        public Builder latestAccountsReceived(String latestAccountsReceived) {
            this.latestAccountsReceived = latestAccountsReceived;
            return this;
        }

        /**
         * Setter for latestReturnsDatabase.
         * @param  latestReturnsDatabase  String value for latestReturnsDatabase.
         * @return Builder
         */
        public Builder latestReturnsDatabase(String latestReturnsDatabase) {
            this.latestReturnsDatabase = latestReturnsDatabase;
            return this;
        }

        /**
         * Setter for latestAccountsDatabase.
         * @param  latestAccountsDatabase  String value for latestAccountsDatabase.
         * @return Builder
         */
        public Builder latestAccountsDatabase(String latestAccountsDatabase) {
            this.latestAccountsDatabase = latestAccountsDatabase;
            return this;
        }

        /**
         * Setter for numAccountsOnFile.
         * @param  numAccountsOnFile  Integer value for numAccountsOnFile.
         * @return Builder
         */
        public Builder numAccountsOnFile(Integer numAccountsOnFile) {
            this.numAccountsOnFile = numAccountsOnFile;
            return this;
        }

        /**
         * Setter for latestAccountType.
         * @param  latestAccountType  String value for latestAccountType.
         * @return Builder
         */
        public Builder latestAccountType(String latestAccountType) {
            this.latestAccountType = latestAccountType;
            return this;
        }

        /**
         * Setter for accountsRefDate.
         * @param  accountsRefDate  MMDD value for accountsRefDate.
         * @return Builder
         */
        public Builder accountsRefDate(MMDD accountsRefDate) {
            this.accountsRefDate = accountsRefDate;
            return this;
        }

        /**
         * Setter for numberDaysToFileAccounts.
         * @param  numberDaysToFileAccounts  Integer value for numberDaysToFileAccounts.
         * @return Builder
         */
        public Builder numberDaysToFileAccounts(Integer numberDaysToFileAccounts) {
            this.numberDaysToFileAccounts = numberDaysToFileAccounts;
            return this;
        }

        /**
         * Builds a new {@link FilingDetails} object using the set fields.
         * @return {@link FilingDetails}
         */
        public FilingDetails build() {
            return new FilingDetails(databaseAccountsOutOfDate, filedAccountsOutOfDate,
                    latestAccounts, latestReturns, latestAccountsReceived, latestReturnsDatabase,
                    latestAccountsDatabase, numAccountsOnFile, latestAccountType, accountsRefDate,
                    numberDaysToFileAccounts);
        }
    }
}
