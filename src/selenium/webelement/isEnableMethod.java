package selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnableMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement isEnable=driver.findElement(By.id("enabled-button"));
        WebElement disable=driver.findElement(By.id("disabled-button"));
        WebElement textBox =driver.findElement(By.id("enabled-example-input"));
        System.out.println(textBox.isEnabled());
        disable.click();
        System.out.println(textBox.isEnabled());
        isEnable.click();
        System.out.println(textBox.isEnabled());
        driver.close();

    }


}
