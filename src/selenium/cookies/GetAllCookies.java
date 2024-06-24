package selenium.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetAllCookies {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();

       System.out.println("before adding the cookie");
        Set<Cookie> allCookies=driver.manage().getCookies();
        for (Cookie c:allCookies){
            System.out.println(c);
        }

        System.out.println("after adding the cookies");
        Cookie cook=new Cookie("company","edso services");
        driver.manage().addCookie(cook);

        Set<Cookie> allCook=driver.manage().getCookies();
        for (Cookie c:allCook) {
            System.out.println(c);
        }
       System.out.println("get the cookie from name");
        System.out.println(driver.manage().getCookieNamed("company"));
        driver.close();
}}
