
public class LeftRotate {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		//1 rotation
		// 2, 3, 4, 5, 1

		//2 rotations
		// 3, 4, 5, 1, 2
		int k = 2;
		System.out.println("Array before rotating left by " + k + " elements:");
		ArrayOps.printArray(arr);
		for(int r=1; r<=k; r++) {
			int first = arr[0];
			for(int i=0; i<arr.length-1; i++) {
				arr[i] = arr[i+1];
			}
			arr[arr.length-1] = first;
		}
		System.out.println("Array after rotating left by " + k + " elements:");
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
