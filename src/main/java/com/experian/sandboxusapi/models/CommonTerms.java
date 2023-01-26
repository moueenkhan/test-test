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
 * This is a model class for CommonTerms type.
 */
public class CommonTerms {
    private String commonTermsCode;
    private Integer commonTermsDBT;
    private Integer commonTermsNumExp;
    private String commonTermsText;

    /**
     * Default constructor.
     */
    public CommonTerms() {
    }

    /**
     * Initialization constructor.
     * @param  commonTermsCode  String value for commonTermsCode.
     * @param  commonTermsDBT  Integer value for commonTermsDBT.
     * @param  commonTermsNumExp  Integer value for commonTermsNumExp.
     * @param  commonTermsText  String value for commonTermsText.
     */
    public CommonTerms(
            String commonTermsCode,
            Integer commonTermsDBT,
            Integer commonTermsNumExp,
            String commonTermsText) {
        this.commonTermsCode = commonTermsCode;
        this.commonTermsDBT = commonTermsDBT;
        this.commonTermsNumExp = commonTermsNumExp;
        this.commonTermsText = commonTermsText;
    }

    /**
     * Getter for CommonTermsCode.
     * Common terms code
     * @return Returns the String
     */
    @JsonGetter("CommonTermsCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCommonTermsCode() {
        return commonTermsCode;
    }

    /**
     * Setter for CommonTermsCode.
     * Common terms code
     * @param commonTermsCode Value for String
     */
    @JsonSetter("CommonTermsCode")
    public void setCommonTermsCode(String commonTermsCode) {
        this.commonTermsCode = commonTermsCode;
    }

    /**
     * Getter for CommonTermsDBT.
     * Days beyond terms for payment experience for the experience month for common terms
     * @return Returns the Integer
     */
    @JsonGetter("CommonTermsDBT")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCommonTermsDBT() {
        return commonTermsDBT;
    }

    /**
     * Setter for CommonTermsDBT.
     * Days beyond terms for payment experience for the experience month for common terms
     * @param commonTermsDBT Value for Integer
     */
    @JsonSetter("CommonTermsDBT")
    public void setCommonTermsDBT(Integer commonTermsDBT) {
        this.commonTermsDBT = commonTermsDBT;
    }

    /**
     * Getter for CommonTermsNumExp.
     * Number of experiences for days beyond terms for payment experience for the experience month
     * for common terms
     * @return Returns the Integer
     */
    @JsonGetter("CommonTermsNumExp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCommonTermsNumExp() {
        return commonTermsNumExp;
    }

    /**
     * Setter for CommonTermsNumExp.
     * Number of experiences for days beyond terms for payment experience for the experience month
     * for common terms
     * @param commonTermsNumExp Value for Integer
     */
    @JsonSetter("CommonTermsNumExp")
    public void setCommonTermsNumExp(Integer commonTermsNumExp) {
        this.commonTermsNumExp = commonTermsNumExp;
    }

    /**
     * Getter for CommonTermsText.
     * Common terms text
     * @return Returns the String
     */
    @JsonGetter("CommonTermsText")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCommonTermsText() {
        return commonTermsText;
    }

    /**
     * Setter for CommonTermsText.
     * Common terms text
     * @param commonTermsText Value for String
     */
    @JsonSetter("CommonTermsText")
    public void setCommonTermsText(String commonTermsText) {
        this.commonTermsText = commonTermsText;
    }

    /**
     * Converts this CommonTerms into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CommonTerms [" + "commonTermsCode=" + commonTermsCode + ", commonTermsDBT="
                + commonTermsDBT + ", commonTermsNumExp=" + commonTermsNumExp + ", commonTermsText="
                + commonTermsText + "]";
    }

    /**
     * Builds a new {@link CommonTerms.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CommonTerms.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .commonTermsCode(getCommonTermsCode())
                .commonTermsDBT(getCommonTermsDBT())
                .commonTermsNumExp(getCommonTermsNumExp())
                .commonTermsText(getCommonTermsText());
        return builder;
    }

    /**
     * Class to build instances of {@link CommonTerms}.
     */
    public static class Builder {
        private String commonTermsCode;
        private Integer commonTermsDBT;
        private Integer commonTermsNumExp;
        private String commonTermsText;



        /**
         * Setter for commonTermsCode.
         * @param  commonTermsCode  String value for commonTermsCode.
         * @return Builder
         */
        public Builder commonTermsCode(String commonTermsCode) {
            this.commonTermsCode = commonTermsCode;
            return this;
        }

        /**
         * Setter for commonTermsDBT.
         * @param  commonTermsDBT  Integer value for commonTermsDBT.
         * @return Builder
         */
        public Builder commonTermsDBT(Integer commonTermsDBT) {
            this.commonTermsDBT = commonTermsDBT;
            return this;
        }

        /**
         * Setter for commonTermsNumExp.
         * @param  commonTermsNumExp  Integer value for commonTermsNumExp.
         * @return Builder
         */
        public Builder commonTermsNumExp(Integer commonTermsNumExp) {
            this.commonTermsNumExp = commonTermsNumExp;
            return this;
        }

        /**
         * Setter for commonTermsText.
         * @param  commonTermsText  String value for commonTermsText.
         * @return Builder
         */
        public Builder commonTermsText(String commonTermsText) {
            this.commonTermsText = commonTermsText;
            return this;
        }

        /**
         * Builds a new {@link CommonTerms} object using the set fields.
         * @return {@link CommonTerms}
         */
        public CommonTerms build() {
            return new CommonTerms(commonTermsCode, commonTermsDBT, commonTermsNumExp,
                    commonTermsText);
        }
    }
}