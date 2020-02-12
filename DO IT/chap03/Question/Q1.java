package Question;

import java.util.Scanner;

public class Q1 {
	static int seqSearchSen(int[] a, int n, int key) {

		a[n] = key;

		int i = 0;
		for (i = 0; i < n + 1; i++) {
			if (a[i] == key)
				break;
		}
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��ڼ� : ");
		int num = sc.nextInt();

		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		System.out.print("�˻��� : ");
		int key = sc.nextInt();

		int idx = seqSearchSen(x, num, key);

		if (idx == -1)
			System.out.println("��ڰ� ����");
		else
			System.out.println(key + "�� x[" + idx + "]�� �ִ�.");
		sc.close();
	}
}
