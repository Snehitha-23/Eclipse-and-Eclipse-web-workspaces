package com.demo.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:background/product.feature",
		monochrome=true,
		plugin="pretty"
		
		)
public class CalculatorTest{

	
	
	
	
}
