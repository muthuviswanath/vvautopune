import java.util.Iterator;

public class PosNegZero {
	public static void main(String[] args) {
		int arr[] = {-1,-5,0,67,9,0,-1,-3};
		int poscount = 0, negcount =0, zerocount = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 0)
				negcount++;
			else if(arr[i] >0)
				poscount++;
			else
				zerocount++;
		}
		System.out.println("Positive numbers: " + poscount);
		System.out.println("Negative numbers: " + negcount);
		System.out.println("Number of zeroes: " + zerocount);
	}
}
