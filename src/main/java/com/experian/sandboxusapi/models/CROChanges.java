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
 * This is a model class for CROChanges type.
 */
public class CROChanges {
    private List<CRO> cROChangeDetail;
    private Integer numCROChanges;

    /**
     * Default constructor.
     */
    public CROChanges() {
    }

    /**
     * Initialization constructor.
     * @param  cROChangeDetail  List of CRO value for cROChangeDetail.
     * @param  numCROChanges  Integer value for numCROChanges.
     */
    public CROChanges(
            List<CRO> cROChangeDetail,
            Integer numCROChanges) {
        this.cROChangeDetail = cROChangeDetail;
        this.numCROChanges = numCROChanges;
    }

    /**
     * Getter for CROChangeDetail.
     * @return Returns the List of CRO
     */
    @JsonGetter("CROChangeDetail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CRO> getCROChangeDetail() {
        return cROChangeDetail;
    }

    /**
     * Setter for CROChangeDetail.
     * @param cROChangeDetail Value for List of CRO
     */
    @JsonSetter("CROChangeDetail")
    public void setCROChangeDetail(List<CRO> cROChangeDetail) {
        this.cROChangeDetail = cROChangeDetail;
    }

    /**
     * Getter for NumCROChanges.
     * Number of Companies House changes to follow
     * @return Returns the Integer
     */
    @JsonGetter("NumCROChanges")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumCROChanges() {
        return numCROChanges;
    }

    /**
     * Setter for NumCROChanges.
     * Number of Companies House changes to follow
     * @param numCROChanges Value for Integer
     */
    @JsonSetter("NumCROChanges")
    public void setNumCROChanges(Integer numCROChanges) {
        this.numCROChanges = numCROChanges;
    }

    /**
     * Converts this CROChanges into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CROChanges [" + "cROChangeDetail=" + cROChangeDetail + ", numCROChanges="
                + numCROChanges + "]";
    }

    /**
     * Builds a new {@link CROChanges.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CROChanges.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cROChangeDetail(getCROChangeDetail())
                .numCROChanges(getNumCROChanges());
        return builder;
    }

    /**
     * Class to build instances of {@link CROChanges}.
     */
    public static class Builder {
        private List<CRO> cROChangeDetail;
        private Integer numCROChanges;



        /**
         * Setter for cROChangeDetail.
         * @param  cROChangeDetail  List of CRO value for cROChangeDetail.
         * @return Builder
         */
        public Builder cROChangeDetail(List<CRO> cROChangeDetail) {
            this.cROChangeDetail = cROChangeDetail;
            return this;
        }

        /**
         * Setter for numCROChanges.
         * @param  numCROChanges  Integer value for numCROChanges.
         * @return Builder
         */
        public Builder numCROChanges(Integer numCROChanges) {
            this.numCROChanges = numCROChanges;
            return this;
        }

        /**
         * Builds a new {@link CROChanges} object using the set fields.
         * @return {@link CROChanges}
         */
        public CROChanges build() {
            return new CROChanges(cROChangeDetail, numCROChanges);
        }
    }
}
