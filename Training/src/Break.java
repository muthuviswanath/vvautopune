import java.util.Scanner;

public class Break {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		try {
			
			System.out.println(Integer.parseInt("12"));
			s.close();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		s.close();
		System.out.println("Welcome");

	}
}
