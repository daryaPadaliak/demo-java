package bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest {
    @Test
    public void testClient(){
        Client client = new Client(12, "dasha");
        Account account = new Account(client, 100);
        Card card  = new Card(client, account);
        Client actualClient = card.getClient();
        Assertions.assertEquals(client, actualClient);
    }

    @Test
    public void testClient2(){
        Client client = new Client(12, "dasha");
        Account account = new Account(client, 100);
        Card card  = new Card(client, account);
        System.out.println(client.equals(card.getClient()));
    }
}
