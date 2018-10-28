package examples.personal.Queue;

public class QueueRunner {

	public static void main(String args[])
	{
		QueueOperations obj = new QueueOperations();
		obj.enqueue(10);
		obj.enqueue(20);
		
		
		obj.dequeue();
		obj.dequeue();
	}
	
}


