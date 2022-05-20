package com.java.orange.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.Base;

public class Login extends Base {

	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Objects

	By txtUsername = By.id("txtUsername");
	By txtPassword = By.id("txtPassword");
	By btnLogin = By.id("btnLogin");

	By lnkWelcome = By.xpath("//*[@id='welcome']");

	// Methods

	public void loginOrange(String username, String password) {
		type(txtUsername, username);
		type(txtPassword, password);
		click(btnLogin);
	}

	public boolean userLoginSuccesfully() {
		return isDisplayed(lnkWelcome);
	}

}
