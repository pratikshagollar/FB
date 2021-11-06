package pomclasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utilities;

public class Login_Page {

	
     WebDriver driver;
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@name='pass']")
	private WebElement password;
	
	@FindBy (xpath = "//button[text()='Log In']")
	private WebElement login;
	
	public Login_Page (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
//		this.driver = driver;
	}
	public void sendusername() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(3000);
		 String mobile_no=Utilities.getData(1,0);
		//username.sendKeys("pratikshagollar4666@gmail.com");
		 username.sendKeys(mobile_no);
		 }

	public void sendpassword() throws InterruptedException
	{
		Thread.sleep(3000);
		
		password.sendKeys("prati1995@@");
	}
	
	public void sendlogin() throws InterruptedException
	{
		
		Thread.sleep(3000);
	   login.click();
		
//		Actions act = new Actions(driver2);
//		
//		act.moveToElement(login).click().build().perform();
	}

}
