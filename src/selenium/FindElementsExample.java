package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        List<WebElement> list =driver.findElements(By.tagName("input"));
        System.out.println(list.size());

       for(WebElement e: list){
            System.out.println(e);
        }
        driver.close();

}}
