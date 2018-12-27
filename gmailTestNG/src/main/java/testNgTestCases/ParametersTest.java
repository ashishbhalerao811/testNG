package testNgTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParametersTest {

	@BeforeMethod
	public void loginPage() {
		
		System.out.println("inside loginPage");
	}
	
	@Test
	public void homePage() {

		System.out.println("inside homePage");
		
	}
	
	@AfterMethod
	public void tearDown() {

		System.out.println("inside teardown");
		
	}
}
