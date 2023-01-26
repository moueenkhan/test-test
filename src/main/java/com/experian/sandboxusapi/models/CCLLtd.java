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
 * This is a model class for CCLLtd type.
 */
public class CCLLtd {
    private Integer totalNumberCCL;
    private List<CCLLtdDetail> cCLDetail;

    /**
     * Default constructor.
     */
    public CCLLtd() {
    }

    /**
     * Initialization constructor.
     * @param  totalNumberCCL  Integer value for totalNumberCCL.
     * @param  cCLDetail  List of CCLLtdDetail value for cCLDetail.
     */
    public CCLLtd(
            Integer totalNumberCCL,
            List<CCLLtdDetail> cCLDetail) {
        this.totalNumberCCL = totalNumberCCL;
        this.cCLDetail = cCLDetail;
    }

    /**
     * Getter for TotalNumberCCL.
     * Number of Consumer Credit Licences for the subject company (0 - 99)
     * @return Returns the Integer
     */
    @JsonGetter("TotalNumberCCL")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalNumberCCL() {
        return totalNumberCCL;
    }

    /**
     * Setter for TotalNumberCCL.
     * Number of Consumer Credit Licences for the subject company (0 - 99)
     * @param totalNumberCCL Value for Integer
     */
    @JsonSetter("TotalNumberCCL")
    public void setTotalNumberCCL(Integer totalNumberCCL) {
        this.totalNumberCCL = totalNumberCCL;
    }

    /**
     * Getter for CCLDetail.
     * @return Returns the List of CCLLtdDetail
     */
    @JsonGetter("CCLDetail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CCLLtdDetail> getCCLDetail() {
        return cCLDetail;
    }

    /**
     * Setter for CCLDetail.
     * @param cCLDetail Value for List of CCLLtdDetail
     */
    @JsonSetter("CCLDetail")
    public void setCCLDetail(List<CCLLtdDetail> cCLDetail) {
        this.cCLDetail = cCLDetail;
    }

    /**
     * Converts this CCLLtd into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CCLLtd [" + "totalNumberCCL=" + totalNumberCCL + ", cCLDetail=" + cCLDetail + "]";
    }

    /**
     * Builds a new {@link CCLLtd.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CCLLtd.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .totalNumberCCL(getTotalNumberCCL())
                .cCLDetail(getCCLDetail());
        return builder;
    }

    /**
     * Class to build instances of {@link CCLLtd}.
     */
    public static class Builder {
        private Integer totalNumberCCL;
        private List<CCLLtdDetail> cCLDetail;



        /**
         * Setter for totalNumberCCL.
         * @param  totalNumberCCL  Integer value for totalNumberCCL.
         * @return Builder
         */
        public Builder totalNumberCCL(Integer totalNumberCCL) {
            this.totalNumberCCL = totalNumberCCL;
            return this;
        }

        /**
         * Setter for cCLDetail.
         * @param  cCLDetail  List of CCLLtdDetail value for cCLDetail.
         * @return Builder
         */
        public Builder cCLDetail(List<CCLLtdDetail> cCLDetail) {
            this.cCLDetail = cCLDetail;
            return this;
        }

        /**
         * Builds a new {@link CCLLtd} object using the set fields.
         * @return {@link CCLLtd}
         */
        public CCLLtd build() {
            return new CCLLtd(totalNumberCCL, cCLDetail);
        }
    }
}
