package switchStatement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtilities;

public class HandelingActiveElements {

	public static void main(String[] args) {
		SeleniumUtilities s1=new SeleniumUtilities();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		
		WebElement activeobject=driver.switchTo().activeElement();
		
		
		 String actualobjectplaceholder=activeobject.getAttribute("placeholder");
          String expectedActiveobject="Username";
       if(actualobjectplaceholder.equals(expectedActiveobject)) {
    	   System.out.println("cursor pointer validation is succesfull");
       }else {
    	   System.out.println("is not sucessfull");
       }
          activeobject.sendKeys("admin",Keys.TAB);
          driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
	}

}
