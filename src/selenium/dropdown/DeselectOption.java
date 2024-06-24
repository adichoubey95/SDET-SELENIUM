package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectOption {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement multiDropdown=driver.findElement(By.id("multiple-select-example"));
        Select select=new Select(multiDropdown);
        //select by index
        select.selectByIndex(0);
        //select by value
        select.selectByValue("orange");
        //selec by visible Text
        select.selectByVisibleText("Peach");

        System.out.println(select.isMultiple()); // to check the multiselect is there or not

       /* select.deselectByIndex(0);
        select.deselectByValue("orange");
        select.deselectByVisibleText("Peach");*/
        select.deselectAll();

}}
