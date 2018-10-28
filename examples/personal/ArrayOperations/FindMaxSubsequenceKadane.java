package examples.personal.ArrayOperations;

public class FindMaxSubsequenceKadane {
	
	/**
	 * 
	 * Finding the subsequence with max sum
	 * The algorithm used is called Kadane's Algorithm..
	 * 
	 * -2, -3, 4, -1, -2, 1, 5, -3
	 * 
	 * 
	 * 
	 * @param args
	 */
	
	public void findSubseq(int[] arr)
	{
		
		int max_so_far=Integer.MIN_VALUE;
		int max_ending_here=0;
		int start=0;
		int end=0;
		int s=0;
		
		for(int i =0;i<arr.length;i++)
		{
			max_ending_here=max_ending_here+arr[i];
			
			if(max_so_far < max_ending_here)
			{
				max_so_far=max_ending_here;
				start=s;
				end=i;
				
			}
			
			if(max_ending_here < 0)
			{
				max_ending_here=0;
				s=i+1;
			}
		}
		System.out.println("Maximum contiguous sum is.."+max_so_far);
		System.out.println("Starting index.."+start);
		System.out.println("Ending inde"+end);
		
		
	}
	
	
	public static void main(String args[])
	{

	    int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
	    
	    FindMaxSubsequenceKadane obj = new FindMaxSubsequenceKadane();
	    obj.findSubseq(arr);
	}

}
