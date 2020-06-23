package com.wordpress.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase;

	public class LoginPage extends  TestBase{
		
		@FindBy(how=How.XPATH,using="//input[@id='user_login']")
		WebElement username;
		
		@FindBy(how=How.XPATH,using="//input[@id='user_pass']")
		WebElement password;
		
		@FindBy(how=How.XPATH,using="//input[@id='wp-submit']")
		WebElement loginbutton;
		
		
		public LoginPage() {
			
			
			PageFactory.initElements(driver, this);
		}
		
		public String validateTitle() {
			
			return driver.getTitle();
		}
		
		public Homepage login(String un,String pwd) {
			
			username.sendKeys(un);
			
			password.sendKeys(pwd);
			
			loginbutton.click();
			
			return new Homepage();
			
		}
		
		public String homepagetitle() {
			
			return driver.getTitle();
		}

	}



