package annonationsTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestTest {

	@Test (priority=1)
	public void loginTest()
	{
		System.out.println("validate LoginTest");
	}
	@Test (priority=2)
	public void regTest()
	{

		System.out.println("validate Registration Test");
	}
	@Test (priority=3)
	public void bookingTest()
	{
		System.out.println("Validate Booking Test");
	}
	@Test (priority=4)
	public void cancelTest()
	{
		System.out.println("Validate Cancelling Test");
	}

	@BeforeClass	
	public void logindb()
	{
		System.out.println("login db");
	}

	@AfterClass	
	public void logoutdb()
	{
		System.out.println("logout db");
	}
	@BeforeTest
	public void loginnetwork()
	{
		System.out.println("login network");
	}

	@AfterTest
	public void logoutnetwork()
	{
		System.out.println("logout network");
	}




}
