package Thread_11_22;

import javax.swing.JOptionPane;

public class ThreadEx {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 지금 실행중인 프로그램을 1초를 쉬고 다시 실행 // 쉬는 동안 다른 쪽으로 컨택스트 스위칭 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
