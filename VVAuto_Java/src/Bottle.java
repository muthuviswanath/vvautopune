
public class Bottle {
	int capacity;
	String color;
	String material;
	double price;
	public Bottle(int capacity, String color, String material, double price) {
		this.capacity = capacity;
		this.color = color;
		this.material = material;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		String s = this.capacity + this.color + this.material + this.price;
		return Integer.parseInt(s);
	}


	public static void main(String[] args) {
		Bottle b1 = new Bottle(1, "Violet", "Fibre", 45.50);
//		Bottle b2 = new Bottle(1, "Violet", "Fibre", 45.50);
//		Bottle b3 = new Bottle(1, "Violet", "Fibre", 45.50);
//		Bottle b4 = new Bottle(1, "Violet", "Fibre", 45.50);
//		Bottle b5 = new Bottle(1, "Violet", "Fibre", 45.50);
//		Bottle b6 = new Bottle(1, "Violet", "Fibre", 45.50);
		
		
		System.out.println(b1.hashCode());

	}
}
