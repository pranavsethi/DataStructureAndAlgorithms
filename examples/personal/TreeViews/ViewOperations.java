package examples.personal.TreeViews;

import java.util.*;

public class ViewOperations {

	TreeMap<Integer, ArrayList> ht = new TreeMap<>();
	public ArrayList<Integer> al;
	
	
	
	/**
	 * Below method will print the Vertical level view of the tree
	 * 
	 * First of all we will create a TreeMap which will have Integer<level> key  and ArrayList as value
	 * Now use recursion to call the left child by decreaseing level by 1 and right child by increasing level by 1
	 * 
	 * if TreeMap contains data .. get the value from the treeMap add it to ArrayList and add Array list with level to TMap
	 * If not add the data to Arraylist and add to treemap
	 * @param root
	 * @param level
	 */
	
	public void VerticalLevelTraversal(Node root, int level)
	{
		
		if(root==null)
			return;
		 if(ht.containsKey(level))
	      {
	    	  ArrayList<Integer> x = ht.get(level);
	    	  x.add(root.data);
	    	  ht.put(level, x);
	      }
	      else
	      {
	    	  al=new ArrayList<>();
	    	  al.add(root.data);
	    	  ht.put(level,al);
	      }
		 
		 VerticalLevelTraversal(root.left_node,level-1);
		 VerticalLevelTraversal(root.right_node, level+1);
	      
		
	}
	
	public void printResult() {
        Set<Integer> i = ht.keySet();
        for (int keys : i) {
            System.out.println(ht.get(keys));
}
	}

	
	/**
	 * Below methods will give the left view and right view of the tree..
	 * Algorithm :  We will Use recursion here to print the left view
	 * Pass a variable called level along with the root ..
	 * initialize a variable called max_level =0
	 * 
	 * For Left view : First call the left child of the root and pass the increase level by 1.
	 * For Right view : First call the right child of the root and pass the increase level by 1
	 * 
	 * So, level becomes 1 which was 0 earlier and greater than max level which is 0
	 * in such a case print that value.. so first left value got printed and set max level as leve (max_level=level=1)
	 * Call right child now 
	 * @param root
	 */
	int max_level=0;
	public void LeftTreeView(Node root, int level)
	{
		
		
		if(root == null)
			return;
		
		if(max_level<level)
		{
			System.out.print(root.data+" ");
			max_level=level;
		}
			
			
			LeftTreeView(root.left_node,level+1);
			LeftTreeView(root.right_node,level+1);
		
	}
	
	
	
	
	public void RightTreeView(Node root, int level)
	{
		
		if(root == null)
			return;
		
		if(max_level <level)
		{
			System.out.print(root.data+" ");
			max_level=level;
		}
		RightTreeView(root.right_node,level+1);
		RightTreeView(root.left_node,level+1);
		
	}
	
	
	
	
	/**
	 * This method will give the Bottom View of the tree
	 * Again we will create Queue wrapper with level and node data
	 * A TreeMap with level as key..
	 * 
	 * First of all add the queue with level and data of the root..
	 * 
	 * Then loop till queue is empty
	 * Inside loop.. poll the queue wrapper and add it to TreeMAP
	 * Last increase the level for right child and decrease it for left child and add it to the queue
	 * 
	 */
	
	
	/**
	 * The important difference between Top view and Bottom view is..
	 * In Top view we check if the level is already in TM, if yes we do not add element
	 * While in bottom view we simply add it as new element overrides or internally creates later version of data and when 
	 * we try to get data we get latest one..
	 */
	
	static TreeMap<Integer,Integer> tm = new TreeMap<>();
	Queue<QueuePack> queue1= new LinkedList<QueuePack>();
	public void BottomView(Node root)
	{
		int level=0;
		
		if(root == null)
			return;
		
		queue1.add(new QueuePack(level, root));
		
		while(!queue1.isEmpty())
		{
			QueuePack q = queue1.poll();
			Node n= q.tnode;
			int level1=q.level;
			
			tm.put(level1, n.data);
			
			if(n.left_node != null)
				queue1.add(new QueuePack(level1-1, n.left_node));
			if(n.right_node != null)
				queue1.add(new QueuePack(level1+1,n.right_node));
				
		}
		
		
	}
	
	
	
	/**
	 * Below method will give the top view of the Tree..
	 * Algorithm : We will use Queue and Tree Map to achieve this view 
	 * We need to create a wrapper over queue which contains queue node data and level into it
	 * Need to create TreeMap with key as level and value and root data
	 * 
	 * First of all we will add root data to the queue with level as 0
	 * Then we will keep the loop till the queue is empty..
	 * Inside loop we will poll the first element and if it is not there in TreeMap, we should add it.
	 * 
	 * Then we will check if the left child is not 0, we will add the node with level -1 
	 * and then go to right child if it is not 0, we will add the node to queue with level +1
	 * @param root
	 */
	
	
	
	public void TopView(Node root)
	{
		int level=0;
		
		if(root == null)
			return;
		
		queue1.add(new QueuePack(level, root));
		
		while(!queue1.isEmpty())
		{
			QueuePack q = queue1.poll();
			Node n= q.tnode;
			int level1=q.level;
			
			if(!tm.containsKey(level1))
			tm.put(level1, n.data);
			
			if(n.left_node != null)
				queue1.add(new QueuePack(level1-1, n.left_node));
			if(n.right_node != null)
				queue1.add(new QueuePack(level1+1,n.right_node));
				
		}
		
		
	}
	
	
	
	
	
	public static void display() { // print the bottom view.
		Set<Integer> keys = tm.keySet();
		for (Integer key : keys) {
			System.out.print(tm.get(key) + " ");
		}

	}
	
	
}
