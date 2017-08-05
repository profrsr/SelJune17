package leafTaps.contact;

import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void samp(){
		String txt = "Button";
		char[] x = txt.toCharArray();
		int len = x.length;
		
		for (int i = len-1; i >=0; i--) {
			
			System.out.print(x[i]);
		}
	}

}
