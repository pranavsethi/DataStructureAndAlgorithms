package examples.personal.sorting;

/**
 * Sorting the array using Bubble Sort..
 * arr= 3,5,1,29,15,30
 * 
 * We need to compare two elements and swap if right < left
 * 
 * First loop
 * 3 < 5 .. 5 > 1 ...3,1,5,29,15,30
 * 29 <15 .. swap 29 and 15 .. 3,1,5,15,29,30
 * 
 * Basically the idea is to loop on the array and push element (out of two) on left and bigger to right so that all the small elements get to the left and bigger number on the right.
 * 
 * @author swetavk
 *
 */

public class BubbleSort {
	
	
	
	public int[] sortArray(int[] arr)
	{
		//Starting the loop through..
		for(int i =0;i<arr.length-1;i++)
		{
			//Starting the loop but 
			for(int j=0;j<arr.length-i-1;j++)
			{
				//Swapping the elements if left number is greater than right..
				if(arr[j]>arr[j+1])
				{
					int tmp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=tmp;
					
				}
			}
				
		}
		
		return arr;
		
	}
	
	
	public static void main(String args[])
	{
		int[] arr = {3,5,1,29,15,29,30};
		
		BubbleSort obj = new BubbleSort();
		int[] arr1 = obj.sortArray(arr);
		
		
		System.out.println("THE SORTED ARRAY IS ..> ");
		for(int i =0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+ "..");
		}
		
	}

}
