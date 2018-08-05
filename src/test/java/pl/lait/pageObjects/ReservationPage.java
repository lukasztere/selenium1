package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.lait.selenium1.Init;

public class ReservationPage {

	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")
	WebElement oneWay;
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")
	WebElement roundTripRadio;
	
	@FindBy(name = "passCount")
	WebElement passCountSelect;
	
	@FindBy(name = "fromPort")
	WebElement fromPortSelect;
	
	@FindBy(name = "fromMonth")
	WebElement fromMonthSelect;
	
	@FindBy(name = "fromDay")
	WebElement fromDaySelect;
	
	@FindBy(name = "toPort")
	WebElement toPortSelect;
	
	@FindBy(name = "toMonth")
	WebElement toMonthSelect;
	
	@FindBy(name = "toDay")
	WebElement toDaySelect;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr/td[2]/table"  // sciezka xpath - economy class radio button
			+ "/tbody/tr[4]/td/table/tbody/tr/td[2]/table/"
			+ "tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input")
	WebElement economyClassRadio;  // radio button Economy Class
	
	@FindBy(name = "airline")
	WebElement airlineSelect;
	
	@FindBy(name = "findFlights")
	WebElement findFlightsBtn;            // komplet guzików na stronie Reservation. teraz projektujemy klikanie po nich:
	
	public ReservationPage() {  	// tworzymy konstruktora 
		driver = Init.getDriver();
		PageFactory.initElements(driver, this);    // ostatnia pozycja z listy .initElemnets WebDriver, Objects
		
	} // end konstruktor
	
	public void fillTheReservationForm() {  
		System.out.println("---------------- przed ----------------------");
		oneWay.click();   // wybieramy Round Trip lub One way. tutaj Round Trip.
		System.out.println("---------------- po ----------------------");
		Init.sleep(3);
		Select passCount = new Select(passCountSelect) ; // dlaczego tutaj musialem importować Selecta?
		passCount.selectByVisibleText("2");		
		
		Select fromPort = new Select(fromPortSelect);
		fromPort.selectByVisibleText("London");
		Select fromMonth = new Select(fromMonthSelect);
		fromMonth.selectByVisibleText("August");
		Select fromDay = new Select(fromDaySelect);
		fromDay.selectByValue("6");
		
	
		Select toPort = new Select(toPortSelect);
		toPort.selectByVisibleText("Paris");
		Select toMonth = new Select(toMonthSelect);
		toMonth.selectByVisibleText("August");
		Select tomDay = new Select(toDaySelect);
		tomDay.selectByValue("6");
		
		economyClassRadio.click();
		Select airline = new Select(airlineSelect);
		airline.selectByVisibleText("Blue Skies Airlines");
		
		findFlightsBtn.click();
		
	} // end fillTheReservationForm
} // end class ReservationPage
