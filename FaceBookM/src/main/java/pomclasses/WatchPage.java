package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchPage {

	
	WebDriver driver;
	Actions actions;
	
	@FindBy(xpath="//a[@aria-label='Watch']")
	private WebElement maintabwatch;
	
	@FindBy(xpath="//span[text()='See All']")
	private WebElement seeall;
	
	public WatchPage(WebDriver driver)
	{
		this.driver=driver;
		actions= new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void mainTabWatch()
	{
		actions.moveToElement(maintabwatch).click().build().perform();
	}
	 
	public void seeAll()
	{
		seeall.click();
		
	}

}
