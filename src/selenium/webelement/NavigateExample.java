package selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();// upcasting
            driver.navigate().to("https://www.facebook.com/");
            driver.manage().window().maximize();
            WebElement element=driver.findElement(By.name("login"));
            element.click();
            driver.navigate().back();
            driver.navigate().forward();
            driver.navigate().refresh();
            driver.close();
    }
}
