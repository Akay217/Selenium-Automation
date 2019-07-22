package assertionsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public void login()
	{
		System.out.println("Starting.....");
		int expected = 1;
		int actual =1;
		Assert.assertEquals(expected, actual);
		System.out.println("Completed.........");		
	}

}
