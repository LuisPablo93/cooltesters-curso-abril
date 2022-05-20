package com.google;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Computer {
	@Test
	public void f() {
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://computer-database.gatling.io/computers");
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Explicit wait
		WebDriverWait explicitwait = new WebDriverWait(driver, 10);
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add")));

		driver.findElement(By.id("searchbox")).sendKeys("Hola Mundo");

		boolean isDisplayed = driver.findElement(By.id("searchsubmit")).isDisplayed();
		boolean isDisplayed2 = driver.findElement(By.id("add")).isDisplayed();

		String isGetText = driver.findElement(By.xpath("//section/h1")).getText();
		
	// Validacion - HARD ASSERTION

//		Assert.assertTrue(isDisplayed2, "is Displayed");
//		Assert.assertTrue(isDisplayed2, "is Displayed2");

		isDisplayed2 = false;
   //Validacion - SOFT ASSERTION
		
		SoftAssert softassert = new SoftAssert();

		softassert.assertTrue(isDisplayed, "is Displayed");
		softassert.assertTrue(isDisplayed2, "is Displayed2");
		softassert.assertEquals(isGetText, "575 computers found");

		softassert.assertAll();

		driver.close();
	}
}
