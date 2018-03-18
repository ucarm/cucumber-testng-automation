package com.app.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.app.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void setUp(Scenario scenario) {
		WebDriver driver = Driver.getDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		Driver.closeDriver();
	}
	
}	
