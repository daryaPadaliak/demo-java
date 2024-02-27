package bank;

import java.util.Objects;

public class Card {
    private Client client;
    private Account account;

    public Card(Client client, Account account) {
        this.client = client;
        this.account = account;
    }

    public Client getClient() {
        return client;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Card{" +
                "client=" + client +
                ", account=" + account +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(client, card.client) && Objects.equals(account, card.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, account);
    }
}
