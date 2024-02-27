package by.itacademy.padaliak;

public class Main18 {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Tom";
        user1.password = "12345P";
        System.out.println(user1.name);
        User user2 = new User();
        user2.name = "Jane";
        user2.password = "1266125T";

        User[] users = {user1, user2};

        System.out.println(users[0].name);
    }
}
