package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutorDemo4 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement clickjs=driver.findElement(By.xpath("//input[@id='btnLogin']"));
//        Thread.sleep(3000);
        js.executeScript("arguments[0].click();", clickjs);





    }

}
