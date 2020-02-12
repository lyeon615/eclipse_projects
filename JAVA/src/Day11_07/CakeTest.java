package Day11_07;

public class CakeTest {
	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		c1.yummy();
		c2.yummy();
		c2.tasty();
	}
}

class Cake{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}
class CheeseCake extends Cake{
	public void yummy() {
		super.yummy();
		System.out.println("Yummy Cheese Cake");
	}
	public void tasty() {
		super.yummy();
		System.out.println("Yummy Tasty Cake");
	}
}