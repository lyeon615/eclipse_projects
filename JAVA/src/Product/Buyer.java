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
			System.out.println(p +"�� ��⿡�� ���� �����մϴ�");
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
		System.out.println("������ ����");	
		int sum = 0;
		for (int i = 0; i < cart.length; i++) {
			if(cart[i] == null)
				break;
			System.out.println(cart[i].toString());
			sum += cart[i].getPrice();		
		}
		
		System.out.println("���ݾ�");
		System.out.println(sum);

		System.out.println("�����ݾ�");
		System.out.println(money);
	}
}
