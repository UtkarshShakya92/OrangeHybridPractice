package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	WebDriver driver ;
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy (name ="username")	
	WebElement txt_user_name ;
	
	@FindBy (name ="password")
	WebElement txt_pwd;
	
	@FindBy (xpath="//button[text()=' Login ']")
	WebElement login_button ;
	
	
	public void enter_UserName(String username)
	{
		txt_user_name.sendKeys(username);
	}
	
	public void enter_pwd(String pwd)
	{
		txt_pwd.sendKeys(pwd);
	}
	
	public void click_Login_Button()
	{
		login_button.click();
	}

}
