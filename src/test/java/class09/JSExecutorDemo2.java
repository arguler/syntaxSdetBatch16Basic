package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutorDemo2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://amazon.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 1200)");

        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0, -500)");



    }

}
