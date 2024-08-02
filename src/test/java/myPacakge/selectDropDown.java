package myPacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectDropDown extends LaunchBrowser{

    public static void getDropdown(){

               WebElement dropdownElement= driver.findElement(By.id("input-country"));

               Select  select = new Select(dropdownElement);

               select.selectByVisibleText("Cuba");


    }
}
