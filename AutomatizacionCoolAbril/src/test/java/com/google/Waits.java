package com.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
  @Test
  public void f() {
	  ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Explict wait
		WebDriverWait explicitwait = new WebDriverWait(driver, 15);
		
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"divLogo\"]/img")));
		
		driver.close();
  }
}
