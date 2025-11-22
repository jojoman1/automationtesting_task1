package org.adidar.tests;

import org.adidar.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceOrderTest extends BaseTest {

    @Test
    public void testOrderFlow() {

        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);
        CheckoutPage checkout = new CheckoutPage(driver);
        LoginPage login = new LoginPage(driver);

        // Step 1: Open and Search
        home.open();
        home.search("Men Tshirt");

        // Step 2: Product details
        product.openFirstProduct();
        product.addToCart();

        String msg = product.getSuccessMessage();
        Assert.assertTrue(msg.contains("added"), "Product not added");
        product.closePopup();

        // Step 3: Go to Cart
        cart.openCart();
        cart.proceedCheckout();

        // Step 4: Open Login from checkout popup
        login.openLoginFromCheckout();

        // Step 5: Login using existing account
        login.login("batfish60624@aminating.com", "Jojoman@99");

        // Step 6: After login → checkout again
        cart.openCart();
        cart.proceedCheckout();

        // Step 7: Payment
        checkout.placeOrder();
        checkout.fillPaymentDetails();

        // Step 8: Assert success
        Assert.assertTrue(
                driver.getPageSource().contains("Your order has been placed successfully!") ||
                        driver.getPageSource().contains("Congratulations! Your order has been confirmed!"),
                "Order success message not found"
        );
    }
}
