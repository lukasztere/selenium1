package pl.lait.selenium1;



import org.junit.Before;
import org.junit.runners.MethodSorters;
import org.junit.*;                     // wszystkie junity wybieramy za pomocą gwiazdki *
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.runners.*;
import org.openqa.selenium.support.ui.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest {
	
	WebDriver driver = null;             // najedz myszka na webdrivera i import.   pusta klasa dla WebDrivera.
	
	@Before								// najedz myszka na Before i import, dodaj import org.junit.Before
	public void openPage() {			// przed kazdym testem chce zeby byla pusta strona
		driver = Init.getDriver();      // klasa Init ma nam zwrócić WebDrivera
	} // end metoda openPage  - metoda z małej litery !!
	
	
	@Ignore								// ignoruj test, pomiń test. Ignorujemy pierwszy test.
	@Test								// najedz myszka na Test i import, dodaj import org.junit.Test
	public void clickOnMenuItems( ) {
			
			Init.sleep(2);
	        driver.findElement(By.linkText("SIGN-ON")).click();; // po czym szukamy elementu po link texcie  tutaj  i KLIK !(By. link text)       //////{{{ inne:xpath - radio butonny, linktext -  a hrefy, id - w html
	        Init.sleep(1);
	        driver.findElement(By.linkText("REGISTER")).click();; // po czym szukamy elementu po link texcie  tutaj  i KLIK !(By. link text)       //////{{{ inne:xpath - radio butonny, linktext -  a hrefy, id - w html
	        Init.sleep(1);
	        driver.findElement(By.linkText("SUPPORT")).click();; // po czym szukamy elementu po link texcie  tutaj  i KLIK !(By. link text)       //////{{{ inne:xpath - radio butonny, linktext -  a hrefy, id - w html
	        Init.sleep(1);
	        driver.findElement(By.linkText("CONTACT")).click();; // po czym szukamy elementu po link texcie  tutaj  i KLIK !(By. link text)       //////{{{ inne:xpath - radio butonny, linktext -  a hrefy, id - w html
	        Init.sleep(1);
	        driver.findElement(By.linkText("SIGN-ON")).click();; // po czym szukamy elementu po link texcie  tutaj  i KLIK !(By. link text)       //////{{{ inne:xpath - radio butonny, linktext -  a hrefy, id - w html
	        Init.sleep(1);
	        driver.findElement(By.name("userName")).sendKeys("sirtepek1");   // znalezc element i wysylam "string" ktory mam wpisac w polu.
	        driver.findElement(By.name("password")).sendKeys("sirtepek"); //
	        Init.sleep(3);
	        driver.findElement(By.name("login")).click();   // submit albo click tez działa
	        driver.findElement(By.linkText("SIGN-OFF")).click();
	        Init.sleep(1); 
		
	} // end metoda clickOnMenuItems
	 
	// rezerwacja lotów stronka, testujemy
	@Test 
	public void reservation( ) {
		  driver.findElement(By.linkText("SIGN-ON")).click();; // po czym szukamy elementu po link texcie  tutaj  i KLIK !(By. link text)       //////{{{ inne:xpath - radio butonny, linktext -  a hrefy, id - w html
	      driver.findElement(By.name("userName")).sendKeys("sirtepek1");   // znalezc element i wysylam "string" ktory mam wpisac w polu.
	      driver.findElement(By.name("password")).sendKeys("sirtepek"); //
	      driver.findElement(By.name("login")).submit();   // submit albo click tez działa
	      driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/"
				+ "tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table"
				+ "/tbody/tr[2]/td[2]/b/font/input[2]")).click();  // radio buttony - xpathami dajemy
		
		Select passCount = new Select(driver.findElement(By.name("passCount")));
		passCount.selectByValue("4");
		Select fromPort = new Select(driver.findElement(By.name("fromPort"))); //f12 chrome zaznaczamy acapulco name"fromPort"
		fromPort.selectByValue("Frankfurt");
		Select airline = new Select(driver.findElement(By.name("airline")));
		airline.selectByVisibleText("Pangea Airlines");
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/"
				+ "td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click(); //continue radio button
		
		
		
	} // end void metoda reservation
	
	
	
	
	@After
	public void tearDown ( ) {          // wygaszanie
	Init.sleep(2);
	} // end void tearDown - wygaszanie
	
	
} // end class LoginTest
