package rw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RwPage {

    WebDriver driver;
    public RwPage(WebDriver driver) {
        this.driver = driver;
    }

    public String fromXpath = "//input[@name='from']";
    public String destinationXpath = "//input[@name='to']";
    public String allDaysXpath = "(//a[@date-code='everyday'])[1]";
    public String searchXpath = "//*[@id=\"fTickets\"]/div[2]/div[1]/span/input";

    public void clickFrom (){
        driver.findElement(By.xpath(fromXpath)).click();
    }

    public void sendFrom (String newFrom){
        driver.findElement(By.xpath(fromXpath)).sendKeys(newFrom);
    }

    public void clickDestination(){
        driver.findElement(By.xpath(destinationXpath)).click();
    }

    public void sendDestination(String newDestination){
        driver.findElement(By.xpath(destinationXpath)).sendKeys(newDestination);
    }

    public void clickAllDays(){
        driver.findElement(By.xpath(allDaysXpath)).click();
    }

    public void clickSearch(){
        driver.findElement(By.xpath(searchXpath)).click();
    }
}
