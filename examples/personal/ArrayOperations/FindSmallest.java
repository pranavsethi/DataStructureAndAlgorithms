package examples.personal.ArrayOperations;

public class FindSmallest {

	/**
	 * Finding first the and second smallest number..
	 * 
	 * Take two variables and keep on comparing next element
	 * 
	 * if next element is less than first then compare first element with seconds
	 * elmement and swap
	 * 
	 * For example .. 3,-1,1,4,10,7 check which out of first and second element is
	 * smaller and assign that to smallest and second_smallest
	 * 
	 * Smallest=-1, Second_smallest=3
	 * 
	 * arr[k] 1 > smallest but arr[k] 1< second_smallest --> Smallest= 1,
	 * second_smallest=smallest=2 arr[k] 4 >smallest no change arr[k] 10 > smallest
	 * no change
	 * 
	 * 
	 * 
	 * @param arr
	 * @return
	 */

	public void findSmallestNum(int[] arr) {
		int smallest = 0;
		int second_smallest = 0;

		if (arr[0] < arr[1]) {
			smallest = arr[0];
			second_smallest = arr[1];
		} else {
			smallest = arr[1];
			second_smallest = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {

			// This indicates that the data is smaller than smallest so push data to
			// smallest and smallest to second smallest
			if (arr[i] < smallest) {
				int tmp = smallest;
				smallest = arr[i];
				second_smallest = tmp;
			}

			// Data is bigger than smallest but smaller than second smallest.. so keep
			// smallest as it is and push data to second smallest
			if (arr[i] > smallest && arr[i] < second_smallest) {
				second_smallest = arr[i];
			}

		}

		// printing the data as smallest and second smallest..
		System.out.println("the smallest number is.." + smallest);
		System.out.println("the second smallest number is.." + second_smallest);

	}

	public static void main(String args[]) {

		int[] arr = { 3, 0, 1, -2, 4, 10 };

		FindSmallest obj = new FindSmallest();
		obj.findSmallestNum(arr);
	}

}
