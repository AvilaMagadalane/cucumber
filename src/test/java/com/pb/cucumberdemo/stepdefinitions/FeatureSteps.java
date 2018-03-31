package com.pb.cucumberdemo.stepdefinitions;

import com.pb.cucumberdemo.base.BaseFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FeatureSteps extends BaseFunctions
{	
	
	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() throws Throwable 
	{
	}

	
	@When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_fill_in_with(String arg1, String arg2) throws Throwable
	{
	
	}
}
