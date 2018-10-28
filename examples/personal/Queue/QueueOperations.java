package examples.personal.Queue;

/**
 * This class will implement queue Operations
 * 
 * Queue : This works on the FIFO approach, i.e. whatever data gets in first will come out first
 * @author swetavk
 *
 */

public class QueueOperations {

	
	/**
	 * This method will add the data to the queue
	 * @param data
	 * Algorithm : we will have declare a few variables first, front, rear and an array
	 */
	
	int front =0;
	int rear=0;
	int[] arr= new int[5];
	

	
	
	public void enqueue(int data)
	{
		arr[front]=data;
		front++;
		
	}
	
	
	/**
	 * 
	 * Below method will remove one element from the queue
	 * As Queue uses FIFO approach, the data will be pulled out from the rear
	 */
	
	public void dequeue()
	{
		System.out.println("the data is.."+arr[rear]);
		arr[rear]=0;
		rear++;
	}
	
}
