package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {

	public void ChooseSubjectHeadign() {
		new Select(Base.GetWebDriver().findElement(By.id("id_contact"))).selectByVisibleText("Webmaster");
	}

	public void FillMailAddress() {
		Base.GetWebDriver().findElement(By.id("email")).sendKeys("Hnnaa@gmail.com");
	}

	public void FillOrderRef() {
		Base.GetWebDriver().findElement(By.id("id_order")).sendKeys("46385643");
	}

	public void FillMesg() {
		Base.GetWebDriver().findElement(By.id("message")).sendKeys("Test test message");

	}

	public void SendClick() {
		Base.GetWebDriver().findElement(By.id("submitMessage")).click() ; 

	}
	public String GetMessage()
	{
		 return Base.GetWebDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText() ; 
	}

}
