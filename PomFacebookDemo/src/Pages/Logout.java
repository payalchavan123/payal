package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	//declaration
	@FindBy(xpath="//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z']")private WebElement profile;
	@FindBy(xpath="//div[@dir='auto']")private WebElement logout;
	
	//initialization
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	public void clickLogoutMenu()
	{
		profile.click();
	}
	public void clickLogoutBtn()
	{
		logout.click();
		
	}

}
