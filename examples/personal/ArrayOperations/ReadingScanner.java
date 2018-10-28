package examples.personal.ArrayOperations;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadingScanner {
	
	static ArrayList al = new ArrayList<>();
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		String[] First_line=sc.nextLine().split(" ");
		int count=0;
		
		int row = Integer.parseInt(First_line[0]);
		int col=  Integer.parseInt(First_line[1]);
		
		int[][] mat = new int[row][col];
		
		
		for(int i =0;i<row;i++)
		{
			String[] Line=sc.nextLine().split(" ");
			
			for(int j =0; j<col;j++)
			{
				int a = Integer.parseInt(Line[j]);
				if(a ==0)
					count++;
			}
		}
		
		
		System.out.println("count");
	}

}
