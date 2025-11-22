package org.adidar.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // REMOVE this (not needed anymore)
    // By cartButton = By.cssSelector("a[href='/view_cart']");

    public void openCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By cartLink = By.cssSelector("a[href='/view_cart']");

        wait.until(ExpectedConditions.elementToBeClickable(cartLink)).click();
    }

    public void proceedCheckout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By checkoutBtn = By.cssSelector(".btn.btn-default.check_out");
        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn)).click();
    }
}
