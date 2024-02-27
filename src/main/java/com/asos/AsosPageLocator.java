package com.asos;

import org.openqa.selenium.By;

public class AsosPageLocator {
    public static String url = "https://www.asos.com";
    public static By women = By.xpath("//a[@data-testid='women-floor']");
    public static By carouselSectionItem = By.xpath("//li[@class='carousel__item']");
    public static By productItem = By.xpath("//article[contains (@id, 'product')]");
    public static By itemHeader = By.xpath("//div[@class='layout-aside']//h1");
    public static By productDescription = By.xpath("//p[@class='bag-item-name']");
    public static By deliveryToBtn = By.xpath("//div[@id='chrome-welcome-mat']//button");
    public static By closeBtn = By.xpath("//button[@data-testid='close-button']");
    public static By cookies = By.xpath("//button[@id='onetrust-accept-btn-handler']");

}
