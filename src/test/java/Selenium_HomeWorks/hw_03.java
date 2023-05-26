package Selenium_HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
[5:19 AM]
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking
on Create new account
what is the reason, will discuss in next lecture
*/
public class hw_03 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement createAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();
        Thread.sleep(2000);

        WebElement fillname=driver.findElement(By.xpath("//input[@aria-label=\"First name\"]"));
        fillname.sendKeys("Ali Rıza");

        WebElement fillsurname=driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]"));
        fillsurname.sendKeys("Güler");

        WebElement fillemail=driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]"));
        fillemail.sendKeys("arguler@hotmail.com");

        WebElement fillemail1=driver.findElement(By.xpath("//input[@aria-label=\"Re-enter email address\"]"));
        fillemail1.sendKeys("arguler@hotmail.com");

        WebElement fillpassword=driver.findElement(By.xpath("//input[@aria-label=\"New password\"]"));
        fillpassword.sendKeys("Fmg1900*");

        WebElement fillbirthday=driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
        fillbirthday.sendKeys("19");

        WebElement fillmonth=driver.findElement(By.xpath("//select[@aria-label=\"Month\"]"));
        fillmonth.sendKeys("May");

        WebElement fillyear=driver.findElement(By.xpath("//select[@aria-label=\"Year\"]"));
        fillyear.sendKeys("1919");

        WebElement fillsexbox=driver.findElement(By.xpath("//label[text()='Male']"));
        fillsexbox.click();

        Thread.sleep(1000);

        WebElement closepopup=driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
        closepopup.click();

        Thread.sleep(2000);

        driver.close();

    }
}