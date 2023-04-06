package Pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	//declaration
	@FindBy(id="email")private WebElement Un;
	@FindBy(id="pass")private WebElement Pass;
	@FindBy(name="login")private WebElement btn;
	
	//Initialization
	public Login(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}
	
	//usage
	public void SetLoginUn()
	{
		Un.sendKeys("pritijapandgale07@gmail.com");
	}
	public void SetLoginPwd()
	{
		Pass.sendKeys("************");
	}
	public void clickLoginBtn()
	{
		btn.click();
	}
	
	}
	
	
	
	


