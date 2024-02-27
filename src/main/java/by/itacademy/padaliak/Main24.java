package by.itacademy.padaliak;

import java.sql.SQLOutput;

public class Main24 {
    public static void main(String[] args) {
        User2 user1 = new User2();
        user1.setName("Peter");
        user1.setPassword("1234yu");
        System.out.println(user1.getName());
        System.out.println(user1.getPassword());
        System.out.println(user1);
        String getUserAsString = user1.toString();
        String newResult = "result = " + user1;
        System.out.println(newResult);
        System.out.println(user1);
    }
}
