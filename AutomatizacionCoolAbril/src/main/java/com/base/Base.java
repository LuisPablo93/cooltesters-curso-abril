package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	private WebDriver driver;

	// Header
	// @Autor: Luis Pablo Subias

	public Base(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver ChromeDriver() {
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);
		return driver;
	}

	public void LaunchBrowser(String url) {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		try {
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void type(By locator, String inputText) {
		driver.findElement(locator).sendKeys(inputText);

	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public boolean isDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();

	}

	public void closeDriver() {
		driver.close();
	}

}
