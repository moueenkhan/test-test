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
 * This is a model class for VotersRollStreetSegment type.
 */
public class VotersRollStreetSegment {
    private String applicantIndicator;
    private String batchNumber;
    private String county;
    private String district;
    private String informationSource;
    private String locationIndicator;
    private int mOSCAICCode;
    private int pAFDistrictNumber;
    private String postcode;
    private String searchLevel;
    private int segmentIDNumber;
    private String street;
    private int streetMatchLevel;
    private String town;

    /**
     * Default constructor.
     */
    public VotersRollStreetSegment() {
    }

    /**
     * Initialization constructor.
     * @param  mOSCAICCode  int value for mOSCAICCode.
     * @param  pAFDistrictNumber  int value for pAFDistrictNumber.
     * @param  segmentIDNumber  int value for segmentIDNumber.
     * @param  streetMatchLevel  int value for streetMatchLevel.
     * @param  applicantIndicator  String value for applicantIndicator.
     * @param  batchNumber  String value for batchNumber.
     * @param  county  String value for county.
     * @param  district  String value for district.
     * @param  informationSource  String value for informationSource.
     * @param  locationIndicator  String value for locationIndicator.
     * @param  postcode  String value for postcode.
     * @param  searchLevel  String value for searchLevel.
     * @param  street  String value for street.
     * @param  town  String value for town.
     */
    public VotersRollStreetSegment(
            int mOSCAICCode,
            int pAFDistrictNumber,
            int segmentIDNumber,
            int streetMatchLevel,
            String applicantIndicator,
            String batchNumber,
            String county,
            String district,
            String informationSource,
            String locationIndicator,
            String postcode,
            String searchLevel,
            String street,
            String town) {
        this.applicantIndicator = applicantIndicator;
        this.batchNumber = batchNumber;
        this.county = county;
        this.district = district;
        this.informationSource = informationSource;
        this.locationIndicator = locationIndicator;
        this.mOSCAICCode = mOSCAICCode;
        this.pAFDistrictNumber = pAFDistrictNumber;
        this.postcode = postcode;
        this.searchLevel = searchLevel;
        this.segmentIDNumber = segmentIDNumber;
        this.street = street;
        this.streetMatchLevel = streetMatchLevel;
        this.town = town;
    }

    /**
     * Getter for ApplicantIndicator.
     * @return Returns the String
     */
    @JsonGetter("ApplicantIndicator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getApplicantIndicator() {
        return applicantIndicator;
    }

    /**
     * Setter for ApplicantIndicator.
     * @param applicantIndicator Value for String
     */
    @JsonSetter("ApplicantIndicator")
    public void setApplicantIndicator(String applicantIndicator) {
        this.applicantIndicator = applicantIndicator;
    }

    /**
     * Getter for BatchNumber.
     * @return Returns the String
     */
    @JsonGetter("BatchNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * Setter for BatchNumber.
     * @param batchNumber Value for String
     */
    @JsonSetter("BatchNumber")
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    /**
     * Getter for County.
     * @return Returns the String
     */
    @JsonGetter("County")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCounty() {
        return county;
    }

    /**
     * Setter for County.
     * @param county Value for String
     */
    @JsonSetter("County")
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * Getter for District.
     * @return Returns the String
     */
    @JsonGetter("District")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDistrict() {
        return district;
    }

    /**
     * Setter for District.
     * @param district Value for String
     */
    @JsonSetter("District")
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * Getter for InformationSource.
     * @return Returns the String
     */
    @JsonGetter("InformationSource")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInformationSource() {
        return informationSource;
    }

    /**
     * Setter for InformationSource.
     * @param informationSource Value for String
     */
    @JsonSetter("InformationSource")
    public void setInformationSource(String informationSource) {
        this.informationSource = informationSource;
    }

    /**
     * Getter for LocationIndicator.
     * @return Returns the String
     */
    @JsonGetter("LocationIndicator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocationIndicator() {
        return locationIndicator;
    }

    /**
     * Setter for LocationIndicator.
     * @param locationIndicator Value for String
     */
    @JsonSetter("LocationIndicator")
    public void setLocationIndicator(String locationIndicator) {
        this.locationIndicator = locationIndicator;
    }

    /**
     * Getter for MOSCAICCode.
     * @return Returns the int
     */
    @JsonGetter("MOSCAICCode")
    public int getMOSCAICCode() {
        return mOSCAICCode;
    }

    /**
     * Setter for MOSCAICCode.
     * @param mOSCAICCode Value for int
     */
    @JsonSetter("MOSCAICCode")
    public void setMOSCAICCode(int mOSCAICCode) {
        this.mOSCAICCode = mOSCAICCode;
    }

    /**
     * Getter for PAFDistrictNumber.
     * @return Returns the int
     */
    @JsonGetter("PAFDistrictNumber")
    public int getPAFDistrictNumber() {
        return pAFDistrictNumber;
    }

    /**
     * Setter for PAFDistrictNumber.
     * @param pAFDistrictNumber Value for int
     */
    @JsonSetter("PAFDistrictNumber")
    public void setPAFDistrictNumber(int pAFDistrictNumber) {
        this.pAFDistrictNumber = pAFDistrictNumber;
    }

    /**
     * Getter for Postcode.
     * @return Returns the String
     */
    @JsonGetter("Postcode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPostcode() {
        return postcode;
    }

    /**
     * Setter for Postcode.
     * @param postcode Value for String
     */
    @JsonSetter("Postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * Getter for SearchLevel.
     * @return Returns the String
     */
    @JsonGetter("SearchLevel")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSearchLevel() {
        return searchLevel;
    }

    /**
     * Setter for SearchLevel.
     * @param searchLevel Value for String
     */
    @JsonSetter("SearchLevel")
    public void setSearchLevel(String searchLevel) {
        this.searchLevel = searchLevel;
    }

    /**
     * Getter for SegmentIDNumber.
     * @return Returns the int
     */
    @JsonGetter("SegmentIDNumber")
    public int getSegmentIDNumber() {
        return segmentIDNumber;
    }

    /**
     * Setter for SegmentIDNumber.
     * @param segmentIDNumber Value for int
     */
    @JsonSetter("SegmentIDNumber")
    public void setSegmentIDNumber(int segmentIDNumber) {
        this.segmentIDNumber = segmentIDNumber;
    }

    /**
     * Getter for Street.
     * @return Returns the String
     */
    @JsonGetter("Street")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStreet() {
        return street;
    }

    /**
     * Setter for Street.
     * @param street Value for String
     */
    @JsonSetter("Street")
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Getter for StreetMatchLevel.
     * @return Returns the int
     */
    @JsonGetter("StreetMatchLevel")
    public int getStreetMatchLevel() {
        return streetMatchLevel;
    }

    /**
     * Setter for StreetMatchLevel.
     * @param streetMatchLevel Value for int
     */
    @JsonSetter("StreetMatchLevel")
    public void setStreetMatchLevel(int streetMatchLevel) {
        this.streetMatchLevel = streetMatchLevel;
    }

    /**
     * Getter for Town.
     * @return Returns the String
     */
    @JsonGetter("Town")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTown() {
        return town;
    }

    /**
     * Setter for Town.
     * @param town Value for String
     */
    @JsonSetter("Town")
    public void setTown(String town) {
        this.town = town;
    }

    /**
     * Converts this VotersRollStreetSegment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VotersRollStreetSegment [" + "mOSCAICCode=" + mOSCAICCode + ", pAFDistrictNumber="
                + pAFDistrictNumber + ", segmentIDNumber=" + segmentIDNumber + ", streetMatchLevel="
                + streetMatchLevel + ", applicantIndicator=" + applicantIndicator + ", batchNumber="
                + batchNumber + ", county=" + county + ", district=" + district
                + ", informationSource=" + informationSource + ", locationIndicator="
                + locationIndicator + ", postcode=" + postcode + ", searchLevel=" + searchLevel
                + ", street=" + street + ", town=" + town + "]";
    }

    /**
     * Builds a new {@link VotersRollStreetSegment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VotersRollStreetSegment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(mOSCAICCode, pAFDistrictNumber, segmentIDNumber,
                streetMatchLevel)
                .applicantIndicator(getApplicantIndicator())
                .batchNumber(getBatchNumber())
                .county(getCounty())
                .district(getDistrict())
                .informationSource(getInformationSource())
                .locationIndicator(getLocationIndicator())
                .postcode(getPostcode())
                .searchLevel(getSearchLevel())
                .street(getStreet())
                .town(getTown());
        return builder;
    }

    /**
     * Class to build instances of {@link VotersRollStreetSegment}.
     */
    public static class Builder {
        private int mOSCAICCode;
        private int pAFDistrictNumber;
        private int segmentIDNumber;
        private int streetMatchLevel;
        private String applicantIndicator;
        private String batchNumber;
        private String county;
        private String district;
        private String informationSource;
        private String locationIndicator;
        private String postcode;
        private String searchLevel;
        private String street;
        private String town;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  mOSCAICCode  int value for mOSCAICCode.
         * @param  pAFDistrictNumber  int value for pAFDistrictNumber.
         * @param  segmentIDNumber  int value for segmentIDNumber.
         * @param  streetMatchLevel  int value for streetMatchLevel.
         */
        public Builder(int mOSCAICCode, int pAFDistrictNumber, int segmentIDNumber,
                int streetMatchLevel) {
            this.mOSCAICCode = mOSCAICCode;
            this.pAFDistrictNumber = pAFDistrictNumber;
            this.segmentIDNumber = segmentIDNumber;
            this.streetMatchLevel = streetMatchLevel;
        }

        /**
         * Setter for mOSCAICCode.
         * @param  mOSCAICCode  int value for mOSCAICCode.
         * @return Builder
         */
        public Builder mOSCAICCode(int mOSCAICCode) {
            this.mOSCAICCode = mOSCAICCode;
            return this;
        }

        /**
         * Setter for pAFDistrictNumber.
         * @param  pAFDistrictNumber  int value for pAFDistrictNumber.
         * @return Builder
         */
        public Builder pAFDistrictNumber(int pAFDistrictNumber) {
            this.pAFDistrictNumber = pAFDistrictNumber;
            return this;
        }

        /**
         * Setter for segmentIDNumber.
         * @param  segmentIDNumber  int value for segmentIDNumber.
         * @return Builder
         */
        public Builder segmentIDNumber(int segmentIDNumber) {
            this.segmentIDNumber = segmentIDNumber;
            return this;
        }

        /**
         * Setter for streetMatchLevel.
         * @param  streetMatchLevel  int value for streetMatchLevel.
         * @return Builder
         */
        public Builder streetMatchLevel(int streetMatchLevel) {
            this.streetMatchLevel = streetMatchLevel;
            return this;
        }

        /**
         * Setter for applicantIndicator.
         * @param  applicantIndicator  String value for applicantIndicator.
         * @return Builder
         */
        public Builder applicantIndicator(String applicantIndicator) {
            this.applicantIndicator = applicantIndicator;
            return this;
        }

        /**
         * Setter for batchNumber.
         * @param  batchNumber  String value for batchNumber.
         * @return Builder
         */
        public Builder batchNumber(String batchNumber) {
            this.batchNumber = batchNumber;
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
         * Setter for informationSource.
         * @param  informationSource  String value for informationSource.
         * @return Builder
         */
        public Builder informationSource(String informationSource) {
            this.informationSource = informationSource;
            return this;
        }

        /**
         * Setter for locationIndicator.
         * @param  locationIndicator  String value for locationIndicator.
         * @return Builder
         */
        public Builder locationIndicator(String locationIndicator) {
            this.locationIndicator = locationIndicator;
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
         * Setter for searchLevel.
         * @param  searchLevel  String value for searchLevel.
         * @return Builder
         */
        public Builder searchLevel(String searchLevel) {
            this.searchLevel = searchLevel;
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
         * Setter for town.
         * @param  town  String value for town.
         * @return Builder
         */
        public Builder town(String town) {
            this.town = town;
            return this;
        }

        /**
         * Builds a new {@link VotersRollStreetSegment} object using the set fields.
         * @return {@link VotersRollStreetSegment}
         */
        public VotersRollStreetSegment build() {
            return new VotersRollStreetSegment(mOSCAICCode, pAFDistrictNumber, segmentIDNumber,
                    streetMatchLevel, applicantIndicator, batchNumber, county, district,
                    informationSource, locationIndicator, postcode, searchLevel, street, town);
        }
    }
}
