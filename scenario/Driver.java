package scenario;

public class Driver {
    public static void main(String[] args) {
        Department ece = new ECE("Electronics & Communication Engineering", 1102);
        Department cse = new CSE("Computer Science & Engineering", 1101);   
        College college = new College();
        Student student1 = new Student("Modi", 2001, ece, college);
        Student student2 = new Student("Rahul", 2002, cse, college);
        System.out.println("--------------------------------------------------------------");
        student1.attendCollegeLevelEvent();
        student1.attendCommonDepartmentEvent();
        student1.attendSpecificDepartmentEvent();
        System.out.println("--------------------------------------------------------------");

        System.out.println();
        System.out.println("--------------------------------------------------------------");
        student2.attendCollegeLevelEvent();
        student2.attendCommonDepartmentEvent();
        student2.attendSpecificDepartmentEvent();
        System.out.println("--------------------------------------------------------------");

        
        
    }
}
