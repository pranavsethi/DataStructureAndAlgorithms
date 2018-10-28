package examples.personal.ArrayOperations;

/**
 * 
 * Find the Triplet from the Array whose sum is given number..
 * 
 * Approach : First of all sort the array using sorting algorith (Quick sort or
 * Merge sort would be better) One you have the data sorted start the loop..
 * start traversing through the element keep one pointer at i+1 and other at
 * last..
 * 
 * traverse through till start pointer is less than end-pointer If sum > num...
 * move last element to left If sum <num.. move first element to right
 * 
 * @author swetavk
 *
 */

public class FindTheTripletToSum {

	// Got the sorted array .. Now use the above algorithm to find the triplet
	public boolean findTriplet(int[] arr, int sum) {

	//	System.out.println("WE NEED TO SORT THE ARRAY.. CALLING MERGE SORT");
		
		
		
		for (int i = 0; i < arr.length; i++) {
			int start_pointer = i + 1;
			int end_pointer = arr.length - 1;

			while (start_pointer < end_pointer) {

				if (arr[i] + arr[start_pointer] + arr[end_pointer] == sum) {
					System.out.println(
							"\nFound the triplet.." + arr[i] + ".." + arr[start_pointer] + ".." + arr[end_pointer]);
					return true;
				}

				if ((arr[i] + arr[start_pointer] + arr[end_pointer]) > sum) {

					end_pointer = end_pointer - 1;

				} else
					start_pointer = start_pointer + 1;

			}

		}
		return false;

	}
	
	
	/** Implementing the Merge sort.. The parition operation of Merge sort and then merge operation for Merge sort..
	 * @param arr
	 * @return
	 */
	
	
	public int[] Partition_Operation(int[] arr)
	{
		

		
		
		if(arr.length <= 1)
			return arr;
		
		int midpoint = arr.length/2;
		int[] right;
		int[] left= new int[midpoint];
		
		if(arr.length %2 ==0)
			right=new int[midpoint];
		else
			right= new int[midpoint+1];
		
		for(int i=0;i<midpoint;i++)
			left[i]=arr[i];
		
		
		
		
		int x=0;
		for(int j =midpoint;j<arr.length;j++)
		{
			right[x]=arr[j];
			x++;
		}
			
		left=Partition_Operation(left);
		right=Partition_Operation(right);
		
		int[] result= new int[arr.length];
		result=Merge_Operation(left,right);
		
		return result;
		
		
	}
	
	
	public int[] Merge_Operation(int[] left, int[] right)
	{
		int[] result= new int[left.length+right.length];
		
		int IndexL=0;
		int IndexR=0;
		int IndexRes=0;
		
		while(IndexL<left.length || IndexR<right.length)
		{
			if(IndexL<left.length && IndexR<right.length)
			{
				
				
				if(left[IndexL]<=right[IndexR])
				{
					result[IndexRes]=left[IndexL];
					IndexL++;
					IndexRes++;
				}
			
				else
				{
					result[IndexRes]=right[IndexR];
					IndexR++;
					IndexRes++;
				}
			}
			
			
			else if (IndexL<left.length)
			{
				result[IndexRes]=left[IndexL];
				IndexL++;
				IndexRes++;
			}
			else
			{
				result[IndexRes]=right[IndexR];
				IndexR++;
				IndexRes++;
				
			}
		}
		return result;
	}
	
	


	

	public static void main(String args[]) {
		int[] arr = { 1, 4, 45, 6, 10, 8 };
		int sum = 18;

		FindTheTripletToSum obj = new FindTheTripletToSum();


		int[] sorted_arr= obj.Partition_Operation(arr);
		System.out.print("SORTED ARRAY IS >> ");

		for (int i = 0; i < sorted_arr.length; i++) {
			System.out.print("..." + sorted_arr[i]);
		}

		if (obj.findTriplet(sorted_arr, sum) == false)
			System.out.println("\n The Triplet is not found..");
		
		
		
		

	}

}
