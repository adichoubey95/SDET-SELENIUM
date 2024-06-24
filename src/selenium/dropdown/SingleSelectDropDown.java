package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement dropdown=driver.findElement(By.id("carselect"));
        Select select=new Select(dropdown);
        //select by index
        select.selectByIndex(2);
        //select by value
        select.selectByValue("benz");
        //selec by visible Text
        select.selectByVisibleText("Honda");

        driver.close();
    }


}
