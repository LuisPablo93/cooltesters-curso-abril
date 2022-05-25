package com.orange;

<<<<<<< HEAD
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.base.GlobalVariables;
import com.java.orange.poc.Login;

public class LoginTestsPOM {

	WebDriver driver;
	Base base;
	Login login;
	String username;
	String password;
	String invalidpassword;

	@BeforeTest
	public void beforeTest() {

		base = new Base(driver);
		driver = base.setupChromeDriver();
		login = new Login(driver);

		// External files
		this.username = "Admin";
		this.password = "admin123";
		this.invalidpassword="admin124";

	}

	@Test
	public void tc006POM() {

		base.LaunchBrowser(GlobalVariables.URL_QA);

		login.loginOrange(username, password);

		Assert.assertTrue(login.userLoginSuccesfully());
		
	}
	
	@Test
	public void tc007POM() {
		base.LaunchBrowser(GlobalVariables.URL_QA);

		login.loginOrange(username, invalidpassword);
		
		Assert.assertTrue(login.actualInvalidMessage());
		
		
	}

	@AfterTest
	public void afterTest() {
		 base.closeDriver();
=======
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginTestsPOM {
	@Test
	public void f() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
>>>>>>> branch 'master' of https://github.com/LuisPablo93/cooltesters-curso-abril
	}

}
