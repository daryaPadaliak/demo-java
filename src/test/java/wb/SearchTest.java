package wb;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest extends BaseTest {

    @Test
    public void testSearchWb(){
        driver.get("https://www.wildberries.ru");

        String searchXPath = "//input[@id='searchInput']";
        WebElement search = driver.findElement(By.xpath(searchXPath));
        search.click();
        search.sendKeys("гирлянда", Keys.ENTER);
    }
}
