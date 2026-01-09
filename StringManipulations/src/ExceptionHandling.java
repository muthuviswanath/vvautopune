import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args){
		int arr[] = {1,2,3,4};
		Scanner s = new Scanner(System.in);
		try {
			int num = s.nextInt();
			System.out.println(10/num);
			System.out.println(arr[num]);

		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			try {
				int num = s.nextInt();
				System.out.println(10/num);
				System.out.println(arr[num]);
			}
			catch(ArithmeticException ex) {
				ex.printStackTrace();
			}

		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
