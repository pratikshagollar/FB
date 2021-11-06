package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FriendPage {

	

	WebDriver driver;
	Actions actions;
	
	
	@FindBy(xpath="//a[@aria-label='Friends']")
	private WebElement mainfrndtab;
	
	
	@FindBy(xpath="(//span[text()='Friend requests'])[2]")
	private WebElement frndlisttext;
	
	public FriendPage(WebDriver driver)
	{
		this.driver=driver;
		actions = new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void frndsTab()
	{
	    	actions.moveToElement(mainfrndtab).click().build().perform();
	}
	
	public void frendreqText()
	{
		System.out.println("FriendPage Text :"+frndlisttext.getText());
		
	}


	
}
