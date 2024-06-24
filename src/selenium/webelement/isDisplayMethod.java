package selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement showElement=driver.findElement(By.id("show-textbox"));
        WebElement hideElement=driver.findElement(By.id("hide-textbox"));
        WebElement textBox =driver.findElement(By.id("displayed-text"));
        System.out.println(textBox.isDisplayed());
        hideElement.click();
        System.out.println(textBox.isDisplayed());
        showElement.click();
        System.out.println(textBox.isDisplayed());
        driver.close();
    }
}
