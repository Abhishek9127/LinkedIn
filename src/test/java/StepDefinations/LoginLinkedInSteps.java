package StepDefinations;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import Base.Basic;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLinkedInSteps extends Basic {

	LoginPage object = new LoginPage();

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		object.user_enters_valid_username_and_password();
	}

	@And("User click on SignIn button")
	public void user_click_on_sign_in_button() {
		object.user_click_on_sign_in_button();
	}

	@Then("Validates user navigating to the homepage or not")
	public void validates_user_navigating_to_the_homepage_or_not() {
		object.validates_user_navigating_to_the_homepage_or_not();
	}

	@Before
	public void LaunchBrowser() {

		String Browsername = prop.getProperty("Browser");
		if (Browsername.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);

		}

		else if (Browsername.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--incognito");
			driver = new FirefoxDriver(options);

		} else if (Browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--incognito");
			options.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(options);

		}

		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
	}

	@After
	public void Last(Scenario p) {
		if (p.isFailed()) {
			Screenshot();
		}
		driver.quit();
	}
	
// Second Scenario steps
	
	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String uname, String pass) {
	   object.user_enters_valid_and(uname, pass);
	}

	@And("user click on signIn button1")
	public void user_click_on_sign_in_button1() {
	   object.user_click_on_sign_in_button1();
	}

	@Then("Validates user navigating to the homepage or not1")
	public void validates_user_navigating_to_the_homepage_or_not1() {
	  object.validates_user_navigating_to_the_homepage_or_not1();
	}

// Third Scenario steps
	
	@When("user enters valids {string} and {string}")
	public void user_enters_valids_and(String name, String pass) {
	  object.user_enters_valids_and(name, pass);
	}

	@And("user click on signIn button2")
	public void user_click_on_sign_in_button2() {
	object.user_click_on_sign_in_button2();
	}

	@Then("Validates user navigating to the homepage or not2")
	public void validates_user_navigating_to_the_homepage_or_not2() {
	object.validates_user_navigating_to_the_homepage_or_not2();
	}


	
	
}
