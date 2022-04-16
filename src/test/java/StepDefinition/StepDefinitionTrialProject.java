package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionTrialProject {
	
	public WebDriver driver;
	public PomTrialProject lp;
	
	
	@Given("Launch the chrome browser")
	public void launch_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new PomTrialProject(driver);
	}

	@When("open the URL as {string}")
	public void open_the_url_as(String URL) {
	    driver.get(URL);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	}

	@When("Enter the Username as {string}")
	public void enter_the_username_as(String email) throws Throwable 
	{
	     
	    lp.SetUsername(email);
	    Thread.sleep(3000);
	}

	@When("Enter the password as {string}")
	public void enter_the_password_as(String pass) throws Throwable 
	{
	    lp.SetPassword(pass);
	    Thread.sleep(3000);
	}

	@When("Click to Login Button")
	public void click_to_login_button() throws Throwable 
	{
	    lp.ClickLogin();
	    Thread.sleep(5000);
	    
	    
	}


	@And("close the browser")
	public void close_the_browser() {
		
	    
	}

}
