package Baseclass;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baseclass {
	
	
	public static WebDriver driver;
	public static void initialization(String Browsername) {
		if(Browsername.equals("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","C://Users//robin//OneDrive//Documents//chromium//chromedriver_win32//chromedriver.exe");	   
			   driver = new ChromeDriver();	
		}
		if(Browsername.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver","C://Users//robin//OneDrive//Documents//msedgedriver.exe");
			 driver = new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://member.lazada.com.ph/user/register?spm=a2o4l.home.header.d6.239eca18BS6t\r\n"
				+ "ch :");
	}
	

}
