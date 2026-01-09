public class Employee {
    String fullName;
    String desig;
    double salary;
    Company company;

    Employee(String fullName, String desig, 
        double salary, Company company){
        this.fullName = fullName;
        this.desig = desig;
        this.salary = salary;
        this.company = company;
    }

    void displayEmpData(){
        System.out.println("Employee Name: " 
                            + fullName);
        System.out.println("Designation: " 
                                + desig);
        System.out.println("Salary: " 
                                    + salary);
        this.company.displayCompanyData();
    }
}
