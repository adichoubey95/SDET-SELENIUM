package selenium.javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDownByPixel {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;// downcasting for JavaScriptExecutor
        javascriptExecutor.executeScript("window.scrollBy(0,1000)");
        javascriptExecutor.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(3000);

        driver.close();


    }
}
