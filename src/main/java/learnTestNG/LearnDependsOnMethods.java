package learnTestNG;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {

	@Test(enabled=false)
	public void deleteLead() {
		System.out.println("deleteLead");
	}
	@Test
	public void createLead() {
		System.out.println("createLead");
		//throw new RuntimeException("createLead failed");
	}
	@Test
	public void duplicateLead() {
		System.out.println("duplicateLead");
	}
	//PackageName.ClassName.MethodName
	@Test(alwaysRun=true,dependsOnMethods={"learnTestNG.LearnDependsOnMethods.createLead"})
	public void editLead() {
		System.out.println("editLead");
	}
	@Test(dependsOnMethods="createLead")
	public void mergeLead() {
		System.out.println("mergeLead");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
