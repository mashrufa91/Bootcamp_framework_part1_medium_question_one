package com.qa.tn_part_one_RegisterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.tn_part1_util.Util;


public class RegisterPage {
public WebDriver driver;
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;

	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-telephone")
	private WebElement telehoneField;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(id = "input-confirm")
	private WebElement confirmPasswordField;
	
	@FindBy(name = "agree")
	private WebElement privacyPolicyCheckBox;
	
	@FindBy(css = "input.btn.btn-primary")
	private WebElement continueButton;
	
	@FindBy(xpath = "//input[@name = 'newsletter' and @value = '1']")
	private WebElement newsLetterRadioButton;
	

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterFirstName(String firstnametext) {
		firstNameField.sendKeys(firstnametext);
	}
	
	public void enterLastName(String lastnametext) {
		lastNameField.sendKeys(lastnametext);
	}
	
	public void enterEmail(String emailtext) {
		emailField.sendKeys(emailtext);
	}
	
	public void enterTelephone(String telephonetext) {
		telehoneField.sendKeys(telephonetext);
	}
	
	public void enterPassword(String passwordtext) {
		passwordField.sendKeys(passwordtext);
	}
	
	public void enterConfirmPassword(String confirmpasswordtext) {
		confirmPasswordField.sendKeys(confirmpasswordtext);
	}
	
	public void clickOnNewsLetterYesOptionRadioButton() {
		newsLetterRadioButton.click();
	}
	
	public void clickOnPrivacyPolicyCheckBox() {
		privacyPolicyCheckBox.click();
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	
	
	public AccountSuccessPage registerPageAllDetails() {
		firstNameField.sendKeys("Mashrufa");
		lastNameField.sendKeys("Shanjia");
		emailField.sendKeys(Util.emailWithDateTimeStamp());
		telehoneField.sendKeys("5784855554");
		passwordField.sendKeys("Mashrufa@123");
		confirmPasswordField.sendKeys("Mashrufa@123");
		newsLetterRadioButton.click();
		privacyPolicyCheckBox.click();
		continueButton.click();
		return new AccountSuccessPage(driver);
	}

	}


	

