package selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementStudy {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        // sendKeys method
       /* WebElement element=driver.findElement(By.id("name"));
        element.sendKeys("Aditya Choubey");*/

        //clear methood
       /* WebElement element=driver.findElement(By.id("name"));
        element.sendKeys("Aditya Choubey");
        Thread.sleep(1000);
        element.clear();*/

        //submit method
      /*  WebElement element=driver.findElement(By.id("name"));
        element.sendKeys("Aditya Choubey");
        element.submit();*/

        // getText method
       /* WebElement element=driver.findElement(By.xpath("//td[text()='Selenium WebDriver With Java']"));
        System.out.println(element.getText());*/

        // get tagname
      /*  WebElement element=driver.findElement(By.xpath("//td[text()='Selenium WebDriver With Java']"));
        System.out.println(element.getTagName());*/

        //get Attribute
        WebElement element=driver.findElement(By.id("name"));
        System.out.println(element.getAttribute("id"));
    }
}
