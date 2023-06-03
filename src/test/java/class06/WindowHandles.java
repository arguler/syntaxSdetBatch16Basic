package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class WindowHandles extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://accounts.google.com/signup";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement helpBtn = driver.findElement(By.linkText("Yardım"));
        helpBtn.click();

        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()=\"Gizlilik\"]"));
        privacyBtn.click();

        String mainPageHandle = driver.getWindowHandle();
        System.out.println("main page handle is :" + mainPageHandle);
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if(title.equalsIgnoreCase("Google Hesabı Yardım")){
                break;
            }
//            System.out.println("the title associated with " + handle + " is :" + title);

        }
        System.out.println("the current page under focus is : "+driver.getTitle());

        driver.switchTo().window(mainPageHandle);

        System.out.println("the focus is on :"+driver.getTitle());

    }
}