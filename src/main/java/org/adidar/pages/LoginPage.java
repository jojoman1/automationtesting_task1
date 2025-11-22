package org.adidar.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // SIGNUP LOCATORS
    By signupName = By.cssSelector("input[data-qa='signup-name']");
    By signupEmail = By.cssSelector("input[data-qa='signup-email']");
    By signupButton = By.cssSelector("button[data-qa='signup-button']");

    // LOGIN LOCATORS
    By loginEmail = By.cssSelector("input[data-qa='login-email']");
    By loginPassword = By.cssSelector("input[data-qa='login-password']");
    By loginButton = By.cssSelector("button[data-qa='login-button']");

    // CHECKOUT POPUP → LOGIN BUTTON
    By loginFromCheckout = By.cssSelector("a[href='/login']");

    // METHOD: Click LOGIN inside the checkout popup
    public void openLoginFromCheckout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click the Login button inside checkout modal
        By loginFromPopup = By.cssSelector("#checkoutModal a[href='/login']");

        wait.until(ExpectedConditions.elementToBeClickable(loginFromPopup)).click();
    }


    // SIGNUP METHOD
    public void signup(String name, String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(signupName)).sendKeys(name);
        wait.until(ExpectedConditions.visibilityOfElementLocated(signupEmail)).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(signupButton)).click();
    }

    // LOGIN METHOD
    public void login(String email, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(loginEmail)).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPassword)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
}
