package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorTest extends BaseTest {
    @Test
    public void calculatorTest(){
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        WebElement btnXPath = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        btnXPath.click();
        WebElement textElement = driver.findElement(By.xpath("//b"));
        String text = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";
        Assertions.assertEquals(text, textElement.getText());
    }
}
