package regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

	public static void main (String args[]){

		// Define the pattern
		String pattern = "[a-zA-Z0-9._]{1,256}@[a-zA-Z0-9-]{3,16}.[a-zA-Z]{2,5}";

		// Compile the pattern
		Pattern p = Pattern.compile(pattern);

		// Get the matcher
		Matcher match = p.matcher("babu$@tester.com");

		// Confirm the matches
		System.out.println(match.matches());






	}
}


