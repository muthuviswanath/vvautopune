import java.util.Scanner;

public class ArrayOps {
	private static Scanner scan = new Scanner(System.in);
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i <arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static int[] createArray(int size) {
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter the value for element " + (i+1));
			arr[i] = scan.nextInt();
		}
		return arr;
	}

	public static void splitArray(int arr[], int eleCount) {
		int a[] = new int[eleCount];
		int b[] = new int[arr.length - eleCount];
		for(int i=0; i<arr.length; i++) {
			if(i < a.length) {
				a[i] = arr[i];
			}
			else {
				b[i-a.length] = arr[i];
			}
		}
		printArray(a);
		printArray(b);
	}
	
	public static void mergeArray(int a[], int b[]) {
		int c[] = new int [a.length + b.length];
		for(int i=0; i<c.length; i++) {
			if (i < a.length)
				c[i] = a[i];
			else
				c[i] = b[i-a.length];
		}
		printArray(c);
	}
	
	public static void zigZagMerge(int a[], int b[]) {
		int i=0, j=0, k=0;
		int c[] = new int [a.length + b.length];
		while(i <a.length && j<b.length) {
			c[k++] = a[i++];
			c[k++] = b[j++];
		}
		while(i <a.length) {
			c[k++] = a[i++];
		}
		while(j<b.length) {
			c[k++] = b[j++];
		}
		printArray(c);
	}
	
	public static void sortedMerge(int a[], int b[]) {
		int i=0, j=0, k=0;
		int c[] = new int [a.length + b.length];
		while(i <a.length && j<b.length) {
			if(a[i] < b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		while(i <a.length) {
			c[k++] = a[i++];
		}
		while(j<b.length) {
			c[k++] = b[j++];
		}
		printArray(c);
	}
}
