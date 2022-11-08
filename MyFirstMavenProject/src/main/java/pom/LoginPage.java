package pom;

import org.openqa.selenium.By;

public class LoginPage {
	
	public void login(String email, String Password)
	{   
		Base.GetWebDriver().findElement(By.id("email")).sendKeys(email) ;
		Base.GetWebDriver().findElement(By.id("passwd")).sendKeys(Password) ; 
		Base.GetWebDriver().findElement(By.name("SubmitLogin")).click() ;
	}
	 public String GetErrorMesage()
	 {
		 return  Base.GetWebDriver().findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText() ;
	 }

}
