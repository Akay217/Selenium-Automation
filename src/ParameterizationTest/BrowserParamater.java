package ParameterizationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BrowserParamater {
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void browserTest(String browser) throws InterruptedException
	{
		
		System.out.println("Test Case Started");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
		}
		
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
		}
	}
}
