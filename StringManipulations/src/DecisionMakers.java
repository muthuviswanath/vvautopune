
public class DecisionMakers {

	static void makeDecision(String country) throws BRICSException{
		if(country.equals("Britain") ||
				country.equals("Russia")||
				country.equals("India")||
				country.equals("China")||
				country.equals("Singapore")){
			System.out.println("Make the descision");
		}
		else {
			throw new BRICSException();
		}
	}

	public static void main(String[] args) {
		
		try {
			DecisionMakers.makeDecision("Pakistan");
		}
		catch(BRICSException e) {
			System.out.println(e.getMessage());
		}
	}
}
