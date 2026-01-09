import java.util.Scanner;

public class ArraysIntro {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the size of array");
//		int arr_size = scan.nextInt();
//		int[] newarr = ArrayOps.createArray(arr_size);
		int a[] = {12,23,45,67,76,124};
		int b[] = {11,34,65,87,89};
		ArrayOps.sortedMerge(a,b);
		
	}
}

