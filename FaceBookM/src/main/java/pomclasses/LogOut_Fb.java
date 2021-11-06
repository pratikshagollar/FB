package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut_Fb {

Actions a;
	
	@FindBy(xpath="//div[@aria-label='Account']")
	private WebElement account;
	
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logoutbutton;
	
	
	public LogOut_Fb(WebDriver driver)
	{
		a = new Actions(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void accountCLick()
	{
		account.click();
	}
	public void logoutbutton()
	{
		
		a.moveToElement(logoutbutton).click().build().perform();
	}

}
