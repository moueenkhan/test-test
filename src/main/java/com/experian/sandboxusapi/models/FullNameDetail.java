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
 * This is a model class for FullNameDetail type.
 */
public class FullNameDetail {
    private String title;
    private String prefix;
    private String forename;
    private String middleNames;
    private String surname;
    private String suffix;

    /**
     * Default constructor.
     */
    public FullNameDetail() {
    }

    /**
     * Initialization constructor.
     * @param  title  String value for title.
     * @param  prefix  String value for prefix.
     * @param  forename  String value for forename.
     * @param  middleNames  String value for middleNames.
     * @param  surname  String value for surname.
     * @param  suffix  String value for suffix.
     */
    public FullNameDetail(
            String title,
            String prefix,
            String forename,
            String middleNames,
            String surname,
            String suffix) {
        this.title = title;
        this.prefix = prefix;
        this.forename = forename;
        this.middleNames = middleNames;
        this.surname = surname;
        this.suffix = suffix;
    }

    /**
     * Getter for Title.
     * Director's title (Lord, Dame, etc.) returned from the Director search
     * @return Returns the String
     */
    @JsonGetter("Title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * Director's title (Lord, Dame, etc.) returned from the Director search
     * @param title Value for String
     */
    @JsonSetter("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for Prefix.
     * Director's name prefix (Mr, Mrs, Dr, Sir, Professor etc.) returned from the Director search
     * @return Returns the String
     */
    @JsonGetter("Prefix")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrefix() {
        return prefix;
    }

    /**
     * Setter for Prefix.
     * Director's name prefix (Mr, Mrs, Dr, Sir, Professor etc.) returned from the Director search
     * @param prefix Value for String
     */
    @JsonSetter("Prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Getter for Forename.
     * Director's forename returned from the Director search
     * @return Returns the String
     */
    @JsonGetter("Forename")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getForename() {
        return forename;
    }

    /**
     * Setter for Forename.
     * Director's forename returned from the Director search
     * @param forename Value for String
     */
    @JsonSetter("Forename")
    public void setForename(String forename) {
        this.forename = forename;
    }

    /**
     * Getter for MiddleNames.
     * Director's middle names returned from the Director search
     * @return Returns the String
     */
    @JsonGetter("MiddleNames")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMiddleNames() {
        return middleNames;
    }

    /**
     * Setter for MiddleNames.
     * Director's middle names returned from the Director search
     * @param middleNames Value for String
     */
    @JsonSetter("MiddleNames")
    public void setMiddleNames(String middleNames) {
        this.middleNames = middleNames;
    }

    /**
     * Getter for Surname.
     * Director's surname returned from the Director search
     * @return Returns the String
     */
    @JsonGetter("Surname")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSurname() {
        return surname;
    }

    /**
     * Setter for Surname.
     * Director's surname returned from the Director search
     * @param surname Value for String
     */
    @JsonSetter("Surname")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Getter for Suffix.
     * Director's name suffix (Jnr. etc.) returned from the Director search
     * @return Returns the String
     */
    @JsonGetter("Suffix")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSuffix() {
        return suffix;
    }

    /**
     * Setter for Suffix.
     * Director's name suffix (Jnr. etc.) returned from the Director search
     * @param suffix Value for String
     */
    @JsonSetter("Suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * Converts this FullNameDetail into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FullNameDetail [" + "title=" + title + ", prefix=" + prefix + ", forename="
                + forename + ", middleNames=" + middleNames + ", surname=" + surname + ", suffix="
                + suffix + "]";
    }

    /**
     * Builds a new {@link FullNameDetail.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FullNameDetail.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .title(getTitle())
                .prefix(getPrefix())
                .forename(getForename())
                .middleNames(getMiddleNames())
                .surname(getSurname())
                .suffix(getSuffix());
        return builder;
    }

    /**
     * Class to build instances of {@link FullNameDetail}.
     */
    public static class Builder {
        private String title;
        private String prefix;
        private String forename;
        private String middleNames;
        private String surname;
        private String suffix;



        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Setter for prefix.
         * @param  prefix  String value for prefix.
         * @return Builder
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Setter for forename.
         * @param  forename  String value for forename.
         * @return Builder
         */
        public Builder forename(String forename) {
            this.forename = forename;
            return this;
        }

        /**
         * Setter for middleNames.
         * @param  middleNames  String value for middleNames.
         * @return Builder
         */
        public Builder middleNames(String middleNames) {
            this.middleNames = middleNames;
            return this;
        }

        /**
         * Setter for surname.
         * @param  surname  String value for surname.
         * @return Builder
         */
        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        /**
         * Setter for suffix.
         * @param  suffix  String value for suffix.
         * @return Builder
         */
        public Builder suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        /**
         * Builds a new {@link FullNameDetail} object using the set fields.
         * @return {@link FullNameDetail}
         */
        public FullNameDetail build() {
            return new FullNameDetail(title, prefix, forename, middleNames, surname, suffix);
        }
    }
}
