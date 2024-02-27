package webdriver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTest extends BaseTest{

    @Test
    public void testOnlinerOpened(){
        driver.get("https://www.onliner.by/");
        String title = "Onlíner";
        Assertions.assertEquals(title, driver.getTitle());
    }
}
