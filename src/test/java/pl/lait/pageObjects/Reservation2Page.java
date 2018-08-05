package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.selenium1.Init;

public class Reservation2Page {
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr["
			+ "4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[9]/td[1]/input")
	WebElement departRadio2;  // radio button z DEPART  drugi z góry   u mnie  4 (ostatni)
	
	@FindBy(xpath= "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody"
			+ "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input")  // pierwszy radio button róznie się od durgiego table 1 i table 2 tylko ! jesli wezmiemy 2 takie same radio buttony np. dwa ostatnie
	WebElement returnRadio2;
	
	@FindBy(name = "reserveFlights")
	WebElement reserveFlightsBtn;
	
	public Reservation2Page( ) {   // metoda 
		driver = Init.getDriver();
				PageFactory.initElements(driver, this);   // this? gdzie? tutaj szukamy.
	
	} // end  Reservation2Page
	
	/**
	 * zawsze klika 2gi z kolei
	 */
	public void chooseFlights() { // metoda realizujaca wybierz loty
		departRadio2.click();
		returnRadio2.click();
		Init.sleep(2);
		reserveFlightsBtn.click();
		Init.sleep(2);
	} // end chooseFlights
} // end class Reservation2Page
