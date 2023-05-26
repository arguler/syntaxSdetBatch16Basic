package Selenium_HomeWorks;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
hw2:
goto facebook.com
 click on create account
and select the your  date of birth using select class
 */
public class hw_07 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.facebook.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

        Thread.sleep(2000);

        WebElement days = driver.findElement(By.xpath("//select[@id='day']"));

        Select sel = new Select(days);
        sel.selectByVisibleText("10");

        WebElement months = driver.findElement(By.xpath("//select[@id=\"month\"]"));

        Select sel1 = new Select(months);
        sel1.selectByVisibleText("Mar");

        WebElement years = driver.findElement(By.xpath("//select[@id=\"year\"]"));

        Select sel2 = new Select(years);
        sel2.selectByVisibleText("1978");

        Thread.sleep(2000);

        driver.close();
    }
}