package chap02;

import java.util.Random;
import java.util.Scanner;

public class ReverseArray {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++)
			swap(a, i, a.length - i - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("��ڼ� : ");
		int num = sc.nextInt();

		int[] x = new int[num];
		for (int i = 0; i < num; i++) {
			x[i] = rand.nextInt(10);
			System.out.println("x[" + i + "] = " + x[i]);
		}
		reverse(x);

		System.out.println("��Ҹ� �������� ����");
		for (int i = 0; i < num; i++)
			System.out.println("x[" + i + "] = " + x[i]);
		sc.close();
	}
}
