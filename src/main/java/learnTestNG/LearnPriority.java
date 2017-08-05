package learnTestNG;

import org.testng.annotations.Test;

public class LearnPriority {

	@Test(priority=2)
	public void createLead() {
		System.out.println("createLead");
	}
	@Test(priority=-7)
	public void editLead() {
		System.out.println("editLead");
	}
	@Test(priority=1)
	public void mergeLead() {
		System.out.println("mergeLead");
	}
	@Test(priority=-99)
	public void deleteLead() {
		System.out.println("deleteLead");
	}
	@Test
	public void duplicateLead() {
		System.out.println("duplicateLead");
	}
	
}
