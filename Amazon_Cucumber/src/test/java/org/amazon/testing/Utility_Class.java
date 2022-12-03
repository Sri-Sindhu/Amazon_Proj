package org.amazon.testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_Class {

	public static WebDriver driver;

	public static WebDriver browser_Lanuch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\Amazon_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\ELCOT\\eclipse-workspace\\Break_Project\\CucumberProject\\Driver\\chromedriver.exe");
			driver = new EdgeDriver();

		}
		return driver;

	}

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click_on_element(WebElement element) {
		element.click();
	}

	public static void sleep(long milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	public static void select_By_Index(WebElement element, int index) {
		Select a = new Select(element);
		a.selectByIndex(index);
	}

	public static void select_By_Value(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void select_By_Visible_Text(WebElement element, String value) {
		Select d = new Select(element);
		d.selectByVisibleText(value);
	}

	public static void get_Url(String url) {
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void move_to_element(WebDriver actions, WebElement element) {
		Actions a = new Actions(actions);
		a.moveToElement(element).build().perform();
	}

	public static void click(WebDriver actions, WebElement element) {
		Actions a = new Actions(actions);
		a.click().build().perform();
	}

	public static void click_element(WebDriver actions, WebElement element) {
		Actions a = new Actions(actions);
		a.click(element).build().perform();
	}

	public static void jsscroll(WebDriver webjs, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) webjs;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	public static void jsclick(WebDriver webjs, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) webjs;
		js.executeScript("arguments[0].click()", element);
	}
	
	public static void select_ByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

}
