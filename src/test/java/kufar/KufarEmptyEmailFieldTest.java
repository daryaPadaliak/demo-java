package kufar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class KufarEmptyEmailFieldTest extends BaseTest{
    @Test
    public void verifyLoginError() throws InterruptedException {
        driver.get("https://www.kufar.by");

        KufarPage kufarPage = new KufarPage();

        WebElement cookieBtn = driver.findElement(By.xpath(kufarPage.cookieBtnXpath));
        cookieBtn.click();

        WebElement subscribeBtnCancel = driver.findElement(By.xpath(kufarPage.subscribeBtnCancelXPath));
        subscribeBtnCancel.click();

        //WebElement windowBtn = driver.findElement(By.xpath(kufarPage.policyWindowBtnXpath));
        //windowBtn.click();

        WebElement loginBtn = driver.findElement(By.xpath(kufarPage.loginBtnXPath));
        loginBtn.click();

        WebElement passwordField = driver.findElement(By.xpath(kufarPage.passwordFieldXPath));
        passwordField.sendKeys("Pass102011");

        WebElement emailField = driver.findElement(By.xpath(kufarPage.emailFieldXPath));
        emailField.click();
        passwordField.click();

        WebElement actualLoginMessage = driver.findElement(By.xpath(kufarPage.actualLoginMessageXpath));

        Assertions.assertEquals(kufarPage.expectedLoginMessage, actualLoginMessage.getText());
    }
}
