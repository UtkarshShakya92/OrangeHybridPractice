package testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DashBoardPage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import testBase.TestBaseClass;

public class TC001_LoginTest extends TestBaseClass{

	@Test
	public void verify_Login()
	{
		
		logger.info("*****Starting TC001 Login Test*****");
		try
		{	
		LoginPage lp = new LoginPage(driver);
		lp.enter_UserName(p.getProperty("username"));
		logger.info("*****for login username is passed*****");
		lp.enter_pwd(p.getProperty("password"));
		logger.info("***** password is passed*****");
		lp.click_Login_Button();
		
		// dashboard page 
		
		logger.info("*****Dashboard section*****");
		DashBoardPage dp = new DashBoardPage(driver);
		boolean req_dash_txt = dp.dash_txt_verify();
		Assert.assertTrue(req_dash_txt);
		
		//logout
		logger.info("*****logout section *****");
		LogoutPage lpo = new LogoutPage(driver);
		lpo.logout_drp_down_btn();
		lpo.logout_btn();
		
		System.out.println("For github sample1 ");
		System.out.println("For github sample2 ");
		
		System.out.println("For github sample3 ");
		System.out.println("For github sample4 ");
		
		
		
		}
		
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
}
