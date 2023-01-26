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
 * This is a model class for VolArrangement type.
 */
public class VolArrangement {
    private String approvalDate;
    private String cessationDate;
    private String cessationLodgeDate;
    private String cessationType;
    private String lodgedDate;
    private Integer numberSupervisors;
    private String publicationTown;
    private List<Supervisors> supervisor;

    /**
     * Default constructor.
     */
    public VolArrangement() {
    }

    /**
     * Initialization constructor.
     * @param  approvalDate  String value for approvalDate.
     * @param  cessationDate  String value for cessationDate.
     * @param  cessationLodgeDate  String value for cessationLodgeDate.
     * @param  cessationType  String value for cessationType.
     * @param  lodgedDate  String value for lodgedDate.
     * @param  numberSupervisors  Integer value for numberSupervisors.
     * @param  publicationTown  String value for publicationTown.
     * @param  supervisor  List of Supervisors value for supervisor.
     */
    public VolArrangement(
            String approvalDate,
            String cessationDate,
            String cessationLodgeDate,
            String cessationType,
            String lodgedDate,
            Integer numberSupervisors,
            String publicationTown,
            List<Supervisors> supervisor) {
        this.approvalDate = approvalDate;
        this.cessationDate = cessationDate;
        this.cessationLodgeDate = cessationLodgeDate;
        this.cessationType = cessationType;
        this.lodgedDate = lodgedDate;
        this.numberSupervisors = numberSupervisors;
        this.publicationTown = publicationTown;
        this.supervisor = supervisor;
    }

    /**
     * Getter for ApprovalDate.
     * Approval Date for the voluntary arrangement for the limited company (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("ApprovalDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getApprovalDate() {
        return approvalDate;
    }

    /**
     * Setter for ApprovalDate.
     * Approval Date for the voluntary arrangement for the limited company (yyyy-mm-dd)
     * @param approvalDate Value for String
     */
    @JsonSetter("ApprovalDate")
    public void setApprovalDate(String approvalDate) {
        this.approvalDate = approvalDate;
    }

    /**
     * Getter for CessationDate.
     * Lodged Date for the cessation of the voluntary arrangement for the limited company
     * (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("CessationDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCessationDate() {
        return cessationDate;
    }

    /**
     * Setter for CessationDate.
     * Lodged Date for the cessation of the voluntary arrangement for the limited company
     * (yyyy-mm-dd)
     * @param cessationDate Value for String
     */
    @JsonSetter("CessationDate")
    public void setCessationDate(String cessationDate) {
        this.cessationDate = cessationDate;
    }

    /**
     * Getter for CessationLodgeDate.
     * Cessation Date for the voluntary arrangement for the limited company (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("CessationLodgeDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCessationLodgeDate() {
        return cessationLodgeDate;
    }

    /**
     * Setter for CessationLodgeDate.
     * Cessation Date for the voluntary arrangement for the limited company (yyyy-mm-dd)
     * @param cessationLodgeDate Value for String
     */
    @JsonSetter("CessationLodgeDate")
    public void setCessationLodgeDate(String cessationLodgeDate) {
        this.cessationLodgeDate = cessationLodgeDate;
    }

    /**
     * Getter for CessationType.
     * Cessation Type indicator - C = Completion; R = Revocation; S = Suspension
     * @return Returns the String
     */
    @JsonGetter("CessationType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCessationType() {
        return cessationType;
    }

    /**
     * Setter for CessationType.
     * Cessation Type indicator - C = Completion; R = Revocation; S = Suspension
     * @param cessationType Value for String
     */
    @JsonSetter("CessationType")
    public void setCessationType(String cessationType) {
        this.cessationType = cessationType;
    }

    /**
     * Getter for LodgedDate.
     * Lodged Date for the voluntary arrangement for the limited company (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("LodgedDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLodgedDate() {
        return lodgedDate;
    }

    /**
     * Setter for LodgedDate.
     * Lodged Date for the voluntary arrangement for the limited company (yyyy-mm-dd)
     * @param lodgedDate Value for String
     */
    @JsonSetter("LodgedDate")
    public void setLodgedDate(String lodgedDate) {
        this.lodgedDate = lodgedDate;
    }

    /**
     * Getter for NumberSupervisors.
     * Number of Supervisors for the voluntary arrangement for the limited company (max 5)
     * @return Returns the Integer
     */
    @JsonGetter("NumberSupervisors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumberSupervisors() {
        return numberSupervisors;
    }

    /**
     * Setter for NumberSupervisors.
     * Number of Supervisors for the voluntary arrangement for the limited company (max 5)
     * @param numberSupervisors Value for Integer
     */
    @JsonSetter("NumberSupervisors")
    public void setNumberSupervisors(Integer numberSupervisors) {
        this.numberSupervisors = numberSupervisors;
    }

    /**
     * Getter for PublicationTown.
     * Publication Town for the voluntary arrangement indicator - B = Belfast; C = Cardiff; E =
     * Edinburgh; L = London
     * @return Returns the String
     */
    @JsonGetter("PublicationTown")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPublicationTown() {
        return publicationTown;
    }

    /**
     * Setter for PublicationTown.
     * Publication Town for the voluntary arrangement indicator - B = Belfast; C = Cardiff; E =
     * Edinburgh; L = London
     * @param publicationTown Value for String
     */
    @JsonSetter("PublicationTown")
    public void setPublicationTown(String publicationTown) {
        this.publicationTown = publicationTown;
    }

    /**
     * Getter for Supervisor.
     * @return Returns the List of Supervisors
     */
    @JsonGetter("Supervisor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Supervisors> getSupervisor() {
        return supervisor;
    }

    /**
     * Setter for Supervisor.
     * @param supervisor Value for List of Supervisors
     */
    @JsonSetter("Supervisor")
    public void setSupervisor(List<Supervisors> supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * Converts this VolArrangement into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VolArrangement [" + "approvalDate=" + approvalDate + ", cessationDate="
                + cessationDate + ", cessationLodgeDate=" + cessationLodgeDate + ", cessationType="
                + cessationType + ", lodgedDate=" + lodgedDate + ", numberSupervisors="
                + numberSupervisors + ", publicationTown=" + publicationTown + ", supervisor="
                + supervisor + "]";
    }

    /**
     * Builds a new {@link VolArrangement.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VolArrangement.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .approvalDate(getApprovalDate())
                .cessationDate(getCessationDate())
                .cessationLodgeDate(getCessationLodgeDate())
                .cessationType(getCessationType())
                .lodgedDate(getLodgedDate())
                .numberSupervisors(getNumberSupervisors())
                .publicationTown(getPublicationTown())
                .supervisor(getSupervisor());
        return builder;
    }

    /**
     * Class to build instances of {@link VolArrangement}.
     */
    public static class Builder {
        private String approvalDate;
        private String cessationDate;
        private String cessationLodgeDate;
        private String cessationType;
        private String lodgedDate;
        private Integer numberSupervisors;
        private String publicationTown;
        private List<Supervisors> supervisor;



        /**
         * Setter for approvalDate.
         * @param  approvalDate  String value for approvalDate.
         * @return Builder
         */
        public Builder approvalDate(String approvalDate) {
            this.approvalDate = approvalDate;
            return this;
        }

        /**
         * Setter for cessationDate.
         * @param  cessationDate  String value for cessationDate.
         * @return Builder
         */
        public Builder cessationDate(String cessationDate) {
            this.cessationDate = cessationDate;
            return this;
        }

        /**
         * Setter for cessationLodgeDate.
         * @param  cessationLodgeDate  String value for cessationLodgeDate.
         * @return Builder
         */
        public Builder cessationLodgeDate(String cessationLodgeDate) {
            this.cessationLodgeDate = cessationLodgeDate;
            return this;
        }

        /**
         * Setter for cessationType.
         * @param  cessationType  String value for cessationType.
         * @return Builder
         */
        public Builder cessationType(String cessationType) {
            this.cessationType = cessationType;
            return this;
        }

        /**
         * Setter for lodgedDate.
         * @param  lodgedDate  String value for lodgedDate.
         * @return Builder
         */
        public Builder lodgedDate(String lodgedDate) {
            this.lodgedDate = lodgedDate;
            return this;
        }

        /**
         * Setter for numberSupervisors.
         * @param  numberSupervisors  Integer value for numberSupervisors.
         * @return Builder
         */
        public Builder numberSupervisors(Integer numberSupervisors) {
            this.numberSupervisors = numberSupervisors;
            return this;
        }

        /**
         * Setter for publicationTown.
         * @param  publicationTown  String value for publicationTown.
         * @return Builder
         */
        public Builder publicationTown(String publicationTown) {
            this.publicationTown = publicationTown;
            return this;
        }

        /**
         * Setter for supervisor.
         * @param  supervisor  List of Supervisors value for supervisor.
         * @return Builder
         */
        public Builder supervisor(List<Supervisors> supervisor) {
            this.supervisor = supervisor;
            return this;
        }

        /**
         * Builds a new {@link VolArrangement} object using the set fields.
         * @return {@link VolArrangement}
         */
        public VolArrangement build() {
            return new VolArrangement(approvalDate, cessationDate, cessationLodgeDate,
                    cessationType, lodgedDate, numberSupervisors, publicationTown, supervisor);
        }
    }
}