package learnArray;

public class LearnArray {

	public static void main(String[] args) {
		negativeArraysize();		
		anonymous();		
		mergeTwoArray();		
	}
	

	//Question 1 :: It throws java.lang.NegativeArraySizeException	
	public static void negativeArraysize() {
		//Negative Declaration
		String[] txt = new String[-2];		
		txt[0] = "Babu";
		txt[1] = "Gopi";
		//System.out.println(txt.length);
		for (int i = 0; i < txt.length; i++) {			
			System.out.println(txt[i]);
		}
	}

	//Question 2
	public static void anonymous(){
		//anonymous
		System.out.println(new int[]{1,2,3,4}.length);				
	}

	//Question 3
	public static void mergeTwoArray(){
		//Merge Two Array
		int[] a = {100,101,102,103};  //initialize first Array
		int[] b = {104,105,106,107};	//initialize second Array

		int count =0;

		int[] c = new int[a.length+b.length]; //Create new Array list for Adding 2 different array.

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			count++;			
		}

		for (int j = 0; j < b.length; j++) {
			c[count++] = b[j];
		}

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}	
	}
	
	//Question 4
	public static void sample(){
		
		
	}




}
