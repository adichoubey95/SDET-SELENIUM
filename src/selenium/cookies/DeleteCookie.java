package selenium.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DeleteCookie {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();// upcasting
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();

         System.out.println("after adding the cookies");
        Cookie cook=new Cookie("company","edso services");
        driver.manage().addCookie(cook);

        Set<Cookie> allCook=driver.manage().getCookies();
        for (Cookie c:allCook) {
            System.out.println(c);
    }
      /*  System.out.println("-----------------------------------------------------------------");
        System.out.println("delete cookies");
        driver.manage().deleteCookie(cook);
        Set<Cookie> allCook1=driver.manage().getCookies();
        for (Cookie c:allCook1) {
            System.out.println(c);}*/

        System.out.println("-----------------------------------------------------------");
        //delete cookies by name
        /*driver.manage().deleteCookieNamed("company");
        Set<Cookie> allCook2=driver.manage().getCookies();
        for (Cookie c:allCook2) {
            System.out.println(c);}*/
        System.out.println("----------------------------------------------------------------");
        System.out.println("delete all cookies");
        driver.manage().deleteAllCookies();
        Set<Cookie> allCook3=driver.manage().getCookies();
        for (Cookie c:allCook3) {
            System.out.println(c);}
        driver.close();

}}
