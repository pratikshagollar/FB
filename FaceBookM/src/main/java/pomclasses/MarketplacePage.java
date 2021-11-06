package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketplacePage {

	
	WebDriver driver;
	Actions actions;
	
	@FindBy(xpath="//a[@aria-label='Marketplace']")
	private WebElement maintaMarketplace;
	
	@FindBy(xpath="//h2[@dir='auto']/span[@dir='auto']")
	private WebElement todayspicks;
	
	public MarketplacePage(WebDriver driver)
	{
		this.driver=driver;
		actions= new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void mainTabarketplacePage()
	{
		actions.moveToElement(maintaMarketplace).click().build().perform();
	}
	 
	public void todaysPicks()
	{
		
		System.out.println("MarketplacePage Text :"+todayspicks.getText());
		
	}
	
	

}
