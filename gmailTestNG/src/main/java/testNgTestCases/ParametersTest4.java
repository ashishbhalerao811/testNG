package testNgTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParametersTest4 {

	@Test(priority=1)
	public void loginPage() {
		
		System.out.println("inside loginPage");
		int a=9/0;
	}
	
	//If login fails, homePage will be skipped.
	@Test(priority=2, dependsOnMethods="loginPage")
	public void homePage() {

		System.out.println("inside homePage");
		
	}
	
	@Test(priority=3 )
	public void payment() {

		System.out.println("inside teardown");
		
	}
	

}
