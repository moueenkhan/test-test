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
 * This is a model class for CheckReturnLocation type.
 */
public class CheckReturnLocation {
    private Object county;
    private Object district;
    private Object flat;
    private Object houseName;
    private Object houseNumber;
    private Object postCode;
    private Object postTown;
    private String rMC;
    private int region;
    private Object street;

    /**
     * Default constructor.
     */
    public CheckReturnLocation() {
    }

    /**
     * Initialization constructor.
     * @param  region  int value for region.
     * @param  county  Object value for county.
     * @param  district  Object value for district.
     * @param  flat  Object value for flat.
     * @param  houseName  Object value for houseName.
     * @param  houseNumber  Object value for houseNumber.
     * @param  postCode  Object value for postCode.
     * @param  postTown  Object value for postTown.
     * @param  rMC  String value for rMC.
     * @param  street  Object value for street.
     */
    public CheckReturnLocation(
            int region,
            Object county,
            Object district,
            Object flat,
            Object houseName,
            Object houseNumber,
            Object postCode,
            Object postTown,
            String rMC,
            Object street) {
        this.county = county;
        this.district = district;
        this.flat = flat;
        this.houseName = houseName;
        this.houseNumber = houseNumber;
        this.postCode = postCode;
        this.postTown = postTown;
        this.rMC = rMC;
        this.region = region;
        this.street = street;
    }

    /**
     * Getter for County.
     * @return Returns the Object
     */
    @JsonGetter("County")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getCounty() {
        return county;
    }

    /**
     * Setter for County.
     * @param county Value for Object
     */
    @JsonSetter("County")
    public void setCounty(Object county) {
        this.county = county;
    }

    /**
     * Getter for District.
     * @return Returns the Object
     */
    @JsonGetter("District")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getDistrict() {
        return district;
    }

    /**
     * Setter for District.
     * @param district Value for Object
     */
    @JsonSetter("District")
    public void setDistrict(Object district) {
        this.district = district;
    }

    /**
     * Getter for Flat.
     * @return Returns the Object
     */
    @JsonGetter("Flat")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getFlat() {
        return flat;
    }

    /**
     * Setter for Flat.
     * @param flat Value for Object
     */
    @JsonSetter("Flat")
    public void setFlat(Object flat) {
        this.flat = flat;
    }

    /**
     * Getter for HouseName.
     * @return Returns the Object
     */
    @JsonGetter("HouseName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getHouseName() {
        return houseName;
    }

    /**
     * Setter for HouseName.
     * @param houseName Value for Object
     */
    @JsonSetter("HouseName")
    public void setHouseName(Object houseName) {
        this.houseName = houseName;
    }

    /**
     * Getter for HouseNumber.
     * @return Returns the Object
     */
    @JsonGetter("HouseNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getHouseNumber() {
        return houseNumber;
    }

    /**
     * Setter for HouseNumber.
     * @param houseNumber Value for Object
     */
    @JsonSetter("HouseNumber")
    public void setHouseNumber(Object houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * Getter for PostCode.
     * @return Returns the Object
     */
    @JsonGetter("PostCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getPostCode() {
        return postCode;
    }

    /**
     * Setter for PostCode.
     * @param postCode Value for Object
     */
    @JsonSetter("PostCode")
    public void setPostCode(Object postCode) {
        this.postCode = postCode;
    }

    /**
     * Getter for PostTown.
     * @return Returns the Object
     */
    @JsonGetter("PostTown")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getPostTown() {
        return postTown;
    }

    /**
     * Setter for PostTown.
     * @param postTown Value for Object
     */
    @JsonSetter("PostTown")
    public void setPostTown(Object postTown) {
        this.postTown = postTown;
    }

    /**
     * Getter for RMC.
     * Rebate Mailing Code
     * @return Returns the String
     */
    @JsonGetter("RMC")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRMC() {
        return rMC;
    }

    /**
     * Setter for RMC.
     * Rebate Mailing Code
     * @param rMC Value for String
     */
    @JsonSetter("RMC")
    public void setRMC(String rMC) {
        this.rMC = rMC;
    }

    /**
     * Getter for Region.
     * Region associated with RMC
     * @return Returns the int
     */
    @JsonGetter("Region")
    public int getRegion() {
        return region;
    }

    /**
     * Setter for Region.
     * Region associated with RMC
     * @param region Value for int
     */
    @JsonSetter("Region")
    public void setRegion(int region) {
        this.region = region;
    }

    /**
     * Getter for Street.
     * @return Returns the Object
     */
    @JsonGetter("Street")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getStreet() {
        return street;
    }

    /**
     * Setter for Street.
     * @param street Value for Object
     */
    @JsonSetter("Street")
    public void setStreet(Object street) {
        this.street = street;
    }

    /**
     * Converts this CheckReturnLocation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckReturnLocation [" + "region=" + region + ", county=" + county + ", district="
                + district + ", flat=" + flat + ", houseName=" + houseName + ", houseNumber="
                + houseNumber + ", postCode=" + postCode + ", postTown=" + postTown + ", rMC=" + rMC
                + ", street=" + street + "]";
    }

    /**
     * Builds a new {@link CheckReturnLocation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckReturnLocation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(region)
                .county(getCounty())
                .district(getDistrict())
                .flat(getFlat())
                .houseName(getHouseName())
                .houseNumber(getHouseNumber())
                .postCode(getPostCode())
                .postTown(getPostTown())
                .rMC(getRMC())
                .street(getStreet());
        return builder;
    }

    /**
     * Class to build instances of {@link CheckReturnLocation}.
     */
    public static class Builder {
        private int region;
        private Object county;
        private Object district;
        private Object flat;
        private Object houseName;
        private Object houseNumber;
        private Object postCode;
        private Object postTown;
        private String rMC;
        private Object street;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  region  int value for region.
         */
        public Builder(int region) {
            this.region = region;
        }

        /**
         * Setter for region.
         * @param  region  int value for region.
         * @return Builder
         */
        public Builder region(int region) {
            this.region = region;
            return this;
        }

        /**
         * Setter for county.
         * @param  county  Object value for county.
         * @return Builder
         */
        public Builder county(Object county) {
            this.county = county;
            return this;
        }

        /**
         * Setter for district.
         * @param  district  Object value for district.
         * @return Builder
         */
        public Builder district(Object district) {
            this.district = district;
            return this;
        }

        /**
         * Setter for flat.
         * @param  flat  Object value for flat.
         * @return Builder
         */
        public Builder flat(Object flat) {
            this.flat = flat;
            return this;
        }

        /**
         * Setter for houseName.
         * @param  houseName  Object value for houseName.
         * @return Builder
         */
        public Builder houseName(Object houseName) {
            this.houseName = houseName;
            return this;
        }

        /**
         * Setter for houseNumber.
         * @param  houseNumber  Object value for houseNumber.
         * @return Builder
         */
        public Builder houseNumber(Object houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        /**
         * Setter for postCode.
         * @param  postCode  Object value for postCode.
         * @return Builder
         */
        public Builder postCode(Object postCode) {
            this.postCode = postCode;
            return this;
        }

        /**
         * Setter for postTown.
         * @param  postTown  Object value for postTown.
         * @return Builder
         */
        public Builder postTown(Object postTown) {
            this.postTown = postTown;
            return this;
        }

        /**
         * Setter for rMC.
         * @param  rMC  String value for rMC.
         * @return Builder
         */
        public Builder rMC(String rMC) {
            this.rMC = rMC;
            return this;
        }

        /**
         * Setter for street.
         * @param  street  Object value for street.
         * @return Builder
         */
        public Builder street(Object street) {
            this.street = street;
            return this;
        }

        /**
         * Builds a new {@link CheckReturnLocation} object using the set fields.
         * @return {@link CheckReturnLocation}
         */
        public CheckReturnLocation build() {
            return new CheckReturnLocation(region, county, district, flat, houseName, houseNumber,
                    postCode, postTown, rMC, street);
        }
    }
}