package TestClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.Base;
import pom.HomePage;

public class HomePageTest extends Base {
	
	
	@Test 
	public void CheckHomePageCount()
	{ HomePage HP = new HomePage() ; 
	  assertEquals(HP.GetHomePageProdcount() , 7) ; 
	}
	
	 


}
