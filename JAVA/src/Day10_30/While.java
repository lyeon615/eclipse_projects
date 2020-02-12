package Day10_30;

public class While {
	public static void main(String[] args) {
		int num = 0;

		while (num < 3) {
			System.out.println("I like Java " + num);
			num++;
		}
		num = 0;
		do {
			System.out.println("I like Java " + num);
			num++;
		} while (num < 3);
	
	
		for (int i = 0 ; i<3 ; i++) {
			System.out.println("I like Java " + i);
		}
	
	}
}
