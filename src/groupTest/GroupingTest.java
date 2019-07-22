package groupTest;

import org.testng.annotations.Test;

public class GroupingTest {
	
	@Test (priority=1, groups={"Books","Cancel"})
	public void loginTest()
	{
		System.out.println("validate LoginTest");
	}
	@Test (priority=2, groups={"Books"})
	public void regTest()
	{
		System.out.println("validate Registration Test");
	}
	@Test (priority=3, groups={"Books","Cancel"})
	public void bookingTest()
	{
		System.out.println("Validate Booking Test");
	}
	@Test (priority=4, groups={"Cancel"})
	public void cancelTest()
	{
		System.out.println("Validate Cancelling Test");
	}

}
