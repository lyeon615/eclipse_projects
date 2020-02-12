
class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	//동기화 문제 해결하기 , 함수가 끝날 때까지 하나의 쓰레드만 접근가능하게끔 하기
	public synchronized void setMemory(int memory) {
		this.memory = memory;

		try {
			Thread.sleep(2000); // 지금 돌아가는 쓰레드를 2초동안 정지시키고, 다른 쓰레드가 돌아감
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