package Day11_08;

public class CakeTest {
	public static void main(String[] args) {
		Cake cake1 = new Cake();
		
		CheeseCake cake2 = new CheeseCake();
		
		Cake cake3 = new CheeseCake();
		
		System.out.println(cake1);
		System.out.println(cake2);
		System.out.println(cake3);

	}
}

class Cake{
	public String toString() {
		return "My birthday cake";
	}
}
class CheeseCake extends Cake{
	public String toString() {
		return "My birthday chesse cake";
	}
}