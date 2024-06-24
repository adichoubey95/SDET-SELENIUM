package selenium.relativexpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingAndOr {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        //By using And
        /*WebElement element=driver.findElement(By.xpath("//input[@id='name' and @name='enter-name']"));
        element.sendKeys("aditya");*/
        //By using OR
        WebElement element1=driver.findElement(By.xpath("//input[@id='nae' or @name='enter-name']"));
        element1.sendKeys("aditya");
        Thread.sleep(1000);
        driver.close();
}}

