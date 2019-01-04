package testPages;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class WebTable extends TestBase implements Communicate {
	
	

	@FindBy(xpath="//table[@class='w3-table-all notranslate']/tbody/tr")
	java.util.List<WebElement> table;
	
	int rowcount;
	
	
	
	
	public WebTable () {
		
		PageFactory.initElements(driver, this);
	}
	

	 
	public int numberOfRows() {
		rowcount=table.size();
		return rowcount;
		
	}
	
	
	public ArrayList<String> versions(int rowcount) {
		ArrayList<String> versionList= new ArrayList<String>();
		for(int i=2; i<=rowcount; i++) 
		{
			String actualxpath=beforexpath_Version+i+afterxpath_Version;
			String versions=driver.findElement(By.xpath(actualxpath)).getText();
			
			
			versionList.add(versions);
		
			
			
			
		}
		return versionList;
	}
	
	
	public ArrayList<String> years(int rowcount){
		ArrayList<String> yearList= new ArrayList<String>();
		for(int i=2; i<=rowcount; i++) {
			
			String actualxpath=beforexpath_year+i+afterxpath_year;
			String year=driver.findElement(By.xpath(actualxpath)).getText();
			
			yearList.add(year);
			
		}
		return yearList;
		
	}
	


}
