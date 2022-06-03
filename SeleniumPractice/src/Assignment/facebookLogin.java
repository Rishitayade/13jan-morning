package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookLogin {


		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", ".\\src\\executables\\chromeDriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			if (driver.getTitle().equals("Facebook – log in or sign up")) {
				System.out.println("Home Page Open Sucessfully.");
			} else {
				System.out.println("Either Home page not open correclty or page title not found.");
			}

			driver.findElement(By.cssSelector("a._42ft._4jy0._6lti")).click();
			
			driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Rohit");
			driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Sharma");
			driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("9988776655");
			driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("rs1234");
			
			int dobDDL=driver.findElements(By.cssSelector("._5k_4>span>select")).size();

			WebElement dayDDL=driver.findElement(By.cssSelector("._5k_4>span>select:nth-of-type(1)"));
			Select s1=new Select(dayDDL);
			System.out.println("Is Day DDL Visible: "+dayDDL.isDisplayed());	//Is Visible
			System.out.println("Is Day DDL Enabled: "+dayDDL.isEnabled());		//Is Enabled
			System.out.println("Is Day DDL Multiseleccted: "+s1.isMultiple());	//Is Multi-selected
			List<WebElement> opt1=s1.getOptions();
			System.out.println("Day DDL Options Count: "+opt1.size());			//Size of Day DDL
			System.out.println("Day DDL Name: "+dayDDL.getAttribute("name"));	//Name of Day DDL
			System.out.println("Default Selected Option: "+s1.getFirstSelectedOption().getText());	//Default Selected Option
			s1.selectByIndex(4);			//Select By Index
			s1.selectByValue("26");			//Select By Value
			s1.selectByVisibleText("15");	//Select By VisibleText
			
			
			WebElement monthDDL=driver.findElement(By.cssSelector("._5k_4>span>select:nth-of-type(2)"));
			Select s2=new Select(monthDDL);
			System.out.println("Is Day DDL Visible: "+monthDDL.isDisplayed());	//Is Visible
			System.out.println("Is Day DDL Enabled: "+monthDDL.isEnabled());	//Is Enabled
			System.out.println("Is Day DDL Multiseleccted: "+s1.isMultiple());	//Is Multi-selected
			List<WebElement> opt2=s2.getOptions();
			System.out.println("Day DDL Options Count: "+opt2.size());			//Size of Month DDL
			System.out.println("Day DDL Name: "+monthDDL.getAttribute("name"));	//Name of Month DDL
			System.out.println("Default Selected Option: "+s2.getFirstSelectedOption().getText());	//Default Selected Option
			s2.selectByIndex(11);			//Select By Index
			s2.selectByValue("4");			//Select By Value
			s2.selectByVisibleText("May");	//Select By VisibleText
			
			
			WebElement yearDDL=driver.findElement(By.cssSelector("._5k_4>span>select:nth-of-type(3)"));
			Select s3=new Select(yearDDL);
			System.out.println("Is Day DDL Visible: "+yearDDL.isDisplayed());	//Is Visible
			System.out.println("Is Day DDL Enabled: "+yearDDL.isEnabled());	//Is Enabled
			System.out.println("Is Day DDL Multiseleccted: "+s1.isMultiple());	//Is Multi-selected
			List<WebElement> opt3=s3.getOptions();
			System.out.println("Day DDL Options Count: "+opt3.size());			//Size of Year DDL
			System.out.println("Day DDL Name: "+yearDDL.getAttribute("name"));	//Name of Year DDL
			System.out.println("Default Selected Option: "+s3.getFirstSelectedOption().getText());	//Default Selected Option
			s3.selectByIndex(56);			//Select By Index
			s3.selectByValue("2021");		//Select By Value
			s3.selectByVisibleText("1989");	//Select By VisibleText
			
			driver.findElement(By.cssSelector("input[value='2']")).click();
			driver.findElement(By.cssSelector("button[name='websubmit']")).click();
			

			}	
		
		

}
	


