package examples.personal.ArrayOperations;

import java.util.HashSet;

/**
 * Below class has method which will check whether the given array contains repeated integer
 * 
 * We will create a Hashset and keep on checking integer in Hashset. If data is not in Hashset, so that It could be checked next time
 * 
 * @author swetavk
 *
 */
public class CheckIfIntExists {
	
	
	
	
	HashSet<Integer> hs = new HashSet<>();
	
	public boolean findIfrepeats(int[] arr)
	{
	   for(int i =0;i<arr.length;i++)
	   {
		   if(hs.contains(arr[i]))
		   return true;
		   
		   hs.add(arr[i]);
	   }
	   
	return false;
	   
	}
	
	
	public static void main(String args[])
	{
		int[] arr= {1,2,4,6,0,7};
		
		CheckIfIntExists obj = new CheckIfIntExists();
		
		if(obj.findIfrepeats(arr)== true)
			System.out.println("THIS ARRAY CONTAINS REPEATED INTEGER");
		else
			System.out.println("THIS ARRAY DOES NOT CONTAIN REPEATED INTEGER");
	}

}
