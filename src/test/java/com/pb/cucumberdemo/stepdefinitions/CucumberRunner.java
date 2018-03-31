package com.pb.cucumberdemo.stepdefinitions;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber"},
		features = {"src/test/resources/features"},
		monochrome = true,
		tags = {"@test123"}		
	 )
 
public class CucumberRunner 
{
	

}
