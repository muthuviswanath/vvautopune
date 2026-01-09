
public class India {
	String name;
	int population;
	
	India(String name, int population){
		this.name = name;
		this.population = population;
	}
	
	public String toString(){
		return name + " | "+ population;
	}
	
	public static void main(String[] args) {
		India india = new India("India", 1400000000);
		System.out.println(india);
		String s = new String("Japan");
		System.out.println(s);
	}
	
}
