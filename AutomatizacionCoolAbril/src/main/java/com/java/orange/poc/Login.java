package com.java.orange.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.Base;
<<<<<<< HEAD
import com.base.GlobalVariables;

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
	By lblInvalidMessage = By.xpath("//*[@id='spanMessage']");

	// Methods

	public void loginOrange(String username, String password) {
		type(txtUsername, username);
		type(txtPassword, password);
		click(btnLogin);
	}

	public boolean userLoginSuccesfully() {
		return isDisplayed(lnkWelcome);
	}

	public boolean actualInvalidMessage() {
		String actualMsg = getText(lblInvalidMessage);
		if (actualMsg.equals(GlobalVariables.INVALID_MSG_LOGIN))
			return true;
		else {
			return false;
		}
	}
=======

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

>>>>>>> branch 'master' of https://github.com/LuisPablo93/cooltesters-curso-abril
}
