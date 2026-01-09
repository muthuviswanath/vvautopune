import java.util.Scanner;

public class Payroll {

	static double generateSalary(double sal){
		return sal;
	}
	static double generateSalary(double sal, double bonus){
		return sal * 1.125;
	}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double finalsal;
		do {
			System.out.println("1. Generate Payable Salary");
			System.out.println("2. Exit");
			int choice = s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the employee name: ");
				String name = s.next();
				System.out.println("Enter the base salary: ");
				double sal = s.nextDouble();
				System.out.println("Eligible for Bonus? (Y/N)");
				char bonus = s.next().charAt(0);
				if(bonus == 'Y' || bonus == 'y') {
					System.out.println("Enter the bonus percentage: ");
					double bon = s.nextDouble();
					finalsal = generateSalary(sal, bon);
					System.out.println("Your Take Home Sal: "+finalsal );
				}
				else {
					finalsal = generateSalary(sal);
					System.out.println("Your Take Home Sal: "+finalsal );
				}
				break;
			case 2:
				return;
			default:
				System.out.println("Invalid choice");
			}
		}while(true);
	}
}
