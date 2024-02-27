package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;

public class WeightCalculatorTest extends BaseTest {

    @Test
    public void testCalculator() {
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String inputNameXpath = "//input[@name = 'name']";
        WebElement inputName = driver.findElement(By.xpath(inputNameXpath));
        inputName.sendKeys("Elena");

        String inputHeightXpath = "//input[@name = 'height']";
        WebElement inputHeight = driver.findElement(By.xpath(inputHeightXpath));
        inputHeight.sendKeys("167");

        String inputWeightXpath = "//input[@name = 'weight']";
        WebElement inputWeight = driver.findElement(By.xpath(inputWeightXpath));
        inputWeight.sendKeys("63");

        String inputCheckboxXpath = "//input[@name = 'gender'][2]";
        WebElement inputCheckbox = driver.findElement(By.xpath(inputCheckboxXpath));
        inputCheckbox.click();

        String inputSubmitXpath = "//input[@type='submit']";
        WebElement inputSubmit = driver.findElement(By.xpath(inputSubmitXpath));
        inputSubmit.click();

        String inputTextXpath = "//td[2]";
        WebElement inputText = driver.findElement(By.xpath(inputTextXpath));
        inputText.getText();
        String textExpected = "Идеальная масса тела";
        Assertions.assertEquals(textExpected, inputText.getText());
    }
}
