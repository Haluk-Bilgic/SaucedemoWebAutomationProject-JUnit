package TestPackage;

import Pages.LoginPage;
import Pages.ProductsPage;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class saucedemoTest extends BaseTest {

    LoginPage loginPage;
    ProductsPage productsPage;

    @Test
    @DisplayName("LoginPage")
    public void test1() {

        loginPage = new LoginPage(driver);
        loginPage.typeUsername("standard_user");
        loginPage.typePassword("secret_sauce");
        loginPage.clickLoginButton();

    }

    @Test
    @DisplayName("LoginPage")
    public void test2() {

        productsPage = new ProductsPage(driver);
        productsPage.addToCart();

    }

}
