package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicsOfSelenium {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setBinary("C:\\Users\\admin\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(chromeOptions);// upcasting
       // ChromeDriver driver=new ChromeDriver(); this can also use but for firebox browsr it will not work
        driver.get("http://www.amazon.in");
        driver.manage().window().maximize();
        driver.manage().window().minimize();
       String title= driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.close();
        Thread.sleep(1000);
    }
}
