package collection;

import java.util.List;

public class Accounts {
    public static int getCountAccounts(Account account, List<Accounts> accounts) {
        int count = 0;
        for (int index = 0; index < accounts.size(); index++) {
            if (account.equals(accounts.get(index))) {
                count++;
            }
        }
        return count;
    }
}
