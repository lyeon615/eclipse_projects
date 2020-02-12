package chap02;

import java.util.Random;
import java.util.Scanner;

// 배열을 이용해서 키의 최댓값을 나타내시오
// 사람수와 키값을 난수로 생성하시오
public class Q01 {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1 ; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("키의 최댓값을 구하시오");
		int num = rand.nextInt(11);
		System.out.println("사람수 : " + num);

		int height[] = new int[num];
		System.out.println("키의 값은 아래와 같다");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(91);
			System.out.println("height[" + i + "] = " + height[i]);
		}
		System.out.println("최댓값은 " + maxOf(height) + "이다.");

		sc.close();
	}
}
