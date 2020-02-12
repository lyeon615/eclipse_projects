package chap01;

//정수 a, b 를 포함하여 그 사이의 모든 정수의 합을 구하시오.
import java.util.Scanner;

public class Q9 {

	public static int sumOf(int a, int b) {

		int sumOf = 0;

		if (a >= b) {
			sumOf = a;
			for (int i = b; a > i; i++) {
				sumOf += i;
			}
			
			return sumOf;

		} else {
			sumOf = b;
			for (int i = a; b > i; i++) {
				sumOf += i;
			}

			return sumOf;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a값을 적으시오");
		int a = sc.nextInt();
		System.out.print("b값을 적으시오");
		int b = sc.nextInt();
		System.out.print(sumOf(a, b));

		sc.close();
	}
}
