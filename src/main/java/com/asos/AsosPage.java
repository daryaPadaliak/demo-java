package com.asos;

import org.openqa.selenium.WebDriver;

public class AsosPage {
    WebDriver driver;

    public AsosPage() {
        this.driver = Singleton.getDriver();
    }


    public void openPage() {
        driver.get(AsosPageLocator.url);
    }

    public void clickWomenSection() {
        driver.findElement(AsosPageLocator.women).click();
    }

    public void clickCarousel() {
        driver.findElement(AsosPageLocator.carouselSectionItem).click();
    }

    public void clickDeliveryTo() {
        driver.findElement(AsosPageLocator.deliveryToBtn).click();
    }

    public void clickCloseBtn() {
        driver.findElement(AsosPageLocator.closeBtn).click();
    }

    public String getItemText() {
        return driver.findElement(AsosPageLocator.itemHeader).getText();
    }


    public void clickProductItem() {
        driver.findElement(AsosPageLocator.productItem).click();
    }

    public void clickCookies(){
        driver.findElement(AsosPageLocator.cookies).click();
    }

    public void clickDeliveryToAndCloseBtn() throws InterruptedException {
        Thread.sleep(5000);
        clickDeliveryTo();
        Thread.sleep(5000);
        clickCloseBtn();
    }
    public void clickWomenSectionAndCarousel(){
        clickWomenSection();
        clickCarousel();
    }
    public void openPageAndProductItem() throws InterruptedException {
        openPage();
        clickWomenSectionAndCarousel();
        clickDeliveryToAndCloseBtn();
        clickProductItem();
    }
}
