package com.app.step_definitions;

import java.util.List;

import com.app.pages.SuiteCRMDashboardPage;
import com.app.utilities.BrowserUtils;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuOptionsStepDefinitions {
	SuiteCRMDashboardPage dashbboard = new SuiteCRMDashboardPage();

	@When("^I hover over the Collaboration menu$")
	public void i_hover_over_the_Collaboration_menu() {
		BrowserUtils.hover(dashbboard.collaboration);

	}

	@Then("^following menu options should be visible for Collaboration:$")
	public void following_menu_options_should_be_visible_for_Collaboration(List<String> options) {
		// capture list of webelements
		// get their text in a list
		// compare the list with options
	}

}
