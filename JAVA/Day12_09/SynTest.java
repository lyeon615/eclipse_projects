
class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	//����ȭ ���� �ذ��ϱ� , �Լ��� ���� ������ �ϳ��� �����常 ���ٰ����ϰԲ� �ϱ�
	public synchronized void setMemory(int memory) {
		this.memory = memory;

		try {
			Thread.sleep(2000); // ���� ���ư��� �����带 2�ʵ��� ������Ű��, �ٸ� �����尡 ���ư�
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);

	}
}

class User1 extends Thread{
	private Calculator calculator;


	public void setCalculator(Calculator calculator) {
		super.setName("CalculatorUser1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}

class User2 extends Thread{
	private Calculator calculator;


	public void setCalculator(Calculator calculator) {
		this.setName("CalculatorUser2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}

public class SynTest{
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
	}
}