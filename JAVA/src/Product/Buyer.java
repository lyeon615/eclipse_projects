package Product;

class Buyer {
	private int money;
	private Product[] cart;
	int num = 0;
	
	Buyer(int money, Product[] cart) {
		this.money = money;
		this.cart = cart;
	}

	void buy(Product p) {
		if (money < p.getPrice()) {
			System.out.println(p +"를 사기에는 돈이 부족합니다");
		} else {
			add(p);
			money -= p.getPrice();
		}
	}

	void add(Product p) {
		if (num >= cart.length) {
			Product[] temp = new Product[num * 2];
			for (int i = 0; i < cart.length; i++) {
				temp[i] = cart[i];
			}
			cart = temp;
		}
		cart[num++] = p;
	}

	void summary() {
		System.out.println("구입한 물건");	
		int sum = 0;
		for (int i = 0; i < cart.length; i++) {
			if(cart[i] == null)
				break;
			System.out.println(cart[i].toString());
			sum += cart[i].getPrice();		
		}
		
		System.out.println("사용금액");
		System.out.println(sum);

		System.out.println("남은금액");
		System.out.println(money);
	}
}
