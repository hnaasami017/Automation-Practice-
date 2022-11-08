package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchClass { 
	
	public void Search (String SearchKeyWord)
	{
		Base.GetWebDriver().findElement(By.id("search_query_top")).sendKeys(SearchKeyWord);
		Base.GetWebDriver().findElement(By.name("submit_search")).click();
				
	}
	public List<WebElement> GetInStockBuuton()
	{
		List<WebElement> itemList = Base.GetWebDriver().findElements(By.xpath("//*[@class='available-now']"));
		return itemList ;
	}

}
