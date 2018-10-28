package examples.personal.BinaryTreeOperations;

public class TreeRunner {
	
	public static void main(String args[])
	{
		TreeOperations obj = new TreeOperations();
		obj.InsertData(10);
		obj.InsertData(20);
		obj.InsertData(15);
		obj.InsertData(5);
		obj.InsertData(4);
		obj.InsertData(3);
		obj.InsertData(7);
		obj.InsertData(30);
		obj.InsertData(40);
		
		
		//Calling the Inorder Traversal
		System.out.println("\nPrinting the In-Order of the tree \n");
		obj.InOrderTraversal(TreeOperations.root);
		
		
		//calling the Pre-Order Traversal
		System.out.println("\nPrinting the Pre-Order of the tree \n");
		obj.PreOrderTraversal(TreeOperations.root);
		
		//calling the Pre-Order Traversal
		System.out.println("\nPrinting the Post-Order of the tree \n");
		obj.PostOrderTraversal(TreeOperations.root);
		
		//Calling the depth of the tree
		System.out.println("\n\nThe depth of the tree is :: "+obj.FindDepthTree(TreeOperations.root));
		
		System.out.println("\nThe Minimum value in the tree is.."+obj.MinvalueTree(TreeOperations.root));
		
		System.out.println("\nThe Minimum value in the tree is.."+obj.MaxValueTree(TreeOperations.root));
		
		//Check whther the tree is BST..
		int min_val=Integer.MIN_VALUE;
		int max_val=Integer.MAX_VALUE;
		System.out.println("\nIs the Tree a BST.."+obj.ISBst(TreeOperations.root, min_val, max_val)+"\n");
		
		
		//Level Order Traversal
		System.out.println("The level order traversal of the tree ");
		obj.LevelOrderTraversal(TreeOperations.root);
		
	}

}
