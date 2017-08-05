package wrappers;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import readExcel.ReadExcel;

public class LeafTapsWrapper extends WrapperMethods{	
	
/*	@Parameters({"browser","url","pwd","uName"})
	@BeforeMethod	
	public void logIn(String browser, String URL, String pwd, String uName) throws Exception {
		invokeApp(browser, URL);
		enterById("username", uName);
		enterById("password", pwd);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
	}
	
	@AfterMethod(groups = {"common"})
	public void closeApplication(){
		closeBrowser();
	}*/
	
	@DataProvider(name="fetchData")	
	public static String[][] getData() throws InvalidFormatException, IOException{
		ReadExcel rd = new ReadExcel();
		return rd.readExcel("CreateLead");
	}
	
	
}










