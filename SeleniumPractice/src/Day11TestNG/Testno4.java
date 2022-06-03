package Day11TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtilities;

public class Testno4 {
  @Test
  public void LoginLogoutActitimeApplication() {
	 
         SeleniumUtilities s1=new SeleniumUtilities();
         WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
         
		String expectedTitle = "actiTIME - Login";
		String actualTitle = driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle().length());
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		} else {
			System.out.println("Either login page not opened or page title got changed");
		}
		 driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");

		 driver.findElement(By.linkText("Login")).click();
		  
		 String actualhomeTitle=driver.getTitle();
		 String expectedhomeTitle="actiTIME -  Enter Time-Track";
		 
		 if(actualhomeTitle.equals(expectedhomeTitle)) {
			 System.out.println("Login is succesfull and Home page Title is also verified");
		 }else {
			 System.out.println("Either login is fail or Home page Title got change");
		 }
		 driver.findElement(By.id("logoutLink")).click();
	}
  }

