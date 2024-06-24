package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       // By id locator
      /*  WebElement webElement = driver.findElement(By.id("email"));
        webElement.sendKeys("adityachoubey74@gmail.com");*/



        /*//By classname locator
        WebElement element= driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
        element.click();/// doubt


      /*  // By name locator
        WebElement Element1= driver.findElement(By.name("pass"));
       Element1.sendKeys("adityachoubey74@gmail.com");

       //by linkTest
        WebElement Element2= driver.findElement(By.linkText("Forgotten password?"));
        Element2.click();

        // by partial linkTest
        WebElement Element3= driver.findElement(By.partialLinkText("Forgotten"));
        Element3.click();
        */

        //By css selector
      /*  WebElement element4=driver.findElement(By.cssSelector("input[id='email']"));
        element4.sendKeys("aditya");*/

      /*  WebElement element5=driver.findElement(By.cssSelector("input#email"));
        element5.sendKeys("aditya");*/ // id is replace by symbol #

      /*  WebElement element6=driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy']"));
        element6.sendKeys("1234");*/  //class by css selector

    /*    WebElement element7=driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy"));
        element7.sendKeys("1234");*/ //doubt

        Thread.sleep(1000);



}
}