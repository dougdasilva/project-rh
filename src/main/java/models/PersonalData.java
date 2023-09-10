package models;

import java.time.LocalDate;

public class PersonalData {

    private int federalTaxNumber;
    private String name;
    private String email;
    private Address address;
    private LocalDate birthDay;

    public PersonalData(int federalTaxNumber, String name, String email, Address address, LocalDate birthDay) {
        this.federalTaxNumber = federalTaxNumber;
        this.name = name;
        this.email = email;
        this.address = address;
        this.birthDay = birthDay;
    }

    public int getFederalTaxNumber() {
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

    public LocalDate getBirthDay() {
        return birthDay;
    }
}
