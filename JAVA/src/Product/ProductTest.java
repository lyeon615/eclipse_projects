package Product;

public class ProductTest {
	public static void main(String[] args) {
		Product[] p = new Product[3];
		Buyer b = new Buyer(400, p);
		
		Product pro = new Computer();
		b.buy((Computer)pro);
		
		pro = new Monitor();
		b.buy((Monitor)pro);
		
		b.buy(new Keyboard());
	
		b.buy(new Mouse());
		
		b.summary();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	