package by.itacademy.padaliak;

public class Main20 {
    public static void main(String[] args) {
        User user1 = new User();
        user1.age = 23;
        User user2 = new User();
        user2.age = 26;
        User user3 = new User();
        user3.age = 37;
        double averageAge = (double) (user1.age + user2.age + user3.age) / 3;
        System.out.println(averageAge);
        int[] users = {user1.age, user2.age, user3.age};
        averageAge = Util.calculateAverageOfArray(users);
        System.out.println(averageAge);
    }
}
