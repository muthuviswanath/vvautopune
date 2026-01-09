import java.util.HashSet;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("CAT");
		hs.add("ACT");
		hs.add("DUCATI");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("CAT");
		ts.add("ACT");
		ts.add("DUCATI");
		System.out.println(ts);
	}
}
