package com.app.step_definitions;

import org.openqa.selenium.WebDriver;

import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HRAppStepDefs {
	
	private WebDriver driver = Driver.getDriver();
	
	@Given("^I am on DeptEmpPage$")
	public void i_am_on_DeptEmpPage() {
		driver.get(ConfigurationReader.getProperty("hrapp.url"));
	}

	@When("^I search for department id (\\d+)$")
	public void i_search_for_department_id(int deptID) {
	    
	}

	@When("^I query database with sql \"([^\"]*)\"$")
	public void i_query_database_with_sql(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^UI data and Database data must match$")
	public void ui_data_and_Database_data_must_match() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
