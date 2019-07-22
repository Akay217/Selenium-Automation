package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class testNGAssignment {

	
	WebDriver driver;
	@BeforeSuite
	public void browser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arun.k.sundararaman\\eclipse-workspace\\SeleniumConcepts\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser is launched");
	}
	@BeforeClass
	public void url() {
		driver.get("http://thawing-shelf-73260.herokuapp.com/index.jsp");
		System.out.println("URL is launched");
	}

	@Test (dataProvider = "dataset",priority=1)
	public void loginTest(String Uname,String Pswd) {
		WebElement username=driver.findElement(By.xpath("//*[@id='login']"));
		username.sendKeys(Uname);
		System.out.println("username is: " +Uname);
				
		WebElement password=driver.findElement(By.xpath("//*[@id=\'password\']"));
		password.sendKeys(Pswd);
		System.out.println("password is: " +Pswd);
				}
	  @DataProvider(name="dataset")
	  public static Object[][]getdata()
	  {
		  return new Object[][]
		      {
		  {"sudha5695","sudhakck"}
		      };
	  }
	
	 @Test(priority=2)
	  public void login() {
		  driver.findElement(By.xpath("//*[@id=\'submit\']")).click();
			System.out.println("Click");
	  }
	 @Test(priority=3)
	 public void listcategory() {
		 driver.findElement(By.xpath("//*[@id=\"go_list_categories\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"go_add_category\"]")).click();
		 driver.findElement(By.id("name")).sendKeys("fruits");
		 driver.findElement(By.id("submit")).click();
		 //driver.findElement(By.id("name")).sendKeys("vegetables");
		 //driver.findElement(By.id("submit")).click();
			System.out.println("List category is added");
	 }
}
