package examples.personal.StringOperations;

public class CountingVowels {

	private static int count=0;
	
	public int countVowels(String str)
	{
		
		char[] strChar= str.toCharArray();
		
		for(char c : strChar)
		{
			if(c=='a'|| c=='e' || c=='o' || c=='u' || c=='i')
				count++;
		}
		return count;
		
		
	}
	
	public static void main(String args[])
	{
		String str="Swetav kamal";
		
		CountingVowels obj= new CountingVowels();
		obj.countVowels(str);
		System.out.println("The count of vowels is"+count);
	}
	
}
