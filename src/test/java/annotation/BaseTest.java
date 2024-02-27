package annotation;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected String commonField;

    @BeforeAll
    public static void beforeAllMethod() {
        System.out.println("@BeforeAll ");
    }

    @BeforeEach
    public void beforeEachMethod() {
        System.out.println("@BeforeEach " + commonField);
    }

    @AfterAll
    public static void afterAllMethod() {
        System.out.println("@AfterAll ");
    }

    @AfterEach
    public void afterEachMethod() {
        System.out.println("@AfterEach " +  commonField);
    }
}
