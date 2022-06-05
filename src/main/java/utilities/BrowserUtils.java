package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;

public class BrowserUtils {


    public static String getScreenshot(String name,WebDriver driver) {

        TakesScreenshot ts= ((TakesScreenshot)driver);
        File source = ts.getScreenshotAs(OutputType.FILE);
        String target = "C:/Users/ahbil/my/SaucedemoWebAutomationProject-JUnit" +
                "/Test-output/Screenshots/" + name + ".png";
        File finalDestination = new File(target);

        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return target;

    }
}
