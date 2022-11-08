package TestClass;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.Base;
import pom.HomePage;
import pom.LoginPage;

public class TestLogin extends Base {
	// WebDriver driver ;

	 

	@Test(priority = 1)
	public void login() {
		HomePage HP = new HomePage();
		HP.click();
		LoginPage LP = new LoginPage();
		LP.login("Hnaa@gmail.com", "");
		Base.GetWebDriver().findElement(By.name("SubmitLogin")).click();
		String MissingPasswordErrorMessage = LP.GetErrorMesage();
		assertEquals(MissingPasswordErrorMessage, "Password is required.");
	}

	@Test(priority = 2)
	public void loginwithincorrectPassword() {
		HomePage HP = new HomePage();
		HP.click();
		LoginPage LP = new LoginPage();
		LP.login("Hnaa@gmail.com", "2324343");
		String MissingPasswordErrorMessage = Base.GetWebDriver()
				.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
		assertEquals(MissingPasswordErrorMessage, "Authentication failed.");
	}

	 
}
