package first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utility.Configreader;

public class root {
    @Test
	public void configure() throws Throwable
	{
    	
    	Configreader con = new Configreader();
    	
	System.setProperty("webdriver.chrome.driver", con.getchromepath());
	WebDriver driver = new ChromeDriver();
	driver.get(con.geturl());
		
		
		
		
	}

}
