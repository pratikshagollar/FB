package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//span[text()='Pratiksha Gollar']")
	private WebElement username;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver,10);
		PageFactory.initElements(driver, this);
	}
	
	public String getUrl()
	{
		
		String url=driver.getCurrentUrl();
		return url;
	}
	public String frendreqText()
	{
		
		String s =username.getText();
		wait.until(ExpectedConditions.visibilityOf(username));
		System.out.println("Home Page Text:"+s);
		return s;
		
	}


}
