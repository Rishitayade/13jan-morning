package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demosite {

	public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\src\\executables\\chromeDriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverpath);
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demosite.executeautomation.com/Login.html");
		 driver.manage().window().maximize();
		 
		 WebElement usernameinputfield=driver.findElement(By.name("UserName"));
		 usernameinputfield.sendKeys("execution");
		 
		 
		 WebElement passwordinputfield=driver.findElement(By.name("Password"));
		 passwordinputfield.sendKeys("admin");
		 
		 
		 WebElement loginbutton=driver.findElement(By.name("Login"));
		 loginbutton.click();
		 
		  
		 
		 
		
		
     	}
	

}
