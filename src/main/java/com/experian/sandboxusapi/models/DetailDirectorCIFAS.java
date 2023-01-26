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
 * This is a model class for DetailDirectorCIFAS type.
 */
public class DetailDirectorCIFAS {
    private Address address;
    private String fraudCategory;
    private String name;
    private String nocRef;
    private String reference;
    private Supplier supplier;

    /**
     * Default constructor.
     */
    public DetailDirectorCIFAS() {
    }

    /**
     * Initialization constructor.
     * @param  address  Address value for address.
     * @param  fraudCategory  String value for fraudCategory.
     * @param  name  String value for name.
     * @param  nocRef  String value for nocRef.
     * @param  reference  String value for reference.
     * @param  supplier  Supplier value for supplier.
     */
    public DetailDirectorCIFAS(
            Address address,
            String fraudCategory,
            String name,
            String nocRef,
            String reference,
            Supplier supplier) {
        this.address = address;
        this.fraudCategory = fraudCategory;
        this.name = name;
        this.nocRef = nocRef;
        this.reference = reference;
        this.supplier = supplier;
    }

    /**
     * Getter for Address.
     * @return Returns the Address
     */
    @JsonGetter("Address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Address getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * @param address Value for Address
     */
    @JsonSetter("Address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Getter for FraudCategory.
     * Fraud category - 00 = Protective Registration - Recorded at request of the person named; 01 =
     * Providing a false name and a true address; 02 = Providing or using the name and particulars
     * of another person; 03 = Providing or using a genuine name and address, but one or more
     * material falsehoods in personal details followed by a serious misuse of the credit or other
     * facility and/or non-payment; 04 = Providing or using a genuine name and address, but one or
     * more material falsehoods in personal details; 05 = Disposal/selling on of goods obtained on
     * credit and failing to settle the finance agreement; 06 = Opening an account for the purpose
     * of fraud; 07 = Aiding and Abetting - Aiding, abetting or assisting, or conspiring with,
     * another or others to fraudulently procure credit, hire or other facilities, or other product
     * or service; 08 = Insurance Fraud - The making of a claim(s) under one or more insurance
     * policy(ies) with one or more material falsehoods or by presenting a false or forged document
     * @return Returns the String
     */
    @JsonGetter("FraudCategory")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFraudCategory() {
        return fraudCategory;
    }

    /**
     * Setter for FraudCategory.
     * Fraud category - 00 = Protective Registration - Recorded at request of the person named; 01 =
     * Providing a false name and a true address; 02 = Providing or using the name and particulars
     * of another person; 03 = Providing or using a genuine name and address, but one or more
     * material falsehoods in personal details followed by a serious misuse of the credit or other
     * facility and/or non-payment; 04 = Providing or using a genuine name and address, but one or
     * more material falsehoods in personal details; 05 = Disposal/selling on of goods obtained on
     * credit and failing to settle the finance agreement; 06 = Opening an account for the purpose
     * of fraud; 07 = Aiding and Abetting - Aiding, abetting or assisting, or conspiring with,
     * another or others to fraudulently procure credit, hire or other facilities, or other product
     * or service; 08 = Insurance Fraud - The making of a claim(s) under one or more insurance
     * policy(ies) with one or more material falsehoods or by presenting a false or forged document
     * @param fraudCategory Value for String
     */
    @JsonSetter("FraudCategory")
    public void setFraudCategory(String fraudCategory) {
        this.fraudCategory = fraudCategory;
    }

    /**
     * Getter for Name.
     * Name
     * @return Returns the String
     */
    @JsonGetter("Name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name
     * @param name Value for String
     */
    @JsonSetter("Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for NocRef.
     * Not currently supported
     * @return Returns the String
     */
    @JsonGetter("NocRef")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNocRef() {
        return nocRef;
    }

    /**
     * Setter for NocRef.
     * Not currently supported
     * @param nocRef Value for String
     */
    @JsonSetter("NocRef")
    public void setNocRef(String nocRef) {
        this.nocRef = nocRef;
    }

    /**
     * Getter for Reference.
     * Reference
     * @return Returns the String
     */
    @JsonGetter("Reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReference() {
        return reference;
    }

    /**
     * Setter for Reference.
     * Reference
     * @param reference Value for String
     */
    @JsonSetter("Reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Getter for Supplier.
     * @return Returns the Supplier
     */
    @JsonGetter("Supplier")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * Setter for Supplier.
     * @param supplier Value for Supplier
     */
    @JsonSetter("Supplier")
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    /**
     * Converts this DetailDirectorCIFAS into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DetailDirectorCIFAS [" + "address=" + address + ", fraudCategory=" + fraudCategory
                + ", name=" + name + ", nocRef=" + nocRef + ", reference=" + reference
                + ", supplier=" + supplier + "]";
    }

    /**
     * Builds a new {@link DetailDirectorCIFAS.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DetailDirectorCIFAS.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .address(getAddress())
                .fraudCategory(getFraudCategory())
                .name(getName())
                .nocRef(getNocRef())
                .reference(getReference())
                .supplier(getSupplier());
        return builder;
    }

    /**
     * Class to build instances of {@link DetailDirectorCIFAS}.
     */
    public static class Builder {
        private Address address;
        private String fraudCategory;
        private String name;
        private String nocRef;
        private String reference;
        private Supplier supplier;



        /**
         * Setter for address.
         * @param  address  Address value for address.
         * @return Builder
         */
        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        /**
         * Setter for fraudCategory.
         * @param  fraudCategory  String value for fraudCategory.
         * @return Builder
         */
        public Builder fraudCategory(String fraudCategory) {
            this.fraudCategory = fraudCategory;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for nocRef.
         * @param  nocRef  String value for nocRef.
         * @return Builder
         */
        public Builder nocRef(String nocRef) {
            this.nocRef = nocRef;
            return this;
        }

        /**
         * Setter for reference.
         * @param  reference  String value for reference.
         * @return Builder
         */
        public Builder reference(String reference) {
            this.reference = reference;
            return this;
        }

        /**
         * Setter for supplier.
         * @param  supplier  Supplier value for supplier.
         * @return Builder
         */
        public Builder supplier(Supplier supplier) {
            this.supplier = supplier;
            return this;
        }

        /**
         * Builds a new {@link DetailDirectorCIFAS} object using the set fields.
         * @return {@link DetailDirectorCIFAS}
         */
        public DetailDirectorCIFAS build() {
            return new DetailDirectorCIFAS(address, fraudCategory, name, nocRef, reference,
                    supplier);
        }
    }
}
