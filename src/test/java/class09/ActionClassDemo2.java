package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.switchTo().frame(0);
        WebElement dragable = driver.findElement(By.id("draggable"));
        WebElement dropable = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(dragable, dropable).perform();


    }

}
