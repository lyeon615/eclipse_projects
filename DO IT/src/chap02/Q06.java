package chap02;

import java.util.Scanner;

// �Է� ���� 10������ 2����~36������ ��� ��ȯ�Ͽ� ��Ÿ���ÿ�
// �迭�� ���ʿ� �Ʒ��ڸ��� �ƴ϶� ���ڸ��� �־�δ� �޼��带 �ۼ��Ͻÿ�
public class Q06 {

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

		for (int i = 0; i < digits/2; i++)
			swap(d, i, digits - 1 - i);

		return digits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		int r;
		int digit;
		char[] d = new char [32];
;

		System.out.println("10������ �����ȯ�մϴ�.");
		do {
			System.out.print("�����ȯ�� ���� ������ �Է��Ͻÿ� : ");
			x = sc.nextInt();
		} while (x < 0);

		do {
			System.out.print("�������� ��ȯ�ϰڽ��ϱ�? (2~36) : ");
			r = sc.nextInt();
		} while (r < 2 || r > 36);

		digit = cardConv(x, r, d);
		
		System.out.print(r + "�����δ� ");
		for (int i = 0; i < digit; i++)
			System.out.print(d[i]);
		System.out.println("�Դϴ�.");

		sc.close();
	}
}
