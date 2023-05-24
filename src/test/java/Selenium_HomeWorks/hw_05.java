package Selenium_HomeWorks;
/*
HW2:
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw_05 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Admin");

        WebElement login = driver.findElement(By.cssSelector("input#btnLogin"));
        login.click();

        WebElement returnedmassage = driver.findElement(By.cssSelector("span#spanMessage"));

        String massage = returnedmassage.getText();
        String truemassage = "Password cannot be empty";
        if (massage.equals(truemassage)) {
            System.out.println("Error massage is match : " + massage);
        } else {
            System.out.println("Error message does not match ("+ massage+") must be this");
        }
        Thread.sleep(3000);
        driver.close();

    }
}