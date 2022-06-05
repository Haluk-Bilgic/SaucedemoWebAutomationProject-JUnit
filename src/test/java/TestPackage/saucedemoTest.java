package TestPackage;

import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.ProductsPage;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class saucedemoTest extends BaseTest {

    LoginPage loginPage;
    ProductsPage productsPage;
    CheckoutPage checkoutPage;

    @Test
    @DisplayName("LoginPage")
    public void test1() {

        loginPage = new LoginPage(driver);
        loginPage.typeUsername("standard_user");
        loginPage.typePassword("secret_sauce");
        loginPage.clickLoginButton();
    }

    @Test
    @DisplayName("ProductsPage")
    public void test2() {

        productsPage = new ProductsPage(driver);
        productsPage.addToCart();
        productsPage.goToCart();
        productsPage.clickCheckoutButton();
    }

    @Test
    @DisplayName("CheckoutPage")
    public void test3() {

        checkoutPage = new CheckoutPage(driver);
        checkoutPage.typeYourInformation();
        checkoutPage.clickContinueButton();
        checkoutPage.checkItemTotal();

    }
}
