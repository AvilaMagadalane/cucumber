package com.pb.cucumberdemo.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepdefinitions {
	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
	}

	@When("^I fill in \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_fill_in_with(String arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
	}
}
