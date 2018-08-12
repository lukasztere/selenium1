package pl.lait.Steps;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import cucumber.api.java.After;   // zamknie sie przegladarka po afterze
import pl.lait.pageObjects.LoginPage;
import pl.lait.selenium1.Init;

public class LoginPageStepDefs {

	WebDriver driver = Init.getDriver(); 
	LoginPage loginPage;
	
	// zmienna obiektowa typu loginPage = null; 
	
	@Given("^I open main page$")
	public void i_open_main_page() throws Throwable {
	    //juz jestem na stronie "main"
	}

	@When("^I click SIGN-ON link$")
	public void i_click_SIGN_ON_link() throws Throwable {
	   loginPage = new LoginPage();
	   loginPage.goToLoginPage();  // nie pokazywalo sie import, bo w innej paczce mialem tą samą naazwę loginPage. wystarczyla zmiana Refector>Rename LoginPageStepsDefs
	  
	}	

	@Then("^I should see login page$")
	public void i_should_see_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	
	}
} // end class LoginPage
