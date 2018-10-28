package examples.personal.ArrayOperations;

public class ReversingAnArray {
	
	// 1 2 3 4 5 
	public void ReverseArray(int[] arr)
	{
		
		for(int i =0 ;i<arr.length/2;i++)
			{
				System.out.println("AA"+arr[i]+"..."+arr[arr.length-i-1]);
				int tmp =arr[i];
				arr[i]=arr[arr.length-i-1];
				arr[arr.length-i-1]=tmp;
			}
	
		System.out.println("The Reversed Array is...");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" --> ");
		}
	
		
	}
	
	
	public static void main(String args[])
	{
		int[] arr= {1,2,3,4,5,6};
		ReversingAnArray obj= new ReversingAnArray();
		obj.ReverseArray(arr);		
		
	}

}
