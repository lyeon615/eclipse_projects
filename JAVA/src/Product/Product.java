package Product;
class Product {
	private int price;
	
	public int getPrice() {
		return price;
	}

	Product(int price){
		this.price = price;
	}

}
class Computer extends Product {
	Computer() {
		super(500);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}

class Monitor extends Product {

	Monitor() {
		super(200);
	}
	@Override
	public String toString() {
		return "Monitor";
	}
}


class Keyboard extends Product {

	Keyboard() {
		super(100);
	}
	@Override
	public String toString() {
		return "Keyboard";
	}
}

class Mouse extends Product {

	Mouse() {
		super(50);
	}
	@Override
	public String toString() {
		return "Mouse";
	}
}

class Speaker extends Product {

	Speaker() {
		super(100);
	}
	@Override
	public String toString() {
		return "Speaker";
	}
}

class Earphone extends Product {

	Earphone() {
		super(10);
	}
	@Override
	public String toString() {
		return "Earphone";
	}
}

