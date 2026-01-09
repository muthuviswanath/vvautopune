public class Computation {
	static int age = 45;
	String name;
	
	public static byte display() {
		return (byte)age; //There may be a loss of data
	}
	
	public static void check(byte c) {
		System.out.println(c);
	}
	
	public static void test(int a ) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		byte output = display();//no output on console
		check(output);//45
		test(34);//34
		System.out.println(output);//45
		
	}
	
	
}
