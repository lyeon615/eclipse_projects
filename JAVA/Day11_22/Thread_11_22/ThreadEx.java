package Thread_11_22;

import javax.swing.JOptionPane;

public class ThreadEx {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // ���� �������� ���α׷��� 1�ʸ� ���� �ٽ� ���� // ���� ���� �ٸ� ������ ���ý�Ʈ ����Ī 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
