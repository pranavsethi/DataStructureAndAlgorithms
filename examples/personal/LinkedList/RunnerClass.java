package examples.personal.LinkedList;

public class RunnerClass {

	public static void main(String args[])
	{
		
		LinkedList obj = new LinkedList();
//      obj.AddNodeAtStart(10);

		
		obj.AddNodeAtEnd(10);
		obj.AddNodeAtEnd(20);
		obj.AddNodeAtEnd(30);
		obj.AddNodeAtEnd(40);
		obj.AddNodeAtEnd(20);
		obj.AddNodeAtEnd(10);
//		obj.AddNodeAtEnd(30);
//		obj.AddNodeAtEnd(20);
//		obj.AddNodeAtEnd(10);
	
		
		
		//obj.AddAtPos(5, 2);
		
		//obj.DeleteNodeAtPos(1);
		
		System.out.println("\n\n The data of the nodes of Linked List is..\n");
		obj.ShowNodes();
	
		
		
		System.out.println("\n\nCalling the Operation class.. \n\n");
		
		LinkedListOperations obj1 = new LinkedListOperations();
		Node l = obj1.FindMidElement(LinkedList.header);
		System.out.println("The Mid Element is .."+l.data);
		
		obj1.findKthElemFromEnd(LinkedList.header, 3);
		
		
		
	//	obj1.IterativereverseLinkedList(LinkedList.header);
	//	System.out.println("The Reversed linked list is..");

		System.out.println("THE DATA "+obj1.FindIsPalindrome(LinkedList.header));
		
	//	obj.ShowNodes();
		
		
		obj1.removeDuplicateNodes(LinkedList.header);
		System.out.println("The Nodes without duplicates are..");
		while(LinkedList.header != null)
		{
			System.out.print(LinkedList.header.data+"-->");
			LinkedList.header=LinkedList.header.next;
		}
	
	}
	
}
