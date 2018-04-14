package com.pb.cucumberdemo.stepdefinitions;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import com.pb.cucumberdemo.base.BaseFunctions;
import com.pb.cucumberdemo.pageobjs.Home_Objs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeaturesSD extends BaseFunctions
{

	
	BaseFunctions base = new BaseFunctions();
	Home_Objs homeObj = new Home_Objs();
	
	
	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage()
	{
		driver.get("http://automationpractice.com/index.php");
	}

	/**
	 * @author TGoswami
	 * @date: 15 April 2017
	 * @description: This will fill any textbox
	 */
	
	@When("^I fill in \"([^\"]*)\" with \"([^\"]*)\" on \"([^\\\"]*)\" page$")
	public void i_fill_in_with_on_page(String elementName, String elementValue, String page) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException
	{
		String locator = base.getLocator(page, elementName);	
		base.getElementType(locator).sendKeys(elementValue);
	}
	
	/**
	 * @author TGoswami
	 * @date: 15 April 2017
	 * @description: This will click button
	 */
	@Then("^I press \"([^\"]*)\" on \"([^\"]*)\" page$")
	public void i_press_button_on_page(String elementName, String page) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException
	{
		String locator = base.getLocator(page, elementName);	
		base.getElementType(locator).click();
	}
}
