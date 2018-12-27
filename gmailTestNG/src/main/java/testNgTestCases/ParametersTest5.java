package testNgTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParametersTest5 {

	@Test(invocationCount=5)
	public void loginPage() {
		int a=10,b=20,c;
		c=a+b;
		
		
		System.out.println("The value of C is=" +c);
		
	}
	

	

}
