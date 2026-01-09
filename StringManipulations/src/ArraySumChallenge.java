import java.util.Scanner;

public class ArraySumChallenge {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		int x = s.nextInt();
		int y = s.nextInt();

		try {

			System.out.println(InvalidIndexRangeException.arraySum(arr, x, y));

		}

		catch(InvalidIndexRangeException iire) {
			System.out.println( iire.getMessage());
		}
	}
}
