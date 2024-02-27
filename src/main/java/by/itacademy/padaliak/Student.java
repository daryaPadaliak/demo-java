package by.itacademy.padaliak;

import java.util.Objects;

public class Student {
    Passport passport;
    University university;

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "passport=" + passport +
                ", university=" + university +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(passport, student.passport) && Objects.equals(university, student.university);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport, university);
    }

    public Student(Passport passport, University university) {
        this.passport = passport;
        this.university = university;
    }
}
