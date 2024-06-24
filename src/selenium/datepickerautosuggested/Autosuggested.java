package selenium.datepickerautosuggested;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class Autosuggested {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement textBox=driver.findElement(By.name("q"));
        textBox.sendKeys("car");

        List<WebElement> allOption=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
       for(WebElement e:allOption){
           System.out.println(e.getText());
           if(e.getText().trim().equals("CARS24")){
                e.click();
                break;
           }
        }
        Thread.sleep(3000);
         driver.close();
    }
}
