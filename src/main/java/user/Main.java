package user;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[10];
        for (int i = 0; i < 10; i++) {
            users[i] = new User();
            users[i].setAge(i);
            users[i].setPassword("" + (int)(Math.random() * 100000));
            users[i].setName("" + (char) (Math.random() * 1000) + (char) (Math.random() * 1000) + (char) (Math.random() * 1000));
        }
        for (int i=0; i< users.length; i++){
            System.out.println("name " + users[i].getName() + " \tpassword " + users[i].getPassword() + " \tage " + users[i].getAge());
        }
    }
}
