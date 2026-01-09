
public class Calculator {

	void calculate(Number a) {
		System.out.println("Hello All, see you after the break");

	}
	void calculate(Double a) {
		System.out.println("Time to take a break");
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.calculate(12);
		
	}
}
