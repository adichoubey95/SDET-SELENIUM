package selenium.windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandleWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.findElement(By.id("openwindow")).click();

        String parentWindowId=driver.getWindowHandle();
        System.out.println(parentWindowId);

        Set<String> allWindowId=driver.getWindowHandles();//interview question why set string return type w use
        System.out.println(allWindowId);// ans- because set does not allowed the duplicate id so for every window we will have unique id.

        for(String s:allWindowId) {// for each loop will use to go from parent window to  child window
            if (!s.contentEquals(parentWindowId)) { // parent id should not equals to child id
                driver.switchTo().window(s);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
            //driver.switchTo().newWindow(WindowType.TAB); for switch to diffrent tab.
            Thread.sleep(3000);
           // System.out.println("parent window title" +  driver.getTitle());
            driver.switchTo().window(parentWindowId);// parent window tittle
            System.out.println("parent window title " +  driver.getTitle());
            driver.close();

        }

    }


