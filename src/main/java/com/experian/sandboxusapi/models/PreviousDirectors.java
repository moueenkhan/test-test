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
 * This is a model class for PreviousDirectors type.
 */
public class PreviousDirectors {
    private String foreignAddressFlag;
    private String directorCompanyFlag;
    private String directorNumber;
    private String appointmentDate;
    private String appointmentIndicator;
    private String resignationDate;
    private String resignationIndicator;
    private Integer directorshipLength;
    private String latestReturns;
    private String nOCRef;
    private Integer numberConvictions;
    private List<ConvictionDetails> convictionDetails;
    private PrevDirectorDetails directorDetails;

    /**
     * Default constructor.
     */
    public PreviousDirectors() {
    }

    /**
     * Initialization constructor.
     * @param  foreignAddressFlag  String value for foreignAddressFlag.
     * @param  directorCompanyFlag  String value for directorCompanyFlag.
     * @param  directorNumber  String value for directorNumber.
     * @param  appointmentDate  String value for appointmentDate.
     * @param  appointmentIndicator  String value for appointmentIndicator.
     * @param  resignationDate  String value for resignationDate.
     * @param  resignationIndicator  String value for resignationIndicator.
     * @param  directorshipLength  Integer value for directorshipLength.
     * @param  latestReturns  String value for latestReturns.
     * @param  nOCRef  String value for nOCRef.
     * @param  numberConvictions  Integer value for numberConvictions.
     * @param  convictionDetails  List of ConvictionDetails value for convictionDetails.
     * @param  directorDetails  PrevDirectorDetails value for directorDetails.
     */
    public PreviousDirectors(
            String foreignAddressFlag,
            String directorCompanyFlag,
            String directorNumber,
            String appointmentDate,
            String appointmentIndicator,
            String resignationDate,
            String resignationIndicator,
            Integer directorshipLength,
            String latestReturns,
            String nOCRef,
            Integer numberConvictions,
            List<ConvictionDetails> convictionDetails,
            PrevDirectorDetails directorDetails) {
        this.foreignAddressFlag = foreignAddressFlag;
        this.directorCompanyFlag = directorCompanyFlag;
        this.directorNumber = directorNumber;
        this.appointmentDate = appointmentDate;
        this.appointmentIndicator = appointmentIndicator;
        this.resignationDate = resignationDate;
        this.resignationIndicator = resignationIndicator;
        this.directorshipLength = directorshipLength;
        this.latestReturns = latestReturns;
        this.nOCRef = nOCRef;
        this.numberConvictions = numberConvictions;
        this.convictionDetails = convictionDetails;
        this.directorDetails = directorDetails;
    }

    /**
     * Getter for ForeignAddressFlag.
     * Previous Director address location indicator - Y = Foreign; N = Not foreign; M = Unknown
     * @return Returns the String
     */
    @JsonGetter("ForeignAddressFlag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getForeignAddressFlag() {
        return foreignAddressFlag;
    }

    /**
     * Setter for ForeignAddressFlag.
     * Previous Director address location indicator - Y = Foreign; N = Not foreign; M = Unknown
     * @param foreignAddressFlag Value for String
     */
    @JsonSetter("ForeignAddressFlag")
    public void setForeignAddressFlag(String foreignAddressFlag) {
        this.foreignAddressFlag = foreignAddressFlag;
    }

    /**
     * Getter for DirectorCompanyFlag.
     * Previous Director company indicator - Y = Director is a company; N = Director is not a
     * company
     * @return Returns the String
     */
    @JsonGetter("DirectorCompanyFlag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDirectorCompanyFlag() {
        return directorCompanyFlag;
    }

    /**
     * Setter for DirectorCompanyFlag.
     * Previous Director company indicator - Y = Director is a company; N = Director is not a
     * company
     * @param directorCompanyFlag Value for String
     */
    @JsonSetter("DirectorCompanyFlag")
    public void setDirectorCompanyFlag(String directorCompanyFlag) {
        this.directorCompanyFlag = directorCompanyFlag;
    }

    /**
     * Getter for DirectorNumber.
     * Experian Director reference number
     * @return Returns the String
     */
    @JsonGetter("DirectorNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDirectorNumber() {
        return directorNumber;
    }

    /**
     * Setter for DirectorNumber.
     * Experian Director reference number
     * @param directorNumber Value for String
     */
    @JsonSetter("DirectorNumber")
    public void setDirectorNumber(String directorNumber) {
        this.directorNumber = directorNumber;
    }

    /**
     * Getter for AppointmentDate.
     * Previous director appointment date (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("AppointmentDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * Setter for AppointmentDate.
     * Previous director appointment date (yyyy-mm-dd)
     * @param appointmentDate Value for String
     */
    @JsonSetter("AppointmentDate")
    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    /**
     * Getter for AppointmentIndicator.
     * The date of Previous Director's appointment qualifier - P=prior to Appointment The date;
     * E=exact date
     * @return Returns the String
     */
    @JsonGetter("AppointmentIndicator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAppointmentIndicator() {
        return appointmentIndicator;
    }

    /**
     * Setter for AppointmentIndicator.
     * The date of Previous Director's appointment qualifier - P=prior to Appointment The date;
     * E=exact date
     * @param appointmentIndicator Value for String
     */
    @JsonSetter("AppointmentIndicator")
    public void setAppointmentIndicator(String appointmentIndicator) {
        this.appointmentIndicator = appointmentIndicator;
    }

    /**
     * Getter for ResignationDate.
     * Previous director resignation date (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("ResignationDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getResignationDate() {
        return resignationDate;
    }

    /**
     * Setter for ResignationDate.
     * Previous director resignation date (yyyy-mm-dd)
     * @param resignationDate Value for String
     */
    @JsonSetter("ResignationDate")
    public void setResignationDate(String resignationDate) {
        this.resignationDate = resignationDate;
    }

    /**
     * Getter for ResignationIndicator.
     * The date of Previous Director's Resignation qualifier - P=prior to Resignation The date;
     * E=exact date
     * @return Returns the String
     */
    @JsonGetter("ResignationIndicator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getResignationIndicator() {
        return resignationIndicator;
    }

    /**
     * Setter for ResignationIndicator.
     * The date of Previous Director's Resignation qualifier - P=prior to Resignation The date;
     * E=exact date
     * @param resignationIndicator Value for String
     */
    @JsonSetter("ResignationIndicator")
    public void setResignationIndicator(String resignationIndicator) {
        this.resignationIndicator = resignationIndicator;
    }

    /**
     * Getter for DirectorshipLength.
     * Length of Previous Directorship in months
     * @return Returns the Integer
     */
    @JsonGetter("DirectorshipLength")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDirectorshipLength() {
        return directorshipLength;
    }

    /**
     * Setter for DirectorshipLength.
     * Length of Previous Directorship in months
     * @param directorshipLength Value for Integer
     */
    @JsonSetter("DirectorshipLength")
    public void setDirectorshipLength(Integer directorshipLength) {
        this.directorshipLength = directorshipLength;
    }

    /**
     * Getter for LatestReturns.
     * Date of latest returns (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("LatestReturns")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLatestReturns() {
        return latestReturns;
    }

    /**
     * Setter for LatestReturns.
     * Date of latest returns (yyyy-mm-dd)
     * @param latestReturns Value for String
     */
    @JsonSetter("LatestReturns")
    public void setLatestReturns(String latestReturns) {
        this.latestReturns = latestReturns;
    }

    /**
     * Getter for NOCRef.
     * Notice of Correction reference
     * @return Returns the String
     */
    @JsonGetter("NOCRef")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNOCRef() {
        return nOCRef;
    }

    /**
     * Setter for NOCRef.
     * Notice of Correction reference
     * @param nOCRef Value for String
     */
    @JsonSetter("NOCRef")
    public void setNOCRef(String nOCRef) {
        this.nOCRef = nOCRef;
    }

    /**
     * Getter for NumberConvictions.
     * Number of convictions against the Previous Director
     * @return Returns the Integer
     */
    @JsonGetter("NumberConvictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumberConvictions() {
        return numberConvictions;
    }

    /**
     * Setter for NumberConvictions.
     * Number of convictions against the Previous Director
     * @param numberConvictions Value for Integer
     */
    @JsonSetter("NumberConvictions")
    public void setNumberConvictions(Integer numberConvictions) {
        this.numberConvictions = numberConvictions;
    }

    /**
     * Getter for ConvictionDetails.
     * @return Returns the List of ConvictionDetails
     */
    @JsonGetter("ConvictionDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ConvictionDetails> getConvictionDetails() {
        return convictionDetails;
    }

    /**
     * Setter for ConvictionDetails.
     * @param convictionDetails Value for List of ConvictionDetails
     */
    @JsonSetter("ConvictionDetails")
    public void setConvictionDetails(List<ConvictionDetails> convictionDetails) {
        this.convictionDetails = convictionDetails;
    }

    /**
     * Getter for DirectorDetails.
     * @return Returns the PrevDirectorDetails
     */
    @JsonGetter("DirectorDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrevDirectorDetails getDirectorDetails() {
        return directorDetails;
    }

    /**
     * Setter for DirectorDetails.
     * @param directorDetails Value for PrevDirectorDetails
     */
    @JsonSetter("DirectorDetails")
    public void setDirectorDetails(PrevDirectorDetails directorDetails) {
        this.directorDetails = directorDetails;
    }

    /**
     * Converts this PreviousDirectors into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PreviousDirectors [" + "foreignAddressFlag=" + foreignAddressFlag
                + ", directorCompanyFlag=" + directorCompanyFlag + ", directorNumber="
                + directorNumber + ", appointmentDate=" + appointmentDate
                + ", appointmentIndicator=" + appointmentIndicator + ", resignationDate="
                + resignationDate + ", resignationIndicator=" + resignationIndicator
                + ", directorshipLength=" + directorshipLength + ", latestReturns=" + latestReturns
                + ", nOCRef=" + nOCRef + ", numberConvictions=" + numberConvictions
                + ", convictionDetails=" + convictionDetails + ", directorDetails="
                + directorDetails + "]";
    }

    /**
     * Builds a new {@link PreviousDirectors.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PreviousDirectors.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .foreignAddressFlag(getForeignAddressFlag())
                .directorCompanyFlag(getDirectorCompanyFlag())
                .directorNumber(getDirectorNumber())
                .appointmentDate(getAppointmentDate())
                .appointmentIndicator(getAppointmentIndicator())
                .resignationDate(getResignationDate())
                .resignationIndicator(getResignationIndicator())
                .directorshipLength(getDirectorshipLength())
                .latestReturns(getLatestReturns())
                .nOCRef(getNOCRef())
                .numberConvictions(getNumberConvictions())
                .convictionDetails(getConvictionDetails())
                .directorDetails(getDirectorDetails());
        return builder;
    }

    /**
     * Class to build instances of {@link PreviousDirectors}.
     */
    public static class Builder {
        private String foreignAddressFlag;
        private String directorCompanyFlag;
        private String directorNumber;
        private String appointmentDate;
        private String appointmentIndicator;
        private String resignationDate;
        private String resignationIndicator;
        private Integer directorshipLength;
        private String latestReturns;
        private String nOCRef;
        private Integer numberConvictions;
        private List<ConvictionDetails> convictionDetails;
        private PrevDirectorDetails directorDetails;



        /**
         * Setter for foreignAddressFlag.
         * @param  foreignAddressFlag  String value for foreignAddressFlag.
         * @return Builder
         */
        public Builder foreignAddressFlag(String foreignAddressFlag) {
            this.foreignAddressFlag = foreignAddressFlag;
            return this;
        }

        /**
         * Setter for directorCompanyFlag.
         * @param  directorCompanyFlag  String value for directorCompanyFlag.
         * @return Builder
         */
        public Builder directorCompanyFlag(String directorCompanyFlag) {
            this.directorCompanyFlag = directorCompanyFlag;
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
         * Setter for appointmentDate.
         * @param  appointmentDate  String value for appointmentDate.
         * @return Builder
         */
        public Builder appointmentDate(String appointmentDate) {
            this.appointmentDate = appointmentDate;
            return this;
        }

        /**
         * Setter for appointmentIndicator.
         * @param  appointmentIndicator  String value for appointmentIndicator.
         * @return Builder
         */
        public Builder appointmentIndicator(String appointmentIndicator) {
            this.appointmentIndicator = appointmentIndicator;
            return this;
        }

        /**
         * Setter for resignationDate.
         * @param  resignationDate  String value for resignationDate.
         * @return Builder
         */
        public Builder resignationDate(String resignationDate) {
            this.resignationDate = resignationDate;
            return this;
        }

        /**
         * Setter for resignationIndicator.
         * @param  resignationIndicator  String value for resignationIndicator.
         * @return Builder
         */
        public Builder resignationIndicator(String resignationIndicator) {
            this.resignationIndicator = resignationIndicator;
            return this;
        }

        /**
         * Setter for directorshipLength.
         * @param  directorshipLength  Integer value for directorshipLength.
         * @return Builder
         */
        public Builder directorshipLength(Integer directorshipLength) {
            this.directorshipLength = directorshipLength;
            return this;
        }

        /**
         * Setter for latestReturns.
         * @param  latestReturns  String value for latestReturns.
         * @return Builder
         */
        public Builder latestReturns(String latestReturns) {
            this.latestReturns = latestReturns;
            return this;
        }

        /**
         * Setter for nOCRef.
         * @param  nOCRef  String value for nOCRef.
         * @return Builder
         */
        public Builder nOCRef(String nOCRef) {
            this.nOCRef = nOCRef;
            return this;
        }

        /**
         * Setter for numberConvictions.
         * @param  numberConvictions  Integer value for numberConvictions.
         * @return Builder
         */
        public Builder numberConvictions(Integer numberConvictions) {
            this.numberConvictions = numberConvictions;
            return this;
        }

        /**
         * Setter for convictionDetails.
         * @param  convictionDetails  List of ConvictionDetails value for convictionDetails.
         * @return Builder
         */
        public Builder convictionDetails(List<ConvictionDetails> convictionDetails) {
            this.convictionDetails = convictionDetails;
            return this;
        }

        /**
         * Setter for directorDetails.
         * @param  directorDetails  PrevDirectorDetails value for directorDetails.
         * @return Builder
         */
        public Builder directorDetails(PrevDirectorDetails directorDetails) {
            this.directorDetails = directorDetails;
            return this;
        }

        /**
         * Builds a new {@link PreviousDirectors} object using the set fields.
         * @return {@link PreviousDirectors}
         */
        public PreviousDirectors build() {
            return new PreviousDirectors(foreignAddressFlag, directorCompanyFlag, directorNumber,
                    appointmentDate, appointmentIndicator, resignationDate, resignationIndicator,
                    directorshipLength, latestReturns, nOCRef, numberConvictions, convictionDetails,
                    directorDetails);
        }
    }
}