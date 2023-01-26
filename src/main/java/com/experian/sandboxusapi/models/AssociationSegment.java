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
 * This is a model class for AssociationSegment type.
 */
public class AssociationSegment {
    private String applicantIndicator;
    private InputNameDetail associateName;
    private String cAISAccountNumbers;
    private String companyType;
    private String dateOfBirth;
    private String doBAssociateOrAlias;
    private String informationDate;
    private String informationSource;
    private String informationSupplier;
    private String informationType;
    private LocationDetail location;
    private String locationIndicator;
    private MatchDetail matchDetails;
    private InputNameDetail name;
    private String noCReference;
    private String source;
    private String supplierBranch;

    /**
     * Default constructor.
     */
    public AssociationSegment() {
    }

    /**
     * Initialization constructor.
     * @param  applicantIndicator  String value for applicantIndicator.
     * @param  associateName  InputNameDetail value for associateName.
     * @param  cAISAccountNumbers  String value for cAISAccountNumbers.
     * @param  companyType  String value for companyType.
     * @param  dateOfBirth  String value for dateOfBirth.
     * @param  doBAssociateOrAlias  String value for doBAssociateOrAlias.
     * @param  informationDate  String value for informationDate.
     * @param  informationSource  String value for informationSource.
     * @param  informationSupplier  String value for informationSupplier.
     * @param  informationType  String value for informationType.
     * @param  location  LocationDetail value for location.
     * @param  locationIndicator  String value for locationIndicator.
     * @param  matchDetails  MatchDetail value for matchDetails.
     * @param  name  InputNameDetail value for name.
     * @param  noCReference  String value for noCReference.
     * @param  source  String value for source.
     * @param  supplierBranch  String value for supplierBranch.
     */
    public AssociationSegment(
            String applicantIndicator,
            InputNameDetail associateName,
            String cAISAccountNumbers,
            String companyType,
            String dateOfBirth,
            String doBAssociateOrAlias,
            String informationDate,
            String informationSource,
            String informationSupplier,
            String informationType,
            LocationDetail location,
            String locationIndicator,
            MatchDetail matchDetails,
            InputNameDetail name,
            String noCReference,
            String source,
            String supplierBranch) {
        this.applicantIndicator = applicantIndicator;
        this.associateName = associateName;
        this.cAISAccountNumbers = cAISAccountNumbers;
        this.companyType = companyType;
        this.dateOfBirth = dateOfBirth;
        this.doBAssociateOrAlias = doBAssociateOrAlias;
        this.informationDate = informationDate;
        this.informationSource = informationSource;
        this.informationSupplier = informationSupplier;
        this.informationType = informationType;
        this.location = location;
        this.locationIndicator = locationIndicator;
        this.matchDetails = matchDetails;
        this.name = name;
        this.noCReference = noCReference;
        this.source = source;
        this.supplierBranch = supplierBranch;
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
     * Getter for AssociateName.
     * @return Returns the InputNameDetail
     */
    @JsonGetter("AssociateName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InputNameDetail getAssociateName() {
        return associateName;
    }

    /**
     * Setter for AssociateName.
     * @param associateName Value for InputNameDetail
     */
    @JsonSetter("AssociateName")
    public void setAssociateName(InputNameDetail associateName) {
        this.associateName = associateName;
    }

    /**
     * Getter for CAISAccountNumbers.
     * @return Returns the String
     */
    @JsonGetter("CAISAccountNumbers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCAISAccountNumbers() {
        return cAISAccountNumbers;
    }

    /**
     * Setter for CAISAccountNumbers.
     * @param cAISAccountNumbers Value for String
     */
    @JsonSetter("CAISAccountNumbers")
    public void setCAISAccountNumbers(String cAISAccountNumbers) {
        this.cAISAccountNumbers = cAISAccountNumbers;
    }

    /**
     * Getter for CompanyType.
     * @return Returns the String
     */
    @JsonGetter("CompanyType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCompanyType() {
        return companyType;
    }

    /**
     * Setter for CompanyType.
     * @param companyType Value for String
     */
    @JsonSetter("CompanyType")
    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    /**
     * Getter for DateOfBirth.
     * Date of birth (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("DateOfBirth")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Setter for DateOfBirth.
     * Date of birth (yyyy-mm-dd)
     * @param dateOfBirth Value for String
     */
    @JsonSetter("DateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Getter for DoBAssociateOrAlias.
     * Date of birth (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("DoBAssociateOrAlias")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDoBAssociateOrAlias() {
        return doBAssociateOrAlias;
    }

    /**
     * Setter for DoBAssociateOrAlias.
     * Date of birth (yyyy-mm-dd)
     * @param doBAssociateOrAlias Value for String
     */
    @JsonSetter("DoBAssociateOrAlias")
    public void setDoBAssociateOrAlias(String doBAssociateOrAlias) {
        this.doBAssociateOrAlias = doBAssociateOrAlias;
    }

    /**
     * Getter for InformationDate.
     * Information Date (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("InformationDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInformationDate() {
        return informationDate;
    }

    /**
     * Setter for InformationDate.
     * Information Date (yyyy-mm-dd)
     * @param informationDate Value for String
     */
    @JsonSetter("InformationDate")
    public void setInformationDate(String informationDate) {
        this.informationDate = informationDate;
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
     * Getter for InformationSupplier.
     * @return Returns the String
     */
    @JsonGetter("InformationSupplier")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInformationSupplier() {
        return informationSupplier;
    }

    /**
     * Setter for InformationSupplier.
     * @param informationSupplier Value for String
     */
    @JsonSetter("InformationSupplier")
    public void setInformationSupplier(String informationSupplier) {
        this.informationSupplier = informationSupplier;
    }

    /**
     * Getter for InformationType.
     * @return Returns the String
     */
    @JsonGetter("InformationType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInformationType() {
        return informationType;
    }

    /**
     * Setter for InformationType.
     * @param informationType Value for String
     */
    @JsonSetter("InformationType")
    public void setInformationType(String informationType) {
        this.informationType = informationType;
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
     * Getter for Source.
     * @return Returns the String
     */
    @JsonGetter("Source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSource() {
        return source;
    }

    /**
     * Setter for Source.
     * @param source Value for String
     */
    @JsonSetter("Source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Getter for SupplierBranch.
     * @return Returns the String
     */
    @JsonGetter("SupplierBranch")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSupplierBranch() {
        return supplierBranch;
    }

    /**
     * Setter for SupplierBranch.
     * @param supplierBranch Value for String
     */
    @JsonSetter("SupplierBranch")
    public void setSupplierBranch(String supplierBranch) {
        this.supplierBranch = supplierBranch;
    }

    /**
     * Converts this AssociationSegment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AssociationSegment [" + "applicantIndicator=" + applicantIndicator
                + ", associateName=" + associateName + ", cAISAccountNumbers=" + cAISAccountNumbers
                + ", companyType=" + companyType + ", dateOfBirth=" + dateOfBirth
                + ", doBAssociateOrAlias=" + doBAssociateOrAlias + ", informationDate="
                + informationDate + ", informationSource=" + informationSource
                + ", informationSupplier=" + informationSupplier + ", informationType="
                + informationType + ", location=" + location + ", locationIndicator="
                + locationIndicator + ", matchDetails=" + matchDetails + ", name=" + name
                + ", noCReference=" + noCReference + ", source=" + source + ", supplierBranch="
                + supplierBranch + "]";
    }

    /**
     * Builds a new {@link AssociationSegment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AssociationSegment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .applicantIndicator(getApplicantIndicator())
                .associateName(getAssociateName())
                .cAISAccountNumbers(getCAISAccountNumbers())
                .companyType(getCompanyType())
                .dateOfBirth(getDateOfBirth())
                .doBAssociateOrAlias(getDoBAssociateOrAlias())
                .informationDate(getInformationDate())
                .informationSource(getInformationSource())
                .informationSupplier(getInformationSupplier())
                .informationType(getInformationType())
                .location(getLocation())
                .locationIndicator(getLocationIndicator())
                .matchDetails(getMatchDetails())
                .name(getName())
                .noCReference(getNoCReference())
                .source(getSource())
                .supplierBranch(getSupplierBranch());
        return builder;
    }

    /**
     * Class to build instances of {@link AssociationSegment}.
     */
    public static class Builder {
        private String applicantIndicator;
        private InputNameDetail associateName;
        private String cAISAccountNumbers;
        private String companyType;
        private String dateOfBirth;
        private String doBAssociateOrAlias;
        private String informationDate;
        private String informationSource;
        private String informationSupplier;
        private String informationType;
        private LocationDetail location;
        private String locationIndicator;
        private MatchDetail matchDetails;
        private InputNameDetail name;
        private String noCReference;
        private String source;
        private String supplierBranch;



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
         * Setter for associateName.
         * @param  associateName  InputNameDetail value for associateName.
         * @return Builder
         */
        public Builder associateName(InputNameDetail associateName) {
            this.associateName = associateName;
            return this;
        }

        /**
         * Setter for cAISAccountNumbers.
         * @param  cAISAccountNumbers  String value for cAISAccountNumbers.
         * @return Builder
         */
        public Builder cAISAccountNumbers(String cAISAccountNumbers) {
            this.cAISAccountNumbers = cAISAccountNumbers;
            return this;
        }

        /**
         * Setter for companyType.
         * @param  companyType  String value for companyType.
         * @return Builder
         */
        public Builder companyType(String companyType) {
            this.companyType = companyType;
            return this;
        }

        /**
         * Setter for dateOfBirth.
         * @param  dateOfBirth  String value for dateOfBirth.
         * @return Builder
         */
        public Builder dateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        /**
         * Setter for doBAssociateOrAlias.
         * @param  doBAssociateOrAlias  String value for doBAssociateOrAlias.
         * @return Builder
         */
        public Builder doBAssociateOrAlias(String doBAssociateOrAlias) {
            this.doBAssociateOrAlias = doBAssociateOrAlias;
            return this;
        }

        /**
         * Setter for informationDate.
         * @param  informationDate  String value for informationDate.
         * @return Builder
         */
        public Builder informationDate(String informationDate) {
            this.informationDate = informationDate;
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
         * Setter for informationSupplier.
         * @param  informationSupplier  String value for informationSupplier.
         * @return Builder
         */
        public Builder informationSupplier(String informationSupplier) {
            this.informationSupplier = informationSupplier;
            return this;
        }

        /**
         * Setter for informationType.
         * @param  informationType  String value for informationType.
         * @return Builder
         */
        public Builder informationType(String informationType) {
            this.informationType = informationType;
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
         * Setter for source.
         * @param  source  String value for source.
         * @return Builder
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * Setter for supplierBranch.
         * @param  supplierBranch  String value for supplierBranch.
         * @return Builder
         */
        public Builder supplierBranch(String supplierBranch) {
            this.supplierBranch = supplierBranch;
            return this;
        }

        /**
         * Builds a new {@link AssociationSegment} object using the set fields.
         * @return {@link AssociationSegment}
         */
        public AssociationSegment build() {
            return new AssociationSegment(applicantIndicator, associateName, cAISAccountNumbers,
                    companyType, dateOfBirth, doBAssociateOrAlias, informationDate,
                    informationSource, informationSupplier, informationType, location,
                    locationIndicator, matchDetails, name, noCReference, source, supplierBranch);
        }
    }
}
