package selenium.actiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickAndHold {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//li[text()='A']"));
        Actions actions =new Actions(driver) ;
        actions.clickAndHold(element)
                .pause(Duration.ofSeconds(5))
                .release()
                .pause(Duration.ofSeconds(5))
                .build()
                .perform();
        driver.close();




    }
}
