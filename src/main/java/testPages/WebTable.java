package testPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class WebTable extends TestBase {
	

	

	@FindBy(xpath="//table[@class='w3-table-all notranslate']/tbody/tr")
	java.util.List<WebElement> table;
	
	
	public WebTable () {
		
		PageFactory.initElements(driver, this);
	}
	
	public int numberOfRows() {
		
		return table.size()-1;
		
	}
	


}
