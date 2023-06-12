package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://amazon.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement signIn=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        //    find the WebElement that you want to hover ur cursor to
//        Action class
        Actions action=new Actions(driver);
//        perform the desried action
        action.moveToElement(signIn);

    }

}
