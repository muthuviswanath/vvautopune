import java.util.Scanner;

public class Invoice {
	public static void main(String[] args) {
		
		
		Product<Integer, String, Float> prod1 = new Product<Integer, String, Float>(123, "Coffee", 15.00f);
		Product<String, String, String> prod2 = new Product("CGTEA","Elachi Chai","34567");
		Product<Integer, String, String> prod3 = new Product("CGTEA",123.34,"34567");
		System.out.println(prod1);
		System.out.println(prod2);
		System.out.println(prod3);
		
		Scanner s = new Scanner(System.in);
		
		int b1 = s.nextInt();
		
		System.out.println(prod3.display("123", "Coffee"));
		
	}
}
