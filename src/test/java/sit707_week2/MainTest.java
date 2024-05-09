package sit707_week2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ahsan Habib
 */
public class MainTest {
	
	public MainTest() {
		System.out.println("MainTest");
	}
	
	@Before
	public void setup() {
	}
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s223418666";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Shreeyut Shrestha";
		Assert.assertNotNull("Student name is null", studentName);
	}
	@Test
	public void testCorrectEmailCorrectPassword() {
		boolean a= SeleniumOperations.bunnings_registration_page("shreeyutshrestha@hotmail.com", "Password1!");
		Assert.assertEquals(true, a);
	}
	@Test
	public void testCorrectEmailIncorrectPassword() {
		boolean a= SeleniumOperations.bunnings_registration_page("shreeyutshrestha@hotmail.com", "asdf");
		Assert.assertEquals(false, a);
	}
	@Test
	public void testIncorrectEmailCorrectPassword() {
		boolean a= SeleniumOperations.bunnings_registration_page("asdf", "Password1!");
		Assert.assertEquals(false, a);
	}
	@Test
	public void testIncorrectEmailIncorrectPassword() {
		boolean a= SeleniumOperations.bunnings_registration_page("asdf", "asdf");
		Assert.assertEquals(false, a);
	}
	@Test
	public void testAssertTrue()
    {
		System.out.println("testAssertTrue...");
        Assert.assertTrue( true );
    }
	
	@Test
	public void testAssertFalse()
    {
		System.out.println("testAssertFalse...");
        Assert.assertFalse( !true );
    }
}
