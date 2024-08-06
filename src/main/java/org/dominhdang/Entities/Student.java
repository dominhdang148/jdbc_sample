package org.dominhdang.Entities;

import java.time.LocalDate;

public class Student {

    private int Id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private float avgScore;

    public Student(
            int Id,
            String firstName,
            String lastName,
            LocalDate birthDate,
            float avgScore) {
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.avgScore = avgScore;
    }

    public int getId() {
        return this.Id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public float getAvgScore() {
        return this.avgScore;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", avgScore=" + avgScore +
                '}';
    }
}
