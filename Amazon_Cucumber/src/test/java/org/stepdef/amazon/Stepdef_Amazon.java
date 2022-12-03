package org.stepdef.amazon;

import org.amazon.Page_Obj_Manager_Class;
import org.amazon.runner.cucumber.Runner_Cucumber;
import org.amazon.testing.Utility_Class;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef_Amazon  extends Utility_Class{
	
	public static WebDriver driver=Runner_Cucumber.driver;
	
	public static Page_Obj_Manager_Class pom= new Page_Obj_Manager_Class(driver);
	

	@Given("user Launch The Url")
	public void user_launch_the_url() {
		get_Url("https://www.amazon.in/");
	}
	
	@When("user Click Signin Page")
	public void user_click_signin_page() {
		move_to_element(driver, pom.getHomepg().getHome());
		move_to_element(driver, pom.getHomepg().getSigninhomepg());
		click_element(driver, pom.getHomepg().getSigninhomepg());
	}
	
	@When("user Enter Id & Password then Submit")
	public void user_enter_id_password_then_submit() {
		sendkeys(pom.getSignin().getSignin(), "sindhujag78@gmail.com");
		click_on_element(pom.getSignin().getContin());
		sendkeys(pom.getSignin().getPassword(), "Sindhu10&");
		click_on_element(pom.getSignin().getSubmit());
	}
	
	@When("user Select The Electronic Product & Choose The Computer Accessories")
	public void user_select_the_electronic_product_choose_the_computer_accessories() {
		click_on_element(pom.getElectronic().getElectron());
		jsscroll(driver, pom.getElectronic().getImage());
		jsclick(driver, pom.getElectronic().getImage());
	}
	
	@When("user Select Any product of Computer Accessories")
	public void user_select_any_product_of_computer_accessories() {
		jsscroll(driver, pom.getLappurchase().getLaptoptable());
		jsclick(driver, pom.getLappurchase().getLaptoptable());
	}
	
	@When("user Select The Lap Top Table")
	public void user_select_the_lap_top_table() throws InterruptedException {
		
	}
	
	@When("user Able To Change The Colour Of The Product")
	public void user_able_to_change_the_colour_of_the_product() throws InterruptedException {
		
	}
	
	@When("user Able To Change The Quantity Of The Product")
	public void user_able_to_change_the_quantity_of_the_product() {
	}
	
	@Then("user Click On Add to Cart Btn")
	public void user_click_on_add_to_cart_btn() {

	}

	
}
