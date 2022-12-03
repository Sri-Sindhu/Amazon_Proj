package org.amazon.runner.cucumber;

import org.amazon.testing.Utility_Class;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { ".//FeatureFiles" }, 
		glue = "org.stepdef.amazon", 
				plugin = {"json:Reports_Amazon/reportamazon.json",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						    "html:Reports_Amazon/reportamazon.html"},
			
		
		monochrome = true,
		dryRun = false,
		publish = true)

public class Runner_Cucumber {

	  public static WebDriver driver;
	  
	  @BeforeClass
	  public static void set_Up() {
		  driver=Utility_Class.browser_Lanuch("chrome");
		  Utility_Class.get_Url("https://www.amazon.in/");
	  }
	  @AfterClass
	  
	   public static void tear_Down() {
       driver.close();		
	}
	 

}
