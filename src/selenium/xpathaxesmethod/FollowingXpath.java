package selenium.xpathaxesmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class FollowingXpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        List<WebElement > element=driver.findElements(By.xpath("//input[@id='name']//following::input"));
        System.out.println(element.size());
        for(WebElement e:element)
            System.out.println(element);
        Thread.sleep(1000);
        driver.close();
}}
