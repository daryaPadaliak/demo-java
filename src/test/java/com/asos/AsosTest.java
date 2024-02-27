package com.asos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AsosTest extends BaseTest{
    @Test
    public void addItemToBagTest() throws InterruptedException {
        AsosPage asosPage = new AsosPage();
        new AsosStep(asosPage).openPageAndProductItem();
        Assertions.assertEquals("New Look ribbed knitted dress with side split in black", asosPage.getItemText());
    }
}
