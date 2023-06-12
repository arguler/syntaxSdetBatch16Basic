package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class CommonMethods {

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(String url, String browser) {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();

        driver.get(url);
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();

        }
    }

    public static void sendText(String text, WebElement element) {
        element.clear();
        element.sendKeys(text);
    }
// Method for filling the dropdown list ***(HOMEWORK)***
    public static void dropdown(String fill, WebElement element) {

        Select sel = new Select(element);
        sel.selectByVisibleText(fill);

    }

    //HW:
//create a method in Common methods for screenshot
//it should take file name as a parameter.
    public static void screenshot(String fileName) throws IOException {
        TakesScreenshot ts=(TakesScreenshot) driver;
        File screenshot=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\lenovoarg\\IdeaProjects\\syntaxSdetBatch16Basic\\screenshot\\"+fileName));
    }

}

