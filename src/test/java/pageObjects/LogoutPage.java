package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {

	WebDriver driver;

	public LogoutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']/following-sibling::i")
	WebElement logout_drp_down;

	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//a[text()='Logout']")
	WebElement logout_button;

	public void logout_drp_down_btn() {
		logout_drp_down.click();
	}

	public void logout_btn() {
		logout_button.click();
	}

}
