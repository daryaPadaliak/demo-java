package kufar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KufarPage {

    private WebDriver driver;

    public void setEmail(String email) {
        driver.findElement(By.xpath(emailFieldXPath)).sendKeys(email);
    }
    public String cookieBtnXpath = "//button[@class='styles_button__oKUgO styles_secondary__MiBIC styles_size-m__NgAcw styles_submit_button__T_qS1']";
    public String subscribeBtnCancelXPath = "//button[@id='cancel']";
    public String policyWindowBtnXpath = "//button[@class='styles_button__oKUgO styles_outline_default__doSRy styles_size-m__NgAcw styles_block___PraQ styles_close__pyx8_']";
    public String loginBtnXPath = "//button[text()='Войти']";
    public String emailFieldXPath = "//input[@id='login']";
    public String passwordFieldXPath = "//input[@id='password']";
    public String loginBtnFormLoginXPath = "//div[@data-name='login_submit']/button";
    public String actualLoginMessageXpath = "//div[@data-name='authorization_error_text']";
    public String actualPasswordMessageXpath = "//div[text()='Введите пароль']";
    public String expectedLoginMessage = "Заполните обязательное поле";
    public String expectedPasswordMessage = "Введите пароль";
    String actualLoginErrorMessageXpath = "//form[@data-name='form_login']/div/div";
    String expectedLoginErrorMessage = "Введен неверный пароль либо такого профиля не существует\n" +
            "Попробуйте войти по номеру телефона";
}
