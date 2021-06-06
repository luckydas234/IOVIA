package StepDefination;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination{

	WebDriver driver;

	@Given("^user is already on  Login Page$")
	public void user_already_on_login_page(String Platform) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sulagnajee/Downloads/chromedriver");
		
		if(Platform.equalsIgnoreCase("Mobile"))
		{
		Map<String, String> mobileEmulation = new HashMap<>();

		mobileEmulation.put("deviceName", "Nexus 5");

		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

		driver = new ChromeDriver(chromeOptions);
		}
		else {
	 
		 driver.get("https://www.hugoboss.com");
		}
		 
	}

	@When("^title of login page is Free CRM")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^user enters Username and Password")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
}