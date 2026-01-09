import java.util.Objects;

public class Emp {
	int id;
	String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		if(this == obj)
			return true;
		if(!(obj instanceof Emp))
			return false;	
		Emp e = (Emp) obj;
		return this.id == e.id && this.name == e.name;
//		return Objects.equals(this.id, e.id) && Objects.equals(this.name, e.name) ;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	public static void main(String[] args) {
		Emp emp1 = new Emp(10, null);
		Emp emp2 = null;

		System.out.println(emp1.hashCode());
		System.out.println(emp1.equals(emp2));


	}
}


