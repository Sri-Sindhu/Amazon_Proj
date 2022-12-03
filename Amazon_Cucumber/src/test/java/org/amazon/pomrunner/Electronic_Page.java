package org.amazon.pomrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronic_Page {
	
	public WebDriver driver;

	@FindBy(xpath = "//a[@href='/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics']")
	private WebElement electron;

	@FindBy(xpath = "//img[@src='https://m.media-amazon.com/images/G/31/img21/CEPC/Electronics/Revamp/SBC/xcm_banners_06_sbc_v1_564x564_in-en._CB657839316_.jpg']")
	private WebElement image;

	public Electronic_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	
	public WebElement getElectron() {
		return electron;
	}

	public WebElement getImage() {
		return image;
	}



}
