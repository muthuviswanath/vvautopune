package scenario;

public class CSE extends Department{

    CSE(String deptName, int deptId){
        super(deptName, deptId);
    }
    @Override
    void graduationCeremony()
    {
        System.out.println(this.deptName + " Department Graduation Ceremony");
        System.out.println("Congratulations to all CSE graduates!");
    }
    void techFest(){
        System.out.println("Welcome to CSE TechFest 2026!");
        System.out.println("Enjoy the latest innovations in computer science and engineering!");
    }
}
