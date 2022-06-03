package handlingMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeCategories {

	public static void main(String[] args) {
     String driverpath=System.getProperty("user.dir")+"\\src\\executables\\chromedriver.exe";
     
     System.setProperty("webdriver.chrome.driver", driverpath);
     
     WebDriver driver=new ChromeDriver();
     
     driver.get("https://www.demoblaze.com/");
     WebElement catagories=driver.findElement(By.cssSelector(".list-group>*:nth-child(1)"));
    System.out.println(catagories.isDisplayed());
    System.out.println(catagories.isEnabled());
    System.out.println(catagories.getText().equals("CATEGORIES"));
    
     WebElement phone=driver.findElement(By.cssSelector(".list-group>*:nth-child(2)"));
     System.out.println(phone.isDisplayed());
     System.out.println(phone.isEnabled());
     System.out.println(phone.getText().equals("Phones"));
     
     WebElement laptop=driver.findElement(By.cssSelector(".list-group>*:nth-child(3)"));
     System.out.println(laptop.isDisplayed());
     System.out.println(laptop.isEnabled());
     System.out.println(laptop.getText().equals("Laptops"));
     
     WebElement monitor=driver.findElement(By.cssSelector(".list-group>*:nth-child(4)"));
     System.out.println(monitor.isDisplayed());
     System.out.println(monitor.isEnabled());
     System.out.println(monitor.getText().equals("Monitors"));
     
	}

}
