package examples.personal.sorting;



public class MergeSort {
	
	
	
	/** 
	 * This method will partition the array into halves till you have just one element..
	 * @param arr
	 */
	public int[] partition(int[] arr)
	{
		
		//Create a Base condition so that for the last element you return the element..
		if(arr.length <= 1)
			return arr;
		
		
		//Calculate the midpoint of the array..
		int midpoint = arr.length/2;
		
		
		//Create two arrays which will contain the left and right elements after you partition the array in two halves..
		int[] left = new int[midpoint]; // The length of Left array will be half of the array
		int[] right;
		
		// The right array length will depend upon whether the array has odd elements or even
		if(arr.length %2 ==0)
			right= new int[midpoint];  // If array has even elements half in left and half and half in right.. for eg. 8 --> 4 & 4
		else
			right=new int[midpoint+1];  // Else right will have one more element ..9 left = 9/2 --> left =4 and right --> 4+1=5
		
		
		
		// Once we have left and right array we need to push elements into left and right arrays..
		for(int i =0 ;i<midpoint;i++)
		{
			left[i]=arr[i];
		}
		
		
		//Right array will have elements from mid to end so we need to assign an extra variable .
		//we need to put elements from half of main array into array from start
		int x=0;
		for(int j=midpoint;j<arr.length;j++)
		{
			right[x]=arr[j];
			x++;
		}
		
		
		
		// Keep on passing the array till there is just one element in array.. Recursive partition..
		left=partition(left);
		right=partition(right);
	
		
		//Create the result array with the same element as input array and call the merge method 
		//so that all the left and right elements are merged after comparing it and after they are partitioned 
		
		int[] result=new int[arr.length];
		
		//Calling merge method..
		return result=merge(left,right);
		
		
	}
	
	
	
	
	
	public int[] merge(int[] left, int[] right)
	{
		
		
		// Create a result array with the length of the sum of left and right array..
		int lenResult= left.length+right.length;
		int[] result= new int[lenResult];
		
		//Declare certain variables such as left Index, right Index and result Index and initialize them all with 0..
		int IndexL=0;
		int IndexR=0;
		int IndexRes=0;
		
		
		
		//We need to keep looping if either left or right array has element.. i.e  IndexL < left.length or IndexR < right.length
		while(IndexL < left.length || IndexR < right.length )
		{
			
			//First condition if both of them has elements..
			if(IndexL < left.length && IndexR < right.length)
			{
				// If left element is less than Right.. put left element in result array and increase index of left and result
				if(left[IndexL]<=right[IndexR])
				{
					result[IndexRes]=left[IndexL];
					IndexL++;
					IndexRes++;
				}
				
				// If right element in smaller, put right element in Index and increase the index of right and result 
				else
				{
					result[IndexRes]=right[IndexR];
					IndexR++;
					IndexRes++;
				}
				
			}
			
			//Now one of the array, say right has all the elements exhausted but we have elements in
			// left array we need to put all the elements of left to result
			else if(IndexL<left.length)
			{
				result[IndexRes]= left[IndexL];
				IndexL++;
				IndexRes++;
				
			}
			else
			{ 
					result[IndexRes]= right[IndexR];
					IndexR++;
					IndexRes++;
				
			}
		}
		
		//Return the result..
		return result;
		
	}
	
	
	
	
	
	public static void main(String args[])
	{
		int[] arr = {3,5,1,29,15,29,30};
		
		System.out.println("THE INPUT ARRAY IS >>");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" --> ");
		
		MergeSort obj = new MergeSort();
		int[] a =obj.partition(arr);
		
		
		System.out.println("\n\nTHE SORTED ARRAY USING MERGE SORT IS..");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" --> ");
	}

}
