package Pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import Base.Basic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends Basic {

	public void user_enters_valid_username_and_password() {
		WebElement username = driver.findElement(By.xpath("//input[@id='session_key']"));
		username.sendKeys(prop.getProperty("username"));

		WebElement password = driver.findElement(By.xpath("//input[@id='session_password']"));
		password.sendKeys(prop.getProperty("password"));
		Explicit_Wait_by_Display_Element(username, 10);
	}

	public void user_click_on_sign_in_button() {
		WebElement button = driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']"));
		button.click();

	}

	public void validates_user_navigating_to_the_homepage_or_not() {
		WebElement Validate = driver.findElement(By.xpath("//span[@class=\"display-flex align-items-center\"]"));
		assertTrue(Validate.isDisplayed());
		System.out.println("Successfull");
	}

//Second Scenario code

	public void user_enters_valid_and(String uname, String pass) {
		WebElement username = driver.findElement(By.xpath("//input[@id='session_key']"));
		username.sendKeys(uname);

		WebElement password = driver.findElement(By.xpath("//input[@id='session_password']"));
		password.sendKeys(pass);

		Explicit_Wait_by_Display_Element(username, 10);
	}

	public void user_click_on_sign_in_button1() {
		WebElement button = driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']"));
		button.click();
	}

	public void validates_user_navigating_to_the_homepage_or_not1() {
		WebElement Validate = driver.findElement(By.xpath("//span[@class=\"display-flex align-items-center\"]"));
		assertTrue(Validate.isDisplayed());
		System.out.println("Successfull");
	}

	// Third Scenario steps

	public void user_enters_valids_and(String name, String pass) {
		WebElement username = driver.findElement(By.xpath("//input[@id='session_key']"));
		username.sendKeys(name);

		WebElement password = driver.findElement(By.xpath("//input[@id='session_password']"));
		password.sendKeys(pass);

		Explicit_Wait_by_Display_Element(username, 10);
	}

	public void user_click_on_sign_in_button2() {
		WebElement button = driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']"));
		button.click();
	}

	public void validates_user_navigating_to_the_homepage_or_not2() {
		WebElement Validate = driver.findElement(By.xpath("//span[@class=\"display-flex align-items-center\"]"));
		assertTrue(Validate.isDisplayed());
		System.out.println("Successfull");
	}
}
