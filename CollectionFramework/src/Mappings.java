import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Mappings {
	public static void main(String[] args) {
		HashMap<Integer, String> jersey = new HashMap<Integer, String>();
		jersey.put(10, "Sachin");
		jersey.put(45, "Rohit");
		jersey.put(18, "Virat");
		System.out.println(jersey);
		
		Iterator<Entry<Integer, String>> itr = jersey.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println("Jersey #:" + entry.getKey() + "| Name: " + entry.getValue());
		}
		
		for(Entry<Integer, String> ent : jersey.entrySet()) {
			System.out.println("Jersey #:" + ent.getKey() + "| Name: " + ent.getValue());
		}
	}
}
