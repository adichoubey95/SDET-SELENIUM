package selenium.actiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MoveToElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement loginElement=driver.findElement(By.xpath("//span[text()='Login']"));
        Actions action= new Actions(driver);
        action.moveToElement(loginElement)
                .pause(Duration.ofSeconds(5))
                .perform();
        driver.close();
    }
}
