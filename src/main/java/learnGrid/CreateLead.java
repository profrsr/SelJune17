package learnGrid;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CreateLead {

	@Test
	public void createLead() throws Exception{		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.17:4444/wd/hub"), dc);
		
		
				
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");		
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Qeagle");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopinath");
		driver.findElementById("createLeadForm_lastName").sendKeys("Jayakumar");
		driver.findElementByXPath("(//input[@name='submitButton'])").click();
		driver.close();
	}
}











