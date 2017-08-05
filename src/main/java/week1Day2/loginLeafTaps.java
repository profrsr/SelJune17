package week1Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginLeafTaps {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//Syntax
		//ClassName obj= new ClassName();
	//	ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps");
		
		//Implicit Wait
		
/*		Options opt = driver.manage();
		
		Timeouts time =  opt.timeouts();
		
		time.implicitlyWait(30, TimeUnit.SECONDS);*/
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
//		driver.findElements
		
//		driver.findElement
		
		//Maximize
		driver.manage().window().maximize();
		
		//Enter the UserName
		driver.findElementById("username").sendKeys("DemoSalesManager",Keys.TAB);
		
		Thread.sleep(10000);
		
		//Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		
		Thread.sleep(10000);
		
		//Click LogOut
		driver.findElementByClassName("decorativeSubmit").click();
		

	}

}








