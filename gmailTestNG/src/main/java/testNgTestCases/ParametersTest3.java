package testNgTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParametersTest3 {

	@Test(priority=1, groups="abc")
	public void loginPage() {
		
		System.out.println("inside loginPage");
	}
	
	@Test(priority=2, groups="title")
	public void homePage() {

		System.out.println("inside homePage");
		
	}
	
	@Test(priority=3)
	public void payment() {

		System.out.println("inside payment");
		
	}
	
	@Test(priority=4,groups="title")
	public void addtoCart() {

		System.out.println("inside addtoCart");
		
	}
	@Test(priority=5,groups="abc")
	public void delivery() {

		System.out.println("inside delivery");
		
	}
}
