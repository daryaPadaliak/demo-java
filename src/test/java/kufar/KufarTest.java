package kufar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class KufarTest extends BaseTest {
    @Test
    public void testLogin() throws InterruptedException {
        driver.get("https://www.kufar.by/");

        String btnPolicyXpath = "//button[@class=\"styles_button__oKUgO styles_secondary__MiBIC styles_size-m__NgAcw styles_submit_button__T_qS1\"]";
        WebElement btnPolicy = driver.findElement(By.xpath(btnPolicyXpath));
        btnPolicy.click();

        String btnPromotionXpath = "//button[@class=\"styles_button__oKUgO styles_outline_default__doSRy styles_size-m__NgAcw styles_block___PraQ styles_close__pyx8_\"]";
        WebElement btnPromotion = driver.findElement(By.xpath(btnPromotionXpath));
        btnPromotion.click();

        Thread.sleep(4000);

        String btnLoginXpath = "//button[@class=\"styles_button__oKUgO styles_outline__maWFU styles_size-m__NgAcw\"]";
        WebElement btnLogin = driver.findElement(By.xpath(btnLoginXpath));
        btnLogin.click();

        String loginXpath = "//*[@id=\"header\"]/div[2]/div[4]/div/div/button";
        WebElement login = driver.findElement(By.xpath(loginXpath));
        login.sendKeys("test65799080@test.com");

        String passwordXpath = "//input[@id='password']";
        WebElement password = driver.findElement(By.xpath(passwordXpath));
        password.sendKeys("jk898079");

        String btnEnterXpath = "//div[@data-name=\"login_submit\"]/button";
        WebElement btnEnter = driver.findElement(By.xpath(btnEnterXpath));
        btnEnter.click();


        String errorMessageXpath = "//form[@data-name=\"form_login\"]/div/div";
        Thread.sleep(4000);
        WebElement errorMessage  = driver.findElement(By.xpath(errorMessageXpath));
        String expectedMessage = "Введен неверный пароль либо такого профиля не существует\n" +
                "Попробуйте войти по номеру телефона";
        Assertions.assertEquals(expectedMessage,errorMessage.getText());
    }
}