package myPacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElementVsElements extends LaunchBrowser{

    public static void findElemenElements(){


//       //1.
//        WebElement searchElement= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
//        searchElement.sendKeys("XYZ");
//
//        //2.
//        WebElement multipleElement= driver.findElement(By.xpath("//div[@class='footer']//a"));
//        System.out.println(multipleElement.getText());
//
//        //3.
//        WebElement logElement1= driver.findElement(By.xpath("//input[@id='small-logo']"));
//        searchElement.sendKeys("XYZ");

        //1.
        List<WebElement> logo= driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println(logo.size());

        //2.
        List<WebElement> multipleElement1= driver.findElements(By.xpath("//div[@class='footer']//a"));

        for (WebElement element : multipleElement1){
            System.out.println(element.getText());
        }

        //3.
        List<WebElement> logElement1= driver.findElements(By.xpath("//input[@id='small-logo']"));

        System.out.println(logElement1.size());

    }
}
