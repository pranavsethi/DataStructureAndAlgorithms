package examples.personal.sorting;

public class HeapSort {

	static int max=11;
	
	static int[] sortArray= new int[10];
	public static void main(String args[])
	{
		for(int i = 1;i< max;i++)
		{
			sortArray[i]= (int) (Math.random()*100);
			sortArray[0]++;
			
			int index=i;
			
			while(sortArray[index/2]<sortArray[index] && (index/2)!=0 )
			{
				int temp=sortArray[index/2];
				sortArray[index/2]=sortArray[index];
				sortArray[index/2]=temp;
				
				index =index/2;
				
			}
		}
	}
	
	
}
