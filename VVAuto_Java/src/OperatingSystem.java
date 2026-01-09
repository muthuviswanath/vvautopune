
public class OperatingSystem {
	public static void main(String[] args) {
		Folder f = new Folder("muthu");
		f.setSize(0);
		f.setFilecount(4567);
		f.setAllowed_user("Admin, Muthu");
		f.displayDetails();
	}
}
