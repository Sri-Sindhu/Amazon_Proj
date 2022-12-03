package org.amazon.pomrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addto_Cart {

	public WebDriver driver;

	@FindBy(xpath = "(//img[@src='https://images-eu.ssl-images-amazon.com/images/I/51EJirBX6bL._AC._SR360,460.jpg'])[1]")
	private WebElement laptable;

	@FindBy(xpath = "//img[@src='https://m.media-amazon.com/images/I/41BGXoSp9hL._SS36_.jpg']")
	private WebElement colour;

	@FindBy(xpath = "//select[@name='quantity']")
	private WebElement quantity;

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	private WebElement addcart;

	public Addto_Cart(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getLaptable() {
		return laptable;
	}

	public WebElement getColour() {
		return colour;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getAddcart() {
		return addcart;
	}

}
