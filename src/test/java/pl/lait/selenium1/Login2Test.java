

// praca domowa
//zrobic do konca i commita   na gita !




package pl.lait.selenium1;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObjects.LoginPage;
import pl.lait.pageObjects.Reservation2Page;
import pl.lait.pageObjects.ReservationPage;
@Ignore
public class Login2Test {

	WebDriver driver = null;
	
	@Before
	public void openPage() {    //  nowa stronę otwieramy
		driver = Init.getDriver();  // juz mamy Firefoxa. ile razy w klasie mamy getDriver tyle razy odpali sie Firefox
		
	} // end openPage
	
	@Test
	public void loginWithPageObject() {
		LoginPage loginPage = new LoginPage();  // LoginPage - typ   loginPage - nazwa zmiennej   i na koncu konstruktor new Loginpage()
		loginPage.goToLoginPage();
		loginPage.loginAs("sirtepek1", "sirtepek");
		
		ReservationPage reservPage = new ReservationPage();
		reservPage.fillTheReservationForm();
		
		Reservation2Page reserv2Page = new Reservation2Page();  // najpierw konstruktor, pozniej stworzony obiekt i na koncu chooseflights
		reserv2Page.chooseFlights();   // <------ najedz myszka na chooseFlights i zobacz komentarz" zawsze klika drugi z kolei" !!!
		
		} // loginWithPageObject
	
	@After
	public void tearDown() {
	 Init.endTest();	
	 
	} // end void tearDown
	
} // end class Login2Test
