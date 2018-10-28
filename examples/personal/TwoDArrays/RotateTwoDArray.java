package examples.personal.TwoDArrays;

import java.util.Scanner;

public class RotateTwoDArray {

	
	public static int MATRIX_SIZE=4;
	public static int level=0;
	public int last=MATRIX_SIZE-1;
	
	public int totnumOfLevels=MATRIX_SIZE/2;
	
	public void PrintArr(int[][] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]<10)
				System.out.print("["+arr[i][j]+"]"+"    ");
				else if(arr[i][j]<100)
					System.out.print("["+arr[i][j]+"]"+"   ");
				else
					System.out.print("["+arr[i][j]+"]"+"  ");
			}
			System.out.print("\n");
		}
	}
	
	

	
	
	void swap(int[][] array, int row1, int col1, int row2, int col2) {
	    int temp = array[row1][col1];
	    array[row1][col1] = array[row2][col2];
	    array[row2][col2] = temp;
	}
	
	
	
	public int[][] rotateArr(int[][] arr)
	{
		while(level<totnumOfLevels)
		
		{
			for(int i =level; i< last; i++)
			{
				
				swap(arr,level,i,i,last);
				swap(arr,level,i,last,last-i+level);
				swap(arr,level,i,last-i+level,level);

				
			}
			level=level+1;
			last=last-1;
		}
		
		
		
		
		return arr;
		
	}
	

	public static void main(String args[])
	{
		
		int[][] TwoDArr = new int[MATRIX_SIZE][MATRIX_SIZE];
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i = 0;i <TwoDArr.length;i++ )
		{
			for(int j =0 ;j<TwoDArr[i].length;j++)
			{
				TwoDArr[i][j]=sc.nextInt();
			}
		}
		RotateTwoDArray obj= new RotateTwoDArray();
		
		System.out.println("-----The Original Array------\n");
		obj.PrintArr(TwoDArr);
		
		int[][] b =obj.rotateArr(TwoDArr);
		System.out.println("-----The Rotated Array------\n");
		obj.PrintArr(b);
	}
	
}
