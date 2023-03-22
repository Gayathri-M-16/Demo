package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.Utility;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

@SuppressWarnings("deprecation")

public class MyHooks extends Utility {

	@Before
	public void beforeScenario1(Scenario s) {
		System.out.println("Hooks-BeforeScenario1");
		String name = s.getName();
		System.out.println(name);

	}

	@After
	public void afterScenario(Scenario s) {
		TakesScreenshot tk = (TakesScreenshot) driver;
		byte[] fbImage = tk.getScreenshotAs(OutputType.BYTES);
		s.embed(fbImage, "Image/png");

	}

	/*
	 * @Before(order=1) public void beforeScenari() {
	 * System.out.println("Hooks-BeforeScenario1"); }
	 */

	/*
	 * @Before(order=2) public void beforeScenario() {
	 * System.out.println("Hooks-BeforeScenario2"); }
	 */

	/*
	 * @Before("@sanity") public void beforeScenario() {
	 * System.out.println("Before-titlepage"); }
	 * 
	 * @Before("@smoke") public void afterScenario() {
	 * System.out.println("before-url"); }
	 */
	/*
	 * @cucumber.api.java.BeforeStep public void BeforeStep() {
	 * System.out.println("Hooks-@BeforeStep");
	 * 
	 * }
	 * 
	 * @cucumber.api.java.AfterStep public void AfterStep() {
	 * System.out.println("Hooks-@AfterStep");
	 * 
	 * 
	 * }
	 */

}
