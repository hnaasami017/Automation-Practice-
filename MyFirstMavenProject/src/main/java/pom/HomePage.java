package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

	public void click() {
		Base.GetWebDriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

	}

	public void ClickonContactUs() {
		Base.GetWebDriver().findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
	}

	public int GetHomePageProdcount() {
		List<WebElement> itemList = Base.GetWebDriver().findElements(By.xpath("//*[@class='product-container']"));
		return itemList.size();
	}

}
