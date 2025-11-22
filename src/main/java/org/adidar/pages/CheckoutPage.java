package org.adidar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckoutPage extends BasePage {

    private By placeOrderBtn = By.cssSelector(".btn.btn-default.check_out");

    // Correct payment locators
    private By nameOnCard = By.cssSelector("input[data-qa='name-on-card']");
    private By cardNumber = By.cssSelector("input[data-qa='card-number']");
    private By cvc = By.cssSelector("input[data-qa='cvc']");
    private By expiryMonth = By.cssSelector("input[data-qa='expiry-month']");
    private By expiryYear = By.cssSelector("input[data-qa='expiry-year']");
    private By payBtn = By.cssSelector("button[data-qa='pay-button']");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void placeOrder() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            By loginModalBtn = By.cssSelector("#checkoutModal a");
            wait.until(ExpectedConditions.elementToBeClickable(loginModalBtn)).click();
            return;
        } catch (Exception ignored) {}

        wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn)).click();
    }

    public void fillPaymentDetails() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(nameOnCard)).sendKeys("JOJO QA");
        driver.findElement(cardNumber).sendKeys("4242424242424242");
        driver.findElement(cvc).sendKeys("123");
        driver.findElement(expiryMonth).sendKeys("12");
        driver.findElement(expiryYear).sendKeys("2030");

        driver.findElement(payBtn).click();
    }
}
