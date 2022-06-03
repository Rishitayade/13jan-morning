package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {


	public static void main(String[] args) {
		
		String driverPath1 ="D:\\Acceleration\\eclipse-jee-2018-09-win32-x86_64\\SeleniumPractice\\src\\executables\\chromedriver.exe";
				//or
    	String driverPath2=".\\src\\executables\\chromedriver.exe";
				//or
		String driverPath3=System.getProperty("user.dir")+"\\src\\executables\\chromedriver.exe";
		System.out.println(System.getProperty("user.dir"));
		
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver",driverPath2);
		//step2: create an instance of Chrome Browser
		WebDriver cdriver=new ChromeDriver();
	}

}