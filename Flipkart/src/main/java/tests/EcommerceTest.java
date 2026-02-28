package tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.HomePage;
import pages.CartPage;

public class EcommerceTest extends BaseClass {

    @Test
    public void completeEcommerceFlow() {

        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);
        CartPage cart = new CartPage(driver);

        login.login("testuser", "test123");
        slow(2);   // wait 2 seconds

        home.selectProduct();
        slow(2);

        home.addProductToCart();
        slow(2);

        cart.openCart();
        slow(3);

        System.out.println("Ecommerce flow completed successfully");
    }
}