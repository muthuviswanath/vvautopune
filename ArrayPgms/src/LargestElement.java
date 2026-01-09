
public class LargestElement {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		int largest = arr[0];
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < smallest)
				smallest = arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > largest)
				largest = arr[i];
		}
		System.out.println("Largest Number: " + largest);
		System.out.println("Smallest Number: " + smallest);
	}
}
