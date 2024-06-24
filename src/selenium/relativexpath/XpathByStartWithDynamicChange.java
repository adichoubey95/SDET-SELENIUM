package selenium.relativexpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByStartWithDynamicChange {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.letskodeit.com/login");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//a[starts-with(text(),'Forgot')]"));
        element.click();
        Thread.sleep(1000);
        driver.close();
}}
