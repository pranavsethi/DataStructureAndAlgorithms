package examples.personal.StringOperations;

/** 
 * 
 * Below class has the method which has methods that will take in input as String and will reverse it and returned back the reversed array
 * 
 * 
 * @author swetavk
 *
 */



public class ReversingString {
	
	static String test="";
	
	StringBuilder sb = new StringBuilder();
	
	/**
	 * This method is taking the string converting it to char array
	 * Then start traversing the array from end and keep on adding the char to string
	 * @param str
	 * @return
	 */
	
	public String reverse_string(String str)
	{
		char[] charset=str.toCharArray();
		
		
		for(int i =charset.length-1;i>=0;i--)
		{
			
			test=test+charset[i];
			
		}
		
		return test;
	}
	
	
	
	public static void main(String args[])
	{
		String input_str ="Swetav";
		
		
		
		ReversingString obj = new ReversingString();
		obj.reverse_string(input_str);
		
		
		
		System.out.println("The reversed String is.."+test);
	}

}
