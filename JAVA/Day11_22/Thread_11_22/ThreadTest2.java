package Thread_11_22;

public class ThreadTest2 {
	public static void main(String[] args) {
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		th1.start();
		th2.start();
	}
}
class MyThread1 extends Thread{
	public void run() {
		for(int i = 0 ; i<300 ; i++)
			System.out.println("-");
	}
}
class MyThread2 extends Thread{
	public void run() {
		for(int i = 0; i<300 ; i++)
			System.out.println("|");
	}
}

//��Ƽ ������