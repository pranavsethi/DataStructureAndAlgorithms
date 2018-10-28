package examples.personal.BinaryTreeOperations;

import java.util.HashSet;
import java.util.Set;

/**
 * This class is creating a node of the tree 
 * This has a data and two reference to it
 * left_node and right node 
 * It also contains a constructor..
 * @author swetavk
 *
 */

public class Node {

	int data;
	Node left_node;
	Node right_node;
	
	
	Set<Integer> a = new HashSet<>();
	//The constructor to pass the values 
	Node(int data)
	{
		this.data=data;
		left_node=null;
		right_node=null;
	}
	
}
