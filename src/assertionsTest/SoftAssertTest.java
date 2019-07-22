package assertionsTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
//hard assertion - static
	//soft assertion - non static
	@Test
	public void login()
	{
		System.out.println("Starting.....");
		int expected = 1;
		int actual =1;
		//Assert.assertEquals(expected, actual);
		SoftAssert s = new SoftAssert(); 
		System.out.println("Completed.........");		
		s.assertAll();//mandatory to give this assert all for soft assertion condition
	}

}
