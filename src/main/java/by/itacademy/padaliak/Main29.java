package by.itacademy.padaliak;

public class Main29 {
    public static void main(String[] args) {
        University univer1 = new University();
        University univer2 = new University();
        univer1.setName("BNTU");
        univer1.setYearOfFoundation(1917);
        univer1.setAmountOfStudents(50000);

        univer2.setName("BNTU");
        univer2.setYearOfFoundation(1917);
        univer2.setAmountOfStudents(50000);

        System.out.println(univer1);
        System.out.println(univer2);

        System.out.println(univer1.getName().equals(univer2.getName()));
        System.out.println(univer1.getYearOfFoundation() == univer2.getYearOfFoundation());
        System.out.println(univer1.getAmountOfStudents() == univer2.getAmountOfStudents());

        System.out.println(univer1.equals(univer2));

        double random = 100 * Math.random();
        System.out.println(random);

    }
}
