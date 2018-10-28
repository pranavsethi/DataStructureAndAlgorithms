package examples.personal.Stack;

import java.util.Stack;

/**
 * This class has the stack method such as push, pop and peek
 * 
 * Stack : This works on LIFO approach, i.e. what ever data comes last will go out first
 * We will try to implement this with below methods.
 * @author swetavk
 *
 */
public class StackOperations {
	
	int top=0;
	
	int[] arr= new int[5];
	
	
	/**
	 * This method will take the data and push it to stack
	 * Algorithm: we have created an array and a pointer top which is 0 
	 * Push data to array and move top to top+1
	 * @param data
	 */
	public void push(int data)
	{
	
		arr[top]=data;
		top++;
		
	}
	
	
	/**
	 * This method will pop the data from stack 
	 * Algorithm : This will take the data from the top 
	 * just because we have increased top in last push.. we will have to call stack[top-1]
	 */
	
	public void peep()
	{
		System.out.println("The data is.."+arr[top-1]);
	}
	
	
	public void pop()
	{
		if(top < 0)
		{
			System.out.println("The stack is empty");
		}
		System.out.println("TOP is"+top);
		System.out.println("The poped data is.."+ arr[top-1]);
		arr[top]=0;
		
		top--;
	}
	
	
	
	
	
	
	/** 
	 * Below method will check the balanced parenthesis
	 * Algorithm take input as string convert it to char array 
	 * if it '[ { ( ' push into the array
	 * If it '] } ) ' pop the stack and pass it to matching method.
	 * If they do not match return false
	 */
	
	Stack<Character> stack1= new Stack<>();
	public boolean checkCompletebrackets(String input)
	{
		char[] input1=input.toCharArray();
		
		for(int i =0;i<input1.length;i++)
		{
			if(input1[i]=='[' || input1[i]=='{' || input1[i]=='(') 
				stack1.add(input1[i]);
			
			if(input1[i]==']' || input1[i]=='}' || input1[i]==')')
			{
				if(!(isMatchingPair(stack1.pop(),input1[i])))
						return false;
	
			}
			

		}
		return true;
		
	}
	
	// This method will check the stack popped out and the current character and will return true if they are same
	static boolean isMatchingPair(char character1, char character2) 
    { 
       if (character1 == '(' && character2 == ')') 
         return true; 
       else if (character1 == '{' && character2 == '}') 
         return true; 
       else if (character1 == '[' && character2 == ']') 
         return true; 
       else
         return false; 
    } 

}
