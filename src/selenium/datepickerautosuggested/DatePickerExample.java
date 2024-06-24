package selenium.datepickerautosuggested;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class DatePickerExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.navigate().to("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       WebElement datePickerElement= driver.findElement(By.xpath("(//div[starts-with(@class,'input-prefix')])[3]"));
       datePickerElement.click();
       List<WebElement> allDate=driver.findElements(By.xpath("//div[@class='container date ']//child::span"));
        for(WebElement e:allDate){

            if(e.getText().contentEquals("29")){
                e.click();
                break;
            }

        }

    }
}
