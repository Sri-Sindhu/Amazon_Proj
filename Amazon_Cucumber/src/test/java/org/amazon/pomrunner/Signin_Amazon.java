package org.amazon.pomrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Amazon {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement signin;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement contin;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement submit;

	public Signin_Amazon(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getContin() {
		return contin;
	}
	
	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}


}
