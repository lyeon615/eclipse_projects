package Question;

import java.util.Scanner;
import Training.IntStack;

public class Chap04Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		IntStack s = new IntStack(64);

		while (true) {
			System.out.println("���� ������ �� : " + s.size() + "/" + s.capacity());
			System.out.println("(1)Ǫ�� (2)�� (3)��ũ (4)���� (5)�˻� (6)Ŭ���� (7)Ǯ (8)����Ƽ? (0)����");

			int menu = sc.nextInt();
			if (menu == 0)
				break;

			int x;

			switch (menu) {
			case 1:
				System.out.print("������ : ");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			case 2:
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 4:
				s.dump();
				break;

			case 5:
				System.out.print("�˻��� : ");
				int search = sc.nextInt();
				int anwser = s.indexOf(search);
				if (anwser < 0)
					System.out.println("�˻����� �����ϴ�.");
				else
					System.out.println("�˻��� �����ʹ� ���ҿ��� " + (anwser+1) + "������ �ֽ��ϴ�.");
				break;

			case 6:
				s.clear();
				break;

			case 7:
				if (s.isFull())
					System.out.println("������ ���� á���ϴ�.");
				else
					System.out.println("������ ���� ���� �ʾҽ��ϴ�.");
				break;

			case 8:
				if (s.isEmpty())
					System.out.println("������ ����ֽ��ϴ�.");
				else
					System.out.println("������ ������� �ʽ��ϴ�.");
				break;
			}
		}
		sc.close();
	}
}
