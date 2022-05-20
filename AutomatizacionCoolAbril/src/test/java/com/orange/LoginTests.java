package com.orange;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.expectThrows;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class LoginTests {

	@BeforeTest
	public void beforeTest() {

	}

	@Test
	public <WebDriverwait> void tc001() { // TC001_Admin_SearchEmployee

		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		// ExplicitWait - Validate Login Succesfully

		WebDriverWait explicitwaitlogin = new WebDriverWait(driver, 5);

		explicitwaitlogin.until(ExpectedConditions.presenceOfElementLocated(By.id("welcome")));

		// SOFT ASSERTION - Validate Login Successfully

		boolean isDisplayed = driver.findElement(By.id("welcome")).isDisplayed();
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(isDisplayed, "isDisplayed filter by welcome");
		if (isDisplayed = true) {
			Reporter.log("Login Succesfully");
		}

		// Validate User Search

		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Admin");
		driver.findElement(By.id("searchBtn")).click();

		// SOFTASSERTION - Validate Deployed user

		boolean isDisplayed2 = driver.findElement(By.xpath("//a[contains(@href,'saveSystem')]")).isDisplayed();

//		String userName = driver.findElement(By.id("searchSystemUser_userName")).getText();

		softassert.assertTrue(isDisplayed2, "isDisplayed filter by Username");
		if (isDisplayed2 = true) {
			Reporter.log("Usuario encontrado");
		}

		driver.findElement(By.id("welcome")).click();

		WebDriverWait explicitwait = new WebDriverWait(driver, 5);
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'logout')]")));

		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();

		softassert.assertAll();

		driver.close();

	}

	@Test
	public <WebDriverwait> void tc002() {

		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

//		WebDrivErexplicit explicitwait = new WebDrivErexplicit(driver,5);
//		
//		explicitwait.until.find.Expected

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		WebDriverWait explicitwaitlogin = new WebDriverWait(driver, 5);

		explicitwaitlogin.until(ExpectedConditions.presenceOfElementLocated(By.id("welcome")));
		boolean isDisplayed = driver.findElement(By.id("welcome")).isDisplayed();
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(isDisplayed, "isDisplayed filter by welcome");
		if (isDisplayed = true) {
			Reporter.log("Login Succesfully");
		}

		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("XYZ");
		driver.findElement(By.id("searchBtn")).click();

//SOFT ASSERTION - Validate Login Successfully

		boolean isDisplayed2 = driver.findElement(By.xpath("//td")).isDisplayed();

//		String userName = driver.findElement(By.id("searchSystemUser_userName")).getText();

		softassert.assertTrue(isDisplayed2, "isDisplayed No Records Found");
		if (isDisplayed2 = true) {
			Reporter.log("Usuario no ncontrado");
		}

//		driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")).getText();

		driver.findElement(By.id("welcome")).click();

		WebDriverWait explicitwait = new WebDriverWait(driver, 5);
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'logout')]")));

		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();

		softassert.assertAll();

		driver.close();

	}

	@Test
	public <WebDriverwait> void tc003() {

		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

//		WebDrivErexplicit explicitwait = new WebDrivErexplicit(driver,5);
//		
//		explicitwait.until.find.Expected

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		WebDriverWait explicitwaitlogin = new WebDriverWait(driver, 5);

		explicitwaitlogin.until(ExpectedConditions.presenceOfElementLocated(By.id("welcome")));
		boolean isDisplayed = driver.findElement(By.id("welcome")).isDisplayed();
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(isDisplayed, "isDisplayed filter by welcome");
		if (isDisplayed = true) {
			Reporter.log("Login Succesfully");
		}

		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
		WebDriverWait explicitwaitadd = new WebDriverWait(driver, 5);
		explicitwaitadd.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"UserHeading\"]")));

		driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]")).sendKeys("Admin A");
		driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]")).sendKeys("LuisPablo");
		driver.findElement(By.xpath("//*[@id=\"systemUser_password\"]")).sendKeys("luis1234");
		driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"]")).sendKeys("luis1234");
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();

		WebDriverWait explicitwaitsearch = new WebDriverWait(driver, 5);
		explicitwaitsearch.until(ExpectedConditions.presenceOfElementLocated(By.id("searchBtn")));

		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("LuisPablo");
		driver.findElement(By.id("searchBtn")).click();

//SOFT ASSERTION - Validate Login Successfully

		boolean isDisplayed2 = driver.findElement(By.xpath("//a[contains(@href,'saveSystem')]")).isDisplayed();

//		String userName = driver.findElement(By.id("searchSystemUser_userName")).getText();

		softassert.assertTrue(isDisplayed2, "isDisplayed filter by Username");
		if (isDisplayed2 = true) {
			Reporter.log("Usuario encontrado");
		}

//		driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")).getText();

		driver.findElement(By.id("welcome")).click();

		WebDriverWait explicitwait = new WebDriverWait(driver, 5);
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'logout')]")));

		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();

		softassert.assertAll();

		driver.close();

	}

	@Test
	public <WebDriverwait> void tc004() {

		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

//		WebDrivErexplicit explicitwait = new WebDrivErexplicit(driver,5);
//		
//		explicitwait.until.find.Expected

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		WebDriverWait explicitwaitlogin = new WebDriverWait(driver, 5);

		explicitwaitlogin.until(ExpectedConditions.presenceOfElementLocated(By.id("welcome")));
		boolean isDisplayed = driver.findElement(By.id("welcome")).isDisplayed();
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(isDisplayed, "isDisplayed filter by welcome");
		if (isDisplayed = true) {
			Reporter.log("Login Succesfully");
		}

		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();

		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Aravind");
		driver.findElement(By.id("searchBtn")).click();

//SOFT ASSERTION - Validate Login Successfully

		boolean isDisplayed2 = driver.findElement(By.xpath("//a[contains(@href,'saveSystem')]")).isDisplayed();

//		String userName = driver.findElement(By.id("searchSystemUser_userName")).getText();

		softassert.assertTrue(isDisplayed2, "isDisplayed filter by Username");
		if (isDisplayed2 = true) {
			Reporter.log("Usuario encontrado");
		}

//		driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")).getText();
//		WebDriverWait explicitwaitsearch = new WebDriverWait(driver, 5);

		driver.findElement(By.xpath("//input[contains(@name,'chkSelectRow[]')]")).click();
		driver.findElement(By.id("btnDelete")).click();

		WebDriverWait explicitwaitdeletecuestion = new WebDriverWait(driver, 5);
		explicitwaitdeletecuestion
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"deleteConfModal\"]/div[1]/h3")));

		driver.findElement(By.id("dialogDeleteBtn")).click();

//		boolean isDisplayedDelete = driver.findElement(By.xpath("//*[@id=\\\"frmList_ohrmListComponent\\\"]/script")).isDisplayed();
//		SoftAssert softassert2 = new SoftAssert();
//		
//		softassert2.assertTrue(isDisplayedDelete, "Usuario Eliminado");
//		WebDriverWait explicitwaitdelete = new WebDriverWait(driver, 5);
//		explicitwaitdelete.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"frmList_ohrmListComponent\"]/script")));

		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Aravind");
		driver.findElement(By.id("searchBtn")).click();

//SOFT ASSERTION - Validate Login Successfully

		boolean isDisplayed3 = driver.findElement(By.xpath("//td")).isDisplayed();

//		String userName = driver.findElement(By.id("searchSystemUser_userName")).getText();

		softassert.assertTrue(isDisplayed3, "isDisplayed No Records Found");
		if (isDisplayed3 = true) {
			Reporter.log("Usuario no ncontrado");
		}

		driver.findElement(By.id("welcome")).click();

		WebDriverWait explicitwait = new WebDriverWait(driver, 5);
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'logout')]")));

		driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();

		softassert.assertAll();

		driver.close();

	}

	@Test
	public <WebDriverwait> void tc005() {

		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

//		WebDrivErexplicit explicitwait = new WebDrivErexplicit(driver,5);
//		
//		explicitwait.until.find.Expected

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		WebDriverWait explicitwaitlogin = new WebDriverWait(driver, 5);

		explicitwaitlogin.until(ExpectedConditions.presenceOfElementLocated(By.id("welcome")));
		boolean isDisplayed = driver.findElement(By.id("welcome")).isDisplayed();
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(isDisplayed, "isDisplayed filter by welcome");
		if (isDisplayed = true) {
			Reporter.log("Login Succesfully");
		}

		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();

		driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
		WebDriverWait explicitwaitadd = new WebDriverWait(driver, 5);
		explicitwaitadd.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"UserHeading\"]")));

		driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]")).sendKeys("Admin A");
		driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]")).sendKeys("LuisPablo");
		driver.findElement(By.id("systemUser_status")).click();
		driver.findElement(By.xpath("//*[@id=\"systemUser_status\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"systemUser_password\"]")).sendKeys("luis1234");
		driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"]")).sendKeys("luis1234");
		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();

		WebDriverWait explicitwaitsearch = new WebDriverWait(driver, 5);
		explicitwaitsearch.until(ExpectedConditions.presenceOfElementLocated(By.id("searchBtn")));

		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("LuisPablo");
		driver.findElement(By.id("searchBtn")).click();

//SOFT ASSERTION - Validate Login Successfully

		boolean isDisplayed2 = driver.findElement(By.xpath("//a[contains(@href,'saveSystem')]")).isDisplayed();

//		String userName = driver.findElement(By.id("searchSystemUser_userName")).getText();

		softassert.assertTrue(isDisplayed2, "isDisplayed filter by Username");
		if (isDisplayed2 = true) {
			Reporter.log("Usuario encontrado");

		}
		boolean isDisable = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[5]")).isDisplayed();

		softassert.assertTrue(isDisable, "Usuario deshabilitado encontrado");

		softassert.assertAll();

		driver.close();
	}

	@Test
	public void tc006() {

// Reglas antes de empezar el desarrollo

//		- entender el script o test case
//		- Correr la prueba manual
//		- Autonomo?
//		- Obtener objetos involucrados
//		- Automatizar!

		// Step 1 - Launch browser appp
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

		// Step 2 - Enter username and password
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// Step 3 - Click on login button
		driver.findElement(By.id("btnLogin")).click();

		// Step 4 - Validate you are logged successfully
//		boolean welcomeIsDisplayed = driver.findElement(By.id("welcome")).isDisplayed();
		boolean welcomeIsDisplayed = driver.findElement(By.xpath("//*[@id='welcome']")).isDisplayed();
		Assert.assertTrue(welcomeIsDisplayed);

		driver.close();

	}

	@Test
	public void tc007() {

		// Step 1 - Launch browser app
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

		// Step 2 - Enter valid Username and invalid password
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("passwordI1233");

		// Step 3 - Click on login button
		driver.findElement(By.id("btnLogin")).click();

//		Step 4 - Validate message invalid password
//				boolean welcomeIsDisplayed = driver.findElement(By.id("welcome")).isDisplayed();
		String actualInvalidMessage = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		Assert.assertEquals(actualInvalidMessage, "Invalid credentials");

		driver.close();

	}

	@Test
	public void tc008() {
		// Step 1 - Launch browser app
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

		// Step 2 - Enter valid Username and invalid password
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("passwordI1233");

		// Step 3 - Click on login button
		driver.findElement(By.id("btnLogin")).click();

//				Step 4 - Validate message invalid password
//						boolean welcomeIsDisplayed = driver.findElement(By.id("welcome")).isDisplayed();
		String actualInvalidMessage = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
//		Assert.assertEquals(actualInvalidMessage, "Invalid credentials");

		SoftAssert softAssert = new SoftAssert();

		softAssert.assertEquals(actualInvalidMessage, "Invalid credential2");

		driver.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();

		boolean isDesplayedResetButton = driver.findElement(By.xpath("//*[@id=\"btnSearchValues\"]")).isDisplayed();
		Assert.assertFalse(isDesplayedResetButton);

//		isDesplayedResetButton=false;

		driver.close();

	}

	@AfterTest
	public void afterTest() {
	}

}
