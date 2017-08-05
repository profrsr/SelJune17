package regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main (String args[]){

		// Define the pattern
		String pattern = "[0-9]{5}";

		// Compile the pattern
		Pattern p = Pattern.compile(pattern);

		// Get the matcher
		Matcher match = p.matcher("HCL(29192) has 24124 employees");		

		// Confirm the matches
		if (match.find()) {
			//System.out.println(match);
		    System.out.println(match.group());
		}
		
		// if multiple matches
		while (match.find()) {
			//System.out.println(match);
            String group = match.group();
            System.out.println(group);
        }






	}
}


