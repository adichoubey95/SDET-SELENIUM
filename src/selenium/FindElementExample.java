package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       WebElement webElement= driver.findElement(By.id("email"));
       webElement.sendKeys("adityachoubey74@gmail.com");
       Thread.sleep(1000);
       driver.close();

    }
}
