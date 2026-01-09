import java.util.Scanner;

public class CoffeeMachine {
	//Cappuchino
	//Espresso
	//Latte
	//Tea
	void giveCappuchino() {
		System.out.println("Dispensed Cappuchino");
	}
	void giveEspresso() {
		System.out.println("Dispensed Espresso");
	}
	void giveLatte() {
		System.out.println("Dispensed Latte");
	}
	void giveTea() {
		System.out.println("Dispensed Tea");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CoffeeMachine c = new CoffeeMachine();
		do {
			System.out.println("1. Cappuchino");
			System.out.println("2. Espresso");
			System.out.println("3. Latte");
			System.out.println("4. Tea");
			System.out.println("5. Exit");
			int choice = scan.nextInt();
			switch (choice) {

			case 1:
				c.giveCappuchino();
				break;

			case 2:
				c.giveEspresso();
				break;

			case 3:
				c.giveLatte();
				break;
			case 4:
				c.giveTea();
				break;
			case 5:
				return;

			default:
				System.out.println("This operation is not possible");
			}
		}while(true);
	}
}
