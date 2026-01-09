
public class Rapido implements BhuvanMap, GoogleMap {
	
	//System.out.println(src + " ->" + "Delhi"  + " ->" +"UP" + " ->" 
//			   + "Himachal Pradesh" + " ->" + dest);
			   
	Rapido(){
		super();
	}
	public void findDirections(String src, String dest){
		System.out.println(src + " ->" + "Delhi"  + " ->" +"UP" + " ->" 
				   + "Himachal Pradesh" + " ->" + dest);
	}
	
	public static void main(String[] args) {
		Rapido r = new Rapido();
		r.findDirections("Mumbai", "Manali");
	}
}
