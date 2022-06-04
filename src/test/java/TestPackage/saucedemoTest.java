package TestPackage;

import Pages.LoginPage;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class saucedemoTest extends BaseTest {


    LoginPage loginPage;

    @Test
    @DisplayName("LoginPage")
    public void test1() {

        loginPage = new LoginPage(driver);
        loginPage.typeUsername("standard_user");
        loginPage.typePassword("secret_sauce");
        loginPage.clickLoginButton();

    }

}
