
public class Check {
	static int a;
	Check(String s){
		this(a);
		System.out.println(s);
		
	}
	
	Check (int d){
		System.out.println(d);
	}
	public static void main(String[] args) {
		Check c = new Check("Test");
	}
}
