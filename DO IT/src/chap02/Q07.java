package chap02;
// ��� ��ȯ ������ �ڼ��� ��Ÿ���� ���α׷��� �ۼ��ϼ���

import java.util.Scanner;

// 10������ �����ȯ�մϴ�
// ��ȯ�ϴ� ���� �ƴ� ���� : 59
// � ������ ��ȯ�ұ��? : 2
// 2|      59
//  +--------
// 2|      29 ... 1
//  +--------

// 2|       1 ... 1
//  +--------
//          0 ... 1
//2������ 111011 �Դϴ�.
public class Q07 {
	static void swap(char[] a, int num1, int num2) {
		char t = a[num1];
		a[num1] = a[num2];
		a[num2] = t;
	}

	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits / 2; i++)
			swap(d, i, digits - 1 - i);

		return digits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		int r;
		int digit;
		char[] d = new char[32];

		System.out.println("10������ �����ȯ�մϴ�");
		do {
			System.out.print("��ȯ�ϴ� ���� �ƴ� ���� :");
			x = sc.nextInt();
		} while (x < 0);

		do {
			System.out.print("� ������ ��ȯ�ұ��? (2~36) :");
			r = sc.nextInt();
		} while (r < 2 || r > 36);

		System.out.printf("%2d|%10d\n", r, x);
		System.out.printf("%2s+%10s\n", " ", "----------");

		int x1 = x;
		int x2 = x;
		do {
			x1 /= r;
			System.out.printf("%2d|%10d ...%d\n", r, x1, x2 % r);
			x2 /= r;
			System.out.printf("%2s+%10s\n", " ", "----------");

		} while (x1 > x1 % r);
		
		System.out.printf("%2s %10d ...%d\n", "", 0, x1 % r);

		digit = cardConv(x, r, d);
		System.out.print(r + "�����δ� ");
		for (int i = 0; i < digit; i++)
			System.out.print(d[i]);
		System.out.println("�Դϴ�.");

		sc.close();
	}

}
