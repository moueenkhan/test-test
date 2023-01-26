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
 * This is a model class for IndvDirPrevName type.
 */
public class IndvDirPrevName {
    private CommDetail commercialDetail;
    private OutputNameDetail name;

    /**
     * Default constructor.
     */
    public IndvDirPrevName() {
    }

    /**
     * Initialization constructor.
     * @param  commercialDetail  CommDetail value for commercialDetail.
     * @param  name  OutputNameDetail value for name.
     */
    public IndvDirPrevName(
            CommDetail commercialDetail,
            OutputNameDetail name) {
        this.commercialDetail = commercialDetail;
        this.name = name;
    }

    /**
     * Getter for CommercialDetail.
     * @return Returns the CommDetail
     */
    @JsonGetter("CommercialDetail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CommDetail getCommercialDetail() {
        return commercialDetail;
    }

    /**
     * Setter for CommercialDetail.
     * @param commercialDetail Value for CommDetail
     */
    @JsonSetter("CommercialDetail")
    public void setCommercialDetail(CommDetail commercialDetail) {
        this.commercialDetail = commercialDetail;
    }

    /**
     * Getter for Name.
     * @return Returns the OutputNameDetail
     */
    @JsonGetter("Name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OutputNameDetail getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for OutputNameDetail
     */
    @JsonSetter("Name")
    public void setName(OutputNameDetail name) {
        this.name = name;
    }

    /**
     * Converts this IndvDirPrevName into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IndvDirPrevName [" + "commercialDetail=" + commercialDetail + ", name=" + name
                + "]";
    }

    /**
     * Builds a new {@link IndvDirPrevName.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IndvDirPrevName.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .commercialDetail(getCommercialDetail())
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link IndvDirPrevName}.
     */
    public static class Builder {
        private CommDetail commercialDetail;
        private OutputNameDetail name;



        /**
         * Setter for commercialDetail.
         * @param  commercialDetail  CommDetail value for commercialDetail.
         * @return Builder
         */
        public Builder commercialDetail(CommDetail commercialDetail) {
            this.commercialDetail = commercialDetail;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  OutputNameDetail value for name.
         * @return Builder
         */
        public Builder name(OutputNameDetail name) {
            this.name = name;
            return this;
        }

        /**
         * Builds a new {@link IndvDirPrevName} object using the set fields.
         * @return {@link IndvDirPrevName}
         */
        public IndvDirPrevName build() {
            return new IndvDirPrevName(commercialDetail, name);
        }
    }
}
