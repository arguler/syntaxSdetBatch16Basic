package Selenium_HomeWorks;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
HW1:
goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
select , tuesday, thursday and friday one by one
Syntax - Website to practice Syntax Automation Platform
Syntax Automation Platform has great examples like Ajax, JQuery,
Bootstrap etc which are used in most of the web applications around the world.
 */
public class hw_06 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement days=driver.findElement(By.xpath("//select[@id=\"select-demo\"]"));
        Select sel=new Select(days);
        sel.selectByVisibleText("Tuesday");
        Thread.sleep(2000);
        sel.selectByVisibleText("Thursday");
        Thread.sleep(2000);
        sel.selectByVisibleText("Friday");
        Thread.sleep(3000);
        driver.close();
    }
}