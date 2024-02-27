package bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientTest {
    @Test
    public void testGetName() {
        String name = "john";
        Client client = new Client(1, name);
        String actualName = client.getName();
        Assertions.assertEquals(name, actualName);
    }

    @Test
    public void testGetId(){
        int id = 12;
        Client client = new Client(id, "dasha");
        Assertions.assertEquals(id, client.getId());
    }
}
