package bank;

import java.util.Objects;

public class Account {
    private int value;
    private Client client;

    public Account(Client client, int value) {
        this.value = value;
        this.client = client;
    }

    public int getValue() {
        return value;
    }

    public Client getClient() {
        return client;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Account{" +
                "value=" + value +
                ", client=" + client +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return value == account.value && Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, client);
    }
}


