package stepDefinition;

import com.wordpress.pages.Homepage;
import com.wordpress.pages.LoginPage;

import BaseClass.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	
	Homepage homepage;
	
	
	
	@Given("^I want to launch the browser and open url$")
	public void i_want_to_launch_the_browser_and_open_url() throws Throwable {
		
		TestBase.intialization();
	    
	}

	@Then("^I verify the page title$")
	public void i_verify_the_page_title() throws Throwable {
		loginpage=new LoginPage();
		
		String actual_title=loginpage.validateTitle();
		
		
		Assert.assertEquals(prop.getProperty("loginpagetitle"), actual_title);
		
	
	    
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
		
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	    
	}

	

	@Then("^Verify the homepage title$")
	public void verify_the_homepage_title() throws Throwable {
		
		String actual_title=homepage.homepagetitle();
		
		
		
		Assert.assertEquals(prop.getProperty("homepagetitle"), actual_title);
	
	}
	    
	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	    driver.quit();
	}

	



}
