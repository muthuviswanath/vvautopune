
public class Laptop {
	String brand;
	float price;
	String version;
		

	
	public Laptop(String brand, float price, String version) {
		this.brand = brand;
		this.price = price;
		this.version = version;
	}



	/*
	 * Constructor:
	 * 	Main purpose it to instantiate the class (to create an object)
	 *  To initialize the instance/non-static variables at the time of object creation
	 *  
	 *  Characteristics:
	 *  1. Name of the constructor will be same as its class
	 *  2. It does not have a return type and neither it returns any value
	 *  3. It cannot be static or abstract or final 
	 *  4. It is not involved in inheritance
	 *  5. The first line of the constructor can be either a super() or this()
	 *  6. A constructor can be overloaded but not overridden
	 *  7. A constructor can have parameters or can be created as non-parameterized
	 *  8. Constructor chaining is possible provided it should not by cyclic
	 *  9. The visibility (access_specifier) can be higher or lower than its class
	 *  10. Every class comes with an automatic constructor called default constructor
	 *  11. If the user creates a constructor, default constructor will become obsolete
	 *  12. The only way to call the constructor explicitly is using new keyword
	 * */
	
	public static void main(String[] args) {
		Laptop l = new Laptop("Lenovo", 562278.76f, "2.4.5");
		System.out.println(l.brand);
		System.out.println(l.price);
		System.out.println(l.version);
	}
	
	//this - keyword
	// used to refer to the current invoking object
	// it is a way to handle variable shadowing
	
}
