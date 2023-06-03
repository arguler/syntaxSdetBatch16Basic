package Selenium_HomeWorks;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

/*
HW1:
goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
click on start
print the text  "welcome syntax technologies "on console (edited)

 */
public class hw_10 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement Btnclick = driver.findElement(By.xpath("//button[@id=\"startButton\"]"));
        Btnclick.click();

        WebDriverWait waitfor = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement display = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        waitfor.until(ExpectedConditions.visibilityOf(display));

        WebElement Readthis = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String isit=Readthis.getText();
        System.out.println(isit);
    }
}
