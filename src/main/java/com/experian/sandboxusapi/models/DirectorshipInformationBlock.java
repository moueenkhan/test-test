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
 * This is a model class for DirectorshipInformationBlock type.
 */
public class DirectorshipInformationBlock {
    private String applicantIndicator;
    private String companyNumber;
    private String creationDate;
    private Object deceased;
    private String directorCount;
    private String directorNumber;
    private String directorships;
    private String informationSource;
    private LocationDetail location;
    private String locationIndicator;
    private MatchDetail matchDetails;
    private InputNameDetail name;
    private String noCReference;
    private String sex;
    private String traderCount;
    private String uniqueRef;

    /**
     * Default constructor.
     */
    public DirectorshipInformationBlock() {
    }

    /**
     * Initialization constructor.
     * @param  applicantIndicator  String value for applicantIndicator.
     * @param  companyNumber  String value for companyNumber.
     * @param  creationDate  String value for creationDate.
     * @param  deceased  Object value for deceased.
     * @param  directorCount  String value for directorCount.
     * @param  directorNumber  String value for directorNumber.
     * @param  directorships  String value for directorships.
     * @param  informationSource  String value for informationSource.
     * @param  location  LocationDetail value for location.
     * @param  locationIndicator  String value for locationIndicator.
     * @param  matchDetails  MatchDetail value for matchDetails.
     * @param  name  InputNameDetail value for name.
     * @param  noCReference  String value for noCReference.
     * @param  sex  String value for sex.
     * @param  traderCount  String value for traderCount.
     * @param  uniqueRef  String value for uniqueRef.
     */
    public DirectorshipInformationBlock(
            String applicantIndicator,
            String companyNumber,
            String creationDate,
            Object deceased,
            String directorCount,
            String directorNumber,
            String directorships,
            String informationSource,
            LocationDetail location,
            String locationIndicator,
            MatchDetail matchDetails,
            InputNameDetail name,
            String noCReference,
            String sex,
            String traderCount,
            String uniqueRef) {
        this.applicantIndicator = applicantIndicator;
        this.companyNumber = companyNumber;
        this.creationDate = creationDate;
        this.deceased = deceased;
        this.directorCount = directorCount;
        this.directorNumber = directorNumber;
        this.directorships = directorships;
        this.informationSource = informationSource;
        this.location = location;
        this.locationIndicator = locationIndicator;
        this.matchDetails = matchDetails;
        this.name = name;
        this.noCReference = noCReference;
        this.sex = sex;
        this.traderCount = traderCount;
        this.uniqueRef = uniqueRef;
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
     * Getter for CompanyNumber.
     * @return Returns the String
     */
    @JsonGetter("CompanyNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCompanyNumber() {
        return companyNumber;
    }

    /**
     * Setter for CompanyNumber.
     * @param companyNumber Value for String
     */
    @JsonSetter("CompanyNumber")
    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    /**
     * Getter for CreationDate.
     * Creation date (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("CreationDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * Setter for CreationDate.
     * Creation date (yyyy-mm-dd)
     * @param creationDate Value for String
     */
    @JsonSetter("CreationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Getter for Deceased.
     * @return Returns the Object
     */
    @JsonGetter("Deceased")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getDeceased() {
        return deceased;
    }

    /**
     * Setter for Deceased.
     * @param deceased Value for Object
     */
    @JsonSetter("Deceased")
    public void setDeceased(Object deceased) {
        this.deceased = deceased;
    }

    /**
     * Getter for DirectorCount.
     * @return Returns the String
     */
    @JsonGetter("DirectorCount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDirectorCount() {
        return directorCount;
    }

    /**
     * Setter for DirectorCount.
     * @param directorCount Value for String
     */
    @JsonSetter("DirectorCount")
    public void setDirectorCount(String directorCount) {
        this.directorCount = directorCount;
    }

    /**
     * Getter for DirectorNumber.
     * @return Returns the String
     */
    @JsonGetter("DirectorNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDirectorNumber() {
        return directorNumber;
    }

    /**
     * Setter for DirectorNumber.
     * @param directorNumber Value for String
     */
    @JsonSetter("DirectorNumber")
    public void setDirectorNumber(String directorNumber) {
        this.directorNumber = directorNumber;
    }

    /**
     * Getter for Directorships.
     * @return Returns the String
     */
    @JsonGetter("Directorships")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDirectorships() {
        return directorships;
    }

    /**
     * Setter for Directorships.
     * @param directorships Value for String
     */
    @JsonSetter("Directorships")
    public void setDirectorships(String directorships) {
        this.directorships = directorships;
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
     * Getter for Location.
     * @return Returns the LocationDetail
     */
    @JsonGetter("Location")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocationDetail getLocation() {
        return location;
    }

    /**
     * Setter for Location.
     * @param location Value for LocationDetail
     */
    @JsonSetter("Location")
    public void setLocation(LocationDetail location) {
        this.location = location;
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
     * Getter for MatchDetails.
     * @return Returns the MatchDetail
     */
    @JsonGetter("MatchDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MatchDetail getMatchDetails() {
        return matchDetails;
    }

    /**
     * Setter for MatchDetails.
     * @param matchDetails Value for MatchDetail
     */
    @JsonSetter("MatchDetails")
    public void setMatchDetails(MatchDetail matchDetails) {
        this.matchDetails = matchDetails;
    }

    /**
     * Getter for Name.
     * @return Returns the InputNameDetail
     */
    @JsonGetter("Name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InputNameDetail getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for InputNameDetail
     */
    @JsonSetter("Name")
    public void setName(InputNameDetail name) {
        this.name = name;
    }

    /**
     * Getter for NoCReference.
     * @return Returns the String
     */
    @JsonGetter("NoCReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNoCReference() {
        return noCReference;
    }

    /**
     * Setter for NoCReference.
     * @param noCReference Value for String
     */
    @JsonSetter("NoCReference")
    public void setNoCReference(String noCReference) {
        this.noCReference = noCReference;
    }

    /**
     * Getter for Sex.
     * @return Returns the String
     */
    @JsonGetter("Sex")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSex() {
        return sex;
    }

    /**
     * Setter for Sex.
     * @param sex Value for String
     */
    @JsonSetter("Sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Getter for TraderCount.
     * @return Returns the String
     */
    @JsonGetter("TraderCount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTraderCount() {
        return traderCount;
    }

    /**
     * Setter for TraderCount.
     * @param traderCount Value for String
     */
    @JsonSetter("TraderCount")
    public void setTraderCount(String traderCount) {
        this.traderCount = traderCount;
    }

    /**
     * Getter for UniqueRef.
     * @return Returns the String
     */
    @JsonGetter("UniqueRef")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUniqueRef() {
        return uniqueRef;
    }

    /**
     * Setter for UniqueRef.
     * @param uniqueRef Value for String
     */
    @JsonSetter("UniqueRef")
    public void setUniqueRef(String uniqueRef) {
        this.uniqueRef = uniqueRef;
    }

    /**
     * Converts this DirectorshipInformationBlock into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DirectorshipInformationBlock [" + "applicantIndicator=" + applicantIndicator
                + ", companyNumber=" + companyNumber + ", creationDate=" + creationDate
                + ", deceased=" + deceased + ", directorCount=" + directorCount
                + ", directorNumber=" + directorNumber + ", directorships=" + directorships
                + ", informationSource=" + informationSource + ", location=" + location
                + ", locationIndicator=" + locationIndicator + ", matchDetails=" + matchDetails
                + ", name=" + name + ", noCReference=" + noCReference + ", sex=" + sex
                + ", traderCount=" + traderCount + ", uniqueRef=" + uniqueRef + "]";
    }

    /**
     * Builds a new {@link DirectorshipInformationBlock.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DirectorshipInformationBlock.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .applicantIndicator(getApplicantIndicator())
                .companyNumber(getCompanyNumber())
                .creationDate(getCreationDate())
                .deceased(getDeceased())
                .directorCount(getDirectorCount())
                .directorNumber(getDirectorNumber())
                .directorships(getDirectorships())
                .informationSource(getInformationSource())
                .location(getLocation())
                .locationIndicator(getLocationIndicator())
                .matchDetails(getMatchDetails())
                .name(getName())
                .noCReference(getNoCReference())
                .sex(getSex())
                .traderCount(getTraderCount())
                .uniqueRef(getUniqueRef());
        return builder;
    }

    /**
     * Class to build instances of {@link DirectorshipInformationBlock}.
     */
    public static class Builder {
        private String applicantIndicator;
        private String companyNumber;
        private String creationDate;
        private Object deceased;
        private String directorCount;
        private String directorNumber;
        private String directorships;
        private String informationSource;
        private LocationDetail location;
        private String locationIndicator;
        private MatchDetail matchDetails;
        private InputNameDetail name;
        private String noCReference;
        private String sex;
        private String traderCount;
        private String uniqueRef;



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
         * Setter for companyNumber.
         * @param  companyNumber  String value for companyNumber.
         * @return Builder
         */
        public Builder companyNumber(String companyNumber) {
            this.companyNumber = companyNumber;
            return this;
        }

        /**
         * Setter for creationDate.
         * @param  creationDate  String value for creationDate.
         * @return Builder
         */
        public Builder creationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        /**
         * Setter for deceased.
         * @param  deceased  Object value for deceased.
         * @return Builder
         */
        public Builder deceased(Object deceased) {
            this.deceased = deceased;
            return this;
        }

        /**
         * Setter for directorCount.
         * @param  directorCount  String value for directorCount.
         * @return Builder
         */
        public Builder directorCount(String directorCount) {
            this.directorCount = directorCount;
            return this;
        }

        /**
         * Setter for directorNumber.
         * @param  directorNumber  String value for directorNumber.
         * @return Builder
         */
        public Builder directorNumber(String directorNumber) {
            this.directorNumber = directorNumber;
            return this;
        }

        /**
         * Setter for directorships.
         * @param  directorships  String value for directorships.
         * @return Builder
         */
        public Builder directorships(String directorships) {
            this.directorships = directorships;
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
         * Setter for location.
         * @param  location  LocationDetail value for location.
         * @return Builder
         */
        public Builder location(LocationDetail location) {
            this.location = location;
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
         * Setter for matchDetails.
         * @param  matchDetails  MatchDetail value for matchDetails.
         * @return Builder
         */
        public Builder matchDetails(MatchDetail matchDetails) {
            this.matchDetails = matchDetails;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  InputNameDetail value for name.
         * @return Builder
         */
        public Builder name(InputNameDetail name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for noCReference.
         * @param  noCReference  String value for noCReference.
         * @return Builder
         */
        public Builder noCReference(String noCReference) {
            this.noCReference = noCReference;
            return this;
        }

        /**
         * Setter for sex.
         * @param  sex  String value for sex.
         * @return Builder
         */
        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        /**
         * Setter for traderCount.
         * @param  traderCount  String value for traderCount.
         * @return Builder
         */
        public Builder traderCount(String traderCount) {
            this.traderCount = traderCount;
            return this;
        }

        /**
         * Setter for uniqueRef.
         * @param  uniqueRef  String value for uniqueRef.
         * @return Builder
         */
        public Builder uniqueRef(String uniqueRef) {
            this.uniqueRef = uniqueRef;
            return this;
        }

        /**
         * Builds a new {@link DirectorshipInformationBlock} object using the set fields.
         * @return {@link DirectorshipInformationBlock}
         */
        public DirectorshipInformationBlock build() {
            return new DirectorshipInformationBlock(applicantIndicator, companyNumber, creationDate,
                    deceased, directorCount, directorNumber, directorships, informationSource,
                    location, locationIndicator, matchDetails, name, noCReference, sex, traderCount,
                    uniqueRef);
        }
    }
}
