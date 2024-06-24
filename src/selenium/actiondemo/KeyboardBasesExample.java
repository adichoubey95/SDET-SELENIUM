package selenium.actiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardBasesExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        WebElement textboxElement=driver.findElement(By.name("q"));
        Actions action=new Actions(driver);
                action.moveToElement(textboxElement)
                        .click(textboxElement)
                        .pause(Duration.ofSeconds(5))
                        .keyDown(Keys.SHIFT)
                        .sendKeys("tshirts")
                        .pause(Duration.ofSeconds(5))
                        .keyUp(Keys.SHIFT)
                        .pause(Duration.ofSeconds(5))
                        .sendKeys(Keys.ENTER)
                        .pause(Duration.ofSeconds(5))
                        .build()
                        .perform();
        driver.close();
    }
}
