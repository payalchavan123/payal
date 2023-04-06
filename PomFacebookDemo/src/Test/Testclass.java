package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Homepage;
import Pages.Login;
import Pages.Logout;

public class Testclass {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//create object of Login
			Login l=new Login(driver);
			l.SetLoginUn();
			l.SetLoginPwd();
			l.clickLoginBtn();
			
			//create object of homepage
			Homepage h=new Homepage(driver);
			h.VerifyHomepageLogo();
			
			//create object of logout
			Logout lo=new Logout(driver);
			lo.clickLogoutMenu();
			lo.clickLogoutBtn();
			
			
			
			
			
			
			
			

}
}