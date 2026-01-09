
public class Folder {
	private int size;
	private String allowed_user;
	private 	int filecount;
	private String username;
	Folder(String username){
		this.username = username;
	}
	
	void displayDetails() {
		System.out.println(this.size);
		System.out.println(this.allowed_user);
		System.out.println(this.filecount);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (this.username.equals("muthu") && this.size >0) 
			this.size = size;
		else {
			System.out.println("Invalid value for the size");
			System.exit(1);
		}
	}

	public String getAllowed_user() {
		return allowed_user;
	}

	public void setAllowed_user(String allowed_user) {
		if(this.username != null) {
		if (this.username.equals("muthu"))
			this.allowed_user = allowed_user;
		}
		else {
			System.out.println("USer name cannot be null");
		}
	}

	public int getFilecount() {
		return filecount;
	}

	public void setFilecount(int filecount) {
		if (this.username.equals("muthu"))
			this.filecount = filecount;
	}
	
	
}
