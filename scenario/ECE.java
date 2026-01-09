package scenario;

public class ECE extends Department {

    ECE(String deptName, int deptId){
        super(deptName, deptId);
    }

    @Override
    void graduationCeremony()
    {
        System.out.println(this.deptName + " Department Graduation Ceremony");
        System.out.println("Congratulations to all ECE graduates!");
    }
    void electroFest(){
        System.out.println("Welcome to ECE ElectroFest 2026!");
        System.out.println("Enjoy the latest innovations in electronics and communication!");
    }
}
