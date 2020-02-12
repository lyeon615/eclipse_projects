package Question;

import java.util.Scanner;

public class Chap04Q3Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Chap04Q3 s = new Chap04Q3(4);

		while (true) {
			System.out.println("���� ������ �� : " + s.size() + "/" + s.capacity());
			System.out.println("(1)Ǫ�� (2)�� (3)��ũ (4)���� (5)�˻� (6)Ŭ���� (7)Ǯ (8)����Ƽ? (9)2Ǫ�� (10)2�� (11)2��ũ (12)2���� (13)2�˻� (0)����");

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
				} catch (Chap04Q3.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			case 2:
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				} catch (Chap04Q3.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (Chap04Q3.EmptyIntStackException e) {
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
				
			case 9:
				System.out.print("������ : ");
				x = sc.nextInt();
				try {
					s.push2(x);
				} catch (Chap04Q3.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			case 10:
				try {
					x = s.pop2();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				} catch (Chap04Q3.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			case 11:
				try {
					x = s.peek2();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch (Chap04Q3.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 12:
				s.dump2();
				break;

			case 13:
				System.out.print("�˻��� : ");
				search = sc.nextInt();
				anwser = s.indexOf2(search);
				if (anwser < 0)
					System.out.println("�˻����� �����ϴ�.");
				else
					System.out.println("�˻��� �����ʹ� ���ҿ��� " + (anwser+1) + "������ �ֽ��ϴ�.");
				break;
				
			}
		}
		sc.close();
	}
}
