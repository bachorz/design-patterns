package com.patterns.libraryAdapter;

import java.time.LocalDate;

public class User {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String pesel;

    public User(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.now();
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPesel() {
        return pesel;
    }
}
