package stepDefinition;

import com.wordpress.pages.Homepage;
import com.wordpress.pages.LoginPage;

import BaseClass.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageTest extends TestBase{

	LoginPage loginpage;
	Homepage homepage;
	
	@Given("^I want launch the browser$")
	public void i_want_launch_the_browser() throws Throwable {
		
	    TestBase.intialization();
	}
	
	@When("^I login$")
	public void i_login() {
		
		loginpage=new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	@Then("^I click on userbutton$")
	public void i_click_on_userbutton() throws Throwable {
		
		 homepage = new Homepage();
		
	   homepage.clickOnAddNewUser();
	}

	@Then("^I enter the details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and\"([^\"]*)\"$")
	public void i_enter_the_details_and_and_and(String userid, String mail, String firstname, String lastname) throws Throwable {
	   
	   
	   homepage.addInformation(userid, mail, firstname, lastname);
	}
	
	@Then("^I click on add new user button$")
	public void i_click_on_add_new_user_button() throws Throwable {
		homepage.addnewuser();


	}
	@Then("^I quit the browser$")
	public void i_quit_the_browser() throws Throwable {
	    driver.quit();
	}
	

}
