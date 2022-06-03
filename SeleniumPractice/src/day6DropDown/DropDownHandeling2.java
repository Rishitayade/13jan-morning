package day6DropDown;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandeling2 {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\src\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement selectskill=driver.findElement(By.id("Skills"));
		
		Select selectoption=new Select(selectskill);
		System.out.println("Already selected option name:"+selectoption.getFirstSelectedOption().getText());
	 
		List<WebElement> option=selectoption.getOptions();
		System.out.println("option count is:"+option.size());
		  
		System.out.println("Dropdown is multiselect or not"+selectoption.isMultiple());
		
		for(int i =0; i<option.size();i++) {
			System.out.println("option:"+i+":"+option.get(i).getText());
		}
	
		selectoption.selectByIndex(8);
		
		selectoption.selectByVisibleText("Installation");
	}
}

