package learnReport;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LearnReport {
	
	public static void main(String[] args) {
		
		
		//Before Suite - startResult
		ExtentReports extent = new ExtentReports("./report/result.html", false);
		extent.loadConfig(new File("./src/main/resources/extent-config.xml"));
	
		
		//BeforeMethod		
		ExtentTest test = extent.startTest("MergeLead", "Merging  Lead in LeafTaps");
		test.assignAuthor("Nesa");
		test.assignCategory("smoke");
		
		
		
		test.log(LogStatus.PASS, "enterById", "Entered Company Name successfully"
				+test.addScreenCapture("./../snaps/snap0.jpg"));
		
		test.log(LogStatus.FAIL, "enterById", "First Name  unable to enter"
				+test.addScreenCapture("./../snaps/snap1.jpg"));
		
		test.log(LogStatus.WARNING, "enterByClassName", "Warning"
				+test.addScreenCapture("./../snaps/snap2.jpg"));
		
		test.log(LogStatus.INFO, "verifyById", "Verified Successfully"
				+test.addScreenCapture("./../snaps/snap3.jpg"));
		
		
		//AfterMethod
		
		extent.endTest(test);
		
		//AfterSuite
		extent.flush();
		
		
		
	}

}











