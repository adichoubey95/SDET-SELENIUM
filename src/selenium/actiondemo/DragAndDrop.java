package selenium.actiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        driver.manage().window().maximize();
        WebElement srcElement=driver.findElement(By.id("draggable"));
        WebElement desElement=driver.findElement(By.id("droppable"));
        Actions actions =new Actions(driver);
        actions.dragAndDrop(srcElement,desElement)
                .pause(Duration.ofSeconds(3))
                .perform();
        driver.close();
    }
}
