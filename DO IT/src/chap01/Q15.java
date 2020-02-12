package chap01;

import java.util.Scanner;

//���� �̵ �ﰢ�� ���
public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ﰢ�� �� ���� ���� : ");
		int n = sc.nextInt();
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ�� ���");
		triangleLB(n);

		System.out.println("���� ���� ������ �̵ �ﰢ�� ���");
		triangleLU(n);

		System.out.println("������ ���� ������ �̵ �ﰢ�� ���");
		triangleRU(n);

		System.out.println("������ �Ʒ��� ������ �̵ �ﰢ�� ���");
		triangleRB(n);

		sc.close();
	}

	public static void triangleLB(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.printf(String.format("%%%ds", i), "*");
			for (int j = 1; j <= n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.printf(String.format("%%%ds", (n - i + 1)), "*");
			for (int j = 1; j <= i - 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
