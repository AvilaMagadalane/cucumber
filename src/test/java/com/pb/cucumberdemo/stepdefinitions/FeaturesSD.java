package com.pb.cucumberdemo.stepdefinitions;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.pb.cucumberdemo.base.BaseFunctions;
import com.pb.cucumberdemo.pageobjs.Home_Objs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Étantdonnéque;

public class FeaturesSD extends BaseFunctions
{

	
	BaseFunctions base = new BaseFunctions();
	Home_Objs homeObj = new Home_Objs();
	
	
	@Given("^I am on the home page$")
	public void i_am_on_the_homepage()
	{
		driver.get("http://automationpractice.com/index.php");

	}
	
	
	/**
	 * @author TGoswami
	 * @date: 15 April 2018
	 * @description: This will fill any textbox
	 */
	
	@When("^I fill \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_fill_in_with_on_page(String elementName, String elementValue) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException
	{
		String page = base.getCurrentPage();

		String locator = base.getLocator(page, elementName);	
		base.getElementType(locator).sendKeys(elementValue);	
	}
		
	/**
	 * @author TGoswami
	 * @date: 15 April 2017
	 * @modified on 22 June 2018
	 * @description: This will click button
	 */
	@Then("^I click \"([^\"]*)\"$")
	public void i_press_button_on_page(String elementName) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException
	{
		String page = base.getCurrentPage();
		String locator = base.getLocator(page, elementName);	
		base.getElementType(locator).click();
	}
	
	/**
	 * @author TGoswami
	 * @date: 15 April 2018
	 * @modified on 23 July 2018
	 * @description: This will follow link
	 */
	@Then("^(?:I|She|He|User) follow \"([^\"]*)\" link$")
	public void i_follow_on_page(String link) 
	{
		driver.findElement(By.linkText(link)).click();
	}
	
	/**
	 * @author TGoswami
	 * @date: 22 June 2018
	 * @description: This will click button
	 */
	
	@Then("^I should see \"([^\"]*)\" heading$")
	public void i_should_see_heading(String pageHeading) 
	{
	    String heading = driver.findElement(By.tagName("h1")).getText();	    
	    Assert.assertEquals(pageHeading, heading); 
	}
	
	
	/**
	 * @author TGoswami
	 * @date: 23 July 2018
	 * @description: This will assert link present or not
	 */
	@Then("^I( see| do not see) link \"([^\"]*)\"$")
	public void i_should_see_link(String optionalValue, String linkText) {
		
		Boolean expectedValue = false;
		Boolean linkPresent = driver.findElements(By.linkText(linkText)).size() > 0;
		
		if(optionalValue.equals(" do not see"))
			expectedValue = false;
		else if(optionalValue.equals(" see"))
			expectedValue = true;
				
		Assert.assertEquals(linkPresent,expectedValue);
				
	   
	}
	
	/**
	 * @author TGoswami
	 * @throws InterruptedException 
	 * @date: 23 June 2018
	 * @description: This will click button
	 */

	@Then("^I enter following details$")
	public void i_enter_following_details(DataTable table) throws InterruptedException 
	{
		  List<List<String>> data = table.raw();
	      
	      driver.findElement(By.id("customer_firstname")).sendKeys(data.get(0).get(1));
	      driver.findElement(By.id("customer_lastname")).sendKeys(data.get(1).get(1));
	      driver.findElement(By.id("passwd")).sendKeys(data.get(2).get(1));     
	     
	      Select daysDrop = new Select(driver.findElement(By.id("days"))); 
	      daysDrop.selectByValue(data.get(3).get(1)); 
	
	      Select yearDrop = new Select(driver.findElement(By.id("years")));
	      yearDrop.selectByValue(data.get(4).get(1)); 
	}
	
	
	@When("^I fill in \"([^\"]*)\" with:$")
	public void i_fill_in_with(String elementName, String messageText) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException 
	{
		String page = base.getCurrentPage();
		String locator = base.getLocator(page, elementName);	
		base.getElementType(locator).sendKeys(messageText);
	}
	
	@Étantdonnéque("^que je suis sur la page d'accueil$")
	public void je_suis_sur_la_page_d_accueil() 
	{

	}

	@Quand("^je remplis \"([^\"]*)\" avec \"([^\"]*)\"$")
	public void je_remplis_avec(String arg1, String arg2)
	{

	}

	@Alors("^Je clique \"([^\"]*)\"$")
	public void je_clique(String arg1) 
	{

	}
}
