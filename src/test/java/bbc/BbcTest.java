package bbc;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcTest extends BaseTest {

    /*@Test
    public void testSportMenu() {
        driver.get("https://www.bbc.com/");
        String sportXpath = "//*[@id=\"orb-header\"]/div/nav[2]/ul/li[3]/a/span";
        WebElement sport = driver.findElement(By.xpath(sportXpath));
        sport.click();
        String expectedTitle = "Sport";
        String titleXpath = "//*[@id=\"header-content\"]/nav/div[1]/div/div[2]/ul[2]/li[3]/a/span";
        WebElement actualTitle = driver.findElement(By.xpath(titleXpath));
        Assertions.assertEquals(expectedTitle, actualTitle.getText());
    }*/

    @Test

    public void testSignIn() {
        driver.get("https://www.bbc.com/");
        String signInXpath = "//*[@id=\"idcta-username\"]";
        WebElement signIn = driver.findElement(By.xpath(signInXpath));
        signIn.click();

        String registerNowXpath = "//*[@id=\"signin-page\"]/div[2]/div/div[2]/a/span";
        WebElement registerNow = driver.findElement(By.xpath(registerNowXpath));
        registerNow.click();

        String sixteenOrOverXpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[2]/fieldset/div[1]/a[2]";
        WebElement sixteenOrOver = driver.findElement(By.xpath(sixteenOrOverXpath));
        sixteenOrOver.click();
    }
}
