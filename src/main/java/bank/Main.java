package bank;

import bank.ATM;
import bank.Account;
import bank.Card;
import bank.Client;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(123, "dasha");
        Client client2 = new Client(123, "tom");
        Account account1 = new Account(client1, 1230);
        Account account2 = new Account(client2, 1200);
        Card card1 = new Card(client1, account1);
        Card card2 = new Card(client2, account2);

        ATM.printBalance(card1);
        ATM.printBalance(card2);
    }
}
