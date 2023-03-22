package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.base.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends Utility {
	WebDriver driver;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");

	}

	@When("User enters {string} and {string}")
	public void user_enters_username_and_password(String user, String pass) {
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);

	}

	@When("User print URL of the page")
	public void user_print_url_of_the_page() {
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());

	}

	@When("User print page Title")
	public void user_print_page_title() {
		driver.getTitle();
		System.out.println(driver.getTitle());

	}

	@When("User clicks on login page")
	public void user_clicks_on_login_page() {
		driver.findElement(By.name("login")).click();

	}

	@Then("User verify the error message")
	public void user_verify_the_error_message() {
		// WebElement value = driver.findElement(By.xpath("//*[text()='Find your account
		// and log in.']"));

		// Assert.assertEquals(value.getText(), "Find your account and log in.");
		// System.out.println(value.getText());

	}

}
