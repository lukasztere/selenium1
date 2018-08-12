package pl.lait.Steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}, monochrome = true )  // target - folder monochome - czarnobialy

// tworzymy nowe foldery, ktore musza sie mapowac z nazwa paczki pl.lait.Steps >> tworzymy folder w src>test>resources>pl>lait>Steps  


public class Test {

	
	
	
}  // end class Test
