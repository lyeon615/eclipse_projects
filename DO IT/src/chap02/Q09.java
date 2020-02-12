package chap02;

import java.util.Scanner;

//y�� m�� d���� �� �� ���� �ϼ�(12�� 31���̸� 0, 12�� 30�� 1)�� ���ϴ� leftDayOfYear �޼��带 �ۼ��ϼ���
public class Q09 {
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, };

	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int dayOfYear(int y, int m, int d) {
		while (m - 1 > 0) {
			d += mdays[isLeap(y)][m - 1];
			m--;
		}
		return d;
	}

	static int leftDayOfYear(int y, int m, int d) {
		int resualt = 365;
		if (isLeap(y) == 1)
			resualt += 1;
		return resualt - dayOfYear(y, m, d);
		// return 365 + isLeap(y) - dayOfYear(y, m, d);
		// ���������� �̷������� ������ ���� ����
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ����ϼ��� ���� �ϼ��� ���մϴ�.");
		System.out.print("�� : ");
		int year = sc.nextInt();
		System.out.print("�� : ");
		int month = sc.nextInt();
		System.out.print("�� : ");
		int day = sc.nextInt();

		System.out.println(dayOfYear(year, month, day) + "�� °�̰�.");
		System.out.println("�� �ش� " + leftDayOfYear(year, month, day) + "�� ���ҽ��ϴ�.");
		sc.close();
	}
}
