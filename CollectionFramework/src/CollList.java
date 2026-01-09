import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollList {
	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("Pappu",123,3534.34));
		emplist.add(new Employee("Kishore",1223,31534.34));
		emplist.add(new Employee("Salman",1243,35434.34));

		Iterator<Employee> itr = emplist.iterator();
		while(itr.hasNext()) {
			Employee e = (Employee) itr.next();
			System.out.println(e.empid);
			System.out.println(e.name);
			System.out.println(e.salary);

		}
		System.out.println();
		for(int i=0; i<emplist.size();i++) {
			if(emplist.get(i).empid == 123) {
				System.out.println(emplist.get(i).name);
				System.out.println(emplist.get(i).salary);
			}
		}
		//		for(Employee e:emplist) {
		//			System.out.println(e.name);
		//			System.out.println(e.empid);
		//			System.out.println(e.salary);
		//		}

		
		int empid =123;
		for(int i=0; i<emplist.size();i++) {
			if(emplist.get(i).empid == 123) {
				emplist.get(i).name = "Rahul Gandhi Mustafa";
				emplist.get(i).salary = 1234567.34;
			}
		}
		System.out.println(emplist);
		
		
		for(int i=0; i<emplist.size();i++) {
			if(emplist.get(i).empid == 123) {
				emplist.remove(emplist.get(i));
			}
		}
		System.out.println(emplist);
	}
}


/*
 * Write a code to create employee objects and store it in arraylist and
 * perform CRUD operations on it.
 * 
 * */

class Employee{
	String name;
	int empid;
	double salary;
	public Employee(String name, int empid, double salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return this.name + "|" + this.empid + "|" + this.salary;
	}


}

