package Selenium_HomeWorks;
/*
@here use css and xpath to dot his
HW1:
Open chrome browser
Go to “http://practice.syntaxtechs.net/input-form-demo.php”
fill in the complete form
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw_04 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("Ali Rıza");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("Güler");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("arguler@hotmail.com");

        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("505 225 45 67");

        WebElement address = driver.findElement(By.cssSelector("input[name='address']"));
        address.sendKeys("5131. Sok.");

        WebElement city = driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("Balıkesir");

        WebElement state = driver.findElement(By.cssSelector("select[name='state']"));
        state.sendKeys("Türkiye");

        WebElement zip = driver.findElement(By.cssSelector("input[name='zip']"));
        zip.sendKeys("10050");

        WebElement website = driver.findElement(By.cssSelector("input[name='website']"));
        website.sendKeys("www.arzaguler.com");

        WebElement hosting = driver.findElement(By.xpath("//input[@value=\"yes\"]"));
        hosting.click();

        WebElement comment = driver.findElement(By.cssSelector("textarea[name='comment']"));
        comment.sendKeys("Xpath and CSS selectors");

        Thread.sleep(2000);

        WebElement submit = driver.findElement(By.xpath("//button[contains(text(),'Send' )]"));
        submit.click();

        Thread.sleep(5000);
        driver.close();
    }
}
