package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutorDemo3 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://amazon.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement clickjs=driver.findElement(By.xpath("//span[@class='hm-icon-label']"));
        Thread.sleep(3000);
        js.executeScript("arguments[0].click();", clickjs);





    }

}
