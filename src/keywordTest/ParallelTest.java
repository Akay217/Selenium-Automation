package keywordTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	public void sessionOne() {
		 //First session of WebDriver
		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com");
	    
	}
	
	@Test
	public void sessionTwo() {
		 
	    //Second session of WebDriver
	    System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
	    WebDriver driver2 = new ChromeDriver();
	    driver2.get("http://www.google.com");
	}

}
