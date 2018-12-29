package seleniumRevise;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitInSelenium {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		
		//Fluent Wait
		FluentWait wait1=new FluentWait(driver)
						.withTimeout(20, TimeUnit.SECONDS)
						.pollingEvery(5, TimeUnit.SECONDS)
						.ignoring(NoSuchElementException.class);
	}

}
