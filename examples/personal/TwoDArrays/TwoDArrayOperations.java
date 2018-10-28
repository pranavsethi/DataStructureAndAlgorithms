package examples.personal.TwoDArrays;



import java.util.HashSet;
import java.util.Scanner;


public class TwoDArrayOperations {


	/** 
	 * This method will traverse through the element and keep on adding the elements to the variable sum...
	 * @param arr
	 * @return
	 */
	public int SumIntegers(int[][] arr)
	{
		int sum =0;
		for(int i =0;i<arr.length;i++)
		{
			for(int j= 0;j<arr[i].length;j++)
			{
				sum=sum+arr[i][j];
			}
		}
		
		return sum;
	}
	
	
	/**
	 * The Below to methods will help solving the Island problems. 
	 * Algo : First of all we will instantiate a variable Island count =0. Next whenever we encounter 1, 
	 * we will increase the count as +1
	 * 
	 * Next whenever we will encounter 1, we will call a recursive function which will make all the 1 
	 * which are connected vertically and 
	 * horizontally as 0.
	 * @param TwoDArr
	 * @return
	 */
	
	
	public int IslandProblem(int[][] TwoDArr)
	{
		if(TwoDArr == null)
			return 0;
		
		int LandCount=0;
		
		// Traverse through the 2D array and increase the count by 1 whenever find a 1
		for(int i=0;i<TwoDArr.length;i++)
		{
			for(int j=0;j<TwoDArr[i].length;j++)
			{
				if (TwoDArr[i][j]==1)
				{
					LandCount ++;
					
					//Call the recursive function which will make all the connected 1 to 0 as they all will be one Island..
					MakeLandWater(TwoDArr, i, j);
				}
			}
		}
		
	return LandCount;	
	}
	
	public void MakeLandWater(int[][] TwoDArr, int i, int j)
	{
		
		//Base condition . This will make sure that we make only connected 1 as 0 and if there is 0 simply return
		if(i< 0 || i >= TwoDArr.length || j<0 || j >= TwoDArr[i].length || TwoDArr[i][j]==0)
			return;
		//Make connected 1s as 0
		TwoDArr[i][j]=0;
		
		MakeLandWater(TwoDArr,i+1,j);   // Make  right element 0
		MakeLandWater(TwoDArr, i, j+1);  // Make downward element as 0
		MakeLandWater(TwoDArr, i-1, j);   //Make backward element as 0
		MakeLandWater(TwoDArr, i, j-1);    //Make downward element as 0
		
		
	}
	
	
	
	
	
	
	/** This method will print the Array in a formatted way
	 * 
	 * @param arr
	 */
	
	public void PrintArray(int[][] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("["+arr[i][j]+"]");
			}
			System.out.print("\n");
		}
	}
	
	
	/**
	 * This method will calculate all the ways to reach from top left to bottom right 
	 * This will be recursive solution .
	 * For reaching from to 2*2 you will have to reach to 1*2 or 2*1
	 * Similarly so on.. until you are at 0,0 or on the first row or first columns..
	 * @param m
	 * @param n
	 * @return
	 */
	public int countPath(int m, int n)
	{
		if(m == 0 && n == 0 )
			return 0;
		if(m ==0 || n ==0 )
		{
			return 1;
			
		}
		return countPath(m-1, n) + countPath(m, n-1);
	}
	
	
	public static void main(String args[])
	{
		int[][] TwoDArr= new int[2][2];
		
		Scanner sc= new Scanner(System.in);
		
		
		HashSet<Integer> hs = new HashSet<Integer>();
	
		
		//This will take the inputs from scanner and add it as elements to 2D array..
		for(int i =0; i< TwoDArr.length;i++)
		{
			for(int j=0;j<TwoDArr[i].length;j++)
			{
				//System.out.println("Array ["+i +"]" + "["+j+"]");
				TwoDArr[i][j]=sc.nextInt();
			}
				
		}
	
		TwoDArrayOperations obj = new TwoDArrayOperations();
		obj.PrintArray(TwoDArr);
		
	
		
		System.out.println("The sum of the elements of 2D Array is "+obj.SumIntegers(TwoDArr));
		
		System.out.println("The way of reaching from top left to bottom right is.. "+obj.countPath(2, 2));
		
		
		System.out.println("The number of Islands is .."+obj.IslandProblem(TwoDArr));
		
	
		
	}
	
	

		
	
}
