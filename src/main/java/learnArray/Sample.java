package learnArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Sample {
	
	//@Test
	public void descendingOrder(){				
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(2);
		ls.add(6);
		ls.add(3);
		ls.add(8);
		ls.add(1);
		Collections.sort(ls);
		System.out.println(ls);		
	}
	
	//@Test
	public void reverWord() {		
		String txt = "Hello World";		
		String[] x = txt.split(" ");
		for (int i = x.length-1; i >=0 ; i--) {
			System.out.print(x[i]+" ");
		}
		System.out.println("");
	}
	
	@Test
	public void nextChar(){
		String given = "A1B2C3";
		char[]  ch = given.toCharArray();		
		for (char c : ch) {			
			int val =(int) c;
			System.out.print(((char) (val+1)));
		}		
		System.out.println("");
	}
	
	//@Test
	public void subString(){
		
	}
}
