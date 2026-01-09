
public class Strings {
	/* It is a datatype (Non-primitive)
	 * Sequence of characters
	 * Immutable
	 * If any string is created using string literal the String object will
	 *  be created in SCP
	 *  public class String implements Serializable, Comparable, CharSequence
	 *  String literal
	 *   
	 *  String s = "test"
	 *  
	 *  new
	 *  
	 *  String s = new String();
	 *  
	 */	

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		int count=0;
		for(int i=0; i<s.length(); i++) {
			if( s.charAt(i) == 'o' || s.charAt(i) == 'O') {
				count++;
			} 
		}
		System.out.println("The character o occurs " + count + " time(s)");
	}
}
