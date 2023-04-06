package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	//declaration
	@FindBy(xpath="//a[@aria-label='Facebook']")private WebElement logo;
	
	//initialization
	public Homepage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	public void VerifyHomepageLogo()
	{
		boolean res=logo.isDisplayed();
		if(res==true)
		{
			System.out.println("Logo is visible");
		}
		else {
			System.out.println("Logo is not visible");
			
		}
	}
	

}
