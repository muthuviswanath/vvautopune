package scenario;

public class Student {
    String studentName;
    int studentId;
    Department department;
    College college;

    Student(String studentName, int studentId, Department department, College college){
        this.studentName = studentName;
        this.studentId = studentId;
        this.department = department;
        this.college = college;
    }

    void attendCollegeLevelEvent(){
        college.campusConnect();
        System.out.println("" + this.studentName + " is attending the college level event at " + College.collegeName);
    }

    void attendCommonDepartmentEvent(){
        department.graduationCeremony();
        System.out.println("" + this.studentName + " is attending the common department event at " + department.deptName);
    }

    void attendSpecificDepartmentEvent(){
        if(department instanceof CSE){
            CSE cseDept = (CSE) department;
            cseDept.techFest();
            System.out.println("" + this.studentName + " is attending the CSE specific event at " + department.deptName);
        } else if(department instanceof ECE){
            ECE eceDept = (ECE) department;
            eceDept.electroFest();
            System.out.println("" + this.studentName + " is attending the ECE specific event at " + department.deptName);
        } else {
            System.out.println("No specific events available for this department.");
        }
    }
}
