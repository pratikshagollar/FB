package testclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;



import pomclasses.FriendPage;
import pomclasses.WatchPage;
import utilityScreenShot.Utilities;
import pomclasses.HomePage;
import pomclasses.LogOut_Fb;
import pomclasses.Login_Page;
import pomclasses.MarketplacePage;
import BasePackage.Base;




public class TestFB extends Base {

	public  static WebDriver driver;
	ChromeOptions  options;
	
	Login_Page loginpage;
	HomePage homepage;
	MarketplacePage marketplacepage;
	FriendPage frndpage;
	WatchPage watch;
	LogOut_Fb logout;

	Assert soft;
	
    @BeforeTest
  //  @Parameters("browser")
    public void launchBrowser()
    {
//    	if(browser.equalsIgnoreCase("chrome"))
//    	{
//    		
//
//    		 driver =Base.openCromeBrowser();//static methode
//    		 options = new ChromeOptions();
//    	     options.addArguments("--disable-notifications");
//        	 driver = new ChromeDriver(options);
//    	}
//    	else
//    	{
//    		if(browser.equalsIgnoreCase("firebox"))
//    		driver =Base.openFireFoxBrower();
//    	}
    	
    	
    	driver =Base.openCromeBrowser();//static methode
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://www.facebook.com/");
		
    }
	 
	@BeforeClass 
	public void createObjectOfPom()
	{  
	  //pom class object
		 loginpage = new Login_Page(driver);
		 homepage= new HomePage(driver);
		 marketplacepage=new MarketplacePage(driver);
		 watch= new WatchPage(driver);
		 frndpage=new FriendPage(driver);
		 logout= new LogOut_Fb(driver);
		 
	}
	
	@BeforeMethod 
	public void logIn() throws InterruptedException, EncryptedDocumentException, IOException
	{
		   
		    loginpage.sendusername();
	    	Thread.sleep(3000);

	    	loginpage.sendpassword();
	    	Thread.sleep(3000);

	   	    loginpage.sendlogin();
			Thread.sleep(3000);          
	}
		
	@Test (priority=0)
	public void homePage() throws IOException, InterruptedException 
	{
		 
		String url=homepage.getUrl();
		//Assert.assertEquals(url,"https://www.facebook.com","fail");
		
		System.out.println("tske screen shot");
		Utilities.takeScreenShot(driver);
		
		String test=homepage.frendreqText();
		soft.assertEquals(test,"pratiksha");
		System.out.println(test);
		
	}
	@Test (priority=1,enabled=true)
	public void marketplacePage() 
	{
		
		marketplacepage.mainTabarketplacePage();
		marketplacepage.todaysPicks();
	}
	
	@Test (priority=2,enabled=true)
	public void watchPage() 
	{
	   
		watch.mainTabWatch();
		//watch.seeAll();
	}
	
	@Test (priority=3,enabled=true)
	public void friendPage() 
	{
	   
		frndpage.frndsTab();
		frndpage.frendreqText();
		
	}
	@AfterMethod
	public void logOut()
	{ 
		  logout.accountCLick();
		  logout.logoutbutton();
	}
	
	@AfterClass 
	public void clearPomObjects()
	{
		///refrances not pointing any object (object is present)
		 loginpage = null;
		 homepage= null;
		 marketplacepage=null;
		 watch= null;
		 frndpage=null;
		 logout=null;
		 
	}

	@AfterTest
	public void closebrwser()
	{
		
		driver.close();
		driver=null;
		System.gc();//present object are deleted  who have not refrances
	}
	
	
}
