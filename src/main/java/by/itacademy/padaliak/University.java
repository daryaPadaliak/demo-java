package by.itacademy.padaliak;

import java.util.Objects;

public class University {
    String name;
    int yearOfFoundation;
    int amountOfStudents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public int getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(int amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }


    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", amountOfStudents=" + amountOfStudents +
                '}';
    }

    /*
    public boolean equals(University university) {
        return this.name == university.name && this.yearOfFoundation == university.yearOfFoundation
                && this.amountOfStudents == university.amountOfStudents;
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return yearOfFoundation == that.yearOfFoundation && amountOfStudents == that.amountOfStudents && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfFoundation, amountOfStudents);
    }

    public University(String name, int yearOfFoundation, int amountOfStudents) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
        this.amountOfStudents = amountOfStudents;
    }

    public University() {
    }
}
