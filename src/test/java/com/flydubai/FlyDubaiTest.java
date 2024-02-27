package com.flydubai;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class FlyDubaiTest extends BaseTest {

    @Test
    public void testSearchDybai() throws InterruptedException{
        FlyDubaiPage flyDubaiPage = new FlyDubaiPage();
        driver.navigate().to(flyDubaiPage.url);
        driver.navigate().refresh();

        //WebElement clickable = driver.findElement(By.xpath(flyDubaiPage.searchIcon));
        /*new Actions(driver)
                .moveByOffset(13, 15)
                .click()
                .perform();*/

        //Thread.sleep(20000);
        /*Wait<WebDriver> wait =
                new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(16))
                        .pollingEvery(Duration.ofMillis(300))
                        .ignoring(ElementNotInteractableException.class);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(flyDubaiPage.searchIcon)));*/

        /*new Actions(driver)
                .scrollByAmount(0, 10000)
                .perform();
        Thread.sleep(20000);*/

        driver.findElement(By.xpath(flyDubaiPage.searchIcon)).click();
        driver.findElement(By.xpath(flyDubaiPage.inputField)).sendKeys("Путеводитель по Дубаю");
        driver.findElement(By.xpath(flyDubaiPage.btnSearch)).click();
        Assertions.assertEquals("Путеводитель по Дубаю", driver.findElement(By.xpath(flyDubaiPage.searchResult)).getText());
    }
/*
    @Test
    public void scrollOnlinerTest() throws InterruptedException{
        String onlinerUrl = "https://www.onliner.by/";
        By copyright = By.xpath("/html/body/div[1]/footer/div/div/div/div[2]/div[2]");
        driver.get(onlinerUrl);

        *//*WebElement footer = driver.findElement(copyright);
        new Actions(driver)
                .scrollToElement(footer)
                .perform();*//*

        new Actions(driver)
                .scrollByAmount(0, 20000)
                .perform();

        new Actions(driver)
                .scrollByAmount(0, -20000)
                .perform();

        Thread.sleep(2000);
    }*/
}
