package myPacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetText_GetAttribute extends LaunchBrowser{

    public static void getTextAttribute(){

        WebElement textInput =driver.findElement(By.xpath("//input[@id='Email']"));

        textInput.clear();
        textInput.sendKeys("hello@gmail.com");

        System.out.println("GetAttribute : "+ textInput.getAttribute("value"));
        System.out.println("GetText : "+textInput.getText());


    }
}
