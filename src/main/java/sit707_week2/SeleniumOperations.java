package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static boolean bunnings_registration_page(String em,String pass) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:/Users/guest1/Downloads/chromedriver-win64(1)/chromedriver-win64/chromedriver.exe");
	
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		sleep(2);
	
	
		driver.get("https://www.bunnings.com.au/login");
		
		
		WebElement email = driver.findElement(By.id("okta-signin-username"));
		System.out.println("Found element: " + email);
		email.sendKeys(em);
		
		WebElement password = driver.findElement(By.id("okta-signin-password"));
		System.out.println("Found element: " + password);
		password.sendKeys(pass);
		
		WebElement button = driver.findElement(By.id("okta-signin-submit"));
		button.click();
		
		sleep(5);
		String abc=driver.getCurrentUrl();
		System.out.println(abc);
		if (abc.equals("https://www.bunnings.com.au/")) {
			driver.close();	
			System.out.println("found true");
			return true;
		}
		else {
			driver.close();	
			System.out.println("found false");
			return false;
		}

		
	}
	
	
}
