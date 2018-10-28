package examples.personal.TreeViews;

public class ViewRunner {

	
	public static void main(String args[])
	{
		Node root = new Node(1);
		
//		root.left_node=new Node(10);
//		root.right_node=new Node(2);
//		root.right_node.right_node= new Node(1);
//		root.right_node.left_node= new Node(3);
//		root.right_node.left_node.left_node= new Node(6);
		

		
		root.left_node = new Node(2);
		root.right_node = new Node(3);
		root.left_node.left_node = new Node(4);
		root.left_node.right_node = new Node(5);
		root.left_node.right_node.left_node = new Node(6);
		root.left_node.right_node.right_node = new Node(7);
        root.right_node.right_node = new Node(8);
        
        ViewOperations obj = new ViewOperations();
        obj.TopView(root);
        obj.display();
        
        
        obj.VerticalLevelTraversal(root, 0);
        obj.printResult();
        
    //    obj.LeftTreeView(root, 1);
      //  obj.RightTreeView(root, 1);
	}
}
