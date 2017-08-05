package week2Day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHand {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://legacy.crystalcruises.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		
		Set<String> allWin = driver.getWindowHandles();
		
		System.out.println(allWin.size());		
		System.out.println(driver.getTitle());		
		System.out.println(driver.getCurrentUrl());
		
		for (String eachWin : allWin) {
			driver.switchTo().window(eachWin);
		}
		
		System.out.println(driver.getTitle());		
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.quit();
		//driver.switchTo().window(nameOrHandle)

	
		
		
		
		
		
		
		
		
		
		

	}

}
