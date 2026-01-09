public class DriverCode {
    public static void main(String[] args) {
        Company c = new Company("Capgemini", "Pune", "Maharashtra", "India");
        Employee emp = new Employee("John Doe", "Software Engineer", 75000, c);
        emp.displayEmpData();
        emp = null;
        c.displayCompanyData();
                
    }
}
