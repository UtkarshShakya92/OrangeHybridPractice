package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage{
	
	WebDriver driver;
	
	public DashBoardPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h6[text()='Dashboard']")
     WebElement dash_header_txt;
	
	
	public boolean dash_txt_verify()
	{
		try {
		return (dash_header_txt.isDisplayed());
		}
		
		catch(Exception e)
		{
			return false;
		}
	}
}
