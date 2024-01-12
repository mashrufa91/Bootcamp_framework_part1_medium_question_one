package com.qa.tn_part_one_Register_Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.tn_part_one_RegisterPage.AccountSuccessPage;
import com.qa.tn_part_one_RegisterPage.HomePage;
import com.qa.tn_part_one_RegisterPage.RegisterPage;
import com.tn.qa.testBase.TestBase;


public class RegisterTest extends TestBase {

	public RegisterTest() throws Exception {
		super();

	}

	public WebDriver driver;
	public HomePage homepage;
	public RegisterPage registerpage;
	public AccountSuccessPage accountsuccesspage;

	@BeforeMethod
	public void setup() {
		driver = initalizeBrowserAndOpenApplication();
		homepage = new HomePage(driver);
		homepage.clickOnMyAccountDropDownMenu();
		registerpage = homepage.selectRegisterOption(); // system will be re-directed to RegisterPage
	}
	
    @Test
	public void verifyingRegisterWithAllFields() throws Exception {
		accountsuccesspage = registerpage.registerPageAllDetails();
		accountsuccesspage= new AccountSuccessPage(driver);
		accountsuccesspage.AccountSuccessMessageDisplayed();
    }
			
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
