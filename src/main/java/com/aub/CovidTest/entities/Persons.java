package com.aub.CovidTest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Persons {

   @Id
  @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String cities;
    private Boolean testStatus;
    private LocalDate testDate;


    public Persons() {
    }

    public Persons( String firstName, String lastName, String cities, Boolean testStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cities = cities;
        this.testStatus = testStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCities() {
        return cities;
    }

    public void setCities(String cities) {
        this.cities = cities;
    }

    public Boolean getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(Boolean testStatus) {
        this.testStatus = testStatus;
    }

    public LocalDate getTestDate() {
        return testDate;
    }

    public void setTestDate(LocalDate testDate) {
        this.testDate = testDate;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cities='" + cities + '\'' +
                ", testStatus=" + testStatus +
                ", testDate=" + testDate +
                '}';
    }
}
