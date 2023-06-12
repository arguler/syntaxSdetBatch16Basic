package class09;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends CommonMethods {
    public static void main(String[] args) throws InterruptedException, IOException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//        Thread.sleep(3000);
        js.executeScript("arguments[0].click();", loginBtn);

/*        TakesScreenshot ts=(TakesScreenshot) driver;
        File screenshot=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\lenovoarg\\IdeaProjects\\syntaxSdetBatch16Basic\\screenshot\\testsyntax.png"));

 */
        ScreenShot obj=new ScreenShot();
        obj.screenshot("screenhot4.png");

    }
}
