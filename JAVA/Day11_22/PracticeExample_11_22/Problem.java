package PracticeExample_11_22;

import java.util.Scanner;

public class Problem implements IProblem {
	public static void main(String[] args) {

		IProblem p = new Problem();
		p.changeDallarToKorea();
		p.showMeTheMoney();
	}

	public void changeDallarToKorea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��) >> ");
		int money = sc.nextInt();

		double change = (double) money / 1100;

		System.out.printf("%d���� $%.1f�Դϴ�.", money, change);

		System.out.println();

	}

	public void showMeTheMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		int money = sc.nextInt();

		int fiftyThousand = 0;
		int tenThousand = 0;
		int thousand = 0;
		int hundred = 0;
		int fifty = 0;
		int ten = 0;
		int one = 0;
		while (money >= 50000) {
			money -= 50000;
			fiftyThousand++;
		}
		while (money >= 10000) {
			money -= 10000;
			tenThousand++;
		}
		while (money >= 1000) {
			money -= 1000;
			thousand++;

		}
		while (money >= 100) {
			money -= 100;
			hundred++;

		}
		while (money >= 50) {
			money -= 50;
			fifty++;

		}
		while (money >= 10) {
			money -= 10;
			ten++;
		}
		while (money > 0) {
			money -= 1;
			one++;
		}
		System.out.printf("�������� %d��\n", fiftyThousand);
		System.out.printf("������ %d��\n", tenThousand);
		System.out.printf("õ���� %d��\n", thousand);
		System.out.printf("��� %d��\n", hundred);
		System.out.printf("���ʿ� %d��\n", fifty);
		System.out.printf("�ʿ� %d��\n", ten);
		System.out.printf("�Ͽ� %d��\n", one);

	}

//	Scanner Ŭ������ �̿��Ͽ� ������ �� ���� �׼��� �Է¹޾� 
//	���� ����, �� ����, õ ����, 500¥�� ����, 100��¥�� ����, 50��¥�� ����, 10��¥�� ����, 1��¥�� ���� �� �� ���� ��ȯ�Ǵ��� ����϶�.
//	  
//	�ݾ��� �Է��Ͻÿ�>>65376
//	�������� 1��
//	������ 1��
//	õ���� 5��
//	��� 3��
//	���ʿ� 1��
//	�ʿ� 2��
//	�Ͽ� 6��

}
