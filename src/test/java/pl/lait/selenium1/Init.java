package pl.lait.selenium1;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.graph.ElementOrder.Type;

public class Init {

	static WebDriver driver = null;   // Web driver - klasa z dużej litery !
	
	public static WebDriver getDriver() {  // // getDriver  - metoda z małej litery
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver\\geckodriver.exe"); //gdzie jest Firefox? tutaj !
        DesiredCapabilities cap = DesiredCapabilities.firefox();  // dowolny Firefox
        if (driver == null) {
        	   driver = new FirefoxDriver(cap); // stwórz nowego Firefoxa za pomocą metody FirefoxDriver
               driver.get("http://newtours.demoaut.com");  // przejdz na tę stronę
               driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS); // 30 sekund  konfigurujemy driver.manage czas czekania 30 s
               driver.manage().window().maximize();
               return driver;
        } else {
        	return driver;
        }
              
           } // end metoda  getDriver 
        	
	public static void endTest() {
		driver.quit();
		driver = null;
	}// end metoda endTest metoda z małej litery !!!
	
	public static void sleep(int seconds) {  //PPM na Thread.sleep and create block,  try and catch
			try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // end catch
		
		} // end main sleep ( int seconds)
	
} // end class Init
