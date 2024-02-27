package by.itacademy.padaliak;

import by.itacademy.padaliak.Account;

public class Main21 {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account();
        Account acc3 = new Account();
        acc1.name = "tom";
        acc1.number = 123;
        acc1.amount = 100;

        acc2.name = "jane";
        acc2.number = 111;
        acc2.amount = 200;

        acc3.name = "olya";
        acc3.number = 13;
        acc3.amount = 100;

        int [] amounts = {acc1.amount, acc2.amount, acc3.amount};
        int sum = Util.calculateSumOfArray(amounts);
        System.out.println(sum);
    }
}
