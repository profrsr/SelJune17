package leafTaps.lead;


import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;

public class CreateLead extends LeafTapsWrapper{

	
	@Test(dataProvider="fetchData")
	public void createLead(String FN,String LN,String CN) throws Exception{		
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",CN);
		enterById("createLeadForm_firstName",FN);
		enterById("createLeadForm_lastName", LN);		
		enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByXpath("//input[@name='submitButton']");		

	}
}
