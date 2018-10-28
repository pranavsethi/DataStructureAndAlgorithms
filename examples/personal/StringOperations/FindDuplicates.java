package examples.personal.StringOperations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FindDuplicates {

	HashMap<Character,Integer> hm= new HashMap<>();
	public void findDuplicates(String str)
	{
		char[] charset = str.toCharArray();
		
		for(int i =0; i<charset.length;i++)
		{
			if(hm.containsKey(charset[i]))
			{
				hm.put(charset[i], hm.get(charset[i])+1);
			}
			else
				hm.put(charset[i],1);
		}
		
		
		
		Set<Character> charset1= hm.keySet();
		
		for(Character c: charset1)
		{
			if(hm.get(c)>1)
				System.out.println(c +":" + hm.get(c));
		}
			
		
	}
	
	
	
	
	public static void main(String args[])
	{
		String str="indian";
		
		FindDuplicates obj = new FindDuplicates();
		obj.findDuplicates(str);
	}
	
}
