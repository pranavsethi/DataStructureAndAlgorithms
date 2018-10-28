package examples.personal.BinaryTreeOperations;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class contains the tree operations of the tree
 * 
 * @author swetavk
 *
 */
public class TreeOperations {

	/**
	 * This method will take data as input and insert node into Binary search tree
	 * following the principal, left child will always be smaller than right child
	 * and so on..
	 * 
	 * Algorithm : We will take a data and create a New node Initialize two
	 * variables one reference which will point to root and parent pointing to null
	 * initially
	 * 
	 * if root == null, that means there is no data in the tree hence point the root
	 * to NewNode else if NeNode.data < reference.data.. move to the left branch by
	 * reference=reference.left child and check whether reference is null If it is
	 * point parent.left to NewNode similarly for right child
	 * 
	 * @param data
	 */
	static Node root;


	public void InsertData(int data) {
		// Creating the node which is to be inserted..
		Node NewNode = new Node(data);

		// Node header=root;
		Node reference = root;
		Node parent = null;

		// if there is no node in the tree point root to NewNode [ Base condition ]
		if (reference == null)
			root = NewNode;

		else {
			while (true) {
				parent = reference;
				if (NewNode.data < reference.data) {
					reference = reference.left_node;
					if (reference == null) {

						parent.left_node = NewNode;
						return;
					}

				} else {
					reference = reference.right_node;
					if (reference == null) {
						parent.right_node = NewNode;
						return;
					}

				}

			}
		}

	}
	
	
	
	/** Below three methods will traverse BST in Inorder,PreOrder and post order fashion
	 * Algorithm : We will use recursion to achieve this
	 * Inorder : We will Open the left functions in stack and print the data after that and then call Sysout and then call right childs
	 * 
	 */
	
	
	public void InOrderTraversal(Node root)
	{
		
		if(root == null)
			return;
		InOrderTraversal(root.left_node);
		System.out.print(root.data+" --> ");
		InOrderTraversal(root.right_node);
	}
	
	
	public void PreOrderTraversal(Node root)
	{
		
		if(root == null)
			return;
		System.out.print(root.data+" --> ");
		InOrderTraversal(root.left_node);
		InOrderTraversal(root.right_node);
	}
	
	public void PostOrderTraversal(Node root)
	{
		
		if(root == null)
			return;
		
		InOrderTraversal(root.left_node);
		InOrderTraversal(root.right_node);
		System.out.print(root.data+" --> ");
	}
	
	/**
	 * This method will calculate the maximum depth of the tree with respect to node..
	 * 
	 * @param root
	 * @return
	 * Algorithm : We will use recursion again
	 * Base condition will be, if node is null, return 0
	 * 
	 * calculate depth of left child and assign it to leftvar and right child to rightvar
	 * If left is bigger than increase leftvar to +1 and if right is bigger or equal increase right by 1
	 */
	public int FindDepthTree(Node root)
	{
		if(root == null)
			return 0;
		
		
		int ldepth=FindDepthTree(root.left_node);
		int rdepth=FindDepthTree(root.right_node);
		
		if(ldepth>rdepth)
			return ldepth+1;
		else
			return rdepth+1;
		
		
	}
	
	/**
	 * The below two methods will take the root reference and will keep on traversing through the left branch 
	 * The left most leaf node of the tree will be minimum as lesser value always goes to the left wing of the tree
	 * Similarly the right most node of the tree will be maximumn as larger value always goes to the right wing of the tree
	 * @param root
	 * @return
	 */
	public int MinvalueTree(Node root)
	{
		Node header=root;
		while(true)
		{
			header=header.left_node;
			
			if(header.left_node==null)
				return header.data;
			
		}
		
	}
	
	public int MaxValueTree(Node root)
	{
		Node header=root;
		while(true)
		{
			header=header.right_node;
			
			if(header.right_node==null)
				return header.data;
			
		}
		
	}

	/**
	 * 	 * This Method will check whether the tree is a BST..
	 * 
	 *   Algo : select a range (Integer.MIN to Integer.MAX) 
	 *   Now, start traversing through 
	 *    When we move towards left child by passing(Node.left), We should have number 
	 *    Min < num < node
	 *    While when we go to right, we should have number 
	 *    node.data< num < Max
	 *    
	 *    Combining these two becomes
	 *    Min< num <Max
	 *    1. Left childs      : Min <left_child.node < current Val.. i.e. setting node.left as Max
	 *    2. Right Childs    :  current <right_child.node < MAX
	 * @param root
	 * @param min_val
	 * @param max_val
	 * @return
	 */
	public boolean ISBst(Node root,int min_val,int max_val)
	{
		
		Node reference=root;

		//Base condition if tree is null
		if(reference==null)
			return true;
		
		
		
		if(reference.data<min_val || reference.data >max_val)
			return false;
		
		return(ISBst(root.left_node,min_val,reference.data) && ISBst(root.right_node,reference.data,max_val));
		
	}
	
	
	
	/** 
	 * This method will take the root and do level order traversal
	 * Algorithm : We will use Queue to achieve the same
	 * We will start the traversal and add the data in queue till queue is empty
	 * Next time we will poll the last element added
	 */
	
	Queue<Node> queue= new LinkedList<Node>();
	public void LevelOrderTraversal(Node root)
	{
		if(root == null)
			return;
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Node tmp_node=queue.poll();
			System.out.print(tmp_node.data+" --> ");
			
			if(tmp_node.left_node != null)
			{
				queue.add(tmp_node.left_node);
			}
			
			if(tmp_node.right_node !=null)
				queue.add(tmp_node.right_node);
		}
	}
	
	
	
	
	
}


