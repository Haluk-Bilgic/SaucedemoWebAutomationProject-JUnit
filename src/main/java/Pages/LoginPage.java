package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    @CacheLookup
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    @CacheLookup
    private WebElement password;

    @FindBy(css = ".submit-button.btn_action")
    @CacheLookup
    private WebElement loginButton;


    public void typeUsername(String message) {
        sendKeysFunction(username, message);
    }

    public void typePassword(String message) {
        sendKeysFunction(password, message);
    }

    public void clickLoginButton() {
        clickFunction(loginButton);
    }

}
