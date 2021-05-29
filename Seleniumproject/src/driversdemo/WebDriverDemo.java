package driversdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\web drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https:\\www.amazon.in");
		  driver=new FirefoxDriver();
		  driver.get("https:\\www.myntra.in");
	}

}
