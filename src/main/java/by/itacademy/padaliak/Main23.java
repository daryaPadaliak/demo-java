package by.itacademy.padaliak;

public class Main23 {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        user1.name = "dasha";
        user1.age = 29;

        user2.name = "tom";
        user2.age = 4;

        user3.name = "tim";
        user3.age = 3;

        User[] users = {user1, user2, user3};
        String name = Util.getTheYoungestFromTheArray(users);
        System.out.println(name);
    }
}
