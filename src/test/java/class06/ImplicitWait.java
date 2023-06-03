package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www.facebook.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement createNewAccountBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccountBtn.click();

        WebElement fillname = driver.findElement(By.xpath("//input[@aria-label=\"First name\"]"));
        sendText("Ali Rıza", fillname);

        WebElement months = driver.findElement(By.xpath("//select[@id=\"month\"]"));
        dropdown("Mar", months);

        WebElement years = driver.findElement(By.xpath("//select[@id=\"year\"]"));
        dropdown("1978", years);

        WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
        dropdown("10", days);
    }

}
