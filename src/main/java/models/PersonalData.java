package models;

import validators.FederalTaxNumberValidator;

public class PersonalData {

    private String federalTaxNumber;
    private String name;
    private String email;
    private Address address;
    private String birthDay;

    public PersonalData(String federalTaxNumber, String name, String email, Address address, String birthDay) {
        if (!FederalTaxNumberValidator.isValidFederalTaxNumber(federalTaxNumber, birthDay)) {
            throw new RuntimeException("INVALID FEDERAL TAX NUMBER!");
        }
        this.federalTaxNumber = federalTaxNumber;
        this.name = name;
        this.email = email;
        this.address = address;
        this.birthDay = birthDay;
    }

    public String getFederalTaxNumber() {
        return federalTaxNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public String getBirthDay() {
        return birthDay;
    }
}
