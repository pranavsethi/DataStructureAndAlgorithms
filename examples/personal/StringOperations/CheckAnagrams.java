package examples.personal.StringOperations;

import java.util.Arrays;

public class CheckAnagrams {

	
	public boolean checkAnagram(String str1, String str2)
	{
		char[] str1Char=str1.toCharArray();
		char[] str2Char=str2.toCharArray();
		
		if(str1Char.length != str2Char.length)
			return false;
		
		Arrays.sort(str1Char);
		Arrays.sort(str2Char);
		
		return Arrays.equals(str1Char, str2Char);
	}
	
	
	public static void main(String args[])
	{
		String str1="JAVA";
		String str2="AJAV";
		
		CheckAnagrams obj= new CheckAnagrams();
		
		if((obj.checkAnagram(str1, str2)==true))
				System.out.println("The Two strings are Anagram");
		else
			System.out.println("The Two Strings are not Anagram");
	}
	
}
