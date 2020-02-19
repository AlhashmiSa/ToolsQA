package com.StepDefinition;

import com.Pages.FormPage;
import com.Utilities.BasePro;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition extends BasePro {
	
	FormPage form;
	
	@Given("^I have chrome browser running$")
	public void i_have_chrome_browser_running()  {
	   BasePro.Intializer();
	}

	@When("^I go to the website$")
	public void i_go_to_the_website()  {
		
	    driver.get("http://www.toolsqa.com");
	}

	@When("^I hover on the Demo sites$")
	public void i_hover_on_the_Demo_sites()  {
		FormPage form = new FormPage();
		form.Hover();
		
	   
	}

	@When("^I click on the form link$")
	public void i_click_on_the_form_link()  {
		FormPage form = new FormPage();
		form.Form();
	}



}
