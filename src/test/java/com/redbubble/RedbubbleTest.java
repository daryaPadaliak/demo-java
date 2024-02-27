package com.redbubble;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class RedbubbleTest extends BaseTest {

    @Test
    public void testLoginWithIncorrectData (){

        driver.get(RedbubblePage.loginPageURL);
        driver.findElement(By.xpath(RedbubblePage.emailXpath)).sendKeys("qwtretre@gmail.com");
        driver.findElement(By.xpath(RedbubblePage.passwordXpath)).sendKeys("215345243Tryre<");
        driver.findElement(By.xpath(RedbubblePage.buttonRememberMeXpath)).click();
        driver.findElement(By.xpath(RedbubblePage.loginXpath)).click();
        Assertions.assertEquals("Invalid username or password.", driver.findElement(By.xpath(RedbubblePage.errorMessageXpath)).getText());
    }
}
