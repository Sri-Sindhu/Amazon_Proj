package org.amazon.pomrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Laptop4_Product {
	public WebDriver driver;

	@FindBy(xpath = "//img[@src='https://images-eu.ssl-images-amazon.com/images/G/31/img22/dec/pc/sbc/440X460_5.jpg']")
	private WebElement laptoptable;

		public Laptop4_Product(WebDriver driver2) {
			
			this.driver = driver2;
			PageFactory.initElements(driver2, this);
		}

		
		public WebElement getLaptoptable() {
			return laptoptable;
		}

	
}
