package Day11TestNG;

import org.testng.annotations.Test;


public class Example_param1 {
	@Test(invocationCount=4,description="hello")
	public void param1() {
		System.out.println("Hello, I am TC8 from Example_Param1 class");
	}	
}
/**
if testng class contains more dn one test method dn all the test method will be executed in
alphabetical order
*/

/**

By Default each @Test has priority as 0
lowest priority will get executed first
*/


