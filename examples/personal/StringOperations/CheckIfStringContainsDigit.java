package examples.personal.StringOperations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIfStringContainsDigit {

	
	public void StringChecker(String str)
	{
		Pattern pattern = Pattern.compile(".*[0-9].*");
		Boolean b= pattern.matcher(str).matches();
		System.out.println("PATTERN MATCHER"+b);
	}
	
	
	public static void main(String args[])
	{
		String str = "1234567";
		CheckIfStringContainsDigit obj= new CheckIfStringContainsDigit();
		obj.StringChecker(str);
	}
	
}
