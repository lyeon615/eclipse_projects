package Day11_06;

import java.util.Scanner;

public class MyMathTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];
		System.out.println("요솟값을 적으시오");
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.println("최솟값 : " + MyMath.myMin(a));
		System.out.println("최댓값 : " + MyMath.myMax(a));

		sc.close();
	}
}
