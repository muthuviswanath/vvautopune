
public class Bank {
	public static String bankName = "Icici Bank";
	String branch;
	public Bank() {
		
	}
	public Bank(String branch) {
		this.branch = branch;
	}
	void login(String name, String pass) {
		System.out.println("Response from SBI Bank");
	}
	void login(int mpin) {
		System.out.println("Response from SBI Bank");
	}
	void login(Card c, int pin) {
		System.out.println("Response from SBI Bank");
	}
	
	public static void main(String[] args) {
		Bank b = new Bank();
		System.out.println(b.branch);
		System.out.println(b.bankName);
		
		
	}
}

class Card{}


//static method dispatch
//compile time polymorphism
//early binding