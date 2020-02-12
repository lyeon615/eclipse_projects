package Question;

import java.util.Scanner;


public class Chap04Q2Test<E> {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Chap04Q2<String> s = new Chap04Q2<String>(64);

		while (true) {
			System.out.println("���� ������ �� : " + s.size() + "/" + s.capacity());
			System.out.println("(1)Ǫ�� (2)�� (3)��ũ (4)���� (0)����");

			int menu = sc.nextInt();
			if (menu == 0)
				break;

			String x;

			switch (menu) {
			case 1:
				System.out.print("������ : ");
				x = sc.next();
				try {
					s.push(x);
				} catch (Chap04Q2.OverflowGStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			
			case 2:
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				}catch(Chap04Q2.EmptyGStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			
			case 3 :
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				}catch(Chap04Q2.EmptyGStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
				
			case 4 : 
				s.dump();
				break;
			}
		}

	}

}

