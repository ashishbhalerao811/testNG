package testNgTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParametersTest1 {

	@Test(priority=2)
	public void loginPage() {
		
		System.out.println("inside loginPage");
	}
	
	@Test(priority=1)
	public void homePage() {

		System.out.println("inside homePage");
		
	}
	
	@Test(priority=1)
	public void tearDown() {

		System.out.println("inside teardown");
		
	}
}
