package Question;

import java.util.Scanner;

public class Q5 {
	static int binSearchX(int[] a, int n, int key) {

		int pl = 0;
		int pr = n - 1;

		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key) {
				while (pc > 0) {
					if(a[--pc]==key) {
						return pc;
					}
				}
				return pc;
			} else if (a[pc] < key) {
				pl = pc + 1;
			} else {
				pr = pc - 1;
			}
		} while (pl <= pr);
		return -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int[] x = new int[num];

		System.out.println("������������ �Է��ϼ���");
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);
		}

		System.out.print("�˻��� : ");
		int key = sc.nextInt();

		int idx = binSearchX(x, num, key);

		if (idx == -1)
			System.out.println("��ڰ� ����");
		else
			System.out.println(key + "�� x[" + idx + "]�� �ִ�.");

		sc.close();

	}
}