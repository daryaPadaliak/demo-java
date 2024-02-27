package by.itacademy.padaliak;

import org.w3c.dom.ls.LSOutput;

public class Main30 {
    public static void main(String[] args) {
        Passport passport1 = new Passport("hrgfg12", "Dasha");
        University university1 = new University("BNTU", 1917, 2000);
        Student student1 = new Student(passport1, university1);
        System.out.println(student1);
    }
}
