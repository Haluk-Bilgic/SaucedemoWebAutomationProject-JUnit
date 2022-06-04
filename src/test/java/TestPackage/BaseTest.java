package TestPackage;

import Helper.BrowserSetup;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = BrowserSetup.startBrowser("chrome", "https://www.saucedemo.com/");
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}
