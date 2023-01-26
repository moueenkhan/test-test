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
 * This is a model class for OtherNonCurrentAssetsDetails type.
 */
public class OtherNonCurrentAssetsDetails {
    private Double otherNonCurrentAssets;
    private Double longTermTrade;
    private Double subsidiaryAssociateJoint;
    private Double assetsHeldForResale;
    private Double other;

    /**
     * Default constructor.
     */
    public OtherNonCurrentAssetsDetails() {
    }

    /**
     * Initialization constructor.
     * @param  otherNonCurrentAssets  Double value for otherNonCurrentAssets.
     * @param  longTermTrade  Double value for longTermTrade.
     * @param  subsidiaryAssociateJoint  Double value for subsidiaryAssociateJoint.
     * @param  assetsHeldForResale  Double value for assetsHeldForResale.
     * @param  other  Double value for other.
     */
    public OtherNonCurrentAssetsDetails(
            Double otherNonCurrentAssets,
            Double longTermTrade,
            Double subsidiaryAssociateJoint,
            Double assetsHeldForResale,
            Double other) {
        this.otherNonCurrentAssets = otherNonCurrentAssets;
        this.longTermTrade = longTermTrade;
        this.subsidiaryAssociateJoint = subsidiaryAssociateJoint;
        this.assetsHeldForResale = assetsHeldForResale;
        this.other = other;
    }

    /**
     * Getter for OtherNonCurrentAssets.
     * Value for Balance Sheet - Other Non Current Assets Details - Other Non Current Assets for
     * these accounts
     * @return Returns the Double
     */
    @JsonGetter("OtherNonCurrentAssets")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getOtherNonCurrentAssets() {
        return otherNonCurrentAssets;
    }

    /**
     * Setter for OtherNonCurrentAssets.
     * Value for Balance Sheet - Other Non Current Assets Details - Other Non Current Assets for
     * these accounts
     * @param otherNonCurrentAssets Value for Double
     */
    @JsonSetter("OtherNonCurrentAssets")
    public void setOtherNonCurrentAssets(Double otherNonCurrentAssets) {
        this.otherNonCurrentAssets = otherNonCurrentAssets;
    }

    /**
     * Getter for LongTermTrade.
     * Value for Balance Sheet - Other Non Current Assets Details - Other Long Term Trade for these
     * accounts
     * @return Returns the Double
     */
    @JsonGetter("LongTermTrade")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getLongTermTrade() {
        return longTermTrade;
    }

    /**
     * Setter for LongTermTrade.
     * Value for Balance Sheet - Other Non Current Assets Details - Other Long Term Trade for these
     * accounts
     * @param longTermTrade Value for Double
     */
    @JsonSetter("LongTermTrade")
    public void setLongTermTrade(Double longTermTrade) {
        this.longTermTrade = longTermTrade;
    }

    /**
     * Getter for SubsidiaryAssociateJoint.
     * Value for Balance Sheet - Other Non Current Assets Details - Subsidiary / Associate / Joint
     * assets for these accounts
     * @return Returns the Double
     */
    @JsonGetter("SubsidiaryAssociateJoint")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getSubsidiaryAssociateJoint() {
        return subsidiaryAssociateJoint;
    }

    /**
     * Setter for SubsidiaryAssociateJoint.
     * Value for Balance Sheet - Other Non Current Assets Details - Subsidiary / Associate / Joint
     * assets for these accounts
     * @param subsidiaryAssociateJoint Value for Double
     */
    @JsonSetter("SubsidiaryAssociateJoint")
    public void setSubsidiaryAssociateJoint(Double subsidiaryAssociateJoint) {
        this.subsidiaryAssociateJoint = subsidiaryAssociateJoint;
    }

    /**
     * Getter for AssetsHeldForResale.
     * Value for Balance Sheet - Other Non Current Assets Details - Assets Held for Resale for these
     * accounts
     * @return Returns the Double
     */
    @JsonGetter("AssetsHeldForResale")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAssetsHeldForResale() {
        return assetsHeldForResale;
    }

    /**
     * Setter for AssetsHeldForResale.
     * Value for Balance Sheet - Other Non Current Assets Details - Assets Held for Resale for these
     * accounts
     * @param assetsHeldForResale Value for Double
     */
    @JsonSetter("AssetsHeldForResale")
    public void setAssetsHeldForResale(Double assetsHeldForResale) {
        this.assetsHeldForResale = assetsHeldForResale;
    }

    /**
     * Getter for Other.
     * Value for Balance Sheet - Other Non Current Assets Details - Other Assets for these accounts
     * @return Returns the Double
     */
    @JsonGetter("Other")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getOther() {
        return other;
    }

    /**
     * Setter for Other.
     * Value for Balance Sheet - Other Non Current Assets Details - Other Assets for these accounts
     * @param other Value for Double
     */
    @JsonSetter("Other")
    public void setOther(Double other) {
        this.other = other;
    }

    /**
     * Converts this OtherNonCurrentAssetsDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OtherNonCurrentAssetsDetails [" + "otherNonCurrentAssets=" + otherNonCurrentAssets
                + ", longTermTrade=" + longTermTrade + ", subsidiaryAssociateJoint="
                + subsidiaryAssociateJoint + ", assetsHeldForResale=" + assetsHeldForResale
                + ", other=" + other + "]";
    }

    /**
     * Builds a new {@link OtherNonCurrentAssetsDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OtherNonCurrentAssetsDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .otherNonCurrentAssets(getOtherNonCurrentAssets())
                .longTermTrade(getLongTermTrade())
                .subsidiaryAssociateJoint(getSubsidiaryAssociateJoint())
                .assetsHeldForResale(getAssetsHeldForResale())
                .other(getOther());
        return builder;
    }

    /**
     * Class to build instances of {@link OtherNonCurrentAssetsDetails}.
     */
    public static class Builder {
        private Double otherNonCurrentAssets;
        private Double longTermTrade;
        private Double subsidiaryAssociateJoint;
        private Double assetsHeldForResale;
        private Double other;



        /**
         * Setter for otherNonCurrentAssets.
         * @param  otherNonCurrentAssets  Double value for otherNonCurrentAssets.
         * @return Builder
         */
        public Builder otherNonCurrentAssets(Double otherNonCurrentAssets) {
            this.otherNonCurrentAssets = otherNonCurrentAssets;
            return this;
        }

        /**
         * Setter for longTermTrade.
         * @param  longTermTrade  Double value for longTermTrade.
         * @return Builder
         */
        public Builder longTermTrade(Double longTermTrade) {
            this.longTermTrade = longTermTrade;
            return this;
        }

        /**
         * Setter for subsidiaryAssociateJoint.
         * @param  subsidiaryAssociateJoint  Double value for subsidiaryAssociateJoint.
         * @return Builder
         */
        public Builder subsidiaryAssociateJoint(Double subsidiaryAssociateJoint) {
            this.subsidiaryAssociateJoint = subsidiaryAssociateJoint;
            return this;
        }

        /**
         * Setter for assetsHeldForResale.
         * @param  assetsHeldForResale  Double value for assetsHeldForResale.
         * @return Builder
         */
        public Builder assetsHeldForResale(Double assetsHeldForResale) {
            this.assetsHeldForResale = assetsHeldForResale;
            return this;
        }

        /**
         * Setter for other.
         * @param  other  Double value for other.
         * @return Builder
         */
        public Builder other(Double other) {
            this.other = other;
            return this;
        }

        /**
         * Builds a new {@link OtherNonCurrentAssetsDetails} object using the set fields.
         * @return {@link OtherNonCurrentAssetsDetails}
         */
        public OtherNonCurrentAssetsDetails build() {
            return new OtherNonCurrentAssetsDetails(otherNonCurrentAssets, longTermTrade,
                    subsidiaryAssociateJoint, assetsHeldForResale, other);
        }
    }
}
