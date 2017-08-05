package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;

public class CreateLeadWithDataProvider extends LeafTapsWrapper{

	@Test(dataProvider = "fetchData")
	public void login(String cName, String fName, String lName) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");		
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByXPath("(//input[@name='submitButton'])").click();
		driver.close();
	}
}











