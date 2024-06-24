package selenium.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement radioBtn=driver.findElement(By.id("bmwradio"));

        WebDriverWait webDriverWait=new WebDriverWait(driver,Duration.ofSeconds(20));// explicit wait
        webDriverWait.until(ExpectedConditions.elementToBeClickable(radioBtn)).click();
    }
}
