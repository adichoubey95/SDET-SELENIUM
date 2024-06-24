package selenium.webelement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement radiobtn=driver.findElement(By.id("bmwradio"));
        System.out.println(radiobtn.isSelected());
        radiobtn.click();
        System.out.println(radiobtn.isSelected());
        driver.close();
}}
