package week3Day1;

import org.junit.Test;

import wrappers.WrapperMethods;

public class LearnExceptionHandling extends WrapperMethods  {
	@Test
	public void learnException(){
		invokeApp("chrome", "https://www.irctc.co.in/eticketing/loginHome.jsf");
		enterById("usernameId1", "Nesa");
		clickById("loginbutton");
		clickByLink("Sign up");
		enterByName("j_password", "Nesa");
	}
	
}
