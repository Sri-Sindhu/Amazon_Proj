package org.amazon.testing;

import org.openqa.selenium.WebDriver;
import org.pomclass.amazon.Addto_Cart;
import org.pomclass.amazon.Electronic_Page;
import org.pomclass.amazon.Homepg_Amazon;
import org.pomclass.amazon.Laptop4_Product;
import org.pomclass.amazon.Signin_Amazon;

public class Pageobj_Manager_Amazon {
	
public WebDriver driver;
	
	private Homepg_Amazon homepg;
	
	private Signin_Amazon signin;
	
	private Electronic_Page electronic;
	
	private Laptop4_Product lappurchase;
	
	private Addto_Cart cart;
	
	public  Pageobj_Manager_Amazon(WebDriver driver2) {
		driver= driver2;
	}

	
	public Homepg_Amazon getHomepg() {
		if (homepg==null) {
			homepg= new Homepg_Amazon(driver);
			
		}
		return homepg;
	}

	public Signin_Amazon getSignin() {
		if(signin==null) {
			signin=new Signin_Amazon(driver);
		}
		return signin;
	}

	public Electronic_Page getElectronic() {
		if(electronic==null)
			electronic=new Electronic_Page(driver);
		return electronic;
	}

	public Laptop4_Product getLappurchase() {
		if(lappurchase==null) {
			lappurchase= new Laptop4_Product(driver); 
		}
		return lappurchase;
	}

	public Addto_Cart getCart() {
		if (cart==null) {
			cart = new Addto_Cart(driver);
			
		}
		return cart;
	}



}
