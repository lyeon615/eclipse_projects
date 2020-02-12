package chap02;

import java.util.Random;

//배열 a의 모든 요소의 합계를 구하여 반환하는 메소드를 작성하시오
public class Q03 {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}

	public static void main(String[] args) {
		Random rand = new Random();

		int num = rand.nextInt(10);
		int[] a = new int[num];

		for (int i = 0; i < num; i++) {
			a[i] = rand.nextInt(20);
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("배열 a의 모든 요소의 합은 " + sumOf(a) + "이다");
	}
}
