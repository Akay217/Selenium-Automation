package keywordTest;

import org.testng.annotations.Test;

public class InvocationTest {

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
	@Test (priority=4,dependsOnMethods="bookingTest",invocationCount=100)
	public void cancelTest()
	{
		System.out.println("Validate Cancelling Test");
	}


}
