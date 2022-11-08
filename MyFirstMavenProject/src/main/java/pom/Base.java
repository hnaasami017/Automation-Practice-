package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base
{
	static WebDriver driver ; 
	
	@BeforeTest
	public void SetUP() {
		Base B = new Base();
		B.SetUp();

	}
	public void SetUp ()
	{
		driver = new ChromeDriver() ; 
		System.setProperty("webdriver.shrome.driver", "chromedriver.exe"); 
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize() ; 
	}
	public static WebDriver GetWebDriver()
	{
		return driver ;  
	}
	
	@AfterTest
	public void Teamdown()

	{
		Base.GetWebDriver().quit(); 
	}

}
