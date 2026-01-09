
public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {12,23,34,45,67,89,97};
		int target = 97;
		int left = 0;
		int right = arr.length-1;
		while (left <= right) {
		    int	mid = (left+right) / 2;
			if(arr[mid] == target) {
				System.out.println("Value found at position: " + (mid+1));
				return;
			}
			else if(target < arr[mid]) {
				right = mid -1;
			}
			else {
				left = mid +1;
			}
		}
		System.out.println("Element not found");
	}
}
