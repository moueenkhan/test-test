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
 * This is a model class for DirSelectOutLocationDetail type.
 */
public class DirSelectOutLocationDetail {
    private String houseName;
    private String houseNumber;
    private String postTown;
    private String postcode;
    private String street;
    private String county;
    private String district;

    /**
     * Default constructor.
     */
    public DirSelectOutLocationDetail() {
    }

    /**
     * Initialization constructor.
     * @param  houseName  String value for houseName.
     * @param  houseNumber  String value for houseNumber.
     * @param  postTown  String value for postTown.
     * @param  postcode  String value for postcode.
     * @param  street  String value for street.
     * @param  county  String value for county.
     * @param  district  String value for district.
     */
    public DirSelectOutLocationDetail(
            String houseName,
            String houseNumber,
            String postTown,
            String postcode,
            String street,
            String county,
            String district) {
        this.houseName = houseName;
        this.houseNumber = houseNumber;
        this.postTown = postTown;
        this.postcode = postcode;
        this.street = street;
        this.county = county;
        this.district = district;
    }

    /**
     * Getter for HouseName.
     * Director's address house name returned from the Director search
     * @return Returns the String
     */
    @JsonGetter("HouseName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHouseName() {
        return houseName;
    }

    /**
     * Setter for HouseName.
     * Director's address house name returned from the Director search
     * @param houseName Value for String
     */
    @JsonSetter("HouseName")
    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    /**
     * Getter for HouseNumber.
     * Director's address house number returned from the Director search
     * @return Returns the String
     */
    @JsonGetter("HouseNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Setter for HouseNumber.
     * Director's address house number returned from the Director search
     * @param houseNumber Value for String
     */
    @JsonSetter("HouseNumber")
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * Getter for PostTown.
     * Director's address town returned from the Director search
     * @return Returns the String
     */
    @JsonGetter("PostTown")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPostTown() {
        return postTown;
    }

    /**
     * Setter for PostTown.
     * Director's address town returned from the Director search
     * @param postTown Value for String
     */
    @JsonSetter("PostTown")
    public void setPostTown(String postTown) {
        this.postTown = postTown;
    }

    /**
     * Getter for Postcode.
     * Director's address postcode returned from the Director search
     * @return Returns the String
     */
    @JsonGetter("Postcode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPostcode() {
        return postcode;
    }

    /**
     * Setter for Postcode.
     * Director's address postcode returned from the Director search
     * @param postcode Value for String
     */
    @JsonSetter("Postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * Getter for Street.
     * Director's street returned from the Director search
     * @return Returns the String
     */
    @JsonGetter("Street")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStreet() {
        return street;
    }

    /**
     * Setter for Street.
     * Director's street returned from the Director search
     * @param street Value for String
     */
    @JsonSetter("Street")
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Getter for County.
     * Director's county returned from the Director search
     * @return Returns the String
     */
    @JsonGetter("County")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCounty() {
        return county;
    }

    /**
     * Setter for County.
     * Director's county returned from the Director search
     * @param county Value for String
     */
    @JsonSetter("County")
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * Getter for District.
     * Director's district returned from the Director search
     * @return Returns the String
     */
    @JsonGetter("District")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDistrict() {
        return district;
    }

    /**
     * Setter for District.
     * Director's district returned from the Director search
     * @param district Value for String
     */
    @JsonSetter("District")
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * Converts this DirSelectOutLocationDetail into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DirSelectOutLocationDetail [" + "houseName=" + houseName + ", houseNumber="
                + houseNumber + ", postTown=" + postTown + ", postcode=" + postcode + ", street="
                + street + ", county=" + county + ", district=" + district + "]";
    }

    /**
     * Builds a new {@link DirSelectOutLocationDetail.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DirSelectOutLocationDetail.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .houseName(getHouseName())
                .houseNumber(getHouseNumber())
                .postTown(getPostTown())
                .postcode(getPostcode())
                .street(getStreet())
                .county(getCounty())
                .district(getDistrict());
        return builder;
    }

    /**
     * Class to build instances of {@link DirSelectOutLocationDetail}.
     */
    public static class Builder {
        private String houseName;
        private String houseNumber;
        private String postTown;
        private String postcode;
        private String street;
        private String county;
        private String district;



        /**
         * Setter for houseName.
         * @param  houseName  String value for houseName.
         * @return Builder
         */
        public Builder houseName(String houseName) {
            this.houseName = houseName;
            return this;
        }

        /**
         * Setter for houseNumber.
         * @param  houseNumber  String value for houseNumber.
         * @return Builder
         */
        public Builder houseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        /**
         * Setter for postTown.
         * @param  postTown  String value for postTown.
         * @return Builder
         */
        public Builder postTown(String postTown) {
            this.postTown = postTown;
            return this;
        }

        /**
         * Setter for postcode.
         * @param  postcode  String value for postcode.
         * @return Builder
         */
        public Builder postcode(String postcode) {
            this.postcode = postcode;
            return this;
        }

        /**
         * Setter for street.
         * @param  street  String value for street.
         * @return Builder
         */
        public Builder street(String street) {
            this.street = street;
            return this;
        }

        /**
         * Setter for county.
         * @param  county  String value for county.
         * @return Builder
         */
        public Builder county(String county) {
            this.county = county;
            return this;
        }

        /**
         * Setter for district.
         * @param  district  String value for district.
         * @return Builder
         */
        public Builder district(String district) {
            this.district = district;
            return this;
        }

        /**
         * Builds a new {@link DirSelectOutLocationDetail} object using the set fields.
         * @return {@link DirSelectOutLocationDetail}
         */
        public DirSelectOutLocationDetail build() {
            return new DirSelectOutLocationDetail(houseName, houseNumber, postTown, postcode,
                    street, county, district);
        }
    }
}