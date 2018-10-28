package examples.personal.TreeViews;

import java.util.*;

public class QueuePack {
	
	Queue<Node> q = new LinkedList<>();
	
	int level;
	Node tnode;
	
	
	QueuePack(int level, Node tnode)
	{
		this.level=level;
		this.tnode=tnode;
	}

}
