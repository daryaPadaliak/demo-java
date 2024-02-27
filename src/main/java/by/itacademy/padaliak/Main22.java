package by.itacademy.padaliak;

import by.itacademy.padaliak.Account;

public class Main22 {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account();
        Account acc3 = new Account();
        acc1.name = "tom";
        acc1.number = 123;
        acc1.amount = 90;

        acc2.name = "jane";
        acc2.number = 111;
        acc2.amount = 700;

        acc3.name = "olya";
        acc3.number = 13;
        acc3.amount = 1070;

        int[] amounts = {acc1.amount, acc2.amount, acc3.amount};
        String[] names = {acc1.name, acc2.name, acc3.name};
        int result = amounts[0];
        String name2 = names [0];
        for (int i = 0; i < amounts.length; i++) {
            if (amounts[i] > result) {
                result = amounts[i];
                name2 = names[i];
            }
        }
        System.out.println(name2);

        String name;
        int max;

        if (acc1.amount > acc2.amount) {
            name = acc1.name;
            max = acc1.amount;
        } else {
            name = acc2.name;
            max = acc2.amount;
        }
        if (max < acc3.amount) {
            name = acc3.name;
            max = acc3.amount;
        }
        System.out.println(name);
    }
}
