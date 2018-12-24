package testCases;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import testPages.WebTable;

public class WebTableTestCase extends TestBase {
	WebTable webTable;
	public WebTableTestCase() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		webTable=new WebTable();
		
	}
	
	@Test
	public void rowCount() {
		
		int number=webTable.numberOfRows();
		
		Assert.assertEquals(number, 6);
			
		
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		
		driver.quit();
	}
	
	
	
	
	
	
	

}
