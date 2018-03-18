package com.app.step_definitions;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.app.pages.SuiteCRMDashboardPage;
import com.app.pages.SuiteCRMLoginPage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UITestsStepDefs {
	
	private WebDriver driver = Driver.getDriver();
	SuiteCRMLoginPage loginPage = new SuiteCRMLoginPage();
	SuiteCRMDashboardPage dashboardPage = new SuiteCRMDashboardPage();
	
	@Given("^I logged into suiteCRM$")
	public void i_logged_into_suiteCRM() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get(ConfigurationReader.getProperty("url"));
		loginPage.login(ConfigurationReader.getProperty("username"),
				ConfigurationReader.getProperty("password"));
	}
	
	@Then("^CRM name should be SuiteCRM$")
	public void crm_name_should_be_SuiteCRM() {
	   assertTrue(driver.getTitle().endsWith("SuiteCRM"));
	}

	@Then("^Modules should be displayed$")
	public void modules_should_be_displayed() {
		assertTrue(dashboardPage.sales.isDisplayed());
		assertTrue(dashboardPage.support.isDisplayed());
		assertTrue(dashboardPage.activities.isDisplayed());
		assertTrue(dashboardPage.marketing.isDisplayed());
		assertTrue(dashboardPage.collaboration.isDisplayed());
		assertTrue(dashboardPage.all.isDisplayed());
	}
}
