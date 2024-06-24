package selenium.screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

import java.io.IOException;

public class TakeAScreenshot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file,new File("C:\\Users\\admin\\Desktop\\primeno.PNG"));

        driver.close();


    }
}
