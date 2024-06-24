package selenium.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement alertBtn=driver.findElement(By.id("alertbtn"));
        WebElement confirmBtn=driver.findElement(By.id("confirmbtn"));
        WebElement textBox=driver.findElement(By.id("name"));

       // alertBtn.click();
        //confirmBtn.click();
        alertBtn.click();
        textBox.sendKeys("hello");
        Thread.sleep(3000);

        Alert alert=driver.switchTo().alert();
        // (downcasting) alert is a interface so we cant make an object , we will use downcasting
       //alert.accept();//if we don't use the accpet method so the alert will come but we didnot handle so the browser will not close.

        //alert.dismiss();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
        driver.close();


    }
}
