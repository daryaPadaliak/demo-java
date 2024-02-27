package by.itacademy.padaliak;

public class Main28 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        phone1.setModel("IOS");
        phone1.setProducer("Apple");
        phone1.setId("12hj");

        phone2.setModel("Android");
        phone2.setProducer("Samsung");
        phone2.setId("12hj");

        System.out.println(phone1);
        System.out.println(phone2);
    }
}
