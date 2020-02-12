package chap02;
// 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하시오
import java.util.Random;
import java.util.Scanner;

public class Q02 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;

	}

	static void reverse(int[] a) {
		for (int j = 0; j < a.length; j++)
			System.out.print(a[j] + "  ");
		System.out.println();
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
			System.out.println("a[" + i + "]과 a[" + (a.length - i - 1) + "]를 교환합니다.");
			for (int j = 0; j < a.length; j++)
				System.out.print(a[j] + "  ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("요솟수 : ");
		int num = sc.nextInt();

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			x[i] = rand.nextInt(10);
			System.out.println("x[" + i + "] = " + x[i]);
		}

		reverse(x);
		System.out.println("역순정렬을 마쳤습니다.");

		sc.close();
	}

}
