package keywordTest;

import org.testng.annotations.Test;

public class PriorityTest {
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

}
