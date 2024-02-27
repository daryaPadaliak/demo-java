package rw;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRW extends BaseTest {

    @Test
    public void testTrain() throws InterruptedException {
        driver.get("https://www.rw.by/");
        RwPage rwPage = new RwPage(driver);
        rwPage.clickFrom();
        rwPage.sendFrom("Минск");
        rwPage.clickDestination();
        rwPage.sendDestination("Витебск");
        rwPage.clickAllDays();
        rwPage.clickSearch();
    }
}
