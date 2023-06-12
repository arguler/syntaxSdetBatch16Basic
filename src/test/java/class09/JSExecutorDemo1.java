package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class JSExecutorDemo1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userNameTxtBox=driver.findElement(By.xpath("//input[@id='txtUsername']"));

        JavascriptExecutor js=(JavascriptExecutor) driver;

//        js.executeScript("arguments[0].style.backgroundColor='green'", userNameTxtBox);
        js.executeScript("arguments[0].style.border='10px solid yellow'",userNameTxtBox);



    }

}
