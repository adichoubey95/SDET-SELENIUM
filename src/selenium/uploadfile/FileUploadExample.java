package selenium.uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        WebElement fileUploadelement= driver.findElement(By.id("file-upload"));
        fileUploadelement.sendKeys("C:\\Users\\admin\\Desktop\\primeno.PNG");
        Thread.sleep(3000);

        WebElement uploadBtn=driver.findElement(By.id("file-submit"));
        uploadBtn.click();

        WebElement fileUploadMsg=driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));

        if(fileUploadMsg.getText().equalsIgnoreCase("File Uploaded!")){
            System.out.println("fileload msg came");}
        else{
            System.out.println("fileload msg will not come");
        }
        Thread.sleep(3000);
        driver.close();
    }
}// doubt
