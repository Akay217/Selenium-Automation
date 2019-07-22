package keywordTest;

import org.testng.annotations.Test;

public class SkipTest {
	
	@Test (priority=1)
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


}
