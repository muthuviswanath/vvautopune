import java.util.Scanner;

public class Employee {
	int empid;
	String empname;
	String desig;
	double salary;
	public Employee(int empid, String empname, String desig, double salary) {
		this.empid = empid;
		this.empname = empname;
		this.desig = desig;
		this.salary = salary;
	}
	
	//Write a code to get the employee count as per your convenience.
	//if the employee count is 2, get the details from the user and create
	//2 employee objects and display their data. Your task is to complete the
	//following code
	
	void displayEmpData() {
		System.out.println(this.empid + " | " + this.empname + " | " 
						+ this.desig +" | " + this.salary);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int count = s.nextInt();
		for(int i=1; i<= count; i++) {
			System.out.println("Enter the id");
			int empid = s.nextInt();
			System.out.println("Enter the name");
			String ename = s.next(); 
			System.out.println("Enter the desig");
			String desig = s.next();
			System.out.println("Enter the sal");
			double sal = s.nextDouble();
			Employee e = new Employee(empid, ename, desig, sal);
			e.displayEmpData();
		}
	}
}
