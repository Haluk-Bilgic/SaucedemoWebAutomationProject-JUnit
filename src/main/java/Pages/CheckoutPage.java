package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@name='firstName']")
    @CacheLookup
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    @CacheLookup
    private WebElement lastName;

    @FindBy(xpath = "//input[@name='postalCode']")
    @CacheLookup
    private WebElement postalCode;

    @FindBy(css = "#continue")
    @CacheLookup
    private WebElement continueButton;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement itemTotal;


    public void typeYourInformation() {
        sendKeysFunction(firstName,"Haluk");
        waitFor(1);
        sendKeysFunction(lastName,"Bilgic");
        waitFor(1);
        sendKeysFunction(postalCode,"06");
    }
    public void clickContinueButton(){
        clickFunction(continueButton);
    }
    public void checkItemTotal(){
        assertion(itemTotal,"Item total: $37.98");
        BrowserUtils.getScreenshot("ProductsPrices",driver);
    }

}
