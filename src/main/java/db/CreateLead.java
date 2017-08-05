package db;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.chrome.ChromeDriver;


public class CreateLead {

	public static void main(String[] args) {		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TL");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
		String leadName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(leadName);

		// Compile the pattern
		Pattern p = Pattern.compile("[0-9]{5}");

		// Get the matcher
		Matcher match = p.matcher(leadName);		

		// Set Lead Id
		String leadId  ="";
		
		// Confirm the matches
		if (match.find()) {
			leadId = match.group();
			System.out.println(leadId);
		}

		DbMethods db = new DbMethods();
		db.verifyDBResults(leadId);
		
		// Close Browser
		driver.close();


















	}

}
