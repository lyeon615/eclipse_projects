package Question;

import java.util.Scanner;

public class Q2 {
	static int seqSearch(int[] a, int n, int key) {

		System.out.print("   |");
		for (int i = 0; i < n; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("\n---+----------------------");

		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds\n", (i * 3 + 3)), "*");

			System.out.printf("%3d|", i);
			for (int j = 0; j < n; j++)
				System.out.printf("%3d", a[j]);
			System.out.println();

			for (int j = 0; j < n; j++) {
				if (a[i] == key) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��ڰ� : ");
		int n = sc.nextInt();
		int[] x = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		System.out.print("�˻��� : ");
		int key = sc.nextInt();
		int idx = seqSearch(x, n, key);

		if (idx == -1)
			System.out.println("��ڰ� ����");
		else
			System.out.println(key + "�� x[" + idx + "]�� �ֽ��ϴ�.");

		sc.close();
	}
}
