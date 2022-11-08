package TestClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.Base;
import pom.ContactUs;
import pom.HomePage;

public class ContactUsTest extends Base{

	

	@Test(priority = 1)
	public void testcontactus() throws InterruptedException {
		HomePage HP = new HomePage();
		HP.ClickonContactUs();
		ContactUs CU = new ContactUs();
		CU.ChooseSubjectHeadign();
		CU.FillMailAddress();
		CU.FillOrderRef();
		CU.FillMesg();
		CU.SendClick();
		//Thread.sleep(3000);
		String ConMessg = CU.GetMessage() ;  
		assertEquals(ConMessg , "Your message has been successfully sent to our team.") ;  
	}


	

}
