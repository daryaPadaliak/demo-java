package collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("test1", "Pass11");
        Account account2 = new Account("test2", "pass3435");
        Account account3 = new Account("test3", "pasgg45");
        Account account4 = new Account("test3", "pasgg45");
        Account account = new Account("test3", "pasgg45");

        List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);

        int count = 0;

        for (int index = 0; index < accounts.size(); index++) {
            if (account.equals(accounts.get(index))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
