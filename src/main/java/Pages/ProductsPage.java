package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    private WebElement backpack;

    @FindBy(css = "#add-to-cart-sauce-labs-onesie")
    private WebElement onesie;

    @FindBy(css = ".shopping_cart_link")
    private WebElement cart;

    @FindBy(css = "#checkout")
    private WebElement checkout;

    public void addToCart() {
        clickFunction(backpack);
        waitFor(1);
        clickFunction(onesie);
    }
    public void goToCart(){
        clickFunction(cart);
    }
    public void clickCheckoutButton(){
        clickFunction(checkout);
    }
}
