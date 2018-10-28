package examples.personal.StringOperations;

public class MergingTwoString {

	
	String merged_String="";
	
	public String MergeAlternateString(String str1, String str2)
	{
		char[] strChar1=str1.toCharArray();
		char[] strChar2=str2.toCharArray();
		
		
		if(strChar1.length > strChar2.length)
		{
			int x=0;
			for(int i =0;i<strChar2.length;i++)
			{
				merged_String=merged_String+strChar1[i]+strChar2[i];
				x++;
			}
			
			while(x<strChar1.length)
			{
				merged_String=merged_String+strChar1[x];
				x++;
			}
		}
		else
		{
				int y=0;
				for(int i =0;i<strChar1.length;i++)
				{
					merged_String=merged_String+strChar1[i]+strChar2[i];
					y++;
				}
				
				while(y<strChar2.length)
				{
					merged_String=merged_String+strChar2[y];
					y++;
				}
		}
		return merged_String;
		
	}
	
	
	
	
	public static void main(String args[])
	{
		String str1 ="abc";
		String str2="efgdLMN";
		
		MergingTwoString obj = new MergingTwoString();
		String a =obj.MergeAlternateString(str1,str2);
		System.out.println(a);
	}
}
