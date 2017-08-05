package learnStatic;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SampleMethods extends RemoteWebDriver{

	static ChromeDriver driver;

	public static void invokeApp(){	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		driver = new ChromeDriver();
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("Demo");
		
	}

	
}
