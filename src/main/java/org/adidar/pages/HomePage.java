package org.adidar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class HomePage extends BasePage {

    private By productsLink = By.cssSelector("a[href='/products']");
    private By searchBox = By.id("search_product");
    private By searchButton = By.id("submit_search");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://automationexercise.com/");
    }

    private void goToProductsPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(productsLink)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
    }

    public void search(String productName) {

        goToProductsPage();

        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }
}
