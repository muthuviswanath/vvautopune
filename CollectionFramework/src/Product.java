
public class Product <PaniPoori, Coffee, Chai>{
	PaniPoori prodid;
	Coffee productname;
	Chai price;
	
	
	
	public Product(PaniPoori prodid, Coffee productname, Chai price) {
		this.prodid = prodid;
		this.productname = productname;
		this.price = price;
	}
	
	Coffee display(Coffee e, Chai c) {
		return e;
	}
	
	@Override
	public String toString() {
		return this.prodid +" | " + this.productname + " | " + this.price;
	}
		
}
