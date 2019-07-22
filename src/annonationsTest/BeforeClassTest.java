package annonationsTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassTest {
	@Test (priority=1,description="login test validation with valid credentials")
	public void loginTest()
	{
		System.out.println("validate LoginTest");
	}
	@Test (priority=2,dependsOnMethods="loginTest",enabled=false)
	public void regTest()
	{
		//int i=1/0;
		System.out.println("validate Registration Test");
	}
	@Test (priority=3,dependsOnMethods="regTest")
	public void bookingTest()
	{
		System.out.println("Validate Booking Test");
	}
	@Test (priority=4,dependsOnMethods="bookingTest")
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


}
