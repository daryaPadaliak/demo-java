package myfin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyfinTest extends BaseTest {
    @Test

    public void testCurrencyExchange() {
        driver.get("https://myfin.by/");
        String aCurrencyXpath = "//*[@id=\"st-container\"]/div/div/div/div/div/div/div/div/div[1]/div/nav/ul/li[2]/a";
        WebElement aCurrency = driver.findElement(By.xpath(aCurrencyXpath));
        aCurrency.click();

        String spanBuyXpath = "//*[@id=\"st-container\"]/div/div/div/div/div/div/div/div/div[4]/section/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[1]/span";
        WebElement spanBuy = driver.findElement(By.xpath(spanBuyXpath));
        String valueBuy = spanBuy.getText();

        String spanSellXpath = "//*[@id=\"st-container\"]/div/div/div/div/div/div/div/div/div[4]/section/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/span";
        WebElement spanSell = driver.findElement(By.xpath(spanSellXpath));
        String valueSell = spanSell.getText();

        System.out.println(valueBuy);
        System.out.println(valueSell);

        double buy = new Double(valueBuy).doubleValue();
        double sell = new Double(valueSell).doubleValue();

        System.out.println(buy);
        System.out.println(sell);

        double result = sell - buy;
        System.out.println(result >= 0);

        Assertions.assertTrue(result >= 0);
    }
}
