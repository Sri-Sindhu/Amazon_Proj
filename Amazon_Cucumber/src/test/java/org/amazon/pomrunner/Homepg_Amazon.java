package org.amazon.pomrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepg_Amazon {

	public WebDriver driver;

	@FindBy(xpath = "//span[.='Hello, sign in']")
	private WebElement home;

	@FindBy(xpath = "(//span[.='Sign in'])[1]")
	private WebElement signinhomepg;

	public Homepg_Amazon(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getSigninhomepg() {
		return signinhomepg;
	}

}
