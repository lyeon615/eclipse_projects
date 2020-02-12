package Training;

import java.util.Scanner;

public class IntQueueTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue s = new IntQueue(4);

		while (true) {
			System.out.println("���� ������ �� : " + s.size() + "/" + s.capacity());
			System.out.println("(1)��ť (2)��ť (3)��ũ (4)���� (0)����");

			int menu = sc.nextInt();

			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1:
				System.out.print("������ : ");
				x = sc.nextInt();
				try {
					s.enque(x);
				} catch (IntQueue.OverflowIntOueueException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			case 2:
				try {
					x = s.deque();
					System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntQueue.EmptyIntOueueException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntQueue.EmptyIntOueueException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 4:
				s.dump();
				break;
			}
		}
	}
}
