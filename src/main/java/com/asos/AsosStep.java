package com.asos;

public class AsosStep {
    private AsosPage asosPage;


    public AsosStep(AsosPage asosPage) {
        this.asosPage = asosPage;
    }

    public void clickDeliveryToAndCloseBtn() throws InterruptedException {
        Thread.sleep(5000);
        asosPage.clickDeliveryTo();
        Thread.sleep(5000);
        asosPage.clickCloseBtn();
    }
    public void clickWomenSectionAndCarousel() throws InterruptedException{
        asosPage.clickWomenSection();
        asosPage.clickCarousel();
        Thread.sleep(5000);
        asosPage.clickCookies();

    }

    public void openPageAndProductItem() throws InterruptedException {
        asosPage.openPage();
        clickWomenSectionAndCarousel();
        clickDeliveryToAndCloseBtn();
        Thread.sleep(3000);
        asosPage.clickProductItem();
    }
}
