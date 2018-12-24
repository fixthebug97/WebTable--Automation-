package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties properties;
	public TestBase() {
		
		try {
			properties=new Properties();
			FileInputStream inputStream =new FileInputStream("C:\\Users\\samik\\eclipse-workspace\\WT\\src\\main\\java\\Configuration\\Configs");
			properties.load(inputStream);
			}
			
			catch (FileNotFoundException e) {
			e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
	}
	
	
	public static void initialization() {
		
		String browserName = properties.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			driver  =new ChromeDriver();
			
			}
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();;;
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));
	}



}
