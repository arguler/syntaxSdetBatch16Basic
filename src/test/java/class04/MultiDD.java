package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiDD extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement DD=driver.findElement(By.xpath("//select[@name='States']"));
        Select sel=new Select(DD);

        boolean isMul=sel.isMultiple();
        System.out.println("the drop down is multi select :"+isMul);

        sel.selectByVisibleText("California");
//        Thread.sleep(2000);
        sel.selectByValue("Ohio");

        sel.selectByIndex(7);

        sel.deselectByVisibleText("Ohio");


    }
}