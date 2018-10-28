package examples.personal.ArrayOperations;

public class FindFactorial {
	
	
	/**
	 * 
	 * To Find the recursion we will have to call the method in recursion with a base condition
	 * so that when num==2 or 1 return 2 and 1 respectively
	 * num = 4
	 * return 3* fact(2)
	 * return 
	 * 
	 * 
	 * @param num
	 * @return
	 */
	
	
//Calling method in recursion in
	public int findFact(int num)
	{
		if(num ==1)
			return 1;
		if (num ==2)
			return 2;
		
		return num*findFact(num-1);
		
	}
	
	
	public static void main(String args[])
	{
		int input= 5;
		
		FindFactorial obj = new FindFactorial();
		System.out.println(obj.findFact(input));
		
	}
	
}
