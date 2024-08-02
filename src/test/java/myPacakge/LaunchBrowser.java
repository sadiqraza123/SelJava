package myPacakge;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

      //  driver.get("https://demo.nopcommerce.com/");
       // driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
      //  driver.get("https://www.opencart.com/index.php?route=account/register");
        driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       // WebElementStatus.elemenStatus();
        //Navigations.navigations();
       // FindElementVsElements.findElemenElements();
       // GetText_GetAttribute.getTextAttribute();
        selectDropDown.getDropdown();

        driver.quit();
        driver.quit();
    }
    // System.out.println(driver.getPageSource()); -> get elemets of current page
}
