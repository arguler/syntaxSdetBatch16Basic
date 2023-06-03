package Selenium_HomeWorks;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
click on get new user
print the firstname of user
 */
public class hw_11 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement Clickthis = driver.findElement(By.xpath("//button[text()='Get New User']"));
        Clickthis.click();

        WebDriverWait waitfor = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement display = driver.findElement(By.xpath("//div[@id='First-Name']"));
        waitfor.until(ExpectedConditions.visibilityOf(display));

        WebElement Readthis = driver.findElement(By.xpath("//div[@id='First-Name']"));
        String isit=Readthis.getText();
        System.out.println(isit);

    }
}