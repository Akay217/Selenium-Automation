package keywordTest;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {
	@Test (priority=1,description="login test validation with valid credentials",expectedExceptions={NullPointerException.class})
	public void loginTest()
	{
		int i=1/0;
		System.out.println("validate LoginTest");
	}
}
