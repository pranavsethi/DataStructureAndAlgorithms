package examples.personal.Stack;

public class StackRunner {

	
	public static void main(String args[])
	{
		StackOperations obj = new StackOperations();
		
	
		
		
		
		
		obj.push(10);
		obj.push(20);
		
		obj.pop();
	//	obj.pop();
	//	obj.pop();
		
	//	obj.peep();
		
		System.out.println(obj.checkCompletebrackets("{([])}"));
	}
}
