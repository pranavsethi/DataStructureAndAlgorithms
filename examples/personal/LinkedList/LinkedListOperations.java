package examples.personal.LinkedList;

import java.util.HashSet;

/**
 * 
 * This class will contain all the LInked list related operations..
 * 
 * @author swetavk
 *
 */
public class LinkedListOperations {
	
	
	/**
	 * This method will print the Kth Element from end in the linked list
	 * Algo:
	 * 
	 * We will start two pointer and let the first pointer reach the kth element from start 
	 * Then start the second Pointer.. Move both the pointers.
	 * By the time, First pointer will reach the end, second pointer will reach the kth element from end
	 * @param header
	 */
	public void findKthElemFromEnd(Node header, int k)
	{
		Node FirstPoint=header;
		Node SecondPoint=header;
		
		for(int i=1;i<k;i++)
		{
			FirstPoint=FirstPoint.next;
		}
		while(FirstPoint.next !=null)
		{
			SecondPoint=SecondPoint.next;
			FirstPoint=FirstPoint.next;
		}
		
		System.out.println("\nThe Kth element from the end is.."+SecondPoint.data+"\n\n");
		
	}
	
	
	
	/**
	 * 
	 * This method will take a list , reverse the list and return it back 
	 * Algo : 
	 * Input  Head --> 1 --> 2 --> 3 --> 4 --> NULL
	 * 
	 * Output Head --> 4 --> 3 --> 2 --> 1 --> NULL
	 * 
	 * We will have to take three variables , previous and next will be pointing to null and current will be pointing to header
	 * 
	 * Now we will start swapping
	 * 
	 * Firstly, move next to the next element of current.. next=current.next
	 * current needs to point to prev current.next= previous
	 * Make current as previous .. previous = current
	 * Move current to next.. current=next
	 * 
	 * 
	 * So  ********************
	 * 	   next=current.next
	 * 	   current.next=previous
	 * 	   previous=current
	 * 	   current=next
	 * 	   *********************
	 * 
	 * 
	 * 
	 * 
	 * @param header
	 * @return
	 */
	
	public Node IterativereverseLinkedList(Node head)
	{
		
		Node current=head;
		Node next=null;
		Node previous=null;
		
		
		while(current != null)
		{
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
			
		}
		
		//Since previous is at the last element 
		LinkedList.header=previous;
		
		
		return LinkedList.header;
		
		
	}
	
	
	/**
	 * This Method will find whether the given Linked List is palindrome
	 * Algo..
	 * First of all find the Middle element .. 
	 * Reverse the second half 
	 * Compare the two halves and return true or false
	 * @param header
	 * @return
	 */
	public boolean FindIsPalindrome(Node header)
	{
		
		//Calling the Method to get the mid element..
		Node Mid_Node=FindMidElement(header);
		
		//Calling the method to reverse the Linked List..
		Node reversed_node =reverse(Mid_Node);
		
		
		Node new_header = header;
		//Checking whether the reversed part and the first half matches
		while(reversed_node !=null && new_header != null )
		{
			
			if(reversed_node.data!=new_header.data)
				return false;
			
			reversed_node=reversed_node.next;
			new_header=new_header.next;
		}
		
	return true;
		
	}
	
	
	
	//Method to reverse the Linked list..
	public Node reverse(Node head)
	{
		Node current=head;
		Node previous=null;
		Node next=null;
		
		while(current != null)
		{
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		
		return previous;
		
		
	}
	
	
	/**
	 * This method will detect and remove the duplicate nodes from the linked list..
	 * Algo : To find the duplicate nodes.. We will use hasing algorithm. 
	 * And If duplicates found we will remove it
	 * @param header
	 */
	HashSet<Integer> hs = new HashSet<Integer>();
	public Node removeDuplicateNodes(Node header)
	{
		 Node current = header; 
	        Node prev = null; 
		while(current !=null)
		{
			
			if(hs.contains(current.data))
			{
				System.out.println("Duplicates found.."+current.data);
				prev.next=current.next;
				
			}
			else
			{
				hs.add(current.data);
				prev=current;
			}
			current=current.next;
		}
		
		return header;
		
	}
	
	
	/**
	 * This method will print the middle element of the linked list.  We will start two pointer, 
	 * One will move two nodes at a time while the other pointer will move one node at a time
	 * Till the time second pointer will move to the end, First pointer will move to the middle
	 * 
	 * @param header
	 * @return
	 */
	public Node FindMidElement(Node header)
	{
		Node FirstPointer=header;
		Node SecondPointer=header;
		
		
		while(SecondPointer.next !=null )
			{
				if(SecondPointer.next.next == null)
				{
					return FirstPointer;
				}
			
			SecondPointer=SecondPointer.next.next;
			FirstPointer=FirstPointer.next;
			}
		
		
		return FirstPointer;
		
		
		
	}

}
