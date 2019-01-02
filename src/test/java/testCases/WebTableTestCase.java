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
	String[] versionArray= {"HTML", "HTML 2.0", "HTML 3.2", "HTML 4.01", "XHTML","HTML5"};
	public WebTableTestCase() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
	
		initialization();
		webTable=new WebTable();
		
	}
	
	@Test(priority=1)
	public void rowCount() {
		
		int number=webTable.numberOfRows();
		
		Assert.assertEquals(number-1, 6);
			
		
		
	}
	
	@Test(priority=2)
	public void getVersion() {
		
		ArrayList<String> versionData= webTable.versions(webTable.numberOfRows());
		
		System.out.println(versionData);
		
		for (int i=0; i<=webTable.numberOfRows()-2;i++) {
		
		Assert.assertEquals(versionData.get(i), versionArray[i]);
			
		System.out.println(versionData.get(i)+"=="+versionArray[i]);
		
		}
		
	}
	
	@Test(priority=3)
	public void getYear() {
		
		ArrayList<String> yearData=webTable.years(webTable.numberOfRows());
		System.out.println(yearData);
		
		
	
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		
		driver.quit();
	}
	
	
	
	
	
	
	

}
