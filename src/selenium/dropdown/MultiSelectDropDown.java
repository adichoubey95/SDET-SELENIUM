package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement multiDropdown=driver.findElement(By.id("multiple-select-example"));
        Select select=new Select(multiDropdown);
        //select by index
        select.selectByIndex(2);
        //select by value
        select.selectByValue("orange");
        //selec by visible Text
        //select.selectByVisibleText("Peach");
        List<WebElement> allElement =select.getAllSelectedOptions();// to fetch the selected value
        for(WebElement element:allElement){
            System.out.println(element.getText());
        }
        driver.close();
    }
}
