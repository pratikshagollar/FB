package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public static WebDriver openCromeBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumSetup\\letest\\chromedriver.exe");
		
		 ChromeOptions options = new ChromeOptions();
	     options.addArguments("--disable-notifications");
	     WebDriver driver = new ChromeDriver(options);

	     
	     
	     
    	
		return driver;
	}
	
	
//	public static WebDriver openFireFoxBrower()
//	{
//		System.setProperty("webdriver.gecko.driver","E:\\SeleniumSetup\\letest\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		return driver;
//		
//	}
//	
	
	

}
