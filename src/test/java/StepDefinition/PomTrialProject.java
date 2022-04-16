package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomTrialProject 
{
	WebDriver ldriver;
	
		public PomTrialProject (WebDriver rdriver)
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		
		@FindBy(id="email")
		@CacheLookup
		WebElement Username;
		
		@FindBy(id="pass")
		@CacheLookup
		WebElement Password;
		
		@FindBy(name="login")
		@CacheLookup
		WebElement Login_Button;
		
		
		
		public void SetUsername(String email)
		{
			Username.clear();
			Username.sendKeys(email);
		}
		
		public void SetPassword(String pass)
		{
			Password.clear();
			Password.sendKeys(pass);
		}
		
		public void ClickLogin()
		{
			Login_Button.click();
		}
		
	}
	
	


