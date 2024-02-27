package com.myredbubble;

import basetest.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class RedbubbleTest extends BaseTest {

    @Test
    public void testLoginWithIncorrectData() {
        driver.get(RedbubblePage.loginPageUrl);
        driver.findElement(By.xpath(RedbubblePage.emailXpath)).sendKeys("gwert7786756@gmail.com");
        driver.findElement(By.xpath(RedbubblePage.cookiesBtnXpath)).click();
        driver.findElement(By.xpath(RedbubblePage.passwordXpath)).sendKeys("465UYuy6FGhdfs@g");
        driver.findElement(By.xpath(RedbubblePage.logInBtnXpath)).click();
        Assertions.assertEquals("Invalid username or password.", driver.findElement(By.xpath(RedbubblePage.errorMessage)).getText());
    }
}
