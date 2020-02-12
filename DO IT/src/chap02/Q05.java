package chap02;

import java.util.Random;

//배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하시오 
public class Q05 {

	static void swap(int[] a, int num1, int num2) {
		int t = a[num1];
		a[num1] = a[num2];
		a[num2] = t;
	}

	static void rcopy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++)
			a[i] = b[i];
		for (int i = 0; i < a.length / 2; i++)
			swap(a, i, a.length - 1 - i);
	}

	public static void main(String[] args) {
		Random ran = new Random();

		int num = 1 + ran.nextInt(10);
		int[] b = new int[num];
		int[] a = new int[num];

		for (int i = 0; i < b.length; i++) {
			b[i] = ran.nextInt(10);
			System.out.println("b[" + i + "] = " + b[i]);
		}
		System.out.println();

		rcopy(a, b);

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}

}
