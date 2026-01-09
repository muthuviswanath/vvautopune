package scenario;

public class Department {
    String deptName;
    int deptId;

    Department(String deptName, int deptId){
        this.deptName = deptName;
        this.deptId = deptId;
    }

    void graduationCeremony(){
        System.out.println("Graduation ceremony");
    }
}
