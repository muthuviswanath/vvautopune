
public class StringFormatting {
	public static void main(String[] args) {
		float salary = 456735.34f;
		String names[] = {"Muthuviswa", "Rangaraj Pandey", "Sharukh Khan", "Salman Bhai"};
		for(int i=0; i<names.length; i++) {
			System.out.print(String.format("|%-20s|", names[i]));
			System.out.print(String.format("%20s|", salary));
			System.out.println();
		}
		// to compare string, don't use == use equals
		String s2 = "Muthu";
		String s3 = "Muthu";
		System.out.println(s2 == s3);
		
		s2 = new String("Hello");
		s3 = new String("Hello");
		System.out.println(s2.equals(s3));
		
		String bike = "Education";
		String my_bike = bike.substring(1, 7);
		System.out.println(my_bike);
		System.out.println(bike.substring(5));
		
		//I want to know whether the following is present in the string
		System.out.println("Training".contains("ai"));
		
		String fname = "Rahul"; String lname = "Gandhi";
		String cname = "is the next prime minister of";
		String dname = "Pakistan";
		System.out.println("Rahul - Gandhi - is the next prime minister of - Pakistan");
		System.out.println(String.join(" - ", fname, lname, cname, dname));
		
		String pappu_dreams = "";
		String pappu_mom_dreams = " ";
		System.out.println("Pappu's dreams are empty: "+ pappu_dreams.isBlank());
		System.out.println("Pappu's mom's dreams are empty: "+ pappu_mom_dreams.isEmpty());
		
	}
}
