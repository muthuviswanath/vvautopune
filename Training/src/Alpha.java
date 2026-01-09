
public class Alpha {
	int age = 10;

	static String  name = "Muthu";
	Alpha(Alpha alp, int a){
		this(a);
		System.out.println(this.name +" : " + this.age);
	}
	public Alpha() {
	}
	Alpha(int a){
		System.out.println(a);
	}
	Alpha(String name, int a){
		this(a);
		System.out.println(this.name +" : " + this.age);
	}
	public static void main(String[] args) {
		Alpha a = new Alpha(new Alpha(), 12);
		Alpha b = new Alpha(name, 12);
	}


}
