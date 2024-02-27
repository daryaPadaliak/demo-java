package com.asos;

import org.junit.jupiter.api.AfterEach;

public class BaseTest {

   @AfterEach
    public void finishDriver() {
        Singleton.closeDriver();
    }
}
