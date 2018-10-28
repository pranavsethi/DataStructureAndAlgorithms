package examples.personal.LinkedList;

/**
 * 
 * This Class contains methods for CRUD operations on the Linked List..
 * 
 * @author swetavk
 *
 */
public class LinkedList {

	static Node header;

	// This Method will add the Node at the start of the Linked List...
	public void AddNodeAtStart(int data) {
		Node NewNode = new Node();
		NewNode.data = data;

		if (header == null)
			header = NewNode;
		else {
			NewNode.next = header;
			header = NewNode;

		}

	}

	// This method will add the node at the End of the Linked List..
	public void AddNodeAtEnd(int data) {
		Node NewNode = new Node();
		NewNode.data = data;

		if (header == null)
			header = NewNode;
		else {
			Node n = header;
			while (n.next != null) {
				n = n.next;
			}
			n.next = NewNode;
		}

	}

	// Traverse till the position and add the NewNode..
	public void AddAtPos(int data, int pos) {
		Node NewNode = new Node();
		NewNode.data = data;

		Node n = header;

		for (int i = 0; i < pos - 1; i++) {
			n = n.next;

		}

		NewNode.next = n.next;
		n.next = NewNode;

	}
	
	
	
	
	

	// Delete A Node from the pos..
	public void DeleteNodeAtPos(int pos) {
		Node n = header;
		for (int i = 1; i < pos - 1; i++) {
			n = n.next;
		}
		n.next = n.next.next;
		// System.out.println("The data is.."+n.data);
	}

	// This Method will list all the nodes of the linked list...
	
	public void ShowNodes() {
		Node n = header;
		
		while (n != null) {
			System.out.print(n.data+"-->");
			n = n.next;
		}
	}

}
