package Day11TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtilities;

public class Testno5 {
  @Test
  public void LoginLogoutActitimeApplication() {
	 
         SeleniumUtilities s1=new SeleniumUtilities();
         WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
         driver.getTitle();
         Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
		 WebElement usernameinputfield=driver.findElement(By.id("username"));
		// Assert.assertTrue(usernameinputfield.isDisplayed());
		 usernameinputfield.sendKeys("admin");
		 
		driver.findElement(By.name("pwd")).sendKeys("manager");

		 driver.findElement(By.linkText("Login")).click();
		//  Assert.assertEquals(driver.getTitle(), "actiTIME -  Enter Time-Track");
		 
		 driver.findElement(By.id("logoutLink")).click();
	}@Test
  public void LoginvalidationActitimeApplication() {
		 
        SeleniumUtilities s1=new SeleniumUtilities();
        WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
        driver.getTitle();
        Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
		 WebElement usernameinputfield=driver.findElement(By.id("username"));
		 Assert.assertTrue(usernameinputfield.isDisplayed());
		 usernameinputfield.sendKeys("admin");
		 
		driver.findElement(By.name("pwd")).sendKeys("manager");

		 driver.findElement(By.linkText("Login")).click();
		 
		 driver.findElement(By.id("logoutLink")).click();
	}

	@Test
	public void loginPageValidationInActitimeApplication() {

        SeleniumUtilities s1=new SeleniumUtilities();
        WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		
		System.out.println("Before login page title: " + driver.getTitle());
		// validation using TestNG
		// Assert.assertEquals(driver.getTitle(), "actiTIME - Login"); //or
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login", "Either login page not opened or title got changed");

		// identify the required element from the UI and perform required action 0-30
		WebElement usernameInputField = driver.findElement(By.id("username"));
		Assert.assertTrue(usernameInputField.isDisplayed());
		Assert.assertTrue(usernameInputField.isEnabled(),"User name input field is not functional");
		Assert.assertEquals(usernameInputField.getAttribute("placeholder"),"Username","Username input field placeholder name is changed");

		// identify remember check box
		WebElement checkBox = driver.findElement(By.name("remember"));
		Assert.assertTrue(checkBox.isDisplayed());
		Assert.assertTrue(checkBox.isEnabled(),"Checkbox is not functional");
		Assert.assertFalse(checkBox.isSelected(),"Checkbox is by defualt selected");
		
		checkBox.click();
		Assert.assertTrue(checkBox.isSelected(),"Checkbox is not functional");
		driver.close();
	}
}
 


  

