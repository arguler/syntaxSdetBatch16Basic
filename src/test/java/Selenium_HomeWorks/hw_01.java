package Selenium_HomeWorks;
/*
HW1:
navigate to
https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser
Note: use name or id as locators
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw_01 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Ali Rıza");

        driver.findElement(By.id("customer.lastName")).sendKeys("Güler");

        driver.findElement(By.id("customer.address.street")).sendKeys("5131. sok.");

        driver.findElement(By.id("customer.address.city")).sendKeys("Balıkesir");

        driver.findElement(By.id("customer.address.state")).sendKeys("Türkiye");

        driver.findElement(By.id("customer.address.zipCode")).sendKeys("10050");

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("00905052251190");

        driver.findElement(By.id("customer.ssn")).sendKeys("12345678910");

        driver.findElement(By.id("customer.username")).sendKeys("arguler");

        driver.findElement(By.id("customer.password")).sendKeys("12345678");

        driver.findElement(By.id("repeatedPassword")).sendKeys("12345678");

        //driver.findElement(By.className ("button")).click();


        String url=driver.getCurrentUrl();
        System.out.println(url);

        String title= driver.getTitle();
        System.out.println(title);

        if(title.equals("ParaBank | Register for Free Online Account Access")) {
            System.out.println("the title is correct");
        }
        else {
            System.out.println("the title is incorrect");
        }
        driver.quit();
    }
}
