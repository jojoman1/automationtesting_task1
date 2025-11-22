package org.adidar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {

    private WebDriverWait wait;

    // 1) First product "View Product" link in the results
    private By firstProductViewLink = By.xpath("(//a[contains(text(),'View Product')])[1]");

    // 2) "Add to cart" button on the PRODUCT DETAILS page
    private By addToCartBtn = By.cssSelector("button.btn.btn-default.cart");

    // 3) Success message in modal
    private By successMessage = By.cssSelector("#cartModal .modal-body p");

    // 4) "Continue Shopping" button on modal
    private By continueBtn = By.cssSelector(".btn.btn-success.close-modal");

    public ProductPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Open first product details page from search results
    public void openFirstProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(firstProductViewLink)).click();
    }

    // Click "Add to cart" on product details page
    public void addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
    }

    public String getSuccessMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).getText();
    }

    public void closePopup() {
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
    }
}
