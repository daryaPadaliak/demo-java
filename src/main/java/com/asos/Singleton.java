package com.asos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Singleton {
    private static WebDriver driver;
    private Singleton(){
    }
    public static WebDriver getDriver() {
        //null
        if (driver == null) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
