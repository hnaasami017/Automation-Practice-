package TestClass;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.Base;
import pom.SearchClass;

public class SearchTest extends Base{

	 

	@Test
	public void CheckAllItemsareinStock() {

		SearchClass SearchTest = new SearchClass();
		SearchTest.Search("dress");
		List<WebElement> itemList = SearchTest.GetInStockBuuton();
		//itemList.get(7).getText(); 
		for (WebElement item : itemList) {
			assertEquals(item.getText(), "In stock");
		}

	}

	 

}
