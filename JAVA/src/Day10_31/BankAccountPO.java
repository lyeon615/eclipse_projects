package Day10_31;

public class BankAccountPO {
	static int balance = 0;
	
	public static void main(String[] args) {
		deposit(10000);
		checkMyBalance();
		withdraw(3000);
		checkMyBalance();
	}
	public static void deposit(int amount) {
		balance += amount;
	}
	public static void withdraw(int amount) {
		balance -= amount;
	}
	public static void checkMyBalance() {
		System.out.println("ภÜพื :" + balance);
	}
}
