package myPacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementStatus extends LaunchBrowser{

    public static void elemenStatus() {

      WebElement element= driver.findElement(By.xpath("//input[@id='small-searchterms']"));

//        System.out.println(element.isDisplayed());
//        System.out.println(element.isEnabled());

        WebElement element1= driver.findElement(By.xpath("//a[@class='ico-register']"));
        element1.click();

        WebElement element2= driver.findElement(By.xpath("//input[@id ='gender-male']"));

        WebElement element3= driver.findElement(By.xpath("//input[@id ='gender-female']"));

        System.out.println(element2.isSelected());  // False
        System.out.println(element3.isSelected());  // False

        System.out.println("---------------------------------");

        element2.click();
        System.out.println(element2.isSelected()); // True
        System.out.println(element3.isSelected()); // False

        System.out.println("---------------------------------");

        element3.click();

        System.out.println(element2.isSelected()); // False
        System.out.println(element3.isSelected()); // True





        //input[@id ='gender-male']


    }
}
