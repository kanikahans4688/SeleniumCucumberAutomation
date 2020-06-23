package com.wordpress.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

public class Homepage extends TestBase{
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Users')]")
	WebElement userbutton;
	
	@FindBy(how=How.XPATH,using="//a[@class='page-title-action']")
	WebElement addnew;
	
	@FindBy(how=How.NAME,using="user_login")
	WebElement userName;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@id='first_name']")
	WebElement firstname;
	
	@FindBy(how=How.XPATH,using="//input[@id='last_name']")
	WebElement lastname;
	
	@FindBy(how=How.XPATH,using="//input[@id='createusersub']")
	WebElement addnewuser;
	
public Homepage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String homepagetitle() {
		
		
		return driver.getTitle();
	}
 public void clickOnAddNewUser() {
	 
	 userbutton.click();
	 
	 addnew.click();
 }

public void addInformation(String user,String mailid,String fname,String lname) {
	
	userName.sendKeys(user);
	
	email.sendKeys(mailid);
	
	firstname.sendKeys(fname);
	
	lastname.sendKeys(lname);
	
	
}

public void addnewuser() {
	
	addnewuser.click();
}


}



