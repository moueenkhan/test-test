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
 * This is a model class for Petition type.
 */
public class Petition {
    private String courtName;
    private String hearingDate;
    private Integer numberPetitioners;
    private List<Petitioners> petitioners;
    private String presentationDate;
    private String publicationDate;
    private Solicitors solicitors;

    /**
     * Default constructor.
     */
    public Petition() {
    }

    /**
     * Initialization constructor.
     * @param  courtName  String value for courtName.
     * @param  hearingDate  String value for hearingDate.
     * @param  numberPetitioners  Integer value for numberPetitioners.
     * @param  petitioners  List of Petitioners value for petitioners.
     * @param  presentationDate  String value for presentationDate.
     * @param  publicationDate  String value for publicationDate.
     * @param  solicitors  Solicitors value for solicitors.
     */
    public Petition(
            String courtName,
            String hearingDate,
            Integer numberPetitioners,
            List<Petitioners> petitioners,
            String presentationDate,
            String publicationDate,
            Solicitors solicitors) {
        this.courtName = courtName;
        this.hearingDate = hearingDate;
        this.numberPetitioners = numberPetitioners;
        this.petitioners = petitioners;
        this.presentationDate = presentationDate;
        this.publicationDate = publicationDate;
        this.solicitors = solicitors;
    }

    /**
     * Getter for CourtName.
     * Court for the Winding Up Petition for the limited company
     * @return Returns the String
     */
    @JsonGetter("CourtName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCourtName() {
        return courtName;
    }

    /**
     * Setter for CourtName.
     * Court for the Winding Up Petition for the limited company
     * @param courtName Value for String
     */
    @JsonSetter("CourtName")
    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    /**
     * Getter for HearingDate.
     * Hearing Date for the Winding Up Petition for the limited company (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("HearingDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHearingDate() {
        return hearingDate;
    }

    /**
     * Setter for HearingDate.
     * Hearing Date for the Winding Up Petition for the limited company (yyyy-mm-dd)
     * @param hearingDate Value for String
     */
    @JsonSetter("HearingDate")
    public void setHearingDate(String hearingDate) {
        this.hearingDate = hearingDate;
    }

    /**
     * Getter for NumberPetitioners.
     * Number of Petitioners for the Winding Up Petition for the limited company (max 2)
     * @return Returns the Integer
     */
    @JsonGetter("NumberPetitioners")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumberPetitioners() {
        return numberPetitioners;
    }

    /**
     * Setter for NumberPetitioners.
     * Number of Petitioners for the Winding Up Petition for the limited company (max 2)
     * @param numberPetitioners Value for Integer
     */
    @JsonSetter("NumberPetitioners")
    public void setNumberPetitioners(Integer numberPetitioners) {
        this.numberPetitioners = numberPetitioners;
    }

    /**
     * Getter for Petitioners.
     * @return Returns the List of Petitioners
     */
    @JsonGetter("Petitioners")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Petitioners> getPetitioners() {
        return petitioners;
    }

    /**
     * Setter for Petitioners.
     * @param petitioners Value for List of Petitioners
     */
    @JsonSetter("Petitioners")
    public void setPetitioners(List<Petitioners> petitioners) {
        this.petitioners = petitioners;
    }

    /**
     * Getter for PresentationDate.
     * Presentation Date for the Winding Up Petition for the limited company (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("PresentationDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPresentationDate() {
        return presentationDate;
    }

    /**
     * Setter for PresentationDate.
     * Presentation Date for the Winding Up Petition for the limited company (yyyy-mm-dd)
     * @param presentationDate Value for String
     */
    @JsonSetter("PresentationDate")
    public void setPresentationDate(String presentationDate) {
        this.presentationDate = presentationDate;
    }

    /**
     * Getter for PublicationDate.
     * Publication Date for the Winding Up Petition for the limited company (yyyy-mm-dd)
     * @return Returns the String
     */
    @JsonGetter("PublicationDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Setter for PublicationDate.
     * Publication Date for the Winding Up Petition for the limited company (yyyy-mm-dd)
     * @param publicationDate Value for String
     */
    @JsonSetter("PublicationDate")
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * Getter for Solicitors.
     * @return Returns the Solicitors
     */
    @JsonGetter("Solicitors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Solicitors getSolicitors() {
        return solicitors;
    }

    /**
     * Setter for Solicitors.
     * @param solicitors Value for Solicitors
     */
    @JsonSetter("Solicitors")
    public void setSolicitors(Solicitors solicitors) {
        this.solicitors = solicitors;
    }

    /**
     * Converts this Petition into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Petition [" + "courtName=" + courtName + ", hearingDate=" + hearingDate
                + ", numberPetitioners=" + numberPetitioners + ", petitioners=" + petitioners
                + ", presentationDate=" + presentationDate + ", publicationDate=" + publicationDate
                + ", solicitors=" + solicitors + "]";
    }

    /**
     * Builds a new {@link Petition.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Petition.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .courtName(getCourtName())
                .hearingDate(getHearingDate())
                .numberPetitioners(getNumberPetitioners())
                .petitioners(getPetitioners())
                .presentationDate(getPresentationDate())
                .publicationDate(getPublicationDate())
                .solicitors(getSolicitors());
        return builder;
    }

    /**
     * Class to build instances of {@link Petition}.
     */
    public static class Builder {
        private String courtName;
        private String hearingDate;
        private Integer numberPetitioners;
        private List<Petitioners> petitioners;
        private String presentationDate;
        private String publicationDate;
        private Solicitors solicitors;



        /**
         * Setter for courtName.
         * @param  courtName  String value for courtName.
         * @return Builder
         */
        public Builder courtName(String courtName) {
            this.courtName = courtName;
            return this;
        }

        /**
         * Setter for hearingDate.
         * @param  hearingDate  String value for hearingDate.
         * @return Builder
         */
        public Builder hearingDate(String hearingDate) {
            this.hearingDate = hearingDate;
            return this;
        }

        /**
         * Setter for numberPetitioners.
         * @param  numberPetitioners  Integer value for numberPetitioners.
         * @return Builder
         */
        public Builder numberPetitioners(Integer numberPetitioners) {
            this.numberPetitioners = numberPetitioners;
            return this;
        }

        /**
         * Setter for petitioners.
         * @param  petitioners  List of Petitioners value for petitioners.
         * @return Builder
         */
        public Builder petitioners(List<Petitioners> petitioners) {
            this.petitioners = petitioners;
            return this;
        }

        /**
         * Setter for presentationDate.
         * @param  presentationDate  String value for presentationDate.
         * @return Builder
         */
        public Builder presentationDate(String presentationDate) {
            this.presentationDate = presentationDate;
            return this;
        }

        /**
         * Setter for publicationDate.
         * @param  publicationDate  String value for publicationDate.
         * @return Builder
         */
        public Builder publicationDate(String publicationDate) {
            this.publicationDate = publicationDate;
            return this;
        }

        /**
         * Setter for solicitors.
         * @param  solicitors  Solicitors value for solicitors.
         * @return Builder
         */
        public Builder solicitors(Solicitors solicitors) {
            this.solicitors = solicitors;
            return this;
        }

        /**
         * Builds a new {@link Petition} object using the set fields.
         * @return {@link Petition}
         */
        public Petition build() {
            return new Petition(courtName, hearingDate, numberPetitioners, petitioners,
                    presentationDate, publicationDate, solicitors);
        }
    }
}
