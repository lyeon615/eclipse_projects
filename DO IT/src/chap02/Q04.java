package chap02;

import java.util.Random;

// �迭 b�� ��� ��Ҹ� �迭 a�� �����ϴ� �޼��� copy�� �ۼ��ϼ���
public class Q04 {
	static void copy(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
	}
public static void main(String[] args) {
		Random rand = new Random();

		int num = 1 + rand.nextInt(10);
		int[] a = new int[num];
		int[] b = new int[num];

		for (int i = 0; i < b.length; i++) {
			b[i] = rand.nextInt(11);
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
		
		System.out.println();

		copy(a, b);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
