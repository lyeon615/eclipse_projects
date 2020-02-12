package Day11_07;

public class MobilePhone {
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	public void answer() {
		System.out.println("Hi~ From " + number);
	}
}
