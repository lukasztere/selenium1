package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium1.Init;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(name = "userName") // najedz myszka na FindBy i import   // zamiast name może być xpath !!!
	WebElement loginInput;   //  najedz myszka na WebElement i import     jest to skrocony zapis  dostepu do przycisków;
	
	@FindBy(name = "password")
	WebElement passwordInput;  // passwordInput - nazwa zmiennej
	
	@FindBy(name= "login")
	WebElement loginBtn;      // loginBtn - nazwa zmiennej
	
	@FindBy(linkText = "SIGN-ON")
	WebElement signOnLink;    // signOnLink to jest nazwa zmiennej
	
		public LoginPage( ) {  // start konstruktor LoginPage
		driver = Init.getDriver();                 // Init ma naszego WebDriver, on wie gdzie jest nasz Firefox. odwołujemy się do Inita bo jest getDriver i return driver dzieki temu mozemy pozyskać Firefoxa; 
		PageFactory.initElements(driver, this);		//gdzie mamy szukac przycisków? this, czyli tutaj !!  // init elements (WebDriver, Object page)  wybieramy init elements podstawia to co jest juz na stronie
				
		}// end konstruktor LoginPage    // konstruktora stworzylismy bo chcemy stworzuc nowy obiekt.
	  
		
		/**
		 * open login page - click on SIGN-ON link
		 * 
		 */
			public void goToLoginPage () {
				signOnLink.click();
		  	} // end goToLoginPage
			
			/**
			 * 
			 Login user with provided data
			 * @param login
			 * @param password
			 */
			
			public void loginAs(String login, String password) { // metoda realizujaca logowanie 
				loginInput.sendKeys(login);
				passwordInput.sendKeys(password);
				loginBtn.click();
				
			} // end loginAs
} // end class LoginPage;
	