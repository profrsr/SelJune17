package learnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead{

	//@Test(invocationCount=2,invocationTimeOut=10000,threadPoolSize=2)
	//@Test(invocationCount=2,timeOut=1000)
	@Test(expectedExceptions={NoSuchElementException.class})
	public void login() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("Demo");		
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("Test");
		/*driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopinath");
		driver.findElementById("createLeadForm_lastName").sendKeys("Jayakumar");
		driver.findElementByXPath("(//input[@name='submitButton'])").click();*/
		//driver.close();
	}
}











