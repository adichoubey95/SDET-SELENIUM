package selenium.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IframeIdentification {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        List<WebElement> allframe=driver.findElements(By.tagName("iframe")) ;
        System.out.println(allframe.size());

        //iframe by index
        //driver.switchTo().frame(4) ;

        //iframe by name or id
         //driver.switchTo().frame("frame1");

         // iframe by webelement
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']"))) ;



        WebElement element= driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        System.out.println(element.getText());


        driver.switchTo().parentFrame();     // switching from child to parent frame then only we will get the text of parent frame.

    WebElement frames= driver.findElement(By.xpath("//h1[text()='Frames']"));
        System.out.println(frames.getText());
}
}
