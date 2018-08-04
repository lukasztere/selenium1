package pl.lait.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class App{
	
	static WebDriver driver;

	  public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        
	        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver\\geckodriver.exe");
	        
	        DesiredCapabilities cap = DesiredCapabilities.firefox();  // dowolny Firefox
	        
	        driver = new FirefoxDriver(cap);
	        driver.get("http://newtours.demoaut.com");  // przejdz na tę stronę
	        sleep(2);
	        driver.findElement(By.linkText("SIGN-ON")).click();; // po czym szukamy elementu po link texcie  tutaj  i KLIK !(By. link text)       //////{{{ inne:xpath - radio butonny, linktext -  a hrefy, id - w html
	        sleep(3);
	        driver.findElement(By.name("userName")).sendKeys("sirtepek1");   // znalezc element i wysylam "string" ktory mam wpisac w polu.
	        driver.findElement(By.name("password")).sendKeys("sirtepek");
	        sleep(3);
	        driver.findElement(By.name("login")).submit();   // submit albo click tez działa
	        sleep(4);
	        driver.quit();  // zamknij Firefoxa jak skonczysz.
	        
	    } // end main
	  		public static void sleep(int seconds) {  //PPM na Thread.sleep and create block,  try and catch
	  			try {
					Thread.sleep(seconds * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	  			
	  		} // end main sleep ( int seconds)
} // end class
