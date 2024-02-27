package by.itacademy.padaliak;

public class Main25 {
    public static void main(String[] args) {
        Transport transport1= new Transport();
        Transport transport2= new Transport();
        transport1.setType("public");
        transport2.setType("private");
        System.out.println(transport1.getType());
        System.out.println(transport2.getType());
    }
}
