package Day11_06;

import java.util.Scanner;

public class MyMathTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];
		System.out.println("��ڰ��� �����ÿ�");
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.println("�ּڰ� : " + MyMath.myMin(a));
		System.out.println("�ִ� : " + MyMath.myMax(a));

		sc.close();
	}
}
