package week1Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class loginLeafTaps {

	public static void main(String[] args) {
		
		//Launch the Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Syntax
		//ClassName obj= new ClassName();
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("http://perftest.leaftaps.com");
		
		//Maximize
		driver.manage().window().maximize();
		
		//Enter the UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click LogOut
		driver.findElementByClassName("decorativeSubmit").click();
		

	}

}








