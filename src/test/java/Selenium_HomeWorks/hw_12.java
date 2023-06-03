package Selenium_HomeWorks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hw_12 {
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
    // Method for filling the dropdown list ******(HOMEWORK)*********
    public static void dropdown(String fill, WebElement element) {

        Select sel = new Select(element);
        sel.selectByVisibleText(fill);

    }

}